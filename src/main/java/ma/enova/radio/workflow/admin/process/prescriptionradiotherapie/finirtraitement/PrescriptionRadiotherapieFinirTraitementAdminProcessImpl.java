package ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.finirtraitement;

import ma.enova.radio.bean.core.PrescriptionRadiotherapie;
import ma.enova.radio.constant.StatutRadioTherapieConstant;
import ma.enova.radio.ws.dto.DecisionTraitementDto;
import ma.enova.radio.service.facade.admin.HistortiquePrescriptionRadiotherapieAdminService;
import ma.enova.radio.service.facade.admin.PrescriptionRadiotherapieAdminService;
import ma.enova.radio.service.facade.admin.StatutRadiotherapieAdminService;
import ma.enova.radio.service.util.admin.RabbitUtils;
import ma.enova.radio.zynerator.process.AbstractProcessImpl;
import ma.enova.radio.zynerator.process.Result;

public class PrescriptionRadiotherapieFinirTraitementAdminProcessImpl extends AbstractProcessImpl<PrescriptionRadiotherapieFinirTraitementAdminInput, PrescriptionRadiotherapieFinirTraitementAdminOutput, PrescriptionRadiotherapie, PrescriptionRadiotherapieFinirTraitementAdminConverter> implements PrescriptionRadiotherapieFinirTraitementAdminProcess {

    @Override
    public void init(PrescriptionRadiotherapieFinirTraitementAdminInput input, PrescriptionRadiotherapie item) {
        service.updateStatutPrescription(item, StatutRadioTherapieConstant.FIN_TRAITEMENT_CODE);
    }

    @Override
    public void validate(PrescriptionRadiotherapieFinirTraitementAdminInput input, PrescriptionRadiotherapie item, Result<PrescriptionRadiotherapieFinirTraitementAdminInput, PrescriptionRadiotherapieFinirTraitementAdminOutput, PrescriptionRadiotherapie> result) {
        if (item.getStatutRadiotherapie() == null)
            result.addErrorMessage("radiotherapie.finirtraitement.status.obligatoire");
        if (item.getId() == null)
            result.addErrorMessage("radiotherapie.finirtraitement.prescription.obligatoire");
    }

    @Override
    public void run(PrescriptionRadiotherapieFinirTraitementAdminInput input, PrescriptionRadiotherapie t, Result<PrescriptionRadiotherapieFinirTraitementAdminInput, PrescriptionRadiotherapieFinirTraitementAdminOutput, PrescriptionRadiotherapie> result) {
        service.updateAsCloturerTraitement(t.getId(), t.getStatutRadiotherapie().getId(), t.getDateFinTraitement(), t.getCompteRendu());
        histortiquePrescriptionRadiotherapieService.createFromPrescription(t.getId(), t.getStatutRadiotherapie());
        //queue message to dcm for update status decisionTraitement.
        if (t.getDecisionTraitement() != null && t.getDecisionTraitement().getId() != null) {
            DecisionTraitementDto decisiontraitementDto = new DecisionTraitementDto(t.getDecisionTraitement().getId(), null, t.getStatutRadiotherapie().getCode());
            RabbitUtils.convertAndSend(decisiontraitementDto);
        }
        result.addInfoMessage("radiotherapie.finirtraitement.ok");
    }


    private PrescriptionRadiotherapieAdminService service;

    private StatutRadiotherapieAdminService statutRadiotherapieService;
    private HistortiquePrescriptionRadiotherapieAdminService histortiquePrescriptionRadiotherapieService;

    public PrescriptionRadiotherapieFinirTraitementAdminProcessImpl(PrescriptionRadiotherapieAdminService service, PrescriptionRadiotherapieFinirTraitementAdminConverter converter, StatutRadiotherapieAdminService statutRadiotherapieService, HistortiquePrescriptionRadiotherapieAdminService histortiquePrescriptionRadiotherapieService) {
        super(converter);
        this.service = service;
        this.statutRadiotherapieService = statutRadiotherapieService;
        this.histortiquePrescriptionRadiotherapieService = histortiquePrescriptionRadiotherapieService;
    }

}
