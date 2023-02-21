package ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.save;

import ma.enova.radio.bean.core.*;
import ma.enova.radio.constant.StatutRadioTherapieConstant;
import ma.enova.radio.service.facade.admin.*;
import ma.enova.radio.zynerator.process.AbstractProcessImpl;
import ma.enova.radio.zynerator.process.Result;
import ma.enova.radio.zynerator.util.DateUtil;
import ma.enova.radio.zynerator.util.StringUtil;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class PrescriptionRadiotherapieSaveAdminProcessImpl extends AbstractProcessImpl<PrescriptionRadiotherapieSaveAdminInput, PrescriptionRadiotherapieSaveAdminOutput, PrescriptionRadiotherapie, PrescriptionRadiotherapieSaveAdminConverter> implements PrescriptionRadiotherapieSaveAdminProcess {

 
    public void init(PrescriptionRadiotherapieSaveAdminInput input, PrescriptionRadiotherapie item) {
        service.updateStatutPrescription(item, StatutRadioTherapieConstant.EN_ATTENTE_SIMULATION_CODE);
        if (item.getDecisionTraitement() != null) {
            item.getDecisionTraitement().setStatutRadiotherapie(item.getStatutRadiotherapie());
        }
        item.setSpecialite(specialiteService.findOrSave(item.getSpecialite()));
        item.setPatient(patientService.findOrSave(item.getPatient()));
        item.setVisee(viseeService.findOrSave(item.getVisee()));
        item.setMedecinPrescripteur(personnelService.findOrSave(item.getMedecinPrescripteur()));
        item.setProtocoleInclusion(protocoleInclusionService.findOrSave(item.getProtocoleInclusion()));
        item.setModaliteRadiotherapie(modaliteRadiotherapieService.findOrSave(item.getModaliteRadiotherapie()));
        item.setSite(siteService.findOrSave(item.getSite()));
        item.setDecisionTraitement(decisionTraitementService.findOrSave(item.getDecisionTraitement()));
    }

    @Override
    public void validate(PrescriptionRadiotherapieSaveAdminInput input, PrescriptionRadiotherapie t, Result<PrescriptionRadiotherapieSaveAdminInput, PrescriptionRadiotherapieSaveAdminOutput, PrescriptionRadiotherapie> result) {
        validateDateTraitement(t.getDateDebutTraitement(), result);
        validateFrequenceRadio(t.getFrequenceRadiotherapie(), result);
        validateFraction(t.getFractionnement(), result);
        validateDateTraitement(t.getDateDebutTraitement(), result);
        validateFraction(t.getFractionnement(), result);

        validateStatutRadiotherapie(t.getStatutRadiotherapie(), result);
        validatePatient(t.getPatient(), result);
        validateVisee(t.getVisee(), result);
        validatePersonnel(t.getMedecinPrescripteur(), result);
        validateProtocoleInclusion(t.getRcc(), t.getProtocoleInclusion(), result);
        validateModaliteRadiotherapie(t.getModaliteRadiotherapie(), result);
        validateSite(t.getSite(), result);
        validateDecisionTraitement(t.getDecisionTraitement(), result);

    }

    @Override
    public void run(PrescriptionRadiotherapieSaveAdminInput input, PrescriptionRadiotherapie t, Result<PrescriptionRadiotherapieSaveAdminInput, PrescriptionRadiotherapieSaveAdminOutput, PrescriptionRadiotherapie> result) {
        constrctSeanceRadioTherapie(t);
        int res = deleteSeanceRadioIfPrescriptionRadiotherapieExist(t);
        service.create(t);
        for (SeanceRadiotherapie seanceRadiotherapie : t.getSeanceRadiotherapies()) {
            seanceRadiotherapie.setPrescriptionRadiotherapie(t);
            seanceRadiotherapieService.create(seanceRadiotherapie);
        }
        histortiquePrescriptionRadiotherapieService.createFromPrescription(t.getId(), t.getStatutRadiotherapie());
        String message = RADIO_SAVED;
        if (res == 1) {
            message = RADIO_UPDATED;
        }
        result.addInfoMessage(message);
    }

    private int deleteSeanceRadioIfPrescriptionRadiotherapieExist(PrescriptionRadiotherapie t) {
        int res = 0;
        if (t != null && t.getId() != null) {
            seanceRadiotherapieService.deleteByPrescriptionRadiotherapieId(t.getId());
            res = 1;
        }
        return res;
    }

    private void constrctSeanceRadioTherapie(PrescriptionRadiotherapie t) {
        if (t.getSeanceRadiotherapies() == null) {
            t.setSeanceRadiotherapies(new ArrayList<>());
        }
        for (int i = 0; i < t.getFractionnement(); i++) {
            SeanceRadiotherapie seanceRadiotherapie = new SeanceRadiotherapie();
            seanceRadiotherapie.setDatePrevu(DateUtil.addFrequence(t.getDateDebutTraitement(), i, t.getFrequenceRadiotherapie().getCode()));
            seanceRadiotherapie.setNumero(i + 1);
            t.getSeanceRadiotherapies().add(seanceRadiotherapie);
        }
        t.setNombreTotalSeance(t.getFractionnement());
    }

    private void validateFraction(Integer fractionnement, Result result) {
        if (fractionnement == null || fractionnement <= 0) {
            result.addErrorMessage(RADIOTHERAPIE_SAVE_FRACTIONNEMENT_STRITECTEMENT_POSITIF);
        }
    }

    private void validateFrequenceRadio(FrequenceRadiotherapie frequenceRadiotherapie, Result result) {
        List<String> frequenceRadiotherapies = Arrays.asList("heure", "jour", "semaine", "mois");
        if (frequenceRadiotherapie != null && StringUtil.isEmpty(frequenceRadiotherapie.getCode())) {
            result.addErrorMessage(RADIOTHERAPIE_SAVE_FREQUENCE_RADIOTHERAPIE_OBLIGATOIRE);
        } else if (!frequenceRadiotherapies.contains(frequenceRadiotherapie.getCode())) {
            result.addErrorMessage(RADIOTHERAPIE_SAVE_FREQUENCE_RADIOTHERAPIE_VALEUR_NON_CONFORME);
        }
    }

    private void validatePatient(Patient patient, Result result) {
        if (patient == null || StringUtil.isEmpty(patient.getIpp())) {
            result.addErrorMessage(RADIOTHERAPIE_SAVE_PATIENT_IPP_OBLIGATOIRE);
        }
    }

    private void validateDateTraitement(LocalDate dateDebutTraitement, Result result) {
        if (dateDebutTraitement == null) {
            result.addErrorMessage(RADIOTHERAPIE_SAVE_DATE_DEBUT_TRAITEMENT_OBLIGATOIRE);
        } else if (DateUtil.isBeforeNow(dateDebutTraitement)) {
            result.addErrorMessage(RADIOTHERAPIE_SAVE_DATE_DEBUT_TRAITEMENT_INFERIEUR_AUJOUDHUI);
        }
    }

    private void validateStatutRadiotherapie(StatutRadiotherapie statutRadiotherapie, Result<PrescriptionRadiotherapieSaveAdminInput, PrescriptionRadiotherapieSaveAdminOutput, PrescriptionRadiotherapie> result) {
        if (statutRadiotherapie == null || StringUtil.isEmpty(statutRadiotherapie.getCode())) {
            result.addErrorMessage(RADIOTHERAPIE_SAVE_STATUT_OBLIGATOIRE);
        }
    }

    private void validateVisee(Visee visee, Result<PrescriptionRadiotherapieSaveAdminInput, PrescriptionRadiotherapieSaveAdminOutput, PrescriptionRadiotherapie> result) {
        if (visee == null || StringUtil.isEmpty(visee.getCode())) {
            result.addErrorMessage(RADIOTHERAPIE_SAVE_VISEE_OBLIGATOIRE);
        }
    }

    private void validateProtocoleInclusion(Boolean rcc, ProtocoleInclusion protocoleInclusion, Result<PrescriptionRadiotherapieSaveAdminInput, PrescriptionRadiotherapieSaveAdminOutput, PrescriptionRadiotherapie> result) {
        if (rcc != null && rcc.equals(true)) {
            if (protocoleInclusion == null || StringUtil.isEmpty(protocoleInclusion.getCode())) {
                result.addErrorMessage(RADIOTHERAPIE_SAVE_PROTOCOLE_INCLUSION_OBLIGATOIRE);
            }
        }
    }

    private void validatePersonnel(Personnel medecinPrescripteur, Result<PrescriptionRadiotherapieSaveAdminInput, PrescriptionRadiotherapieSaveAdminOutput, PrescriptionRadiotherapie> result) {
        if (medecinPrescripteur == null || StringUtil.isEmpty(medecinPrescripteur.getNom())) {
            result.addErrorMessage(RADIOTHERAPIE_SAVE_MEDECIN_PRESCRIPTEUR_OBLIGATOIRE);
        }
    }

    private void validateModaliteRadiotherapie(ModaliteRadiotherapie modaliteRadiotherapie, Result<PrescriptionRadiotherapieSaveAdminInput, PrescriptionRadiotherapieSaveAdminOutput, PrescriptionRadiotherapie> result) {
        if (modaliteRadiotherapie == null || StringUtil.isEmpty(modaliteRadiotherapie.getCode())) {
            result.addErrorMessage(RADIOTHERAPIE_SAVE_MODALITE_RADIOTHERAPIE_OBLIGATOIRE);
        }
    }

    private void validateSite(Site site, Result<PrescriptionRadiotherapieSaveAdminInput, PrescriptionRadiotherapieSaveAdminOutput, PrescriptionRadiotherapie> result) {
        if (site == null || StringUtil.isEmpty(site.getCode())) {
            result.addErrorMessage(RADIOTHERAPIE_SAVE_SITE_OBLIGATOIRE);
        }
    }

    private void validateDecisionTraitement(DecisionTraitement decisionTraitement, Result<PrescriptionRadiotherapieSaveAdminInput, PrescriptionRadiotherapieSaveAdminOutput, PrescriptionRadiotherapie> result) {
        if (decisionTraitement == null || StringUtil.isEmpty(decisionTraitement.getId())) {
            result.addErrorMessage(RADIOTHERAPIE_SAVE_DECISION_TRAITEMENT_OBLIGATOIRE);
        }
    }

    private PrescriptionRadiotherapieAdminService service;
    private SeanceRadiotherapieAdminService seanceRadiotherapieService;
    private StatutRadiotherapieAdminService statutRadiotherapieService;
    private HistortiquePrescriptionRadiotherapieAdminService histortiquePrescriptionRadiotherapieService;
    private ViseeAdminService viseeService;
    private ProtocoleInclusionAdminService protocoleInclusionService;
    private PersonnelAdminService personnelService;
    private PatientAdminService patientService;
    private SpecialiteAdminService specialiteService;
    private ModaliteRadiotherapieAdminService modaliteRadiotherapieService;
    private SiteAdminService siteService;
    private DecisionTraitementAdminService decisionTraitementService;

    private static final String RADIO_SAVED = "radiotherapie.save.ok";
    private static final String RADIO_UPDATED = "radiotherapie.update.ok";
    private static final String RADIOTHERAPIE_SAVE_FRACTIONNEMENT_STRITECTEMENT_POSITIF = "radiotherapie.save.fractionnement.stritectement-positif";
    private static final String RADIOTHERAPIE_SAVE_FREQUENCE_RADIOTHERAPIE_OBLIGATOIRE = "radiotherapie.save.frequenceRadiotherapie.obligatoire";
    private static final String RADIOTHERAPIE_SAVE_FREQUENCE_RADIOTHERAPIE_VALEUR_NON_CONFORME = "radiotherapie.save.frequenceRadiotherapie.valeur-non-conforme";
    private static final String RADIOTHERAPIE_SAVE_PATIENT_IPP_OBLIGATOIRE = "radiotherapie.save.patient.ipp-obligatoire";
    private static final String RADIOTHERAPIE_SAVE_DATE_DEBUT_TRAITEMENT_OBLIGATOIRE = "radiotherapie.save.dateDebutTraitement-obligatoire";
    private static final String RADIOTHERAPIE_SAVE_DATE_DEBUT_TRAITEMENT_INFERIEUR_AUJOUDHUI = "radiotherapie.save.dateDebutTraitement.inferieur-aujoudhui";
    private static final String RADIOTHERAPIE_SAVE_STATUT_OBLIGATOIRE = "radiotherapie.save.statut.obligatoire";
    private static final String RADIOTHERAPIE_SAVE_VISEE_OBLIGATOIRE = "radiotherapie.save.visee.obligatoire";
    private static final String RADIOTHERAPIE_SAVE_PROTOCOLE_INCLUSION_OBLIGATOIRE = "radiotherapie.save.protocole-inclusion.obligatoire";
    private static final String RADIOTHERAPIE_SAVE_MEDECIN_PRESCRIPTEUR_OBLIGATOIRE = "radiotherapie.save.medecin-prescripteur.obligatoire";
    private static final String RADIOTHERAPIE_SAVE_MODALITE_RADIOTHERAPIE_OBLIGATOIRE = "radiotherapie.save.modalite-radiotherapie.obligatoire";
    private static final String RADIOTHERAPIE_SAVE_SITE_OBLIGATOIRE = "radiotherapie.save.site.obligatoire";
    private static final String RADIOTHERAPIE_SAVE_DECISION_TRAITEMENT_OBLIGATOIRE = "radiotherapie.save.decision-traitement.obligatoire";

    public PrescriptionRadiotherapieSaveAdminProcessImpl(PrescriptionRadiotherapieAdminService service, StatutRadiotherapieAdminService statutRadiotherapieService, SeanceRadiotherapieAdminService seanceRadiotherapieService,
                                                         PrescriptionRadiotherapieSaveAdminConverter converter, HistortiquePrescriptionRadiotherapieAdminService histortiquePrescriptionRadiotherapieService,
                                                         ViseeAdminService viseeService, ProtocoleInclusionAdminService protocoleInclusionService,
                                                         PersonnelAdminService personnelService, PatientAdminService patientService, ModaliteRadiotherapieAdminService modaliteRadiotherapieService,
                                                         SiteAdminService siteService, DecisionTraitementAdminService decisionTraitementService,SpecialiteAdminService specialiteService) {
        super(converter);
        this.service = service;
        this.seanceRadiotherapieService = seanceRadiotherapieService;
        this.statutRadiotherapieService = statutRadiotherapieService;
        this.histortiquePrescriptionRadiotherapieService = histortiquePrescriptionRadiotherapieService;
        this.viseeService = viseeService;
        this.protocoleInclusionService = protocoleInclusionService;
        this.personnelService = personnelService;
        this.patientService = patientService;
        this.modaliteRadiotherapieService = modaliteRadiotherapieService;
        this.siteService = siteService;
        this.decisionTraitementService = decisionTraitementService;
        this.specialiteService = specialiteService;
    }
}
