package ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.suivreconsultation;
import ma.enova.radio.service.facade.admin.PrescriptionRadiotherapieAdminService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrescriptionRadiotherapieSuivreConsultationAdminInjector{

    @Bean
    public PrescriptionRadiotherapieSuivreConsultationAdminProcess prescriptionRadiotherapieSuivreConsultationAdmin(PrescriptionRadiotherapieAdminService service, PrescriptionRadiotherapieSuivreConsultationAdminConverter converter) {
        return new PrescriptionRadiotherapieSuivreConsultationAdminProcessImpl(service,converter);
    }

}
