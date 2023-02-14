package ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.save;
import ma.enova.radio.service.facade.admin.PrescriptionRadiotherapieAdminService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrescriptionRadiotherapieSaveAdminInjector{

    @Bean
    public PrescriptionRadiotherapieSaveAdminProcess prescriptionRadiotherapieSaveAdmin(PrescriptionRadiotherapieAdminService service, PrescriptionRadiotherapieSaveAdminConverter converter) {
        return new PrescriptionRadiotherapieSaveAdminProcessImpl(service,converter);
    }

}
