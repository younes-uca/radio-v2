package ma.enova.radio.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.radio.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "grade_toxicite_rth")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="grade_toxicite_rth_seq",sequenceName="grade_toxicite_rth_seq",allocationSize=1, initialValue = 1)
public class GradeToxiciteRthHistory extends HistBusinessObject  {


    public GradeToxiciteRthHistory() {
    super();
    }

    public GradeToxiciteRthHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="grade_toxicite_rth_seq")
    public Long getId() {
    return id;
    }
}

