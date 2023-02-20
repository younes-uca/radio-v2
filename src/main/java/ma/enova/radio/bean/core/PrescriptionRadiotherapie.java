package ma.enova.radio.bean.core;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.radio.zynerator.audit.AuditBusinessObject;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;


@Entity
@Table(name = "prescription_radiotherapie")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name = "prescription_radiotherapie_seq", sequenceName = "prescription_radiotherapie_seq", allocationSize = 1, initialValue = 1)
public class PrescriptionRadiotherapie extends AuditBusinessObject {

    private Long id;

    @Temporal(TemporalType.DATE)
    private LocalDate datePrescription;
    @Column(columnDefinition = "boolean default false")
    private Boolean rcc = false;
    private BigDecimal dose = BigDecimal.ZERO;
    private Integer fractionnement = 0;
    private Integer etalement = 0;
    private FrequenceRadiotherapie frequenceRadiotherapie;
    private LocalDate dateSouhaiteDebutTraitement;
    @Lob
    @Column(columnDefinition = "TEXT")
    private String observation;
    private LocalDateTime dateSimulation;
    private Immobilistion immobilistion;
    private Positionnement positionnement;
    @Column(length = 500)
    private String fichierTraitements;
    private LocalDateTime validateurSimulationDate;
    private LocalDateTime datePrevu;
    private LocalDate dateDebutTraitement;
    private LocalDateTime dateFinTraitement;
    private LocalDate dateDecisionTraitement;
    @Column(length = 500)
    private String compteRendu;
    @Column(columnDefinition = "boolean default false")
    private Boolean actif = false;
    private Integer nombreSeanceRealise = 0;
    private Integer nombreTotalSeance = 0;

    private DecisionTraitement decisionTraitement;
    private Personnel medecinPrescripteur;

    private Site site;

    private ModaliteRadiotherapie modaliteRadiotherapie;

    private Visee visee;

    private ProtocoleInclusion protocoleInclusion;

    private StatutRadiotherapie statutRadiotherapie;

    private Personnel validateurSimulation;

    private Patient patient;

    private TypeTraitement typeTraitement;


    private List<ConsultationRadiotherapie> consultationRadiotherapies;
    private List<SeanceRadiotherapie> seanceRadiotherapies;
    private List<HistortiquePrescriptionRadiotherapie> histortiquePrescriptionRadiotherapies;

    public PrescriptionRadiotherapie() {
        super();
    }


    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prescription_radiotherapie_seq")
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    @ManyToOne(fetch = FetchType.LAZY)
    public DecisionTraitement getDecisionTraitement() {
        return this.decisionTraitement;
    }

    public void setDecisionTraitement(DecisionTraitement decisionTraitement) {
        this.decisionTraitement = decisionTraitement;
    }

    public LocalDate getDatePrescription() {
        return this.datePrescription;
    }

