package ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.simuler;

import ma.enova.radio.bean.core.Personnel;
import ma.enova.radio.bean.core.PrescriptionRadiotherapie;
import ma.enova.radio.bean.core.StatutRadiotherapie;
import ma.enova.radio.constant.StatutRadioTherapieConstant;
import ma.enova.radio.service.facade.admin.HistortiquePrescriptionRadiotherapieAdminService;
import ma.enova.radio.service.facade.admin.PrescriptionRadiotherapieAdminService;
import ma.enova.radio.service.facade.admin.StatutRadiotherapieAdminService;
import ma.enova.radio.zynerator.process.AbstractProcessImpl;
import ma.enova.radio.zynerator.process.Result;

import java.time.LocalDateTime;

public class PrescriptionRadiotherapieSimulerAdminProcessImpl extends AbstractProcessImpl<PrescriptionRadiotherapieSimulerAdminInput, PrescriptionRadiotherapieSimulerAdminOutput, PrescriptionRadiotherapie, PrescriptionRadiotherapieSimulerAdminConverter> implements PrescriptionRadiotherapieSimulerAdminProcess {

    @Override
    public void init(PrescriptionRadiotherapieSimulerAdminInput input, PrescriptionRadiotherapie item) {
        StatutRadiotherapie statutRadiotherapie = statutRadiotherapieService.findByCode(StatutRadioTherapieConstant.EN_COURS_TRAITEMENT);
        item.setStatutRadiotherapie(statutRadiotherapie);
        Personnel personnel = new Personnel(1L);
        item.setValidateurSimulation(personnel);//TODO get current user :: Personnel must extends User
        item.setValidateurSimulationDate(LocalDateTime.now());
    }

    @Override
    public void validate(PrescriptionRadiotherapieSimulerAdminInput input, PrescriptionRadiotherapie item, Result<PrescriptionRadiotherapieSimulerAdminInput, PrescriptionRadiotherapieSimulerAdminOutput, PrescriptionRadiotherapie> result) {
        if (item.getStatutRadiotherapie() == null)
            result.addErrorMessage("radiotherapie.simuler.status.obligatoire");
        else if (item.getId() == null)
            result.addErrorMessage("radiotherapie.simuler.prescription.obligatoire");
        else if (item.getValidateurSimulation() == null || item.getValidateurSimulation().getId() == null) {
            result.addErrorMessage("radiotherapie.simuler.validateur.obligatoire");
        }
    }

    @Override
    public void run(PrescriptionRadiotherapieSimulerAdminInput input, PrescriptionRadiotherapie t, Result<PrescriptionRadiotherapieSimulerAdminInput, PrescriptionRadiotherapieSimulerAdminOutput, PrescriptionRadiotherapie> result) {
        Long validateurSimulationId = t.getValidateurSimulation().getId();
        service.updateAsSimuler(t.getId(), t.getStatutRadiotherapie().getId(),t.getDateSimulation() , t.getImmobilistion(), t.getPositionnement() , t.getFichierTraitements() , t.getValidateurSimulationDate(), validateurSimulationId);
        histortiquePrescriptionRadiotherapieService.createFromPrescription(t.getId(), t.getStatutRadiotherapie());
        // TODO : send new state to RabbitMq
        result.addInfoMessage("radiotherapie.simuler.ok");
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
