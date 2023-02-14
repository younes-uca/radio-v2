package  ma.enova.radio.dao.criteria.core;



import ma.enova.radio.zynerator.criteria.BaseCriteria;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonFormat;
import ma.enova.radio.zynerator.criteria.BaseCriteria;
import java.time.LocalDateTime;



public class ConsultationRadiotherapieCriteria extends BaseCriteria {

    private LocalDateTime dateConsultation;
    private LocalDateTime dateConsultationFrom;
    private LocalDateTime dateConsultationTo;
    private String classificationOms;
    private String classificationOmsLike;
    private String statutMedicale;
    private String statutMedicaleLike;



    public ConsultationRadiotherapieCriteria(){}

    public LocalDateTime getDateConsultation(){
        return this.dateConsultation;
    }
    public void setDateConsultation(LocalDateTime dateConsultation){
        this.dateConsultation = dateConsultation;
    }
    public LocalDateTime getDateConsultationFrom(){
        return this.dateConsultationFrom;
    }
    public void setDateConsultationFrom(LocalDateTime dateConsultationFrom){
        this.dateConsultationFrom = dateConsultationFrom;
    }
    public LocalDateTime getDateConsultationTo(){
        return this.dateConsultationTo;
    }
    public void setDateConsultationTo(LocalDateTime dateConsultationTo){
        this.dateConsultationTo = dateConsultationTo;
    }
    public String getClassificationOms(){
        return this.classificationOms;
    }
    public void setClassificationOms(String classificationOms){
        this.classificationOms = classificationOms;
    }
    public String getClassificationOmsLike(){
        return this.classificationOmsLike;
    }
    public void setClassificationOmsLike(String classificationOmsLike){
        this.classificationOmsLike = classificationOmsLike;
    }

    public String getStatutMedicale(){
        return this.statutMedicale;
    }
    public void setStatutMedicale(String statutMedicale){
        this.statutMedicale = statutMedicale;
    }
    public String getStatutMedicaleLike(){
        return this.statutMedicaleLike;
    }
    public void setStatutMedicaleLike(String statutMedicaleLike){
        this.statutMedicaleLike = statutMedicaleLike;
    }


}
