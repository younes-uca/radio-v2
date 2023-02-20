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
        item.setStatutRadiotherapie(statutRadiotherapieService.findByCode(StatutRadioTherapieConstant.EN_ATTENTE_SIMULATION));
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
        String message = "radiotherapie.save.ok";
        if (res == 1) {
            message = "radiotherapie.update.ok";
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
            result.addErrorMessage("radiotherapie.save.fractionnement.stritectement-positif");
        }
    }

    private void validateFrequenceRadio(FrequenceRadiotherapie frequenceRadiotherapie, Result result) {
        List<String> frequenceRadiotherapies = Arrays.asList("heure", "jour", "semaine", "mois");
        if (frequenceRadiotherapie!=null && StringUtil.isEmpty(frequenceRadiotherapie.getCode())) {
            result.addErrorMessage("radiotherapie.save.frequenceRadiotherapie.obligatoire");
        } else if (!frequenceRadiotherapies.contains(frequenceRadiotherapie.getCode())) {
            result.addErrorMessage("radiotherapie.save.frequenceRadiotherapie.valeur-non-conforme");
        }
    }

    private void validatePatient(Patient patient, Result result) {
        if (patient == null || StringUtil.isEmpty(patient.getIpp())) {
            result.addErrorMessage("radiotherapie.save.patient.ipp-obligatoire");
        }
    }

    private void validateDateTraitement(LocalDate dateDebutTraitement, Result result) {
        if (dateDebutTraitement == null) {
            result.addErrorMessage("radiotherapie.save.dateDebutTraitement-obligatoire");
        } else if (DateUtil.isBeforeNow(dateDebutTraitement)) {
            result.addErrorMessage("radiotherapie.save.dateDebutTraitement.inferieur-aujoudhui");
        }
    }

    private void validateStatutRadiotherapie(StatutRadiotherapie statutRadiotherapie, Result<PrescriptionRadiotherapieSaveAdminInput, PrescriptionRadiotherapieSaveAdminOutput, PrescriptionRadiotherapie> result) {
        if (statutRadiotherapie == null || StringUtil.isEmpty(statutRadiotherapie.getCode())) {
            result.addErrorMessage("radiotherapie.save.statut.obligatoire");
        }
    }

    private void validateVisee(Visee visee, Result<PrescriptionRadiotherapieSaveAdminInput, PrescriptionRadiotherapieSaveAdminOutput, PrescriptionRadiotherapie> result) {
        if (visee == null || StringUtil.isEmpty(visee.getCode())) {
            result.addErrorMessage("radiotherapie.save.visee.obligatoire");
        }
    }

    private void validateProtocoleInclusion(Boolean rcc, ProtocoleInclusion protocoleInclusion, Result<PrescriptionRadiotherapieSaveAdminInput, PrescriptionRadiotherapieSaveAdminOutput, PrescriptionRadiotherapie> result) {
        if (rcc != null && rcc.equals(true)) {
            if (protocoleInclusion == null || StringUtil.isEmpty(protocoleInclusion.getCode())) {
                result.addErrorMessage("radiotherapie.save.protocole-inclusion.obligatoire");
            }
        }
    }

    private void validatePersonnel(Personnel medecinPrescripteur, Result<PrescriptionRadiotherapieSaveAdminInput, PrescriptionRadiotherapieSaveAdminOutput, PrescriptionRadiotherapie> result) {
        if (medecinPrescripteur == null || StringUtil.isEmpty(medecinPrescripteur.getNom())) {
            result.addErrorMessage("radiotherapie.save.medecin-prescripteur.obligatoire");
        }
    }

    private void validateModaliteRadiotherapie(ModaliteRadiotherapie modaliteRadiotherapie, Result<PrescriptionRadiotherapieSaveAdminInput, PrescriptionRadiotherapieSaveAdminOutput, PrescriptionRadiotherapie> result) {
        if (modaliteRadiotherapie == null || StringUtil.isEmpty(modaliteRadiotherapie.getCode())) {
            result.addErrorMessage("radiotherapie.save.modalite-radiotherapie.obligatoire");
        }
    }

    private void validateSite(Site site, Result<PrescriptionRadiotherapieSaveAdminInput, PrescriptionRadiotherapieSaveAdminOutput, PrescriptionRadiotherapie> result) {
        if (site == null || StringUtil.isEmpty(site.getCode())) {
            result.addErrorMessage("radiotherapie.save.site.obligatoire");
        }
    }

    private void validateDecisionTraitement(DecisionTraitement decisionTraitement, Result<PrescriptionRadiotherapieSaveAdminInput, PrescriptionRadiotherapieSaveAdminOutput, PrescriptionRadiotherapie> result) {
        if (decisionTraitement == null || StringUtil.isEmpty(decisionTraitement.getCode())) {
            result.addErrorMessage("radiotherapie.save.decision-traitement.obligatoire");
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
    private ModaliteRadiotherapieAdminService modaliteRadiotherapieService;
    private SiteAdminService siteService;
    private DecisionTraitementAdminService decisionTraitementService;

    public PrescriptionRadiotherapieSaveAdminProcessImpl(PrescriptionRadiotherapieAdminService service, StatutRadiotherapieAdminService statutRadiotherapieService, SeanceRadiotherapieAdminService seanceRadiotherapieService, PrescriptionRadiotherapieSaveAdminConverter converter, HistortiquePrescriptionRadiotherapieAdminService histortiquePrescriptionRadiotherapieService, ViseeAdminService viseeService, ProtocoleInclusionAdminService protocoleInclusionService, PersonnelAdminService personnelService, PatientAdminService patientService, ModaliteRadiotherapieAdminService modaliteRadiotherapieService, SiteAdminService siteService, DecisionTraitementAdminService decisionTraitementService) {
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
    }
}
