package ma.enova.radio.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.radio.zynerator.history.HistBusinessObject;

import javax.persistence.*;


@Entity
@Table(name = "classification_oms")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="classification_oms_seq",sequenceName="classification_oms_seq",allocationSize=1, initialValue = 1)
public class ClassificationOmsHistory extends HistBusinessObject  {


    public ClassificationOmsHistory() {
    super();
    }

    public ClassificationOmsHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="classification_oms_seq")
    public Long getId() {
    return id;
    }
}