    public void setDatePrescription(LocalDate datePrescription) {
        this.datePrescription = datePrescription;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    public Personnel getMedecinPrescripteur() {
        return this.medecinPrescripteur;
    }

    public void setMedecinPrescripteur(Personnel medecinPrescripteur) {
        this.medecinPrescripteur = medecinPrescripteur;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    public Site getSite() {
        return this.site;
    }

    public void setSite(Site site) {
        this.site = site;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    public ModaliteRadiotherapie getModaliteRadiotherapie() {
        return this.modaliteRadiotherapie;
    }

    public void setModaliteRadiotherapie(ModaliteRadiotherapie modaliteRadiotherapie) {
        this.modaliteRadiotherapie = modaliteRadiotherapie;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    public Visee getVisee() {
        return this.visee;
    }

    public void setVisee(Visee visee) {
        this.visee = visee;
    }

    public Boolean getRcc() {
        return this.rcc;
    }

    public void setRcc(Boolean rcc) {
        this.rcc = rcc;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    public ProtocoleInclusion getProtocoleInclusion() {
        return this.protocoleInclusion;
    }

    public void setProtocoleInclusion(ProtocoleInclusion protocoleInclusion) {
        this.protocoleInclusion = protocoleInclusion;
    }

    public BigDecimal getDose() {
        return this.dose;
    }

    public void setDose(BigDecimal dose) {
        this.dose = dose;
    }

    public Integer getFractionnement() {
        return this.fractionnement;
    }

    public void setFractionnement(Integer fractionnement) {
        this.fractionnement = fractionnement;
    }

    public Integer getEtalement() {
        return this.etalement;
    }

    public void setEtalement(Integer etalement) {
        this.etalement = etalement;
    }

    public LocalDate getDateSouhaiteDebutTraitement() {
        return this.dateSouhaiteDebutTraitement;
    }

    public void setDateSouhaiteDebutTraitement(LocalDate dateSouhaiteDebutTraitement) {
        this.dateSouhaiteDebutTraitement = dateSouhaiteDebutTraitement;
    }

    public String getObservation() {
        return this.observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    public StatutRadiotherapie getStatutRadiotherapie() {
        return this.statutRadiotherapie;
    }

    public void setStatutRadiotherapie(StatutRadiotherapie statutRadiotherapie) {
        this.statutRadiotherapie = statutRadiotherapie;
    }

    public LocalDateTime getDateSimulation() {
        return this.dateSimulation;
    }

    public void setDateSimulation(LocalDateTime dateSimulation) {
        this.dateSimulation = dateSimulation;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    public Immobilistion getImmobilistion() {
        return this.immobilistion;
    }

    public void setImmobilistion(Immobilistion immobilistion) {
        this.immobilistion = immobilistion;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    public Positionnement getPositionnement() {
        return this.positionnement;
    }

    public void setPositionnement(Positionnement positionnement) {
        this.positionnement = positionnement;
    }

    public String getFichierTraitements() {
        return this.fichierTraitements;
    }

    public void setFichierTraitements(String fichierTraitements) {
        this.fichierTraitements = fichierTraitements;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    public Personnel getValidateurSimulation() {
        return this.validateurSimulation;
    }

    public void setValidateurSimulation(Personnel validateurSimulation) {
        this.validateurSimulation = validateurSimulation;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    public FrequenceRadiotherapie getFrequenceRadiotherapie() {
        return frequenceRadiotherapie;
    }

    public void setFrequenceRadiotherapie(FrequenceRadiotherapie frequenceRadiotherapie) {
        this.frequenceRadiotherapie = frequenceRadiotherapie;
    }


    public LocalDateTime getValidateurSimulationDate() {
        return this.validateurSimulationDate;
    }

    public void setValidateurSimulationDate(LocalDateTime validateurSimulationDate) {
        this.validateurSimulationDate = validateurSimulationDate;
    }

    @OneToMany(mappedBy = "prescriptionRadiotherapie")
    public List<ConsultationRadiotherapie> getConsultationRadiotherapies() {
        return this.consultationRadiotherapies;
    }

    public void setConsultationRadiotherapies(List<ConsultationRadiotherapie> consultationRadiotherapies) {
        this.consultationRadiotherapies = consultationRadiotherapies;
    }

    public LocalDateTime getDatePrevu() {
        return this.datePrevu;
    }

    public void setDatePrevu(LocalDateTime datePrevu) {
        this.datePrevu = datePrevu;
    }

    public LocalDate getDateDebutTraitement() {
        return this.dateDebutTraitement;
    }

    public void setDateDebutTraitement(LocalDate dateDebutTraitement) {
        this.dateDebutTraitement = dateDebutTraitement;
    }

    public LocalDateTime getDateFinTraitement() {
        return this.dateFinTraitement;
    }

    public void setDateFinTraitement(LocalDateTime dateFinTraitement) {
        this.dateFinTraitement = dateFinTraitement;
    }

    public LocalDate getDateDecisionTraitement() {
        return this.dateDecisionTraitement;
    }

    public void setDateDecisionTraitement(LocalDate dateDecisionTraitement) {
        this.dateDecisionTraitement = dateDecisionTraitement;
    }

    public String getCompteRendu() {
        return this.compteRendu;
    }

    public void setCompteRendu(String compteRendu) {
        this.compteRendu = compteRendu;
    }

    @OneToMany(mappedBy = "prescriptionRadiotherapie")
    public List<SeanceRadiotherapie> getSeanceRadiotherapies() {
        return this.seanceRadiotherapies;
    }

    public void setSeanceRadiotherapies(List<SeanceRadiotherapie> seanceRadiotherapies) {
        this.seanceRadiotherapies = seanceRadiotherapies;
    }

    @OneToMany(mappedBy = "prescriptionRadiotherapie")
    public List<HistortiquePrescriptionRadiotherapie> getHistortiquePrescriptionRadiotherapies() {
        return this.histortiquePrescriptionRadiotherapies;
    }

    public void setHistortiquePrescriptionRadiotherapies(List<HistortiquePrescriptionRadiotherapie> histortiquePrescriptionRadiotherapies) {
        this.histortiquePrescriptionRadiotherapies = histortiquePrescriptionRadiotherapies;
    }

    public Boolean getActif() {
        return this.actif;
    }

    public void setActif(Boolean actif) {
        this.actif = actif;
    }

    public Integer getNombreSeanceRealise() {
        return this.nombreSeanceRealise;
    }

    public void setNombreSeanceRealise(Integer nombreSeanceRealise) {
        this.nombreSeanceRealise = nombreSeanceRealise;
    }

    public Integer getNombreTotalSeance() {
        return this.nombreTotalSeance;
    }

    public void setNombreTotalSeance(Integer nombreTotalSeance) {
        this.nombreTotalSeance = nombreTotalSeance;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    public Patient getPatient() {
        return this.patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    public TypeTraitement getTypeTraitement() {
        return this.typeTraitement;
    }

    public void setTypeTraitement(TypeTraitement typeTraitement) {
        this.typeTraitement = typeTraitement;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrescriptionRadiotherapie prescriptionRadiotherapie = (PrescriptionRadiotherapie) o;
        return id != null && id.equals(prescriptionRadiotherapie.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

