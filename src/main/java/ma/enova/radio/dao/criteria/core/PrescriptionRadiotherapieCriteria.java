package ma.enova.radio.dao.criteria.core;


import ma.enova.radio.zynerator.criteria.BaseCriteria;

import java.time.LocalDateTime;
import java.util.List;


public class PrescriptionRadiotherapieCriteria extends BaseCriteria {

    private LocalDateTime datePrescription;
    private LocalDateTime datePrescriptionFrom;
    private LocalDateTime datePrescriptionTo;
    private Boolean rcc;
    private String dose;
    private String doseMin;
    private String doseMax;
    private String fractionnement;
    private String fractionnementMin;
    private String fractionnementMax;
    private String etalement;
    private String etalementMin;
    private String etalementMax;
    private String frequenceRadiotherapie;
    private String frequenceRadiotherapieLike;
    private LocalDateTime dateSouhaiteDebutTraitement;
    private LocalDateTime dateSouhaiteDebutTraitementFrom;
    private LocalDateTime dateSouhaiteDebutTraitementTo;
    private LocalDateTime dateSimulation;
    private LocalDateTime dateSimulationFrom;
    private LocalDateTime dateSimulationTo;
    private String immobilistion;
    private String immobilistionLike;
    private String positionnement;
    private String positionnementLike;
    private String fichierTraitements;
    private String fichierTraitementsLike;
    private LocalDateTime validateurSimulationDate;
    private LocalDateTime validateurSimulationDateFrom;
    private LocalDateTime validateurSimulationDateTo;
    private LocalDateTime datePrevu;
    private LocalDateTime datePrevuFrom;
    private LocalDateTime datePrevuTo;
    private LocalDateTime dateDebutTraitement;
    private LocalDateTime dateDebutTraitementFrom;
    private LocalDateTime dateDebutTraitementTo;
    private LocalDateTime dateFinTraitement;
    private LocalDateTime dateFinTraitementFrom;
    private LocalDateTime dateFinTraitementTo;
    private LocalDateTime dateDecisionTraitement;
    private LocalDateTime dateDecisionTraitementFrom;
    private LocalDateTime dateDecisionTraitementTo;
    private String compteRendu;
    private String compteRenduLike;
    private Boolean actif;
    private String nombreSeanceRealise;
    private String nombreSeanceRealiseMin;
    private String nombreSeanceRealiseMax;
    private String nombreTotalSeance;
    private String nombreTotalSeanceMin;
    private String nombreTotalSeanceMax;

    private DecisionTraitementCriteria decisionTraitement;
    private List<DecisionTraitementCriteria> decisionTraitements;
    private StatutRadiotherapieCriteria statutRadiotherapie;
    private List<StatutRadiotherapieCriteria> statutRadiotherapies;
    private PatientCriteria patient;
    private List<PatientCriteria> patients;


    public PrescriptionRadiotherapieCriteria() {
    }

    public LocalDateTime getDatePrescription() {
        return this.datePrescription;
    }

    public void setDatePrescription(LocalDateTime datePrescription) {
        this.datePrescription = datePrescription;
    }

    public LocalDateTime getDatePrescriptionFrom() {
        return this.datePrescriptionFrom;
    }

    public void setDatePrescriptionFrom(LocalDateTime datePrescriptionFrom) {
        this.datePrescriptionFrom = datePrescriptionFrom;
    }

    public LocalDateTime getDatePrescriptionTo() {
        return this.datePrescriptionTo;
    }

    public void setDatePrescriptionTo(LocalDateTime datePrescriptionTo) {
        this.datePrescriptionTo = datePrescriptionTo;
    }

    public Boolean getRcc() {
        return this.rcc;
    }

    public void setRcc(Boolean rcc) {
        this.rcc = rcc;
    }

    public String getDose() {
        return this.dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }

    public String getDoseMin() {
        return this.doseMin;
    }

    public void setDoseMin(String doseMin) {
        this.doseMin = doseMin;
    }

    public String getDoseMax() {
        return this.doseMax;
    }

