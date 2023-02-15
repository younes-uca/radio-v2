package ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.save;

import ma.enova.radio.bean.core.DecisionTraitement;
import ma.enova.radio.bean.core.PrescriptionRadiotherapie;
import ma.enova.radio.bean.core.SeanceRadiotherapie;
import ma.enova.radio.constant.StatutRadioTherapieConstant;
import ma.enova.radio.service.facade.admin.*;
import ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.util.RadiotherapieValidator;
import ma.enova.radio.zynerator.process.AbstractProcessImpl;
import ma.enova.radio.zynerator.process.Result;
import ma.enova.radio.zynerator.util.DateUtil;
import ma.enova.radio.zynerator.util.StringUtil;

import java.util.ArrayList;


public class PrescriptionRadiotherapieSaveAdminProcessImpl extends AbstractProcessImpl<PrescriptionRadiotherapieSaveAdminInput, PrescriptionRadiotherapieSaveAdminOutput, PrescriptionRadiotherapie, PrescriptionRadiotherapieSaveAdminConverter> implements PrescriptionRadiotherapieSaveAdminProcess {

    public void init(PrescriptionRadiotherapieSaveAdminInput input, PrescriptionRadiotherapie item) {
        item.setStatutRadiotherapie(statutRadiotherapieService.findByCode(StatutRadioTherapieConstant.EN_ATTENTE_PRESCRIPTION));
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
        RadiotherapieValidator.validateDateTraitement(t.getDateSouhaiteDebutTraitement(), result);
        RadiotherapieValidator.validateFrequenceRadio(t.getFrequenceRadiotherapie(), result);
        RadiotherapieValidator.validateFraction(t.getFractionnement(), result);
        RadiotherapieValidator.validateDateTraitement(t.getDateSouhaiteDebutTraitement(), result);
        RadiotherapieValidator.validateFraction(t.getFractionnement(), result);

        RadiotherapieValidator.validateStatutRadiotherapie(t.getStatutRadiotherapie(), result);
        RadiotherapieValidator.validatePatient(t.getPatient(), result);
        RadiotherapieValidator.validateVisee(t.getVisee(), result);
        RadiotherapieValidator.validatePersonnel(t.getMedecinPrescripteur(), result);
        RadiotherapieValidator.validateProtocoleInclusion(t.getProtocoleInclusion(), result);
        RadiotherapieValidator.validateModaliteRadiotherapie(t.getModaliteRadiotherapie(), result);
        RadiotherapieValidator.validateSite(t.getSite(), result);
        RadiotherapieValidator.validateDecisionTraitement(t.getDecisionTraitement(), result);

    }

    @Override
    public void run(PrescriptionRadiotherapieSaveAdminInput input, PrescriptionRadiotherapie t, Result<PrescriptionRadiotherapieSaveAdminInput, PrescriptionRadiotherapieSaveAdminOutput, PrescriptionRadiotherapie> result) {
        constrctSeanceRadioTherapie(t);
        service.create(t);
        for (SeanceRadiotherapie seanceRadiotherapie : t.getSeanceRadiotherapies()) {
            seanceRadiotherapie.setPrescriptionRadiotherapie(t);
            seanceRadiotherapieService.create(seanceRadiotherapie);
        }
        histortiquePrescriptionRadiotherapieService.createFromPrescription(t.getId(), t.getStatutRadiotherapie());
        result.addInfoMessage("radiotherapie.save.ok");
    }

    private void constrctSeanceRadioTherapie(PrescriptionRadiotherapie t) {
        if (t.getSeanceRadiotherapies() == null) {
            t.setSeanceRadiotherapies(new ArrayList<>());
        }
        for (int i = 0; i < t.getFractionnement(); i++) {
            SeanceRadiotherapie seanceRadiotherapie = new SeanceRadiotherapie();
            seanceRadiotherapie.setDatePrevu(DateUtil.addFrequence(t.getDateSouhaiteDebutTraitement(), i, t.getFrequenceRadiotherapie()));
            seanceRadiotherapie.setNumero(i + 1);
            t.getSeanceRadiotherapies().add(seanceRadiotherapie);
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
