package  ma.enova.radio.ws.dto;

import ma.enova.radio.zynerator.audit.Log;
import ma.enova.radio.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

    import java.util.Date;
    import javax.persistence.Temporal;
    import javax.persistence.TemporalType;
    import com.fasterxml.jackson.annotation.JsonFormat;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProtocoleInclusionDto  extends AuditBaseDto {

    private String code  ;
    private String libelle  ;
    private String dateInclusion ;
    private String protocoleInclusionStatut  ;

    private ServicesDto services ;


    public ProtocoleInclusionDto(){
        super();
    }



    @Log
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }

    @Log
    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateInclusion(){
        return this.dateInclusion;
    }
    public void setDateInclusion(String dateInclusion){
        this.dateInclusion = dateInclusion;
    }

    @Log
    public String getProtocoleInclusionStatut(){
        return this.protocoleInclusionStatut;
    }
    public void setProtocoleInclusionStatut(String protocoleInclusionStatut){
        this.protocoleInclusionStatut = protocoleInclusionStatut;
    }


    public ServicesDto getServices(){
        return this.services;
    }

    public void setServices(ServicesDto services){
        this.services = services;
    }


}
