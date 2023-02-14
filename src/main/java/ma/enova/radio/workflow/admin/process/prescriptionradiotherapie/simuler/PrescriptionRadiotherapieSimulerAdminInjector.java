package ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.simuler;
import ma.enova.radio.service.facade.admin.PrescriptionRadiotherapieAdminService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrescriptionRadiotherapieSimulerAdminInjector{

    @Bean
    public PrescriptionRadiotherapieSimulerAdminProcess prescriptionRadiotherapieSimulerAdmin(PrescriptionRadiotherapieAdminService service, PrescriptionRadiotherapieSimulerAdminConverter converter) {
        return new PrescriptionRadiotherapieSimulerAdminProcessImpl(service,converter);
    }

}
