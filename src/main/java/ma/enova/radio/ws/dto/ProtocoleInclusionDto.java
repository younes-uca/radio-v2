package ma.enova.radio.ws.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.radio.zynerator.audit.Log;
import ma.enova.radio.zynerator.dto.AuditBaseDto;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProtocoleInclusionDto extends AuditBaseDto {

    private String code;
    private String libelle;
    private String dateInclusion;
    private ProtocoleInclusionStatutDto protocoleInclusionStatut;

    private ServicesDto services;


    public ProtocoleInclusionDto() {
        super();
    }


    @Log
    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Log
    public String getLibelle() {
        return this.libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    public String getDateInclusion() {
        return this.dateInclusion;
    }

    public void setDateInclusion(String dateInclusion) {
        this.dateInclusion = dateInclusion;
    }



    public ServicesDto getServices() {
        return this.services;
    }

    public void setServices(ServicesDto services) {
        this.services = services;
    }

    public ProtocoleInclusionStatutDto getProtocoleInclusionStatut() {
        return protocoleInclusionStatut;
    }

    public void setProtocoleInclusionStatut(ProtocoleInclusionStatutDto protocoleInclusionStatut) {
        this.protocoleInclusionStatut = protocoleInclusionStatut;
    }
}
