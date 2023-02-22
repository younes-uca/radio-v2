package ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.save;

import ma.enova.radio.service.facade.admin.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrescriptionRadiotherapieSaveAdminUtil {
    public static final String SAVED = "radiotherapie.save.ok";
    public static final String UPDATED = "radiotherapie.update.ok";
    public static final String FRACTIONNEMENT_STRITECTEMENT_POSITIF = "radiotherapie.save.fractionnement.stritectement-positif";
    public static final String FREQUENCE_OBLIGATOIRE = "radiotherapie.save.frequence-radiotherapie.obligatoire";
    public static final String FREQUENCE_VALEUR_NON_CONFORME = "radiotherapie.save.frequence-radiotherapie.valeur-non-conforme";
    public static final String PATIENT_IPP_OBLIGATOIRE = "radiotherapie.save.patient-ipp-obligatoire";
    public static final String DATE_DEBUT_TRAITEMENT_OBLIGATOIRE = "radiotherapie.save.date-debut-traitement.obligatoire";
    public static final String DATE_DEBUT_TRAITEMENT_INFERIEUR_AUJOUDHUI = "radiotherapie.save.date-debut-traitement.inferieur-aujoudhui";
    public static final String STATUT_OBLIGATOIRE = "radiotherapie.save.statut.obligatoire";
    public static final String VISEE_OBLIGATOIRE = "radiotherapie.save.visee.obligatoire";
    public static final String PROTOCOLE_INCLUSION_OBLIGATOIRE = "radiotherapie.save.protocole-inclusion.obligatoire";
    public static final String MEDECIN_PRESCRIPTEUR_OBLIGATOIRE = "radiotherapie.save.medecin-prescripteur.obligatoire";
    public static final String MODALITE_RADIOTHERAPIE_OBLIGATOIRE = "radiotherapie.save.modalite-radiotherapie.obligatoire";
    public static final String SITE_OBLIGATOIRE = "radiotherapie.save.site.obligatoire";
    public static final String DECISION_TRAITEMENT_OBLIGATOIRE = "radiotherapie.save.decision-traitement.obligatoire";


    @Bean
    public PrescriptionRadiotherapieSaveAdminProcess prescriptionRadiotherapieSaveAdmin(PrescriptionRadiotherapieAdminService service, StatutRadiotherapieAdminService statutRadiotherapieService,
                                                                                        SeanceRadiotherapieAdminService seanceRadiotherapieService, PrescriptionRadiotherapieSaveAdminConverter converter,
                                                                                        HistortiquePrescriptionRadiotherapieAdminService histortiquePrescriptionRadiotherapieService, ViseeAdminService viseeService,
                                                                                        ProtocoleInclusionAdminService protocoleInclusionService, PersonnelAdminService personnelService, PatientAdminService patientService,
                                                                                        ModaliteRadiotherapieAdminService modaliteRadiotherapieService, SiteAdminService siteService,
                                                                                        DecisionTraitementAdminService decisionTraitementService, SpecialiteAdminService specialiteService, FrequenceRadiotherapieAdminService frequenceRadiotherapieService) {
        return new PrescriptionRadiotherapieSaveAdminProcessImpl(service, statutRadiotherapieService, seanceRadiotherapieService, converter, histortiquePrescriptionRadiotherapieService, viseeService, protocoleInclusionService,
                personnelService, patientService, modaliteRadiotherapieService, siteService, decisionTraitementService, specialiteService, frequenceRadiotherapieService);
    }

}
