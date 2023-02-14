package ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.suivreconsultation;
import ma.enova.radio.service.facade.admin.PrescriptionRadiotherapieAdminService;

import ma.enova.radio.zynerator.process.AbstractProcessImpl;
import ma.enova.radio.zynerator.process.Result;
import ma.enova.radio.bean.core.PrescriptionRadiotherapie;

public class PrescriptionRadiotherapieSuivreConsultationAdminProcessImpl extends AbstractProcessImpl<PrescriptionRadiotherapieSuivreConsultationAdminInput, PrescriptionRadiotherapieSuivreConsultationAdminOutput,  PrescriptionRadiotherapie,  PrescriptionRadiotherapieSuivreConsultationAdminConverter> implements PrescriptionRadiotherapieSuivreConsultationAdminProcess {

    @Override
    public void init(PrescriptionRadiotherapieSuivreConsultationAdminInput input, PrescriptionRadiotherapie item) {

    }

    @Override
    public void validate(PrescriptionRadiotherapieSuivreConsultationAdminInput input, PrescriptionRadiotherapie item, Result<PrescriptionRadiotherapieSuivreConsultationAdminInput, PrescriptionRadiotherapieSuivreConsultationAdminOutput, PrescriptionRadiotherapie> result) {
        
    }

    @Override
    public void run(PrescriptionRadiotherapieSuivreConsultationAdminInput input, PrescriptionRadiotherapie t, Result<PrescriptionRadiotherapieSuivreConsultationAdminInput, PrescriptionRadiotherapieSuivreConsultationAdminOutput, PrescriptionRadiotherapie> result) {
        
    }
    


    private PrescriptionRadiotherapieAdminService service;
    public PrescriptionRadiotherapieSuivreConsultationAdminProcessImpl(PrescriptionRadiotherapieAdminService service, PrescriptionRadiotherapieSuivreConsultationAdminConverter converter) {
        super(converter);
        this.service = service;
    }

}
