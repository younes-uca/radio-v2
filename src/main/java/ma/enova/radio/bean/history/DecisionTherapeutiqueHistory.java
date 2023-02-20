package ma.enova.radio.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.radio.zynerator.history.HistBusinessObject;

import javax.persistence.*;


@Entity
@Table(name = "decision_therapeutique")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="decision_therapeutique_seq",sequenceName="decision_therapeutique_seq",allocationSize=1, initialValue = 1)
public class DecisionTherapeutiqueHistory extends HistBusinessObject  {


    public DecisionTherapeutiqueHistory() {
    super();
    }

    public DecisionTherapeutiqueHistory(Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="decision_therapeutique_seq")
    public Long getId() {
    return id;
    }
}

