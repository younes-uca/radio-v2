package ma.enova.radio.workflow.admin.process.consultationradiotherapie.save;

import ma.enova.radio.bean.core.ConsultationRadiotherapie;
import ma.enova.radio.service.facade.admin.ConsultationRadiotherapieAdminService;
import ma.enova.radio.zynerator.process.AbstractProcessImpl;
import ma.enova.radio.zynerator.process.Result;

public class ConsultationRadiotherapieSaveAdminProcessImpl extends AbstractProcessImpl<ConsultationRadiotherapieSaveAdminInput, ConsultationRadiotherapieSaveAdminOutput,  ConsultationRadiotherapie,  ConsultationRadiotherapieSaveAdminConverter> implements ConsultationRadiotherapieSaveAdminProcess {

    @Override
    public void init(ConsultationRadiotherapieSaveAdminInput input, ConsultationRadiotherapie item) {

    }

    @Override
    public void validate(ConsultationRadiotherapieSaveAdminInput input, ConsultationRadiotherapie item, Result<ConsultationRadiotherapieSaveAdminInput, ConsultationRadiotherapieSaveAdminOutput, ConsultationRadiotherapie> result) {
        
    }

    @Override
    public void run(ConsultationRadiotherapieSaveAdminInput input, ConsultationRadiotherapie t, Result<ConsultationRadiotherapieSaveAdminInput, ConsultationRadiotherapieSaveAdminOutput, ConsultationRadiotherapie> result) {
        
    }
    


    private ConsultationRadiotherapieAdminService service;
    public ConsultationRadiotherapieSaveAdminProcessImpl(ConsultationRadiotherapieAdminService service, ConsultationRadiotherapieSaveAdminConverter converter) {
        super(converter);
        this.service = service;
    }

}
