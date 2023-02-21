package ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.finirtraitement;

import ma.enova.radio.bean.core.PrescriptionRadiotherapie;
import ma.enova.radio.ws.converter.*;
import ma.enova.radio.zynerator.process.AbstractProcessConverter;
import ma.enova.radio.zynerator.util.DateUtil;
import ma.enova.radio.zynerator.util.ListUtil;
import ma.enova.radio.zynerator.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PrescriptionRadiotherapieFinirTraitementAdminConverter extends AbstractProcessConverter<PrescriptionRadiotherapieFinirTraitementAdminInput, PrescriptionRadiotherapieFinirTraitementAdminOutput, PrescriptionRadiotherapie> {

    @Autowired
    private ModaliteRadiotherapieConverter modaliteRadiotherapieConverter;
    @Autowired
    private HistortiquePrescriptionRadiotherapieConverter histortiquePrescriptionRadiotherapieConverter;
    @Autowired
    private StatutRadiotherapieConverter statutRadiotherapieConverter;
    @Autowired
    private SiteConverter siteConverter;
    @Autowired
    private TypeTraitementConverter typeTraitementConverter;
    @Autowired
    private PersonnelConverter personnelConverter;
    @Autowired
    private DecisionTraitementConverter decisionTraitementConverter;
    @Autowired
    private FrequenceRadiotherapieConverter frequenceRadiotherapieConverter;
    @Autowired
    private ImmobilistionConverter immobilistionConverter;
    @Autowired
    private PositionnementConverter positionnementConverter;
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
    private boolean decisionTraitement = true;
    private boolean frequenceRadiotherapie = true;
    private boolean positionnement = true;
    private boolean immobilisation = true;

    private boolean medecinPrescripteur = true;
    private boolean site = true;
    private boolean modaliteRadiotherapie = true;
    private boolean visee = true;
    private boolean protocoleInclusion = true;
    private boolean statutRadiotherapie = true;
    private boolean validateurSimulation = true;
    private boolean patient = true;
    private boolean typeTraitement = true;
    private boolean consultationRadiotherapies = true;
    private boolean seanceRadiotherapies = true;
    private boolean histortiquePrescriptionRadiotherapies = true;

    public PrescriptionRadiotherapieFinirTraitementAdminConverter() {
        super(PrescriptionRadiotherapie.class, PrescriptionRadiotherapieFinirTraitementAdminInput.class, PrescriptionRadiotherapieFinirTraitementAdminOutput.class);
    }

    @Override
    public PrescriptionRadiotherapie toItem(PrescriptionRadiotherapieFinirTraitementAdminInput input) {
        if (input == null) {
            return null;
        } else {
            PrescriptionRadiotherapie item = new PrescriptionRadiotherapie();
            if (StringUtil.isNotEmpty(input.getId()))
                item.setId(input.getId());
            if (StringUtil.isNotEmpty(input.getDateFinTraitement()))
                item.setDateFinTraitement(DateUtil.stringEnToDate(input.getDateFinTraitement()));
            if (StringUtil.isNotEmpty(input.getCompteRendu()))
                item.setCompteRendu(input.getCompteRendu());
            if (StringUtil.isNotEmpty(input.getCompteRendu()))
                item.setCompteRendu(input.getCompteRendu());
            if (this.decisionTraitement && input.getDecisionTraitement() != null) {
                item.setDecisionTraitement(decisionTraitementConverter.toItem(input.getDecisionTraitement()));
                if (StringUtil.isNotEmpty(input.getDecisionTraitement().getLabel())) {
                    item.getDecisionTraitement().setCode(input.getDecisionTraitement().getLabel());
                }
            }

            return item;
        }
    }

    @Override
    public PrescriptionRadiotherapieFinirTraitementAdminOutput toOutput(PrescriptionRadiotherapie item) {
        if (item == null) {
            return null;
        } else {
            PrescriptionRadiotherapieFinirTraitementAdminOutput output = new PrescriptionRadiotherapieFinirTraitementAdminOutput();
            if (StringUtil.isNotEmpty(item.getId()))
                output.setId(item.getId());
            if (item.getDatePrescription() != null)
                output.setDatePrescription(DateUtil.dateTimeToString(item.getDatePrescription()));
            output.setRcc(item.getRcc());
            if (StringUtil.isNotEmpty(item.getDose()))
                output.setDose(item.getDose());
            if (StringUtil.isNotEmpty(item.getFractionnement()))
                output.setFractionnement(item.getFractionnement());
            if (StringUtil.isNotEmpty(item.getEtalement()))
                output.setEtalement(item.getEtalement());

            if (item.getDateSouhaiteDebutTraitement() != null)
                output.setDateSouhaiteDebutTraitement(DateUtil.dateTimeToString(item.getDateSouhaiteDebutTraitement()));
            if (StringUtil.isNotEmpty(item.getObservation()))
                output.setObservation(item.getObservation());
            if (item.getDateSimulation() != null)
                output.setDateSimulation(DateUtil.dateTimeToString(item.getDateSimulation()));

            if (StringUtil.isNotEmpty(item.getFichierTraitements()))
                output.setFichierTraitements(item.getFichierTraitements());
            if (item.getValidateurSimulationDate() != null)
                output.setValidateurSimulationDate(DateUtil.dateTimeToString(item.getValidateurSimulationDate()));
            if (item.getDatePrevu() != null)
                output.setDatePrevu(DateUtil.dateTimeToString(item.getDatePrevu()));
            if (item.getDateDebutTraitement() != null)
                output.setDateDebutTraitement(DateUtil.dateTimeToString(item.getDateDebutTraitement()));
            if (item.getDateFinTraitement() != null)
                output.setDateFinTraitement(DateUtil.dateTimeToString(item.getDateFinTraitement()));
            if (item.getDateDecisionTraitement() != null)
                output.setDateDecisionTraitement(DateUtil.dateTimeToString(item.getDateDecisionTraitement()));
            if (StringUtil.isNotEmpty(item.getCompteRendu()))
                output.setCompteRendu(item.getCompteRendu());
            output.setActif(item.getActif());
            if (StringUtil.isNotEmpty(item.getNombreSeanceRealise()))
                output.setNombreSeanceRealise(item.getNombreSeanceRealise());
            if (StringUtil.isNotEmpty(item.getNombreTotalSeance()))
                output.setNombreTotalSeance(item.getNombreTotalSeance());


            if (this.immobilisation && item.getImmobilistion() != null) {
                output.setImmobilistion(immobilistionConverter.toDto(item.getImmobilistion()));
            }
            if (this.positionnement && item.getPositionnement() != null) {
                output.setPositionnement(positionnementConverter.toDto(item.getPositionnement()));
            }

            if (this.frequenceRadiotherapie && item.getFrequenceRadiotherapie() != null) {
                output.setFrequenceRadiotherapie(frequenceRadiotherapieConverter.toDto(item.getFrequenceRadiotherapie()));
            }
            if (this.decisionTraitement && item.getDecisionTraitement() != null) {
                output.setDecisionTraitement(decisionTraitementConverter.toDto(item.getDecisionTraitement()));
            }
            if (this.medecinPrescripteur && item.getMedecinPrescripteur() != null) {
                output.setMedecinPrescripteur(personnelConverter.toDto(item.getMedecinPrescripteur()));
            }
            if (this.site && item.getSite() != null) {
                output.setSite(siteConverter.toDto(item.getSite()));
            }
            if (this.modaliteRadiotherapie && item.getModaliteRadiotherapie() != null) {
                output.setModaliteRadiotherapie(modaliteRadiotherapieConverter.toDto(item.getModaliteRadiotherapie()));
            }
            if (this.visee && item.getVisee() != null) {
                output.setVisee(viseeConverter.toDto(item.getVisee()));
            }
            if (this.protocoleInclusion && item.getProtocoleInclusion() != null) {
                output.setProtocoleInclusion(protocoleInclusionConverter.toDto(item.getProtocoleInclusion()));
            }
            if (this.statutRadiotherapie && item.getStatutRadiotherapie() != null) {
                output.setStatutRadiotherapie(statutRadiotherapieConverter.toDto(item.getStatutRadiotherapie()));
            }
            if (this.validateurSimulation && item.getValidateurSimulation() != null) {
                output.setValidateurSimulation(personnelConverter.toDto(item.getValidateurSimulation()));
            }
            if (this.patient && item.getPatient() != null) {
                output.setPatient(patientConverter.toDto(item.getPatient()));
            }
            if (this.typeTraitement && item.getTypeTraitement() != null) {
                output.setTypeTraitement(typeTraitementConverter.toDto(item.getTypeTraitement()));
            }
            if (this.consultationRadiotherapies && ListUtil.isNotEmpty(item.getConsultationRadiotherapies())) {
                consultationRadiotherapieConverter.init(true);
                consultationRadiotherapieConverter.setPrescriptionRadiotherapie(false);
                output.setConsultationRadiotherapies(consultationRadiotherapieConverter.toDto(item.getConsultationRadiotherapies()));
                consultationRadiotherapieConverter.setPrescriptionRadiotherapie(true);

            }
            if (this.seanceRadiotherapies && ListUtil.isNotEmpty(item.getSeanceRadiotherapies())) {
                seanceRadiotherapieConverter.init(true);
                seanceRadiotherapieConverter.setPrescriptionRadiotherapie(false);
                output.setSeanceRadiotherapies(seanceRadiotherapieConverter.toDto(item.getSeanceRadiotherapies()));
                seanceRadiotherapieConverter.setPrescriptionRadiotherapie(true);

            }
            if (this.histortiquePrescriptionRadiotherapies && ListUtil.isNotEmpty(item.getHistortiquePrescriptionRadiotherapies())) {
                histortiquePrescriptionRadiotherapieConverter.init(true);
                histortiquePrescriptionRadiotherapieConverter.setPrescriptionRadiotherapie(false);
                output.setHistortiquePrescriptionRadiotherapies(histortiquePrescriptionRadiotherapieConverter.toDto(item.getHistortiquePrescriptionRadiotherapies()));
                histortiquePrescriptionRadiotherapieConverter.setPrescriptionRadiotherapie(true);

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
