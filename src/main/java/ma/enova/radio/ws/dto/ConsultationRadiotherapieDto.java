package  ma.enova.radio.ws.dto;

import ma.enova.radio.zynerator.audit.Log;
import ma.enova.radio.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

    import java.util.Date;
    import javax.persistence.Temporal;
    import javax.persistence.TemporalType;
    import com.fasterxml.jackson.annotation.JsonFormat;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConsultationRadiotherapieDto  extends AuditBaseDto {

    private String dateConsultation ;
    private String classificationOms  ;
    private String observation  ;
    private String statutMedicale  ;

    private PersonnelDto medecin ;
    private TypeConsultationRadiotherapieDto typeConsultationRadiotherapie ;
    private TypeToxiciteRthDto typeToxiciteRth ;
    private GradeToxiciteRthDto gradeToxiciteRth ;
    private PrescriptionRadiotherapieDto prescriptionRadiotherapie ;


    public ConsultationRadiotherapieDto(){
        super();
    }



    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateConsultation(){
        return this.dateConsultation;
    }
    public void setDateConsultation(String dateConsultation){
        this.dateConsultation = dateConsultation;
    }

    @Log
    public String getClassificationOms(){
        return this.classificationOms;
    }
    public void setClassificationOms(String classificationOms){
        this.classificationOms = classificationOms;
    }

    @Log
    public String getObservation(){
        return this.observation;
    }
    public void setObservation(String observation){
        this.observation = observation;
    }

    @Log
    public String getStatutMedicale(){
        return this.statutMedicale;
    }
    public void setStatutMedicale(String statutMedicale){
        this.statutMedicale = statutMedicale;
    }


    public PersonnelDto getMedecin(){
        return this.medecin;
    }

    public void setMedecin(PersonnelDto medecin){
        this.medecin = medecin;
    }
    public TypeConsultationRadiotherapieDto getTypeConsultationRadiotherapie(){
        return this.typeConsultationRadiotherapie;
    }

    public void setTypeConsultationRadiotherapie(TypeConsultationRadiotherapieDto typeConsultationRadiotherapie){
        this.typeConsultationRadiotherapie = typeConsultationRadiotherapie;
    }
    public TypeToxiciteRthDto getTypeToxiciteRth(){
        return this.typeToxiciteRth;
    }

    public void setTypeToxiciteRth(TypeToxiciteRthDto typeToxiciteRth){
        this.typeToxiciteRth = typeToxiciteRth;
    }
    public GradeToxiciteRthDto getGradeToxiciteRth(){
        return this.gradeToxiciteRth;
    }

    public void setGradeToxiciteRth(GradeToxiciteRthDto gradeToxiciteRth){
        this.gradeToxiciteRth = gradeToxiciteRth;
    }
    public PrescriptionRadiotherapieDto getPrescriptionRadiotherapie(){
        return this.prescriptionRadiotherapie;
    }

    public void setPrescriptionRadiotherapie(PrescriptionRadiotherapieDto prescriptionRadiotherapie){
        this.prescriptionRadiotherapie = prescriptionRadiotherapie;
    }


}
