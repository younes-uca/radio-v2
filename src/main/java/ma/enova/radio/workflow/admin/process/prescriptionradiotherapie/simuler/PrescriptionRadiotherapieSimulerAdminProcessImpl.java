package ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.simuler;

import ma.enova.radio.bean.core.Personnel;
import ma.enova.radio.bean.core.PrescriptionRadiotherapie;
import ma.enova.radio.bean.core.StatutRadiotherapie;
import ma.enova.radio.constant.StatutRadioTherapieConstant;
import ma.enova.radio.required.dto.dmc.DecisionTraitementDto;
import ma.enova.radio.service.facade.admin.HistortiquePrescriptionRadiotherapieAdminService;
import ma.enova.radio.service.facade.admin.PrescriptionRadiotherapieAdminService;
import ma.enova.radio.service.facade.admin.StatutRadiotherapieAdminService;
import ma.enova.radio.service.util.admin.RabbitUtils;
import ma.enova.radio.zynerator.process.AbstractProcessImpl;
import ma.enova.radio.zynerator.process.Result;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.time.LocalDateTime;

public class PrescriptionRadiotherapieSimulerAdminProcessImpl extends AbstractProcessImpl<PrescriptionRadiotherapieSimulerAdminInput, PrescriptionRadiotherapieSimulerAdminOutput, PrescriptionRadiotherapie, PrescriptionRadiotherapieSimulerAdminConverter> implements PrescriptionRadiotherapieSimulerAdminProcess {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    @Value("${rabbitmq.exchange}")
    private String exchange;

    @Value("${rabbitmq.routingkey}")
    private String routingkey;

    @Value("${rabbitmq.queue}")
    private String queue;

    @Override
    public void init(PrescriptionRadiotherapieSimulerAdminInput input, PrescriptionRadiotherapie item) {
        service.updateStatutPrescription(item, StatutRadioTherapieConstant.EN_COURS_TRAITEMENT_CODE);
        item.setValidateurSimulationDate(LocalDateTime.now());
    }

    @Override
    public void validate(PrescriptionRadiotherapieSimulerAdminInput input, PrescriptionRadiotherapie item, Result<PrescriptionRadiotherapieSimulerAdminInput, PrescriptionRadiotherapieSimulerAdminOutput, PrescriptionRadiotherapie> result) {
        validateStatutRadiotherapie(item.getStatutRadiotherapie(), result);
        validatePrescription(item.getId(), result);
        validateValidateurSimulation(item.getValidateurSimulation(), result);
    }


    @Override
    public void run(PrescriptionRadiotherapieSimulerAdminInput input, PrescriptionRadiotherapie t, Result<PrescriptionRadiotherapieSimulerAdminInput, PrescriptionRadiotherapieSimulerAdminOutput, PrescriptionRadiotherapie> result) {
        Long validateurSimulationId = t.getValidateurSimulation().getId();
        service.updateAsSimuler(t.getId(), t.getStatutRadiotherapie().getId(), t.getDateSimulation(), t.getImmobilistion(), t.getPositionnement(), t.getFichierTraitements(), t.getValidateurSimulationDate(), validateurSimulationId);
        histortiquePrescriptionRadiotherapieService.createFromPrescription(t.getId(), t.getStatutRadiotherapie());
        // queue to MS to create prescriptionRadioTherapie
        if (t.getDecisionTraitement() != null && t.getDecisionTraitement().getId() != null) {
            DecisionTraitementDto decisiontraitementDto = new DecisionTraitementDto(t.getDecisionTraitement().getId(), t.getDecisionTraitement().getCode(), t.getStatutRadiotherapie().getCode());
            RabbitUtils.convertAndSend(decisiontraitementDto, exchange, routingkey, rabbitTemplate);
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
