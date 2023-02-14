package  ma.enova.radio.ws.dto;

import ma.enova.radio.zynerator.audit.Log;
import ma.enova.radio.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

    import java.util.Date;
    import javax.persistence.Temporal;
    import javax.persistence.TemporalType;
    import com.fasterxml.jackson.annotation.JsonFormat;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class HistortiquePrescriptionRadiotherapieDto  extends AuditBaseDto {

    private String dateHistortiquePrescriptionRadiotherapie ;
    private String description  ;

    private PrescriptionRadiotherapieDto prescriptionRadiotherapie ;
    private StatutRadiotherapieDto statutRadiotherapie ;


    public HistortiquePrescriptionRadiotherapieDto(){
        super();
    }



    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateHistortiquePrescriptionRadiotherapie(){
        return this.dateHistortiquePrescriptionRadiotherapie;
    }
    public void setDateHistortiquePrescriptionRadiotherapie(String dateHistortiquePrescriptionRadiotherapie){
        this.dateHistortiquePrescriptionRadiotherapie = dateHistortiquePrescriptionRadiotherapie;
    }

    @Log
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }


    public PrescriptionRadiotherapieDto getPrescriptionRadiotherapie(){
        return this.prescriptionRadiotherapie;
    }

    public void setPrescriptionRadiotherapie(PrescriptionRadiotherapieDto prescriptionRadiotherapie){
        this.prescriptionRadiotherapie = prescriptionRadiotherapie;
    }
    public StatutRadiotherapieDto getStatutRadiotherapie(){
        return this.statutRadiotherapie;
    }

    public void setStatutRadiotherapie(StatutRadiotherapieDto statutRadiotherapie){
        this.statutRadiotherapie = statutRadiotherapie;
    }


}
