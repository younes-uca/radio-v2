package  ma.enova.radio.dao.criteria.core;



import ma.enova.radio.zynerator.criteria.BaseCriteria;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonFormat;
import ma.enova.radio.zynerator.criteria.BaseCriteria;
import java.time.LocalDateTime;



public class ProtocoleInclusionCriteria extends BaseCriteria {

    private String code;
    private String codeLike;
    private String libelle;
    private String libelleLike;
    private LocalDateTime dateInclusion;
    private LocalDateTime dateInclusionFrom;
    private LocalDateTime dateInclusionTo;
    private String protocoleInclusionStatut;
    private String protocoleInclusionStatutLike;



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
    public String getProtocoleInclusionStatut(){
        return this.protocoleInclusionStatut;
    }
    public void setProtocoleInclusionStatut(String protocoleInclusionStatut){
        this.protocoleInclusionStatut = protocoleInclusionStatut;
    }
    public String getProtocoleInclusionStatutLike(){
        return this.protocoleInclusionStatutLike;
    }
    public void setProtocoleInclusionStatutLike(String protocoleInclusionStatutLike){
        this.protocoleInclusionStatutLike = protocoleInclusionStatutLike;
    }


}
