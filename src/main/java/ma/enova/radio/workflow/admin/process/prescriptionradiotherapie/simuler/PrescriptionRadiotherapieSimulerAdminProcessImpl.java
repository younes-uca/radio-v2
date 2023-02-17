package ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.simuler;

import java.time.LocalDateTime;


import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.transaction.annotation.Transactional;

import ma.enova.radio.bean.core.PrescriptionRadiotherapie;
import ma.enova.radio.bean.core.StatutRadiotherapie;
import ma.enova.radio.constant.StatutRadioTherapieConstant;
import ma.enova.radio.required.dto.dmc.DecisionTraitementDto;
import ma.enova.radio.service.facade.admin.HistortiquePrescriptionRadiotherapieAdminService;
import ma.enova.radio.service.facade.admin.PrescriptionRadiotherapieAdminService;
import ma.enova.radio.service.facade.admin.StatutRadiotherapieAdminService;
import ma.enova.radio.zynerator.process.AbstractProcessImpl;
import ma.enova.radio.zynerator.process.Result;
import ma.enova.radio.zynerator.service.RabbitUtils;

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
        StatutRadiotherapie statutRadiotherapie = statutRadiotherapieService.findByCode(StatutRadioTherapieConstant.EN_COURS_TRAITEMENT);
        item.setStatutRadiotherapie(statutRadiotherapie);
        item.setValidateurSimulationDate(LocalDateTime.now());
    }

    @Override
    public void validate(PrescriptionRadiotherapieSimulerAdminInput input, PrescriptionRadiotherapie item, Result<PrescriptionRadiotherapieSimulerAdminInput, PrescriptionRadiotherapieSimulerAdminOutput, PrescriptionRadiotherapie> result) {
        if (item.getStatutRadiotherapie() == null)
            result.addErrorMessage("radiotherapie.simuler.status.obligatoire");
        else if (item.getId() == null)
            result.addErrorMessage("radiotherapie.simuler.prescription.obligatoire");
//        else if (input.getValidateurSimulation() == null || input.getValidateurSimulation().getId() == null) {
//            result.addErrorMessage("radiotherapie.simuler.validateur.obligatoire");
//        }
    }

    @Override
    public void run(PrescriptionRadiotherapieSimulerAdminInput input, PrescriptionRadiotherapie t, Result<PrescriptionRadiotherapieSimulerAdminInput, PrescriptionRadiotherapieSimulerAdminOutput, PrescriptionRadiotherapie> result) {
        Long validateurSimulationId = 1l;
        service.updateAsSimuler(t.getId(), t.getStatutRadiotherapie().getId(),t.getDateSimulation() , t.getImmobilistion(), t.getPositionnement() , t.getFichierTraitements() , t.getValidateurSimulationDate(), validateurSimulationId);
        histortiquePrescriptionRadiotherapieService.createFromPrescription(t.getId(), t.getStatutRadiotherapie());
        // queue to MS to create prescriptionRadioTherapie
        DecisionTraitementDto decisiontraitementDto = new DecisionTraitementDto(1l, null,t.getStatutRadiotherapie().getCode());
		RabbitUtils.convertAndSend(decisiontraitementDto, exchange, routingkey, rabbitTemplate);
        
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
