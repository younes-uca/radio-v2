package ma.enova.radio.bean.core;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.radio.zynerator.audit.AuditBusinessObject;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;


@Entity
@Table(name = "decision_traitement")
@JsonInclude(JsonInclude.Include.NON_NULL)
//@SequenceGenerator(name = "decision_traitement_seq", sequenceName = "decision_traitement_seq", allocationSize = 1, initialValue = 1)
public class DecisionTraitement extends AuditBusinessObject {

    private Long id;

    private String code;
    private LocalDateTime dateDecisionTraitement;
    @Lob
    @Column(columnDefinition = "TEXT")
    private String decisionTherapeutique;

    private Boolean urgence;
    private StatutRadiotherapie statutRadiotherapie;


    public DecisionTraitement() {
        super();
    }


    @Id
    @Column(name = "id")
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "decision_traitement_seq")
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDateDecisionTraitement() {
        return this.dateDecisionTraitement;
    }

    public void setDateDecisionTraitement(LocalDateTime dateHistortiquePrescriptionRadiotherapie) {
        this.dateDecisionTraitement = dateHistortiquePrescriptionRadiotherapie;
    }


    @ManyToOne(fetch = FetchType.LAZY)
    public StatutRadiotherapie getStatutRadiotherapie() {
        return this.statutRadiotherapie;
    }

    public void setStatutRadiotherapie(StatutRadiotherapie statutRadiotherapie) {
        this.statutRadiotherapie = statutRadiotherapie;
    }

    public String getDecisionTherapeutique() {
        return decisionTherapeutique;
    }

    public void setDecisionTherapeutique(String decisionTherapeutique) {
        this.decisionTherapeutique = decisionTherapeutique;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Boolean getUrgence() {
        return urgence;
    }

    public void setUrgence(Boolean urgence) {
        this.urgence = urgence;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DecisionTraitement histortiquePrescriptionRadiotherapie = (DecisionTraitement) o;
        return id != null && id.equals(histortiquePrescriptionRadiotherapie.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

