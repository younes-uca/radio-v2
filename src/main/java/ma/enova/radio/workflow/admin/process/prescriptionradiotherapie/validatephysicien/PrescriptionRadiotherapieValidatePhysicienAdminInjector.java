package ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.validatephysicien;

import ma.enova.radio.service.facade.admin.HistortiquePrescriptionRadiotherapieAdminService;
import ma.enova.radio.service.facade.admin.PrescriptionRadiotherapieAdminService;
import ma.enova.radio.service.facade.admin.StatutRadiotherapieAdminService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrescriptionRadiotherapieValidatePhysicienAdminInjector {

    @Bean
    public PrescriptionRadiotherapieValidatePhysicienAdminProcess prescriptionRadiotherapieValidatePhysicienAdmin(PrescriptionRadiotherapieAdminService service, PrescriptionRadiotherapieValidatePhysicienAdminConverter converter, StatutRadiotherapieAdminService statutRadiotherapieService, HistortiquePrescriptionRadiotherapieAdminService histortiquePrescriptionRadiotherapieService) {
        return new PrescriptionRadiotherapieValidatePhysicienAdminProcessImpl(service, converter, statutRadiotherapieService, histortiquePrescriptionRadiotherapieService);
    }

}
