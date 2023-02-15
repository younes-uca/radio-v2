package ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.finirtraitement;

import ma.enova.radio.service.facade.admin.HistortiquePrescriptionRadiotherapieAdminService;
import ma.enova.radio.service.facade.admin.PrescriptionRadiotherapieAdminService;
import ma.enova.radio.service.facade.admin.StatutRadiotherapieAdminService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrescriptionRadiotherapieFinirTraitementAdminInjector {

    @Bean
    public PrescriptionRadiotherapieFinirTraitementAdminProcess prescriptionRadiotherapieFinirTraitementAdmin(PrescriptionRadiotherapieAdminService service, PrescriptionRadiotherapieFinirTraitementAdminConverter converter, StatutRadiotherapieAdminService statutRadiotherapieService, HistortiquePrescriptionRadiotherapieAdminService histortiquePrescriptionRadiotherapieService) {
        return new PrescriptionRadiotherapieFinirTraitementAdminProcessImpl(service, converter, statutRadiotherapieService, histortiquePrescriptionRadiotherapieService);
    }

}
