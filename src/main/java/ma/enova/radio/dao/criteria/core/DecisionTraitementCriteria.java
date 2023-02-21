package ma.enova.radio.dao.criteria.core;


import ma.enova.radio.zynerator.criteria.BaseCriteria;

import java.time.LocalDateTime;
import java.util.List;


public class DecisionTraitementCriteria extends BaseCriteria {

    private String code;
    private String codeLike;
    private LocalDateTime dateDecisionTraitement;
    private LocalDateTime dateDecisionTraitementFrom;
    private LocalDateTime dateDecisionTraitementTo;
    private Boolean urgence;

    private DecisionTherapeutiqueCriteria decisionTherapeutique ;
    private List<DecisionTherapeutiqueCriteria> decisionTherapeutiques ;
    private StatutRadiotherapieCriteria statutRadiotherapie ;
    private List<StatutRadiotherapieCriteria> statutRadiotherapies ;


    public DecisionTraitementCriteria(){}

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

    public LocalDateTime getDateDecisionTraitement(){
        return this.dateDecisionTraitement;
    }
    public void setDateDecisionTraitement(LocalDateTime dateDecisionTraitement){
        this.dateDecisionTraitement = dateDecisionTraitement;
    }
    public LocalDateTime getDateDecisionTraitementFrom(){
        return this.dateDecisionTraitementFrom;
    }
    public void setDateDecisionTraitementFrom(LocalDateTime dateDecisionTraitementFrom){
        this.dateDecisionTraitementFrom = dateDecisionTraitementFrom;
    }
    public LocalDateTime getDateDecisionTraitementTo(){
        return this.dateDecisionTraitementTo;
    }
    public void setDateDecisionTraitementTo(LocalDateTime dateDecisionTraitementTo){
        this.dateDecisionTraitementTo = dateDecisionTraitementTo;
    }
    public Boolean getUrgence(){
        return this.urgence;
    }
    public void setUrgence(Boolean urgence){
        this.urgence = urgence;
    }

    public DecisionTherapeutiqueCriteria getDecisionTherapeutique(){
        return this.decisionTherapeutique;
    }

    public void setDecisionTherapeutique(DecisionTherapeutiqueCriteria decisionTherapeutique){
        this.decisionTherapeutique = decisionTherapeutique;
    }
    public List<DecisionTherapeutiqueCriteria> getDecisionTherapeutiques(){
        return this.decisionTherapeutiques;
    }

    public void setDecisionTherapeutiques(List<DecisionTherapeutiqueCriteria> decisionTherapeutiques){
        this.decisionTherapeutiques = decisionTherapeutiques;
    }
    public StatutRadiotherapieCriteria getStatutRadiotherapie(){
        return this.statutRadiotherapie;
    }

    public void setStatutRadiotherapie(StatutRadiotherapieCriteria statutRadiotherapie){
        this.statutRadiotherapie = statutRadiotherapie;
    }
    public List<StatutRadiotherapieCriteria> getStatutRadiotherapies(){
        return this.statutRadiotherapies;
    }

    public void setStatutRadiotherapies(List<StatutRadiotherapieCriteria> statutRadiotherapies){
        this.statutRadiotherapies = statutRadiotherapies;
    }
}
