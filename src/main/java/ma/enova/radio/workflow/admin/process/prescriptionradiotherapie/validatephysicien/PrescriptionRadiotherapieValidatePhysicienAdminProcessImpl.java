package ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.validatephysicien;
import ma.enova.radio.service.facade.admin.HistortiquePrescriptionRadiotherapieAdminService;
import ma.enova.radio.service.facade.admin.PrescriptionRadiotherapieAdminService;

import ma.enova.radio.service.facade.admin.StatutRadiotherapieAdminService;
import ma.enova.radio.zynerator.process.AbstractProcessImpl;
import ma.enova.radio.zynerator.process.Result;
import ma.enova.radio.bean.core.PrescriptionRadiotherapie;
import ma.enova.radio.zynerator.util.DateUtil;

public class PrescriptionRadiotherapieValidatePhysicienAdminProcessImpl extends AbstractProcessImpl<PrescriptionRadiotherapieValidatePhysicienAdminInput, PrescriptionRadiotherapieValidatePhysicienAdminOutput,  PrescriptionRadiotherapie,  PrescriptionRadiotherapieValidatePhysicienAdminConverter> implements PrescriptionRadiotherapieValidatePhysicienAdminProcess {

    @Override
    public void init(PrescriptionRadiotherapieValidatePhysicienAdminInput input, PrescriptionRadiotherapie item) {

    }

    @Override
    public void validate(PrescriptionRadiotherapieValidatePhysicienAdminInput input, PrescriptionRadiotherapie item, Result<PrescriptionRadiotherapieValidatePhysicienAdminInput, PrescriptionRadiotherapieValidatePhysicienAdminOutput, PrescriptionRadiotherapie> result) {
        if (input.getStatutRadiotherapie() == null)
            result.addErrorMessage("");
        else if (input.getId() == null)
            result.addErrorMessage("");
        else if (input.getValidateurSimulation() == null || input.getValidateurSimulation().getId() == null) {
            result.addErrorMessage("");
        }
    }

    @Override
    public void run(PrescriptionRadiotherapieValidatePhysicienAdminInput input, PrescriptionRadiotherapie t, Result<PrescriptionRadiotherapieValidatePhysicienAdminInput, PrescriptionRadiotherapieValidatePhysicienAdminOutput, PrescriptionRadiotherapie> result) {
        Long validateurSimulationId = input.getValidateurSimulation().getId();
        service.updateAsValiderSimulation(input.getId(), input.getStatutRadiotherapie().getId(), DateUtil.stringToDateTime(input.getValidateurSimulationDate()), validateurSimulationId);
        histortiquePrescriptionRadiotherapieService.createFromPrescription(t.getId(), t.getStatutRadiotherapie());
    }


    private PrescriptionRadiotherapieAdminService service;
    private StatutRadiotherapieAdminService statutRadiotherapieService;
    private HistortiquePrescriptionRadiotherapieAdminService histortiquePrescriptionRadiotherapieService;

    public PrescriptionRadiotherapieValidatePhysicienAdminProcessImpl(PrescriptionRadiotherapieAdminService service, PrescriptionRadiotherapieValidatePhysicienAdminConverter converter, StatutRadiotherapieAdminService statutRadiotherapieService, HistortiquePrescriptionRadiotherapieAdminService histortiquePrescriptionRadiotherapieService) {
        super(converter);
        this.service = service;
        this.statutRadiotherapieService = statutRadiotherapieService;
        this.histortiquePrescriptionRadiotherapieService = histortiquePrescriptionRadiotherapieService;
    }

}
