package ma.enova.radio.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.radio.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "visee")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="visee_seq",sequenceName="visee_seq",allocationSize=1, initialValue = 1)
public class ViseeHistory extends HistBusinessObject  {


    public ViseeHistory() {
    super();
    }

    public ViseeHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="visee_seq")
    public Long getId() {
    return id;
    }
}

