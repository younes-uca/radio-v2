package  ma.enova.radio.dao.criteria.core;



import ma.enova.radio.zynerator.criteria.BaseCriteria;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonFormat;
import ma.enova.radio.zynerator.criteria.BaseCriteria;
import java.time.LocalDateTime;



public class HistortiquePrescriptionRadiotherapieCriteria extends BaseCriteria {

    private LocalDateTime dateHistortiquePrescriptionRadiotherapie;
    private LocalDateTime dateHistortiquePrescriptionRadiotherapieFrom;
    private LocalDateTime dateHistortiquePrescriptionRadiotherapieTo;
    private PrescriptionRadiotherapieCriteria prescriptionRadiotherapie;
    private StatutRadiotherapieCriteria statutRadiotherapie;


    public HistortiquePrescriptionRadiotherapieCriteria(){}

    public PrescriptionRadiotherapieCriteria getPrescriptionRadiotherapie() {
        return prescriptionRadiotherapie;
    }

    public void setPrescriptionRadiotherapie(PrescriptionRadiotherapieCriteria prescriptionRadiotherapie) {
        this.prescriptionRadiotherapie = prescriptionRadiotherapie;
    }

    public StatutRadiotherapieCriteria getStatutRadiotherapie() {
        return statutRadiotherapie;
    }

    public void setStatutRadiotherapie(StatutRadiotherapieCriteria statutRadiotherapie) {
        this.statutRadiotherapie = statutRadiotherapie;
    }

    public LocalDateTime getDateHistortiquePrescriptionRadiotherapie(){
        return this.dateHistortiquePrescriptionRadiotherapie;
    }
    public void setDateHistortiquePrescriptionRadiotherapie(LocalDateTime dateHistortiquePrescriptionRadiotherapie){
        this.dateHistortiquePrescriptionRadiotherapie = dateHistortiquePrescriptionRadiotherapie;
    }
    public LocalDateTime getDateHistortiquePrescriptionRadiotherapieFrom(){
        return this.dateHistortiquePrescriptionRadiotherapieFrom;
    }
    public void setDateHistortiquePrescriptionRadiotherapieFrom(LocalDateTime dateHistortiquePrescriptionRadiotherapieFrom){
        this.dateHistortiquePrescriptionRadiotherapieFrom = dateHistortiquePrescriptionRadiotherapieFrom;
    }
    public LocalDateTime getDateHistortiquePrescriptionRadiotherapieTo(){
        return this.dateHistortiquePrescriptionRadiotherapieTo;
    }
    public void setDateHistortiquePrescriptionRadiotherapieTo(LocalDateTime dateHistortiquePrescriptionRadiotherapieTo){
        this.dateHistortiquePrescriptionRadiotherapieTo = dateHistortiquePrescriptionRadiotherapieTo;
    }

}
