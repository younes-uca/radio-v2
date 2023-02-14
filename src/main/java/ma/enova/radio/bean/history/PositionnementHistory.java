package ma.enova.radio.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.radio.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "positionnement")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="positionnement_seq",sequenceName="positionnement_seq",allocationSize=1, initialValue = 1)
public class PositionnementHistory extends HistBusinessObject  {


    public PositionnementHistory() {
    super();
    }

    public PositionnementHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="positionnement_seq")
    public Long getId() {
    return id;
    }
}