    public void setDoseMax(String doseMax) {
        this.doseMax = doseMax;
    }

    public String getFractionnement() {
        return this.fractionnement;
    }

    public void setFractionnement(String fractionnement) {
        this.fractionnement = fractionnement;
    }

    public String getFractionnementMin() {
        return this.fractionnementMin;
    }

    public void setFractionnementMin(String fractionnementMin) {
        this.fractionnementMin = fractionnementMin;
    }

    public String getFractionnementMax() {
        return this.fractionnementMax;
    }

    public void setFractionnementMax(String fractionnementMax) {
        this.fractionnementMax = fractionnementMax;
    }

    public String getEtalement() {
        return this.etalement;
    }

    public void setEtalement(String etalement) {
        this.etalement = etalement;
    }

    public String getEtalementMin() {
        return this.etalementMin;
    }

    public void setEtalementMin(String etalementMin) {
        this.etalementMin = etalementMin;
    }

    public String getEtalementMax() {
        return this.etalementMax;
    }

    public void setEtalementMax(String etalementMax) {
        this.etalementMax = etalementMax;
    }

    public String getFrequenceRadiotherapie() {
        return this.frequenceRadiotherapie;
    }

    public void setFrequenceRadiotherapie(String frequenceRadiotherapie) {
        this.frequenceRadiotherapie = frequenceRadiotherapie;
    }

    public String getFrequenceRadiotherapieLike() {
        return this.frequenceRadiotherapieLike;
    }

    public void setFrequenceRadiotherapieLike(String frequenceRadiotherapieLike) {
        this.frequenceRadiotherapieLike = frequenceRadiotherapieLike;
    }

    public LocalDateTime getDateSouhaiteDebutTraitement() {
        return this.dateSouhaiteDebutTraitement;
    }

    public void setDateSouhaiteDebutTraitement(LocalDateTime dateSouhaiteDebutTraitement) {
        this.dateSouhaiteDebutTraitement = dateSouhaiteDebutTraitement;
    }

    public LocalDateTime getDateSouhaiteDebutTraitementFrom() {
        return this.dateSouhaiteDebutTraitementFrom;
    }

    public void setDateSouhaiteDebutTraitementFrom(LocalDateTime dateSouhaiteDebutTraitementFrom) {
        this.dateSouhaiteDebutTraitementFrom = dateSouhaiteDebutTraitementFrom;
    }

    public LocalDateTime getDateSouhaiteDebutTraitementTo() {
        return this.dateSouhaiteDebutTraitementTo;
    }

    public void setDateSouhaiteDebutTraitementTo(LocalDateTime dateSouhaiteDebutTraitementTo) {
        this.dateSouhaiteDebutTraitementTo = dateSouhaiteDebutTraitementTo;
    }

    public LocalDateTime getDateSimulation() {
        return this.dateSimulation;
    }

    public void setDateSimulation(LocalDateTime dateSimulation) {
        this.dateSimulation = dateSimulation;
    }

    public LocalDateTime getDateSimulationFrom() {
        return this.dateSimulationFrom;
    }

    public void setDateSimulationFrom(LocalDateTime dateSimulationFrom) {
        this.dateSimulationFrom = dateSimulationFrom;
    }

    public LocalDateTime getDateSimulationTo() {
        return this.dateSimulationTo;
    }

    public void setDateSimulationTo(LocalDateTime dateSimulationTo) {
        this.dateSimulationTo = dateSimulationTo;
    }

    public String getImmobilistion() {
        return this.immobilistion;
    }

    public void setImmobilistion(String immobilistion) {
        this.immobilistion = immobilistion;
    }

    public String getImmobilistionLike() {
        return this.immobilistionLike;
    }

    public void setImmobilistionLike(String immobilistionLike) {
        this.immobilistionLike = immobilistionLike;
    }

    public String getPositionnement() {
        return this.positionnement;
    }

    public void setPositionnement(String positionnement) {
        this.positionnement = positionnement;
    }

    public String getPositionnementLike() {
        return this.positionnementLike;
    }

