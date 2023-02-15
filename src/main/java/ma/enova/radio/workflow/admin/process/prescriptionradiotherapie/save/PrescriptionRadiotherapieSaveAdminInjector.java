package ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.save;

import ma.enova.radio.service.facade.admin.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrescriptionRadiotherapieSaveAdminInjector {

    @Bean
    public PrescriptionRadiotherapieSaveAdminProcess prescriptionRadiotherapieSaveAdmin(PrescriptionRadiotherapieAdminService service, StatutRadiotherapieAdminService statutRadiotherapieService, SeanceRadiotherapieAdminService seanceRadiotherapieService, PrescriptionRadiotherapieSaveAdminConverter converter, HistortiquePrescriptionRadiotherapieAdminService histortiquePrescriptionRadiotherapieService, ViseeAdminService viseeService, ProtocoleInclusionAdminService protocoleInclusionService, PersonnelAdminService personnelService, PatientAdminService patientService, ModaliteRadiotherapieAdminService modaliteRadiotherapieService, SiteAdminService siteService, DecisionTraitementAdminService decisionTraitementService) {
        return new PrescriptionRadiotherapieSaveAdminProcessImpl(service, statutRadiotherapieService, seanceRadiotherapieService, converter, histortiquePrescriptionRadiotherapieService, viseeService, protocoleInclusionService, personnelService, patientService, modaliteRadiotherapieService, siteService, decisionTraitementService);
    }

}
