package ma.enova.radio.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.radio.zynerator.history.HistBusinessObject;

import javax.persistence.*;


@Entity
@Table(name = "visee")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="decision_traitement_seq",sequenceName="decision_traitement_seq",allocationSize=1, initialValue = 1)
public class DecisionTraitementHistory extends HistBusinessObject  {


    public DecisionTraitementHistory() {
    super();
    }

    public DecisionTraitementHistory(Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="decision_traitement_seq")
    public Long getId() {
    return id;
    }
}