    public void setPositionnementLike(String positionnementLike) {
        this.positionnementLike = positionnementLike;
    }

    public String getFichierTraitements() {
        return this.fichierTraitements;
    }

    public void setFichierTraitements(String fichierTraitements) {
        this.fichierTraitements = fichierTraitements;
    }

    public String getFichierTraitementsLike() {
        return this.fichierTraitementsLike;
    }

    public void setFichierTraitementsLike(String fichierTraitementsLike) {
        this.fichierTraitementsLike = fichierTraitementsLike;
    }

    public LocalDateTime getValidateurSimulationDate() {
        return this.validateurSimulationDate;
    }

    public void setValidateurSimulationDate(LocalDateTime validateurSimulationDate) {
        this.validateurSimulationDate = validateurSimulationDate;
    }

    public LocalDateTime getValidateurSimulationDateFrom() {
        return this.validateurSimulationDateFrom;
    }

    public void setValidateurSimulationDateFrom(LocalDateTime validateurSimulationDateFrom) {
        this.validateurSimulationDateFrom = validateurSimulationDateFrom;
    }

    public LocalDateTime getValidateurSimulationDateTo() {
        return this.validateurSimulationDateTo;
    }

    public void setValidateurSimulationDateTo(LocalDateTime validateurSimulationDateTo) {
        this.validateurSimulationDateTo = validateurSimulationDateTo;
    }

    public LocalDateTime getDatePrevu() {
        return this.datePrevu;
    }

    public void setDatePrevu(LocalDateTime datePrevu) {
        this.datePrevu = datePrevu;
    }

    public LocalDateTime getDatePrevuFrom() {
        return this.datePrevuFrom;
    }

    public void setDatePrevuFrom(LocalDateTime datePrevuFrom) {
        this.datePrevuFrom = datePrevuFrom;
    }

    public LocalDateTime getDatePrevuTo() {
        return this.datePrevuTo;
    }

    public void setDatePrevuTo(LocalDateTime datePrevuTo) {
        this.datePrevuTo = datePrevuTo;
    }

    public LocalDateTime getDateDebutTraitement() {
        return this.dateDebutTraitement;
    }

    public void setDateDebutTraitement(LocalDateTime dateDebutTraitement) {
        this.dateDebutTraitement = dateDebutTraitement;
    }

    public LocalDateTime getDateDebutTraitementFrom() {
        return this.dateDebutTraitementFrom;
    }

    public void setDateDebutTraitementFrom(LocalDateTime dateDebutTraitementFrom) {
        this.dateDebutTraitementFrom = dateDebutTraitementFrom;
    }

    public LocalDateTime getDateDebutTraitementTo() {
        return this.dateDebutTraitementTo;
    }

    public void setDateDebutTraitementTo(LocalDateTime dateDebutTraitementTo) {
        this.dateDebutTraitementTo = dateDebutTraitementTo;
    }

    public LocalDateTime getDateFinTraitement() {
        return this.dateFinTraitement;
    }

    public void setDateFinTraitement(LocalDateTime dateFinTraitement) {
        this.dateFinTraitement = dateFinTraitement;
    }

    public LocalDateTime getDateFinTraitementFrom() {
        return this.dateFinTraitementFrom;
    }

    public void setDateFinTraitementFrom(LocalDateTime dateFinTraitementFrom) {
        this.dateFinTraitementFrom = dateFinTraitementFrom;
    }

    public LocalDateTime getDateFinTraitementTo() {
        return this.dateFinTraitementTo;
    }

    public void setDateFinTraitementTo(LocalDateTime dateFinTraitementTo) {
        this.dateFinTraitementTo = dateFinTraitementTo;
    }

    public LocalDateTime getDateDecisionTraitement() {
        return this.dateDecisionTraitement;
    }

    public void setDateDecisionTraitement(LocalDateTime dateDecisionTraitement) {
        this.dateDecisionTraitement = dateDecisionTraitement;
    }

    public LocalDateTime getDateDecisionTraitementFrom() {
        return this.dateDecisionTraitementFrom;
    }

