package ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.save;

import ma.enova.radio.bean.core.PrescriptionRadiotherapie;
import ma.enova.radio.ws.converter.*;
import ma.enova.radio.ws.dto.SeanceRadiotherapieDto;
import ma.enova.radio.zynerator.process.AbstractProcessConverter;
import ma.enova.radio.zynerator.util.DateUtil;
import ma.enova.radio.zynerator.util.ListUtil;
import ma.enova.radio.zynerator.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class PrescriptionRadiotherapieSaveAdminConverter extends AbstractProcessConverter<PrescriptionRadiotherapieSaveAdminInput, PrescriptionRadiotherapieSaveAdminOutput, PrescriptionRadiotherapie> {

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
    @Autowired
    private DecisionTraitementConverter decisionTraitementConverter;
    private boolean decisionTraitement = true;
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

    public PrescriptionRadiotherapieSaveAdminConverter() {
        super(PrescriptionRadiotherapie.class, PrescriptionRadiotherapieSaveAdminInput.class, PrescriptionRadiotherapieSaveAdminOutput.class);
    }

    @Override
    public PrescriptionRadiotherapie toItem(PrescriptionRadiotherapieSaveAdminInput input) {
        if (input == null) {
            return null;
        } else {
            PrescriptionRadiotherapie item = new PrescriptionRadiotherapie();
            if (StringUtil.isNotEmpty(input.getId()))
                item.setId(input.getId());
            if (StringUtil.isNotEmpty(input.getDatePrescription()))
                item.setDatePrescription(DateUtil.stringToDate(input.getDatePrescription()));
            if (input.getRcc() != null)
                item.setRcc(input.getRcc());
            if (StringUtil.isNotEmpty(input.getDose()))
                item.setDose(input.getDose());
            if (StringUtil.isNotEmpty(input.getFractionnement()))
                item.setFractionnement(input.getFractionnement());
            if (StringUtil.isNotEmpty(input.getEtalement()))
                item.setEtalement(input.getEtalement());
            if (input.getFrequenceRadiotherapie() != null && StringUtil.isNotEmpty(input.getFrequenceRadiotherapie().getCode()))
                item.setFrequenceRadiotherapie(input.getFrequenceRadiotherapie().getCode());
            if (StringUtil.isNotEmpty(input.getDateSouhaiteDebutTraitement()))
                item.setDateSouhaiteDebutTraitement(DateUtil.stringToDate(input.getDateSouhaiteDebutTraitement()));
            if (StringUtil.isNotEmpty(input.getObservation()))
                item.setObservation(input.getObservation());
            if (StringUtil.isNotEmpty(input.getImmobilistion()))
                item.setImmobilistion(input.getImmobilistion());
            if (StringUtil.isNotEmpty(input.getPositionnement()))
                item.setPositionnement(input.getPositionnement());
            if (StringUtil.isNotEmpty(input.getCompteRendu()))
                item.setCompteRendu(input.getCompteRendu());
            if (input.getActif() != null)
                item.setActif(input.getActif());
            if (StringUtil.isNotEmpty(input.getNombreSeanceRealise()))
                item.setNombreSeanceRealise(input.getNombreSeanceRealise());
            if (StringUtil.isNotEmpty(input.getNombreTotalSeance()))
                item.setNombreTotalSeance(input.getNombreTotalSeance());


            if (this.decisionTraitement && input.getDecisionTraitement() != null)
                item.setDecisionTraitement(decisionTraitementConverter.toItem(input.getDecisionTraitement()));

            if (this.medecinPrescripteur && input.getMedecinPrescripteur() != null)
                item.setMedecinPrescripteur(personnelConverter.toItem(input.getMedecinPrescripteur()));

            if (this.site && input.getSite() != null)
                item.setSite(siteConverter.toItem(input.getSite()));

            if (this.modaliteRadiotherapie && input.getModaliteRadiotherapie() != null)
                item.setModaliteRadiotherapie(modaliteRadiotherapieConverter.toItem(input.getModaliteRadiotherapie()));

            if (this.visee && input.getVisee() != null)
                item.setVisee(viseeConverter.toItem(input.getVisee()));

            if (this.protocoleInclusion && input.getProtocoleInclusion() != null)
                item.setProtocoleInclusion(protocoleInclusionConverter.toItem(input.getProtocoleInclusion()));

            if (this.statutRadiotherapie && input.getStatutRadiotherapie() != null)
                item.setStatutRadiotherapie(statutRadiotherapieConverter.toItem(input.getStatutRadiotherapie()));

            if (this.patient && input.getPatient() != null)
                item.setPatient(patientConverter.toItem(input.getPatient()));

            if (this.typeTraitement && input.getTypeTraitement() != null)
                item.setTypeTraitement(typeTraitementConverter.toItem(input.getTypeTraitement()));

            return item;
        }
    }

    @Override
    public PrescriptionRadiotherapieSaveAdminOutput toOutput(PrescriptionRadiotherapie item) {
        if (item == null) {
            return null;
        } else {
            PrescriptionRadiotherapieSaveAdminOutput output = new PrescriptionRadiotherapieSaveAdminOutput();
            if (StringUtil.isNotEmpty(item.getId()))
                output.setId(item.getId());
            if (item.getDatePrescription() != null)
                output.setDatePrescription(DateUtil.dateToString(item.getDatePrescription()));
            output.setRcc(item.getRcc());
            if (StringUtil.isNotEmpty(item.getDose()))
                output.setDose(item.getDose());
            if (StringUtil.isNotEmpty(item.getFractionnement()))
                output.setFractionnement(item.getFractionnement());
            if (StringUtil.isNotEmpty(item.getEtalement()))
                output.setEtalement(item.getEtalement());
            if (StringUtil.isNotEmpty(item.getFrequenceRadiotherapie()))
                output.setFrequenceRadiotherapie(item.getFrequenceRadiotherapie());
            if (item.getDateSouhaiteDebutTraitement() != null)
                output.setDateSouhaiteDebutTraitement(DateUtil.dateToString(item.getDateSouhaiteDebutTraitement()));
            if (StringUtil.isNotEmpty(item.getObservation()))
                output.setObservation(item.getObservation());
            if (item.getDateSimulation() != null)
                output.setDateSimulation(DateUtil.dateToString(item.getDateSimulation()));
            if (StringUtil.isNotEmpty(item.getImmobilistion()))
                output.setImmobilistion(item.getImmobilistion());
            if (StringUtil.isNotEmpty(item.getPositionnement()))
                output.setPositionnement(item.getPositionnement());
            if (StringUtil.isNotEmpty(item.getFichierTraitements()))
                output.setFichierTraitements(item.getFichierTraitements());
            if (item.getValidateurSimulationDate() != null)
                output.setValidateurSimulationDate(DateUtil.dateToString(item.getValidateurSimulationDate()));
            if (item.getDatePrevu() != null)
                output.setDatePrevu(DateUtil.dateToString(item.getDatePrevu()));
            if (item.getDateDebutTraitement() != null)
                output.setDateDebutTraitement(DateUtil.dateToString(item.getDateDebutTraitement()));
            if (item.getDateFinTraitement() != null)
                output.setDateFinTraitement(DateUtil.dateToString(item.getDateFinTraitement()));
            if (item.getDateDecisionTraitement() != null)
                output.setDateDecisionTraitement(DateUtil.dateToString(item.getDateDecisionTraitement()));
            if (StringUtil.isNotEmpty(item.getCompteRendu()))
                output.setCompteRendu(item.getCompteRendu());
            output.setActif(item.getActif());
            if (StringUtil.isNotEmpty(item.getNombreSeanceRealise()))
                output.setNombreSeanceRealise(item.getNombreSeanceRealise());
            if (StringUtil.isNotEmpty(item.getFrequenceRadiotherapie()))
                output.setFrequenceRadiotherapie(item.getFrequenceRadiotherapie());

            if (StringUtil.isNotEmpty(item.getNombreTotalSeance()))
                output.setNombreTotalSeance(item.getNombreTotalSeance());
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

            if (this.seanceRadiotherapies && ListUtil.isNotEmpty(item.getSeanceRadiotherapies())) {
                seanceRadiotherapieConverter.init(true);
                seanceRadiotherapieConverter.setPrescriptionRadiotherapie(false);
                output.setSeanceRadiotherapies(seanceRadiotherapieConverter.toDto(item.getSeanceRadiotherapies()));
                seanceRadiotherapieConverter.setPrescriptionRadiotherapie(true);
               /* output.setSeanceRadiotherapies(item.getSeanceRadiotherapies().stream().map(e ->
                        new SeanceRadiotherapieDto(e.getId(), e.getCodeRdv(), DateUtil.dateTimeToString(e.getDatePrevu()),
                                DateUtil.dateTimeToString(e.getDateRealisation()), e.getNumero(),
                                e.getEffectue(), e.getCr(), e.getFichiers())).collect(Collectors.toList()));*/

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
}
