package ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.save;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.radio.required.dto.dmc.DecisionTraitementDto;
import ma.enova.radio.ws.dto.*;
import ma.enova.radio.zynerator.audit.Log;
import ma.enova.radio.zynerator.process.AbstractProcessInput;

import java.math.BigDecimal;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class PrescriptionRadiotherapieSaveAdminInput extends AbstractProcessInput {

    private String datePrescription;
    private Boolean rcc;
    private BigDecimal dose;
    private Integer fractionnement = 0;
    private Integer etalement = 0;
    private String dateSouhaiteDebutTraitement;
    private String dateDebutTraitement;
    private String observation;
    private String immobilistion;
    private String positionnement;
    private String datePrevu;
    private String compteRendu;
    private Boolean actif;
    private Integer nombreTotalSeance = 0;
    private Integer nombreSeanceRealise = 0;

    private PersonnelDto medecinPrescripteur;
    private SiteDto site;
    private ModaliteRadiotherapieDto modaliteRadiotherapie;
    private ViseeDto visee;
    private ProtocoleInclusionDto protocoleInclusion;
    private StatutRadiotherapieDto statutRadiotherapie;
    private PatientDto patient;
    private TypeTraitementDto typeTraitement;
    private DecisionTraitementDto decisionTraitement;
    private FrequenceRadiotherapieDto frequenceRadiotherapie;

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


    public StatutRadiotherapieDto getStatutRadiotherapie() {
        return statutRadiotherapie;
    }

    public void setStatutRadiotherapie(StatutRadiotherapieDto statutRadiotherapie) {
        this.statutRadiotherapie = statutRadiotherapie;
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
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDatePrevu() {
        return this.datePrevu;
    }

    public void setDatePrevu(String datePrevu) {
        this.datePrevu = datePrevu;
    }

    @Log
    public String getObservation() {
        return this.observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }


    @Log
    public String getImmobilistion() {
        return this.immobilistion;
    }

    public void setImmobilistion(String immobilistion) {
        this.immobilistion = immobilistion;
    }

    @Log
    public String getPositionnement() {
        return this.positionnement;
    }

    public void setPositionnement(String positionnement) {
        this.positionnement = positionnement;
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
    public Integer getNombreTotalSeance() {
        return this.nombreTotalSeance;
    }

    public void setNombreTotalSeance(Integer nombreTotalSeance) {
        this.nombreTotalSeance = nombreTotalSeance;
    }


    public PersonnelDto getMedecinPrescripteur() {
        return this.medecinPrescripteur;
    }

    public void setMedecinPrescripteurDto(PersonnelDto medecinPrescripteur) {
        this.medecinPrescripteur = medecinPrescripteur;
    }

    public SiteDto getSite() {
        return this.site;
    }

    public void setSiteDto(SiteDto site) {
        this.site = site;
    }

    public ModaliteRadiotherapieDto getModaliteRadiotherapie() {
        return this.modaliteRadiotherapie;
    }

    public void setModaliteRadiotherapieDto(ModaliteRadiotherapieDto modaliteRadiotherapie) {
        this.modaliteRadiotherapie = modaliteRadiotherapie;
    }

    public ViseeDto getVisee() {
        return this.visee;
    }

    public void setViseeDto(ViseeDto visee) {
        this.visee = visee;
    }

    public ProtocoleInclusionDto getProtocoleInclusion() {
        return this.protocoleInclusion;
    }

    public void setProtocoleInclusionDto(ProtocoleInclusionDto protocoleInclusion) {
        this.protocoleInclusion = protocoleInclusion;
    }

    public void setStatutRadiotherapieDto(StatutRadiotherapieDto statutRadiotherapie) {
        this.statutRadiotherapie = statutRadiotherapie;
    }

    public PatientDto getPatient() {
        return this.patient;
    }

    public void setPatientDto(PatientDto patient) {
        this.patient = patient;
    }

    public TypeTraitementDto getTypeTraitement() {
        return this.typeTraitement;
    }

    public void setTypeTraitementDto(TypeTraitementDto typeTraitement) {
        this.typeTraitement = typeTraitement;
    }

    @Log
    public Integer getNombreSeanceRealise() {
        return nombreSeanceRealise;
    }

    public void setNombreSeanceRealise(Integer nombreSeanceRealise) {
        this.nombreSeanceRealise = nombreSeanceRealise;
    }

    public void setMedecinPrescripteur(PersonnelDto medecinPrescripteur) {
        this.medecinPrescripteur = medecinPrescripteur;
    }

    public void setSite(SiteDto site) {
        this.site = site;
    }

    public void setModaliteRadiotherapie(ModaliteRadiotherapieDto modaliteRadiotherapie) {
        this.modaliteRadiotherapie = modaliteRadiotherapie;
    }

    public void setVisee(ViseeDto visee) {
        this.visee = visee;
    }

    public void setProtocoleInclusion(ProtocoleInclusionDto protocoleInclusion) {
        this.protocoleInclusion = protocoleInclusion;
    }

    public DecisionTraitementDto getDecisionTraitement() {
        return decisionTraitement;
    }

    public void setDecisionTraitement(DecisionTraitementDto decisionTraitement) {
        this.decisionTraitement = decisionTraitement;
    }


    public FrequenceRadiotherapieDto getFrequenceRadiotherapie() {
        return frequenceRadiotherapie;
    }

    public void setFrequenceRadiotherapie(FrequenceRadiotherapieDto frequenceRadiotherapie) {
        this.frequenceRadiotherapie = frequenceRadiotherapie;
    }

    public String getDateDebutTraitement() {
        return dateDebutTraitement;
    }

    public void setDateDebutTraitement(String dateDebutTraitement) {
        this.dateDebutTraitement = dateDebutTraitement;
    }

    public void setPatient(PatientDto patient) {
        this.patient = patient;
    }

    public void setTypeTraitement(TypeTraitementDto typeTraitement) {
        this.typeTraitement = typeTraitement;
    }
}



