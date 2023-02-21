package ma.enova.radio.ws.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.radio.zynerator.audit.Log;
import ma.enova.radio.zynerator.dto.AuditBaseDto;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class DecisionTraitementDto extends AuditBaseDto {

    private String code;
    private String dateDecisionTraitement;
    private String etat;
    private Boolean urgence;

    //    private DecisionTherapeutiqueDto decisionTherapeutique;
    private String decisionTherapeutique;
    //private StatutRadiotherapieDto statutRadiotherapie;
    private String statutRadiotherapie;


    public DecisionTraitementDto() {
        super();
    }

    public DecisionTraitementDto(Long id, String code, String codeEtat) {
        super(id);
        this.code = code;
        this.etat = codeEtat;
    }

    @Log
    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateDecisionTraitement() {
        return this.dateDecisionTraitement;
    }

    public void setDateDecisionTraitement(String dateDecisionTraitement) {
        this.dateDecisionTraitement = dateDecisionTraitement;
    }

    @Log
    public Boolean getUrgence() {
        return this.urgence;
    }

    public void setUrgence(Boolean urgence) {
        this.urgence = urgence;
    }

    /*
        public DecisionTherapeutiqueDto getDecisionTherapeutique() {
            return this.decisionTherapeutique;
        }

        public void setDecisionTherapeutique(DecisionTherapeutiqueDto decisionTherapeutique) {
            this.decisionTherapeutique = decisionTherapeutique;
        }*/
    public String getDecisionTherapeutique() {
        return this.decisionTherapeutique;
    }

    public void setDecisionTherapeutique(String decisionTherapeutique) {
        this.decisionTherapeutique = decisionTherapeutique;
    }
/*

    public StatutRadiotherapieDto getStatutRadiotherapie() {
        return this.statutRadiotherapie;
    }

    public void setStatutRadiotherapie(StatutRadiotherapieDto statutRadiotherapie) {
        this.statutRadiotherapie = statutRadiotherapie;
    }
*/

    public String getStatutRadiotherapie() {
        return statutRadiotherapie;
    }

    public void setStatutRadiotherapie(String statutRadiotherapie) {
        this.statutRadiotherapie = statutRadiotherapie;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }
}
