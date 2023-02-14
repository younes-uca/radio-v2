package ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.finirtraitement;
import ma.enova.radio.service.facade.admin.PrescriptionRadiotherapieAdminService;

import ma.enova.radio.zynerator.process.AbstractProcessImpl;
import ma.enova.radio.zynerator.process.Result;
import ma.enova.radio.bean.core.PrescriptionRadiotherapie;

public class PrescriptionRadiotherapieFinirTraitementAdminProcessImpl extends AbstractProcessImpl<PrescriptionRadiotherapieFinirTraitementAdminInput, PrescriptionRadiotherapieFinirTraitementAdminOutput,  PrescriptionRadiotherapie,  PrescriptionRadiotherapieFinirTraitementAdminConverter> implements PrescriptionRadiotherapieFinirTraitementAdminProcess {

    @Override
    public void init(PrescriptionRadiotherapieFinirTraitementAdminInput input, PrescriptionRadiotherapie item) {

    }

    @Override
    public void validate(PrescriptionRadiotherapieFinirTraitementAdminInput input, PrescriptionRadiotherapie item, Result<PrescriptionRadiotherapieFinirTraitementAdminInput, PrescriptionRadiotherapieFinirTraitementAdminOutput, PrescriptionRadiotherapie> result) {
        
    }

    @Override
    public void run(PrescriptionRadiotherapieFinirTraitementAdminInput input, PrescriptionRadiotherapie t, Result<PrescriptionRadiotherapieFinirTraitementAdminInput, PrescriptionRadiotherapieFinirTraitementAdminOutput, PrescriptionRadiotherapie> result) {
        
    }
    


    private PrescriptionRadiotherapieAdminService service;
    public PrescriptionRadiotherapieFinirTraitementAdminProcessImpl(PrescriptionRadiotherapieAdminService service, PrescriptionRadiotherapieFinirTraitementAdminConverter converter) {
        super(converter);
        this.service = service;
    }

}
