package ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.save;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.radio.required.dto.dmc.DecisionTraitementDto;
import ma.enova.radio.ws.dto.*;
import ma.enova.radio.zynerator.audit.Log;
import ma.enova.radio.zynerator.process.AbstractProcessOutput;

import java.math.BigDecimal;
import java.util.List;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class PrescriptionRadiotherapieSaveAdminOutput extends AbstractProcessOutput {

    protected String datePrescription;
    protected Boolean rcc;
    protected BigDecimal dose;
    protected Integer fractionnement = 0;
    protected Integer etalement = 0;
    protected FrequenceRadiotherapieDto frequenceRadiotherapie;
    protected String dateSouhaiteDebutTraitement;
    protected String dateDebutTraitement;
    protected String observation;
    protected String dateSimulation;
    protected ImmobilistionDto immobilistion;
    protected PositionnementDto positionnement;
    protected String fichierTraitements;
    protected String validateurSimulationDate;
    protected String datePrevu;
    protected String dateFinTraitement;
    protected String dateDecisionTraitement;
    protected String compteRendu;
    protected Boolean actif;
    protected Integer nombreSeanceRealise = 0;
    protected Integer nombreTotalSeance = 0;
    protected PersonnelDto medecinPrescripteur;
    protected SiteDto site;
    protected ModaliteRadiotherapieDto modaliteRadiotherapie;
    protected ViseeDto visee;
    protected ProtocoleInclusionDto protocoleInclusion;
    protected StatutRadiotherapieDto statutRadiotherapie;
    protected PersonnelDto validateurSimulation;
    protected PatientDto patient;
    protected TypeTraitementDto typeTraitement;

    protected List<SeanceRadiotherapieDto> seanceRadiotherapies;
    protected String decisionTraitementCode;
    protected DecisionTraitementDto decisionTraitement;

    public DecisionTraitementDto getDecisionTraitement() {
        return decisionTraitement;
    }

    public void setDecisionTraitement(DecisionTraitementDto decisionTraitement) {
        this.decisionTraitement = decisionTraitement;
    }

    @Log
    public String getDecisionTraitementCode() {
        return decisionTraitementCode;
    }

    public void setDecisionTraitementCode(String decisionTraitementCode) {
        this.decisionTraitementCode = decisionTraitementCode;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDatePrescription() {
        return this.datePrescription;
    }

    public void setDatePrescription(String datePrescription) {
        this.datePrescription = datePrescription;
    }

    @Log
    public Boolean getRcc() {
        return this.rcc;
    }

    public void setRcc(Boolean rcc) {
        this.rcc = rcc;
    }

    @Log
    public BigDecimal getDose() {
        return this.dose;
    }

    public void setDose(BigDecimal dose) {
        this.dose = dose;
    }

    @Log
    public Integer getFractionnement() {
        return this.fractionnement;
    }

    public void setFractionnement(Integer fractionnement) {
        this.fractionnement = fractionnement;
    }

    @Log
    public Integer getEtalement() {
        return this.etalement;
    }

    public void setEtalement(Integer etalement) {
        this.etalement = etalement;
    }


    public FrequenceRadiotherapieDto getFrequenceRadiotherapie() {
        return this.frequenceRadiotherapie;
    }

    public void setFrequenceRadiotherapie(FrequenceRadiotherapieDto frequenceRadiotherapie) {
        this.frequenceRadiotherapie = frequenceRadiotherapie;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateSouhaiteDebutTraitement() {
        return this.dateSouhaiteDebutTraitement;
    }

    public void setDateSouhaiteDebutTraitement(String dateSouhaiteDebutTraitement) {
        this.dateSouhaiteDebutTraitement = dateSouhaiteDebutTraitement;
    }

    @Log
    public String getObservation() {
        return this.observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateSimulation() {
        return this.dateSimulation;
    }

    public void setDateSimulation(String dateSimulation) {
        this.dateSimulation = dateSimulation;
    }

    public ImmobilistionDto getImmobilistion() {
        return this.immobilistion;
    }

    public void setImmobilistion(ImmobilistionDto immobilistion) {
        this.immobilistion = immobilistion;
    }

    public PositionnementDto getPositionnement() {
        return this.positionnement;
    }

    public void setPositionnement(PositionnementDto positionnement) {
        this.positionnement = positionnement;
    }

    @Log
    public String getFichierTraitements() {
        return this.fichierTraitements;
    }

    public void setFichierTraitements(String fichierTraitements) {
        this.fichierTraitements = fichierTraitements;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getValidateurSimulationDate() {
        return this.validateurSimulationDate;
    }

    public void setValidateurSimulationDate(String validateurSimulationDate) {
        this.validateurSimulationDate = validateurSimulationDate;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDatePrevu() {
        return this.datePrevu;
    }

    public void setDatePrevu(String datePrevu) {
        this.datePrevu = datePrevu;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateDebutTraitement() {
        return this.dateDebutTraitement;
    }

    public void setDateDebutTraitement(String dateDebutTraitement) {
        this.dateDebutTraitement = dateDebutTraitement;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateFinTraitement() {
        return this.dateFinTraitement;
    }

    public void setDateFinTraitement(String dateFinTraitement) {
        this.dateFinTraitement = dateFinTraitement;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateDecisionTraitement() {
        return this.dateDecisionTraitement;
    }

    public void setDateDecisionTraitement(String dateDecisionTraitement) {
        this.dateDecisionTraitement = dateDecisionTraitement;
    }

    @Log
    public String getCompteRendu() {
        return this.compteRendu;
    }

    public void setCompteRendu(String compteRendu) {
        this.compteRendu = compteRendu;
    }

    @Log
    public Boolean getActif() {
        return this.actif;
    }

    public void setActif(Boolean actif) {
        this.actif = actif;
    }

    @Log
    public Integer getNombreSeanceRealise() {
        return this.nombreSeanceRealise;
    }

    public void setNombreSeanceRealise(Integer nombreSeanceRealise) {
        this.nombreSeanceRealise = nombreSeanceRealise;
    }

    @Log
    public Integer getNombreTotalSeance() {
        return this.nombreTotalSeance;
    }

    public void setNombreTotalSeance(Integer nombreTotalSeance) {
        this.nombreTotalSeance = nombreTotalSeance;
    }


    public PersonnelDto getMedecinPrescripteur() {
        return this.medecinPrescripteur;
    }

    public void setMedecinPrescripteur(PersonnelDto medecinPrescripteur) {
        this.medecinPrescripteur = medecinPrescripteur;
    }

    public SiteDto getSite() {
        return this.site;
    }

    public void setSite(SiteDto site) {
        this.site = site;
    }

    public ModaliteRadiotherapieDto getModaliteRadiotherapie() {
        return this.modaliteRadiotherapie;
    }

    public void setModaliteRadiotherapie(ModaliteRadiotherapieDto modaliteRadiotherapie) {
        this.modaliteRadiotherapie = modaliteRadiotherapie;
    }

    public ViseeDto getVisee() {
        return this.visee;
    }

    public void setVisee(ViseeDto visee) {
        this.visee = visee;
    }

    public ProtocoleInclusionDto getProtocoleInclusion() {
        return this.protocoleInclusion;
    }

    public void setProtocoleInclusion(ProtocoleInclusionDto protocoleInclusion) {
        this.protocoleInclusion = protocoleInclusion;
    }

    public StatutRadiotherapieDto getStatutRadiotherapie() {
        return this.statutRadiotherapie;
    }

    public void setStatutRadiotherapie(StatutRadiotherapieDto statutRadiotherapie) {
        this.statutRadiotherapie = statutRadiotherapie;
    }

    public PersonnelDto getValidateurSimulation() {
        return this.validateurSimulation;
    }

    public void setValidateurSimulation(PersonnelDto validateurSimulation) {
        this.validateurSimulation = validateurSimulation;
    }

    public PatientDto getPatient() {
        return this.patient;
    }

    public void setPatient(PatientDto patient) {
        this.patient = patient;
    }

    public TypeTraitementDto getTypeTraitement() {
        return this.typeTraitement;
    }

    public void setTypeTraitement(TypeTraitementDto typeTraitement) {
        this.typeTraitement = typeTraitement;
    }

    public List<SeanceRadiotherapieDto> getSeanceRadiotherapies() {
        return this.seanceRadiotherapies;
    }

    public void setSeanceRadiotherapies(List<SeanceRadiotherapieDto> seanceRadiotherapies) {
        this.seanceRadiotherapies = seanceRadiotherapies;
    }

}
