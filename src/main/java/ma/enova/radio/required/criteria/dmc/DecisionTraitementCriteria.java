package ma.enova.radio.required.criteria.dmc;

import ma.enova.radio.dao.criteria.core.StatutRadiotherapieCriteria;
import ma.enova.radio.zynerator.criteria.BaseCriteria;

import java.time.LocalDateTime;
import java.util.List;


public class DecisionTraitementCriteria extends BaseCriteria {

    private String code;
    private String codeLike;
    private LocalDateTime dateDecisionTraitement;
    private LocalDateTime dateDecisionTraitementFrom;
    private LocalDateTime dateDecisionTraitementTo;
    private String decisionTherapeutique;
    private String decisionTherapeutiqueLike;
    private String etat;
    private String etatLike;
    private Boolean urgence;
    private StatutRadiotherapieCriteria statutRadiotherapieCriteria;
    private List<StatutRadiotherapieCriteria> statutRadiotherapieCriterias;


    public DecisionTraitementCriteria() {
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCodeLike() {
        return this.codeLike;
    }

    public void setCodeLike(String codeLike) {
        this.codeLike = codeLike;
    }

    public LocalDateTime getDateDecisionTraitement() {
        return this.dateDecisionTraitement;
    }

    public void setDateDecisionTraitement(LocalDateTime dateDecisionTraitement) {
        this.dateDecisionTraitement = dateDecisionTraitement;
    }

    public LocalDateTime getDateDecisionTraitementFrom() {
        return this.dateDecisionTraitementFrom;
    }

    public void setDateDecisionTraitementFrom(LocalDateTime dateDecisionTraitementFrom) {
        this.dateDecisionTraitementFrom = dateDecisionTraitementFrom;
    }

    public LocalDateTime getDateDecisionTraitementTo() {
        return this.dateDecisionTraitementTo;
    }

    public void setDateDecisionTraitementTo(LocalDateTime dateDecisionTraitementTo) {
        this.dateDecisionTraitementTo = dateDecisionTraitementTo;
    }

    public String getDecisionTherapeutique() {
        return this.decisionTherapeutique;
    }

    public void setDecisionTherapeutique(String decisionTherapeutique) {
        this.decisionTherapeutique = decisionTherapeutique;
    }

    public String getDecisionTherapeutiqueLike() {
        return this.decisionTherapeutiqueLike;
    }

    public void setDecisionTherapeutiqueLike(String decisionTherapeutiqueLike) {
        this.decisionTherapeutiqueLike = decisionTherapeutiqueLike;
    }

    public String getEtat() {
        return this.etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public String getEtatLike() {
        return this.etatLike;
    }

    public void setEtatLike(String etatLike) {
        this.etatLike = etatLike;
    }

    public Boolean getUrgence() {
        return this.urgence;
    }

    public void setUrgence(Boolean urgence) {
        this.urgence = urgence;
    }

    public StatutRadiotherapieCriteria getStatutRadiotherapieCriteria() {
        return statutRadiotherapieCriteria;
    }

    public void setStatutRadiotherapieCriteria(StatutRadiotherapieCriteria statutRadiotherapieCriteria) {
        this.statutRadiotherapieCriteria = statutRadiotherapieCriteria;
    }

    public List<StatutRadiotherapieCriteria> getStatutRadiotherapieCriterias() {
        return statutRadiotherapieCriterias;
    }

    public void setStatutRadiotherapieCriterias(List<StatutRadiotherapieCriteria> statutRadiotherapieCriterias) {
        this.statutRadiotherapieCriterias = statutRadiotherapieCriterias;
    }
}
