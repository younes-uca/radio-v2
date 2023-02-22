package ma.enova.radio.dao.criteria.core;


import ma.enova.radio.zynerator.criteria.BaseCriteria;

import java.time.LocalDateTime;
import java.util.List;



public class ProtocoleInclusionCriteria extends BaseCriteria {

    private String code;
    private String codeLike;
    private String libelle;
    private String libelleLike;
    private LocalDateTime dateInclusion;
    private LocalDateTime dateInclusionFrom;
    private LocalDateTime dateInclusionTo;

    private ProtocoleInclusionStatutCriteria protocoleInclusionStatut ;
    private List<ProtocoleInclusionStatutCriteria> protocoleInclusionStatuts ;
    private ServicesCriteria services ;
    private List<ServicesCriteria> servicess ;


    public ProtocoleInclusionCriteria(){}

    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }
    public String getCodeLike(){
        return this.codeLike;
    }
    public void setCodeLike(String codeLike){
        this.codeLike = codeLike;
    }

    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }
    public String getLibelleLike(){
        return this.libelleLike;
    }
    public void setLibelleLike(String libelleLike){
        this.libelleLike = libelleLike;
    }

    public LocalDateTime getDateInclusion(){
        return this.dateInclusion;
    }
    public void setDateInclusion(LocalDateTime dateInclusion){
        this.dateInclusion = dateInclusion;
    }
    public LocalDateTime getDateInclusionFrom(){
        return this.dateInclusionFrom;
    }
    public void setDateInclusionFrom(LocalDateTime dateInclusionFrom){
        this.dateInclusionFrom = dateInclusionFrom;
    }
    public LocalDateTime getDateInclusionTo(){
        return this.dateInclusionTo;
    }
    public void setDateInclusionTo(LocalDateTime dateInclusionTo){
        this.dateInclusionTo = dateInclusionTo;
    }

    public ProtocoleInclusionStatutCriteria getProtocoleInclusionStatut(){
        return this.protocoleInclusionStatut;
    }

    public void setProtocoleInclusionStatut(ProtocoleInclusionStatutCriteria protocoleInclusionStatut){
        this.protocoleInclusionStatut = protocoleInclusionStatut;
    }
    public List<ProtocoleInclusionStatutCriteria> getProtocoleInclusionStatuts(){
        return this.protocoleInclusionStatuts;
    }

    public void setProtocoleInclusionStatuts(List<ProtocoleInclusionStatutCriteria> protocoleInclusionStatuts){
        this.protocoleInclusionStatuts = protocoleInclusionStatuts;
    }
    public ServicesCriteria getServices(){
        return this.services;
    }

    public void setServices(ServicesCriteria services){
        this.services = services;
    }
    public List<ServicesCriteria> getServicess(){
        return this.servicess;
    }

    public void setServicess(List<ServicesCriteria> servicess){
        this.servicess = servicess;
    }
}
