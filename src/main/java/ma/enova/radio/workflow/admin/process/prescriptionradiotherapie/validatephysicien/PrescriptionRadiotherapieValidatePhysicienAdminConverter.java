package ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.validatephysicien;

import ma.enova.radio.bean.core.PrescriptionRadiotherapie;
import ma.enova.radio.ws.converter.*;
import ma.enova.radio.zynerator.process.AbstractProcessConverter;
import ma.enova.radio.zynerator.util.DateUtil;
import ma.enova.radio.zynerator.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PrescriptionRadiotherapieValidatePhysicienAdminConverter extends AbstractProcessConverter<PrescriptionRadiotherapieValidatePhysicienAdminInput, PrescriptionRadiotherapieValidatePhysicienAdminOutput, PrescriptionRadiotherapie> {

    @Autowired
    private ModaliteRadiotherapieConverter modaliteRadiotherapieConverter;
    @Autowired
    private HistortiquePrescriptionRadiotherapieConverter histortiquePrescriptionRadiotherapieConverter;
    @Autowired
    private StatutRadiotherapieConverter statutRadiotherapieConverter;
    @Autowired
    private ImmobilistionConverter immobilistionConverter;
    @Autowired
    private PositionnementConverter positionnementConverter;
    @Autowired
    private SiteConverter siteConverter;
    @Autowired
    private TypeTraitementConverter typeTraitementConverter;
    @Autowired
    private PersonnelConverter personnelConverter;
    @Autowired
    private ViseeConverter viseeConverter;
    @Autowired
    private SeanceRadiotherapieConverter seanceRadiotherapieConverter;
    @Autowired
    private PatientConverter patientConverter;
    @Autowired
    private ConsultationRadiotherapieConverter consultationRadiotherapieConverter;
    @Autowired
    private TypeToxiciteRthConverter typeToxiciteRthConverter;
    @Autowired
    private TypeConsultationRadiotherapieConverter typeConsultationRadiotherapieConverter;
    @Autowired
    private ProtocoleInclusionConverter protocoleInclusionConverter;
    @Autowired
    private GradeToxiciteRthConverter gradeToxiciteRthConverter;
    private boolean decisionTraitement;
    private boolean medecinPrescripteur;
    private boolean site;
    private boolean modaliteRadiotherapie;
    private boolean visee;
    private boolean protocoleInclusion;
    private boolean statutRadiotherapie;
    private boolean validateurSimulation;
    private boolean patient;
    private boolean typeTraitement;
    private boolean consultationRadiotherapies;
    private boolean seanceRadiotherapies;
    private boolean histortiquePrescriptionRadiotherapies;

    public PrescriptionRadiotherapieValidatePhysicienAdminConverter() {
        super(PrescriptionRadiotherapie.class, PrescriptionRadiotherapieValidatePhysicienAdminInput.class, PrescriptionRadiotherapieValidatePhysicienAdminOutput.class);
    }

    @Override
    public PrescriptionRadiotherapie toItem(PrescriptionRadiotherapieValidatePhysicienAdminInput input) {
        if (input == null) {
            return null;
        } else {
            PrescriptionRadiotherapie item = new PrescriptionRadiotherapie();
            if (StringUtil.isNotEmpty(input.getId()))
                item.setId(input.getId());

            if (StringUtil.isNotEmpty(input.getDateSimulation()))
                item.setDateSimulation(DateUtil.stringEnToDate(input.getDateSimulation()));

            if (StringUtil.isNotEmpty(input.getFichierTraitements()))
                item.setFichierTraitements(input.getFichierTraitements());
            if (StringUtil.isNotEmpty(input.getValidateurSimulationDate()))
                item.setValidateurSimulationDate(DateUtil.stringEnToDate(input.getValidateurSimulationDate()));

            if (input.getImmobilistion() != null)
                item.setImmobilistion(immobilistionConverter.toItem(input.getImmobilistion()));
            if (input.getPositionnement() != null)
                item.setPositionnement(positionnementConverter.toItem(input.getPositionnement()));

            if (this.statutRadiotherapie && input.getStatutRadiotherapie() != null)
                item.setStatutRadiotherapie(statutRadiotherapieConverter.toItem(input.getStatutRadiotherapie()));

            if (this.validateurSimulation && input.getValidateurSimulation() != null)
                item.setValidateurSimulation(personnelConverter.toItem(input.getValidateurSimulation()));


            return item;
        }
    }

    @Override
    public PrescriptionRadiotherapieValidatePhysicienAdminOutput toOutput(PrescriptionRadiotherapie item) {
        if (item == null) {
            return null;
        } else {
            PrescriptionRadiotherapieValidatePhysicienAdminOutput output = new PrescriptionRadiotherapieValidatePhysicienAdminOutput();
            if (StringUtil.isNotEmpty(item.getId()))
                output.setId(item.getId());

            if (item.getDateSimulation() != null)
                output.setDateSimulation(DateUtil.dateTimeToString(item.getDateSimulation()));

            if (StringUtil.isNotEmpty(item.getFichierTraitements()))
                output.setFichierTraitements(item.getFichierTraitements());
            if (item.getValidateurSimulationDate() != null)
                output.setValidateurSimulationDate(DateUtil.dateTimeToString(item.getValidateurSimulationDate()));

            if (item.getImmobilistion() != null)
                output.setImmobilistion(immobilistionConverter.toDto(item.getImmobilistion()));
            if (item.getPositionnement() != null)
                output.setPositionnement(positionnementConverter.toDto(item.getPositionnement()));

            if (this.statutRadiotherapie && item.getStatutRadiotherapie() != null) {
                output.setStatutRadiotherapie(statutRadiotherapieConverter.toDto(item.getStatutRadiotherapie()));
            }
            return output;
        }
    }


    public ModaliteRadiotherapieConverter getModaliteRadiotherapieConverter() {
        return this.modaliteRadiotherapieConverter;
    }

    public void setModaliteRadiotherapieConverter(ModaliteRadiotherapieConverter modaliteRadiotherapieConverter) {
        this.modaliteRadiotherapieConverter = modaliteRadiotherapieConverter;
    }

    public HistortiquePrescriptionRadiotherapieConverter getHistortiquePrescriptionRadiotherapieConverter() {
        return this.histortiquePrescriptionRadiotherapieConverter;
    }

    public void setHistortiquePrescriptionRadiotherapieConverter(HistortiquePrescriptionRadiotherapieConverter histortiquePrescriptionRadiotherapieConverter) {
        this.histortiquePrescriptionRadiotherapieConverter = histortiquePrescriptionRadiotherapieConverter;
    }

    public StatutRadiotherapieConverter getStatutRadiotherapieConverter() {
        return this.statutRadiotherapieConverter;
    }

    public void setStatutRadiotherapieConverter(StatutRadiotherapieConverter statutRadiotherapieConverter) {
        this.statutRadiotherapieConverter = statutRadiotherapieConverter;
    }

    public SiteConverter getSiteConverter() {
        return this.siteConverter;
    }

    public void setSiteConverter(SiteConverter siteConverter) {
        this.siteConverter = siteConverter;
    }

    public TypeTraitementConverter getTypeTraitementConverter() {
        return this.typeTraitementConverter;
    }

    public void setTypeTraitementConverter(TypeTraitementConverter typeTraitementConverter) {
        this.typeTraitementConverter = typeTraitementConverter;
    }

    public PersonnelConverter getPersonnelConverter() {
        return this.personnelConverter;
    }

    public void setPersonnelConverter(PersonnelConverter personnelConverter) {
        this.personnelConverter = personnelConverter;
    }

    public ViseeConverter getViseeConverter() {
        return this.viseeConverter;
    }

    public void setViseeConverter(ViseeConverter viseeConverter) {
        this.viseeConverter = viseeConverter;
    }

    public SeanceRadiotherapieConverter getSeanceRadiotherapieConverter() {
        return this.seanceRadiotherapieConverter;
    }

    public void setSeanceRadiotherapieConverter(SeanceRadiotherapieConverter seanceRadiotherapieConverter) {
        this.seanceRadiotherapieConverter = seanceRadiotherapieConverter;
    }

    public PatientConverter getPatientConverter() {
        return this.patientConverter;
    }

    public void setPatientConverter(PatientConverter patientConverter) {
        this.patientConverter = patientConverter;
    }

    public ConsultationRadiotherapieConverter getConsultationRadiotherapieConverter() {
        return this.consultationRadiotherapieConverter;
    }

    public void setConsultationRadiotherapieConverter(ConsultationRadiotherapieConverter consultationRadiotherapieConverter) {
        this.consultationRadiotherapieConverter = consultationRadiotherapieConverter;
    }

    public TypeToxiciteRthConverter getTypeToxiciteRthConverter() {
        return this.typeToxiciteRthConverter;
    }

    public void setTypeToxiciteRthConverter(TypeToxiciteRthConverter typeToxiciteRthConverter) {
        this.typeToxiciteRthConverter = typeToxiciteRthConverter;
    }

    public TypeConsultationRadiotherapieConverter getTypeConsultationRadiotherapieConverter() {
        return this.typeConsultationRadiotherapieConverter;
    }

    public void setTypeConsultationRadiotherapieConverter(TypeConsultationRadiotherapieConverter typeConsultationRadiotherapieConverter) {
        this.typeConsultationRadiotherapieConverter = typeConsultationRadiotherapieConverter;
    }

    public ProtocoleInclusionConverter getProtocoleInclusionConverter() {
        return this.protocoleInclusionConverter;
    }

    public void setProtocoleInclusionConverter(ProtocoleInclusionConverter protocoleInclusionConverter) {
        this.protocoleInclusionConverter = protocoleInclusionConverter;
    }

    public GradeToxiciteRthConverter getGradeToxiciteRthConverter() {
        return this.gradeToxiciteRthConverter;
    }

    public void setGradeToxiciteRthConverter(GradeToxiciteRthConverter gradeToxiciteRthConverter) {
        this.gradeToxiciteRthConverter = gradeToxiciteRthConverter;
    }


    public boolean isDecisionTraitement() {
        return this.decisionTraitement;
    }

    public void setDecisionTraitement(boolean decisionTraitement) {
        this.decisionTraitement = decisionTraitement;
    }

    public boolean isMedecinPrescripteur() {
        return this.medecinPrescripteur;
    }

    public void setMedecinPrescripteur(boolean medecinPrescripteur) {
        this.medecinPrescripteur = medecinPrescripteur;
    }

    public boolean isSite() {
        return this.site;
    }

    public void setSite(boolean site) {
        this.site = site;
    }

    public boolean isModaliteRadiotherapie() {
        return this.modaliteRadiotherapie;
    }

    public void setModaliteRadiotherapie(boolean modaliteRadiotherapie) {
        this.modaliteRadiotherapie = modaliteRadiotherapie;
    }

    public boolean isVisee() {
        return this.visee;
    }

    public void setVisee(boolean visee) {
        this.visee = visee;
    }

    public boolean isProtocoleInclusion() {
        return this.protocoleInclusion;
    }

    public void setProtocoleInclusion(boolean protocoleInclusion) {
        this.protocoleInclusion = protocoleInclusion;
    }

    public boolean isStatutRadiotherapie() {
        return this.statutRadiotherapie;
    }

    public void setStatutRadiotherapie(boolean statutRadiotherapie) {
        this.statutRadiotherapie = statutRadiotherapie;
    }

    public boolean isValidateurSimulation() {
        return this.validateurSimulation;
    }

    public void setValidateurSimulation(boolean validateurSimulation) {
        this.validateurSimulation = validateurSimulation;
    }

    public boolean isPatient() {
        return this.patient;
    }

    public void setPatient(boolean patient) {
        this.patient = patient;
    }

    public boolean isTypeTraitement() {
        return this.typeTraitement;
    }

    public void setTypeTraitement(boolean typeTraitement) {
        this.typeTraitement = typeTraitement;
    }

    public boolean isConsultationRadiotherapies() {
        return this.consultationRadiotherapies;
    }

    public void setConsultationRadiotherapies(boolean consultationRadiotherapies) {
        this.consultationRadiotherapies = consultationRadiotherapies;
    }

    public boolean isSeanceRadiotherapies() {
        return this.seanceRadiotherapies;
    }

    public void setSeanceRadiotherapies(boolean seanceRadiotherapies) {
        this.seanceRadiotherapies = seanceRadiotherapies;
    }

    public boolean isHistortiquePrescriptionRadiotherapies() {
        return this.histortiquePrescriptionRadiotherapies;
    }

    public void setHistortiquePrescriptionRadiotherapies(boolean histortiquePrescriptionRadiotherapies) {
        this.histortiquePrescriptionRadiotherapies = histortiquePrescriptionRadiotherapies;
    }
}
