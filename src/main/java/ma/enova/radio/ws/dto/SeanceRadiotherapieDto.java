package  ma.enova.radio.ws.dto;

import ma.enova.radio.zynerator.audit.Log;
import ma.enova.radio.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

    import java.util.Date;
    import javax.persistence.Temporal;
    import javax.persistence.TemporalType;
    import com.fasterxml.jackson.annotation.JsonFormat;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class SeanceRadiotherapieDto  extends AuditBaseDto {

    private String codeRdv  ;
    private String datePrevu ;
    private String dateRealisation ;
    private Integer numero  = 0 ;
    private Boolean effectue  ;
    private String cr  ;
    private String fichiers  ;

    private PrescriptionRadiotherapieDto prescriptionRadiotherapie ;


    public SeanceRadiotherapieDto(){
        super();
    }



    @Log
    public String getCodeRdv(){
        return this.codeRdv;
    }
    public void setCodeRdv(String codeRdv){
        this.codeRdv = codeRdv;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDatePrevu(){
        return this.datePrevu;
    }
    public void setDatePrevu(String datePrevu){
        this.datePrevu = datePrevu;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateRealisation(){
        return this.dateRealisation;
    }
    public void setDateRealisation(String dateRealisation){
        this.dateRealisation = dateRealisation;
    }

    @Log
    public Integer getNumero(){
        return this.numero;
    }
    public void setNumero(Integer numero){
        this.numero = numero;
    }

    @Log
    public Boolean getEffectue(){
        return this.effectue;
    }
    public void setEffectue(Boolean effectue){
        this.effectue = effectue;
    }

    @Log
    public String getCr(){
        return this.cr;
    }
    public void setCr(String cr){
        this.cr = cr;
    }

    @Log
    public String getFichiers(){
        return this.fichiers;
    }
    public void setFichiers(String fichiers){
        this.fichiers = fichiers;
    }


    public PrescriptionRadiotherapieDto getPrescriptionRadiotherapie(){
        return this.prescriptionRadiotherapie;
    }

    public void setPrescriptionRadiotherapie(PrescriptionRadiotherapieDto prescriptionRadiotherapie){
        this.prescriptionRadiotherapie = prescriptionRadiotherapie;
    }


}
