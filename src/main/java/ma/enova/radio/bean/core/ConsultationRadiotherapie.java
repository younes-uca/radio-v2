package ma.enova.radio.bean.core;

import java.util.Objects;

import java.time.LocalDateTime;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;



import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.radio.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;






@Entity
@Table(name = "consultation_radiotherapie")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="consultation_radiotherapie_seq",sequenceName="consultation_radiotherapie_seq",allocationSize=1, initialValue = 1)
public class ConsultationRadiotherapie   extends AuditBusinessObject  {

    private Long id;

    private LocalDateTime dateConsultation ;
    @Column(length = 500)
    private String classificationOms;
    @Lob
    @Column(columnDefinition="TEXT")
    private String observation;
    @Column(length = 500)
    private String statutMedicale;

    private Personnel medecin ;
    
    private TypeConsultationRadiotherapie typeConsultationRadiotherapie ;
    
    private TypeToxiciteRth typeToxiciteRth ;
    
    private GradeToxiciteRth gradeToxiciteRth ;
    
    private PrescriptionRadiotherapie prescriptionRadiotherapie ;
    


    public ConsultationRadiotherapie(){
        super();
    }




    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="consultation_radiotherapie_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public LocalDateTime getDateConsultation(){
        return this.dateConsultation;
    }
    public void setDateConsultation(LocalDateTime dateConsultation){
        this.dateConsultation = dateConsultation;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Personnel getMedecin(){
        return this.medecin;
    }
    public void setMedecin(Personnel medecin){
        this.medecin = medecin;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public TypeConsultationRadiotherapie getTypeConsultationRadiotherapie(){
        return this.typeConsultationRadiotherapie;
    }
    public void setTypeConsultationRadiotherapie(TypeConsultationRadiotherapie typeConsultationRadiotherapie){
        this.typeConsultationRadiotherapie = typeConsultationRadiotherapie;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public TypeToxiciteRth getTypeToxiciteRth(){
        return this.typeToxiciteRth;
    }
    public void setTypeToxiciteRth(TypeToxiciteRth typeToxiciteRth){
        this.typeToxiciteRth = typeToxiciteRth;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public GradeToxiciteRth getGradeToxiciteRth(){
        return this.gradeToxiciteRth;
    }
    public void setGradeToxiciteRth(GradeToxiciteRth gradeToxiciteRth){
        this.gradeToxiciteRth = gradeToxiciteRth;
    }
    public String getClassificationOms(){
        return this.classificationOms;
    }
    public void setClassificationOms(String classificationOms){
        this.classificationOms = classificationOms;
    }
    public String getObservation(){
        return this.observation;
    }
    public void setObservation(String observation){
        this.observation = observation;
    }
    public String getStatutMedicale(){
        return this.statutMedicale;
    }
    public void setStatutMedicale(String statutMedicale){
        this.statutMedicale = statutMedicale;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public PrescriptionRadiotherapie getPrescriptionRadiotherapie(){
        return this.prescriptionRadiotherapie;
    }
    public void setPrescriptionRadiotherapie(PrescriptionRadiotherapie prescriptionRadiotherapie){
        this.prescriptionRadiotherapie = prescriptionRadiotherapie;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConsultationRadiotherapie consultationRadiotherapie = (ConsultationRadiotherapie) o;
        return id != null && id.equals(consultationRadiotherapie.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

