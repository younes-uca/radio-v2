package ma.enova.radio.workflow.admin.process.consultationradiotherapie.save;
import ma.enova.radio.service.facade.admin.ConsultationRadiotherapieAdminService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConsultationRadiotherapieSaveAdminInjector{

    @Bean
    public ConsultationRadiotherapieSaveAdminProcess consultationRadiotherapieSaveAdmin(ConsultationRadiotherapieAdminService service, ConsultationRadiotherapieSaveAdminConverter converter) {
        return new ConsultationRadiotherapieSaveAdminProcessImpl(service,converter);
    }

}
