package ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.simuler;

import ma.enova.radio.bean.core.*;
import ma.enova.radio.constant.StatutRadioTherapieConstant;
//import ma.enova.radio.ws.dto.DecisionTraitementDto;
import ma.enova.radio.ws.dto.DecisionTraitementDto;

import ma.enova.radio.service.facade.admin.HistortiquePrescriptionRadiotherapieAdminService;
import ma.enova.radio.service.facade.admin.PrescriptionRadiotherapieAdminService;
import ma.enova.radio.service.facade.admin.StatutRadiotherapieAdminService;
import ma.enova.radio.service.util.admin.RabbitUtils;
import ma.enova.radio.ws.dto.DecisionTraitementDto;
import ma.enova.radio.zynerator.process.AbstractProcessImpl;
import ma.enova.radio.zynerator.process.Result;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.time.LocalDateTime;

public class PrescriptionRadiotherapieSimulerAdminProcessImpl extends AbstractProcessImpl<PrescriptionRadiotherapieSimulerAdminInput, PrescriptionRadiotherapieSimulerAdminOutput, PrescriptionRadiotherapie, PrescriptionRadiotherapieSimulerAdminConverter> implements PrescriptionRadiotherapieSimulerAdminProcess {

    @Override
    public void init(PrescriptionRadiotherapieSimulerAdminInput input, PrescriptionRadiotherapie item) {
        service.updateStatutPrescription(item, StatutRadioTherapieConstant.EN_COURS_TRAITEMENT_CODE);
        item.setValidateurSimulationDate(LocalDateTime.now());
    }

    @Override
    public void validate(PrescriptionRadiotherapieSimulerAdminInput input, PrescriptionRadiotherapie item, Result<PrescriptionRadiotherapieSimulerAdminInput, PrescriptionRadiotherapieSimulerAdminOutput, PrescriptionRadiotherapie> result) {
        validateStatutRadiotherapie(item.getStatutRadiotherapie(), result);
        validatePrescription(item.getId(), result);
        validateImmobilisation(item.getImmobilistion(), result);
        validatePositionnement(item.getPositionnement(), result);
        //validateValidateurSimulation(item.getValidateurSimulation(), result);
    }


    @Override
    public void run(PrescriptionRadiotherapieSimulerAdminInput input, PrescriptionRadiotherapie t, Result<PrescriptionRadiotherapieSimulerAdminInput, PrescriptionRadiotherapieSimulerAdminOutput, PrescriptionRadiotherapie> result) {
        Long validateurSimulationId = t.getValidateurSimulation().getId();
        service.updateAsSimuler(t.getId(), t.getStatutRadiotherapie().getId(), t.getDateSimulation(), t.getImmobilistion().getId(), t.getPositionnement().getId(), t.getFichierTraitements(), t.getValidateurSimulationDate(), validateurSimulationId);
        histortiquePrescriptionRadiotherapieService.createFromPrescription(t.getId(), t.getStatutRadiotherapie());
        //queue message to dcm for update status decisionTraitement.
        if (t.getDecisionTraitement() != null && t.getDecisionTraitement().getId() != null) {
            DecisionTraitementDto decisiontraitementDto = new DecisionTraitementDto(t.getDecisionTraitement().getId(), null, t.getStatutRadiotherapie().getCode());
            RabbitUtils.convertAndSend(decisiontraitementDto);
        }
       /* PrescriptionRadiotherapie prescriptionRadiotherapie = service.findWithSeance(t.getId());
        result.setItem(prescriptionRadiotherapie);*/
        result.addInfoMessage("radiotherapie.simuler.ok");
    }


    private void validateStatutRadiotherapie(StatutRadiotherapie statutRadiotherapie, Result result) {
        if (statutRadiotherapie == null)
            result.addErrorMessage("radiotherapie.simuler.status.obligatoire");
    }

    private void validatePrescription(Long idPrescription, Result result) {
        if (idPrescription == null)
            result.addErrorMessage("radiotherapie.simuler.prescription.obligatoire");
    }


    private void validateValidateurSimulation(Personnel validateurSimulation, Result result) {
        if (validateurSimulation == null || validateurSimulation.getId() == null) {
            result.addErrorMessage("radiotherapie.simuler.validateur.obligatoire");
        }
    }

    private void validatePositionnement(Positionnement positionnement, Result<PrescriptionRadiotherapieSimulerAdminInput, PrescriptionRadiotherapieSimulerAdminOutput, PrescriptionRadiotherapie> result) {
        if (positionnement == null || positionnement.getId() == null)
            result.addErrorMessage("radiotherapie.simuler.positionnement.obligatoire");
    }

    private void validateImmobilisation(Immobilistion immobilistion, Result<PrescriptionRadiotherapieSimulerAdminInput, PrescriptionRadiotherapieSimulerAdminOutput, PrescriptionRadiotherapie> result) {
        if (immobilistion == null || immobilistion.getId() == null)
            result.addErrorMessage("radiotherapie.simuler.immobilistion.obligatoire");
    }


    private PrescriptionRadiotherapieAdminService service;
    private StatutRadiotherapieAdminService statutRadiotherapieService;
    private HistortiquePrescriptionRadiotherapieAdminService histortiquePrescriptionRadiotherapieService;

    public PrescriptionRadiotherapieSimulerAdminProcessImpl(PrescriptionRadiotherapieAdminService service, PrescriptionRadiotherapieSimulerAdminConverter converter, StatutRadiotherapieAdminService statutRadiotherapieService, HistortiquePrescriptionRadiotherapieAdminService histortiquePrescriptionRadiotherapieService) {
        super(converter);
        this.service = service;
        this.statutRadiotherapieService = statutRadiotherapieService;
        this.histortiquePrescriptionRadiotherapieService = histortiquePrescriptionRadiotherapieService;
    }

}
