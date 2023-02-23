package  ma.enova.radio.ws.dto;

import ma.enova.radio.zynerator.audit.Log;
import ma.enova.radio.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.radio.zynerator.dto.ReferentielBaseDto;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class ViseeDto  extends ReferentielBaseDto {

    private String code  ;
    private String libelle  ;
    private String description  ;

    private ServicesDto services ;


    public ViseeDto(){
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
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }


    public ServicesDto getServices(){
        return this.services;
    }

    public void setServices(ServicesDto services){
        this.services = services;
    }


}
