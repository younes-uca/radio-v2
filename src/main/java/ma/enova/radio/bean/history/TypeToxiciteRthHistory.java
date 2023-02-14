package ma.enova.radio.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.radio.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "type_toxicite_rth")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="type_toxicite_rth_seq",sequenceName="type_toxicite_rth_seq",allocationSize=1, initialValue = 1)
public class TypeToxiciteRthHistory extends HistBusinessObject  {


    public TypeToxiciteRthHistory() {
    super();
    }

    public TypeToxiciteRthHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="type_toxicite_rth_seq")
    public Long getId() {
    return id;
    }
}

