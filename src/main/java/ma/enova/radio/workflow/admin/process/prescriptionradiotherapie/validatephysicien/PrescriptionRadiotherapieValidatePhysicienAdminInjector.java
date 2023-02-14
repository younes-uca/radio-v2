package ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.validatephysicien;
import ma.enova.radio.service.facade.admin.PrescriptionRadiotherapieAdminService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrescriptionRadiotherapieValidatePhysicienAdminInjector{

    @Bean
    public PrescriptionRadiotherapieValidatePhysicienAdminProcess prescriptionRadiotherapieValidatePhysicienAdmin(PrescriptionRadiotherapieAdminService service, PrescriptionRadiotherapieValidatePhysicienAdminConverter converter) {
        return new PrescriptionRadiotherapieValidatePhysicienAdminProcessImpl(service,converter);
    }

}
