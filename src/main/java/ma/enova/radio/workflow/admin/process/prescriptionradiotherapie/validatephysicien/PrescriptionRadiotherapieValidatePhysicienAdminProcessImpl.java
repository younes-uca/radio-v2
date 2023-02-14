package ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.validatephysicien;
import ma.enova.radio.service.facade.admin.PrescriptionRadiotherapieAdminService;

import ma.enova.radio.zynerator.process.AbstractProcessImpl;
import ma.enova.radio.zynerator.process.Result;
import ma.enova.radio.bean.core.PrescriptionRadiotherapie;

public class PrescriptionRadiotherapieValidatePhysicienAdminProcessImpl extends AbstractProcessImpl<PrescriptionRadiotherapieValidatePhysicienAdminInput, PrescriptionRadiotherapieValidatePhysicienAdminOutput,  PrescriptionRadiotherapie,  PrescriptionRadiotherapieValidatePhysicienAdminConverter> implements PrescriptionRadiotherapieValidatePhysicienAdminProcess {

    @Override
    public void init(PrescriptionRadiotherapieValidatePhysicienAdminInput input, PrescriptionRadiotherapie item) {

    }

    @Override
    public void validate(PrescriptionRadiotherapieValidatePhysicienAdminInput input, PrescriptionRadiotherapie item, Result<PrescriptionRadiotherapieValidatePhysicienAdminInput, PrescriptionRadiotherapieValidatePhysicienAdminOutput, PrescriptionRadiotherapie> result) {
        
    }

    @Override
    public void run(PrescriptionRadiotherapieValidatePhysicienAdminInput input, PrescriptionRadiotherapie t, Result<PrescriptionRadiotherapieValidatePhysicienAdminInput, PrescriptionRadiotherapieValidatePhysicienAdminOutput, PrescriptionRadiotherapie> result) {
        
    }
    


    private PrescriptionRadiotherapieAdminService service;
    public PrescriptionRadiotherapieValidatePhysicienAdminProcessImpl(PrescriptionRadiotherapieAdminService service, PrescriptionRadiotherapieValidatePhysicienAdminConverter converter) {
        super(converter);
        this.service = service;
    }

}
