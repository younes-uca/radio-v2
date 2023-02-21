package ma.enova.radio.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.radio.zynerator.history.HistBusinessObject;

import javax.persistence.*;


@Entity
@Table(name = "specialite")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="specialite_seq",sequenceName="specialite_seq",allocationSize=1, initialValue = 1)
public class SpecialiteHistory extends HistBusinessObject  {


    public SpecialiteHistory() {
    super();
    }

    public SpecialiteHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="specialite_seq")
    public Long getId() {
    return id;
    }
}

