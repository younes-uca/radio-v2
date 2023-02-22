package ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.save;

import ma.enova.radio.bean.core.*;
import ma.enova.radio.constant.StatutRadioTherapieConstant;
import ma.enova.radio.service.facade.admin.*;
import ma.enova.radio.service.util.admin.RabbitUtils;
import ma.enova.radio.ws.dto.DecisionTraitementDto;
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
        item.setFrequenceRadiotherapie(frequenceRadiotherapieService.findOrSave(item.getFrequenceRadiotherapie()));
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
        // TODO : 1-Ismail plz le code de verification  de t.getDecisionTraitement() && t.getDecisionTraitement().getId() Doit etre dans validate et non pas dans run
        if (t.getDecisionTraitement() != null && t.getDecisionTraitement().getId() != null) {
            // TODO : 1-Ismail plz le code de conversion de DecisionTraitementDto  doit etre dans le SaveConverter
            DecisionTraitementDto decisiontraitementDto = new DecisionTraitementDto(t.getDecisionTraitement().getId(), null, t.getStatutRadiotherapie().getCode());
            RabbitUtils.convertAndSend(decisiontraitementDto);
        }
        String message = PrescriptionRadiotherapieSaveAdminUtil.SAVED;
        if (res == 1) {
            message = PrescriptionRadiotherapieSaveAdminUtil.UPDATED;
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
            result.addErrorMessage(PrescriptionRadiotherapieSaveAdminUtil.FRACTIONNEMENT_STRITECTEMENT_POSITIF);
        }
    }

    private void validateFrequenceRadio(FrequenceRadiotherapie frequenceRadiotherapie, Result result) {
        List<String> frequenceRadiotherapies = Arrays.asList("heure", "jour", "semaine", "mois","quotidienne");
        if (frequenceRadiotherapie != null && StringUtil.isEmpty(frequenceRadiotherapie.getCode())) {
            result.addErrorMessage(PrescriptionRadiotherapieSaveAdminUtil.FREQUENCE_OBLIGATOIRE);
        } else if (!frequenceRadiotherapies.contains(frequenceRadiotherapie.getCode())) {
            result.addErrorMessage(PrescriptionRadiotherapieSaveAdminUtil.FREQUENCE_VALEUR_NON_CONFORME);
        }
    }

    private void validatePatient(Patient patient, Result result) {
        if (patient == null || StringUtil.isEmpty(patient.getIpp())) {
            result.addErrorMessage(PrescriptionRadiotherapieSaveAdminUtil.PATIENT_IPP_OBLIGATOIRE);
        }
    }

    private void validateDateTraitement(LocalDate dateDebutTraitement, Result result) {
        if (dateDebutTraitement == null) {
            result.addErrorMessage(PrescriptionRadiotherapieSaveAdminUtil.DATE_DEBUT_TRAITEMENT_OBLIGATOIRE);
        } else if (DateUtil.isBeforeNow(dateDebutTraitement)) {
            result.addErrorMessage(PrescriptionRadiotherapieSaveAdminUtil.DATE_DEBUT_TRAITEMENT_INFERIEUR_AUJOUDHUI);
        }
    }

    private void validateStatutRadiotherapie(StatutRadiotherapie statutRadiotherapie, Result<PrescriptionRadiotherapieSaveAdminInput, PrescriptionRadiotherapieSaveAdminOutput, PrescriptionRadiotherapie> result) {
        if (statutRadiotherapie == null || StringUtil.isEmpty(statutRadiotherapie.getCode())) {
            result.addErrorMessage(PrescriptionRadiotherapieSaveAdminUtil.STATUT_OBLIGATOIRE);
        }
    }

    private void validateVisee(Visee visee, Result<PrescriptionRadiotherapieSaveAdminInput, PrescriptionRadiotherapieSaveAdminOutput, PrescriptionRadiotherapie> result) {
        if (visee == null || StringUtil.isEmpty(visee.getCode())) {
            result.addErrorMessage(PrescriptionRadiotherapieSaveAdminUtil.VISEE_OBLIGATOIRE);
        }
    }

    private void validateProtocoleInclusion(Boolean rcc, ProtocoleInclusion protocoleInclusion, Result<PrescriptionRadiotherapieSaveAdminInput, PrescriptionRadiotherapieSaveAdminOutput, PrescriptionRadiotherapie> result) {
        if (rcc != null && rcc.equals(true)) {
            if (protocoleInclusion == null || StringUtil.isEmpty(protocoleInclusion.getCode())) {
                result.addErrorMessage(PrescriptionRadiotherapieSaveAdminUtil.PROTOCOLE_INCLUSION_OBLIGATOIRE);
            }
        }
    }

    private void validatePersonnel(Personnel medecinPrescripteur, Result<PrescriptionRadiotherapieSaveAdminInput, PrescriptionRadiotherapieSaveAdminOutput, PrescriptionRadiotherapie> result) {
        if (medecinPrescripteur == null || StringUtil.isEmpty(medecinPrescripteur.getNom())) {
            result.addErrorMessage(PrescriptionRadiotherapieSaveAdminUtil.MEDECIN_PRESCRIPTEUR_OBLIGATOIRE);
        }
    }

    private void validateModaliteRadiotherapie(ModaliteRadiotherapie modaliteRadiotherapie, Result<PrescriptionRadiotherapieSaveAdminInput, PrescriptionRadiotherapieSaveAdminOutput, PrescriptionRadiotherapie> result) {
        if (modaliteRadiotherapie == null || StringUtil.isEmpty(modaliteRadiotherapie.getCode())) {
            result.addErrorMessage(PrescriptionRadiotherapieSaveAdminUtil.MODALITE_RADIOTHERAPIE_OBLIGATOIRE);
        }
    }

    private void validateSite(Site site, Result<PrescriptionRadiotherapieSaveAdminInput, PrescriptionRadiotherapieSaveAdminOutput, PrescriptionRadiotherapie> result) {
        if (site == null || StringUtil.isEmpty(site.getCode())) {
            result.addErrorMessage(PrescriptionRadiotherapieSaveAdminUtil.SITE_OBLIGATOIRE);
        }
    }

    private void validateDecisionTraitement(DecisionTraitement decisionTraitement, Result<PrescriptionRadiotherapieSaveAdminInput, PrescriptionRadiotherapieSaveAdminOutput, PrescriptionRadiotherapie> result) {
        if (decisionTraitement == null || StringUtil.isEmpty(decisionTraitement.getId())) {
            result.addErrorMessage(PrescriptionRadiotherapieSaveAdminUtil.DECISION_TRAITEMENT_OBLIGATOIRE);
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
    private FrequenceRadiotherapieAdminService frequenceRadiotherapieService;
    private SpecialiteAdminService specialiteService;
    private ModaliteRadiotherapieAdminService modaliteRadiotherapieService;
    private SiteAdminService siteService;
    private DecisionTraitementAdminService decisionTraitementService;

    public PrescriptionRadiotherapieSaveAdminProcessImpl(PrescriptionRadiotherapieAdminService service, StatutRadiotherapieAdminService statutRadiotherapieService, SeanceRadiotherapieAdminService seanceRadiotherapieService,
                                                         PrescriptionRadiotherapieSaveAdminConverter converter, HistortiquePrescriptionRadiotherapieAdminService histortiquePrescriptionRadiotherapieService,
                                                         ViseeAdminService viseeService, ProtocoleInclusionAdminService protocoleInclusionService,
                                                         PersonnelAdminService personnelService, PatientAdminService patientService, ModaliteRadiotherapieAdminService modaliteRadiotherapieService,
                                                         SiteAdminService siteService, DecisionTraitementAdminService decisionTraitementService,SpecialiteAdminService specialiteService,FrequenceRadiotherapieAdminService frequenceRadiotherapieService) {
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
        this.frequenceRadiotherapieService = frequenceRadiotherapieService;
    }
}
