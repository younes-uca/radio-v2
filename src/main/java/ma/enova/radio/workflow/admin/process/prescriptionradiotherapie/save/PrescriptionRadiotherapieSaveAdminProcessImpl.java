package ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.save;
import ma.enova.radio.service.facade.admin.PrescriptionRadiotherapieAdminService;

import ma.enova.radio.zynerator.process.AbstractProcessImpl;
import ma.enova.radio.zynerator.process.Result;
import ma.enova.radio.bean.core.PrescriptionRadiotherapie;

public class PrescriptionRadiotherapieSaveAdminProcessImpl extends AbstractProcessImpl<PrescriptionRadiotherapieSaveAdminInput, PrescriptionRadiotherapieSaveAdminOutput,  PrescriptionRadiotherapie,  PrescriptionRadiotherapieSaveAdminConverter> implements PrescriptionRadiotherapieSaveAdminProcess {

    @Override
    public void init(PrescriptionRadiotherapieSaveAdminInput input, PrescriptionRadiotherapie item) {

    }

    @Override
    public void validate(PrescriptionRadiotherapieSaveAdminInput input, PrescriptionRadiotherapie item, Result<PrescriptionRadiotherapieSaveAdminInput, PrescriptionRadiotherapieSaveAdminOutput, PrescriptionRadiotherapie> result) {
        
    }

    @Override
    public void run(PrescriptionRadiotherapieSaveAdminInput input, PrescriptionRadiotherapie t, Result<PrescriptionRadiotherapieSaveAdminInput, PrescriptionRadiotherapieSaveAdminOutput, PrescriptionRadiotherapie> result) {
        
    }
    


    private PrescriptionRadiotherapieAdminService service;
    public PrescriptionRadiotherapieSaveAdminProcessImpl(PrescriptionRadiotherapieAdminService service, PrescriptionRadiotherapieSaveAdminConverter converter) {
        super(converter);
        this.service = service;
    }

}
