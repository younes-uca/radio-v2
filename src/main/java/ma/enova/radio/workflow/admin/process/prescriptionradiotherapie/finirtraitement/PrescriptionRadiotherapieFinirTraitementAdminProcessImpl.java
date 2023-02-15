package ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.finirtraitement;

import ma.enova.radio.bean.core.PrescriptionRadiotherapie;
import ma.enova.radio.bean.core.StatutRadiotherapie;
import ma.enova.radio.constant.StatutRadioTherapieConstant;
import ma.enova.radio.service.facade.admin.HistortiquePrescriptionRadiotherapieAdminService;
import ma.enova.radio.service.facade.admin.PrescriptionRadiotherapieAdminService;
import ma.enova.radio.service.facade.admin.StatutRadiotherapieAdminService;
import ma.enova.radio.zynerator.process.AbstractProcessImpl;
import ma.enova.radio.zynerator.process.Result;

public class PrescriptionRadiotherapieFinirTraitementAdminProcessImpl extends AbstractProcessImpl<PrescriptionRadiotherapieFinirTraitementAdminInput, PrescriptionRadiotherapieFinirTraitementAdminOutput, PrescriptionRadiotherapie, PrescriptionRadiotherapieFinirTraitementAdminConverter> implements PrescriptionRadiotherapieFinirTraitementAdminProcess {

    @Override
    public void init(PrescriptionRadiotherapieFinirTraitementAdminInput input, PrescriptionRadiotherapie item) {
        StatutRadiotherapie statutRadiotherapie = statutRadiotherapieService.findByCode(StatutRadioTherapieConstant.FIN_TRAITEMENT);
        item.setStatutRadiotherapie(statutRadiotherapie);
    }

    @Override
    public void validate(PrescriptionRadiotherapieFinirTraitementAdminInput input, PrescriptionRadiotherapie item, Result<PrescriptionRadiotherapieFinirTraitementAdminInput, PrescriptionRadiotherapieFinirTraitementAdminOutput, PrescriptionRadiotherapie> result) {
        if (item.getStatutRadiotherapie() == null)
        	 result.addErrorMessage("radiotherapie.finirtraitement.status.obligatoire");
        else if (item.getId() == null)
        	result.addErrorMessage("radiotherapie.finirtraitement.prescription.obligatoire");
    }

    @Override
    public void run(PrescriptionRadiotherapieFinirTraitementAdminInput input, PrescriptionRadiotherapie t, Result<PrescriptionRadiotherapieFinirTraitementAdminInput, PrescriptionRadiotherapieFinirTraitementAdminOutput, PrescriptionRadiotherapie> result) {        Long validateurSimulationId = t.getValidateurSimulation() != null ? t.getValidateurSimulation().getId() : null;
        service.updateAsCloturerTraitement(t.getId(), t.getStatutRadiotherapie().getId(), t.getDateFinTraitement(), t.getCompteRendu());
        histortiquePrescriptionRadiotherapieService.createFromPrescription(t.getId(), t.getStatutRadiotherapie());
        // TODO : send new state to RabbitMq
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
