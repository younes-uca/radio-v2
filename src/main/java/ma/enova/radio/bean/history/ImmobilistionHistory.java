package ma.enova.radio.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.radio.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "immobilistion")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="immobilistion_seq",sequenceName="immobilistion_seq",allocationSize=1, initialValue = 1)
public class ImmobilistionHistory extends HistBusinessObject  {


    public ImmobilistionHistory() {
    super();
    }

    public ImmobilistionHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="immobilistion_seq")
    public Long getId() {
    return id;
    }
}