    public void setDateDecisionTraitementFrom(LocalDateTime dateDecisionTraitementFrom) {
        this.dateDecisionTraitementFrom = dateDecisionTraitementFrom;
    }

    public LocalDateTime getDateDecisionTraitementTo() {
        return this.dateDecisionTraitementTo;
    }

    public void setDateDecisionTraitementTo(LocalDateTime dateDecisionTraitementTo) {
        this.dateDecisionTraitementTo = dateDecisionTraitementTo;
    }

    public String getCompteRendu() {
        return this.compteRendu;
    }

    public void setCompteRendu(String compteRendu) {
        this.compteRendu = compteRendu;
    }

    public String getCompteRenduLike() {
        return this.compteRenduLike;
    }

    public void setCompteRenduLike(String compteRenduLike) {
        this.compteRenduLike = compteRenduLike;
    }

    public Boolean getActif() {
        return this.actif;
    }

    public void setActif(Boolean actif) {
        this.actif = actif;
    }

    public String getNombreSeanceRealise() {
        return this.nombreSeanceRealise;
    }

    public void setNombreSeanceRealise(String nombreSeanceRealise) {
        this.nombreSeanceRealise = nombreSeanceRealise;
    }

    public String getNombreSeanceRealiseMin() {
        return this.nombreSeanceRealiseMin;
    }

    public void setNombreSeanceRealiseMin(String nombreSeanceRealiseMin) {
        this.nombreSeanceRealiseMin = nombreSeanceRealiseMin;
    }

    public String getNombreSeanceRealiseMax() {
        return this.nombreSeanceRealiseMax;
    }

    public void setNombreSeanceRealiseMax(String nombreSeanceRealiseMax) {
        this.nombreSeanceRealiseMax = nombreSeanceRealiseMax;
    }

    public String getNombreTotalSeance() {
        return this.nombreTotalSeance;
    }

    public void setNombreTotalSeance(String nombreTotalSeance) {
        this.nombreTotalSeance = nombreTotalSeance;
    }

    public String getNombreTotalSeanceMin() {
        return this.nombreTotalSeanceMin;
    }

    public void setNombreTotalSeanceMin(String nombreTotalSeanceMin) {
        this.nombreTotalSeanceMin = nombreTotalSeanceMin;
    }

    public String getNombreTotalSeanceMax() {
        return this.nombreTotalSeanceMax;
    }

    public void setNombreTotalSeanceMax(String nombreTotalSeanceMax) {
        this.nombreTotalSeanceMax = nombreTotalSeanceMax;
    }


    public DecisionTraitementCriteria getDecisionTraitement() {
        return this.decisionTraitement;
    }

    public void setDecisionTraitement(DecisionTraitementCriteria decisionTraitement) {
        this.decisionTraitement = decisionTraitement;
    }

    public List<DecisionTraitementCriteria> getDecisionTraitements() {
        return this.decisionTraitements;
    }

    public void setDecisionTraitements(List<DecisionTraitementCriteria> decisionTraitements) {
        this.decisionTraitements = decisionTraitements;
    }

    public StatutRadiotherapieCriteria getStatutRadiotherapie() {
        return statutRadiotherapie;
    }

    public void setStatutRadiotherapie(StatutRadiotherapieCriteria statutRadiotherapie) {
        this.statutRadiotherapie = statutRadiotherapie;
    }

    public List<StatutRadiotherapieCriteria> getStatutRadiotherapies() {
        return statutRadiotherapies;
    }

    public void setStatutRadiotherapies(List<StatutRadiotherapieCriteria> statutRadiotherapies) {
        this.statutRadiotherapies = statutRadiotherapies;
    }

    public PatientCriteria getPatient() {
        return patient;
    }

    public void setPatient(PatientCriteria patient) {
        this.patient = patient;
    }

    public List<PatientCriteria> getPatients() {
        return patients;
    }

    public void setPatients(List<PatientCriteria> patients) {
        this.patients = patients;
    }
}
