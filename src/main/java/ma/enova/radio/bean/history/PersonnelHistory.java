package ma.enova.radio.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.radio.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "personnel")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="personnel_seq",sequenceName="personnel_seq",allocationSize=1, initialValue = 1)
public class PersonnelHistory extends HistBusinessObject  {


    public PersonnelHistory() {
    super();
    }

    public PersonnelHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="personnel_seq")
    public Long getId() {
    return id;
    }
}

