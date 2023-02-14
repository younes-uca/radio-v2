package ma.enova.radio.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.radio.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "seance_radiotherapie")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="seance_radiotherapie_seq",sequenceName="seance_radiotherapie_seq",allocationSize=1, initialValue = 1)
public class SeanceRadiotherapieHistory extends HistBusinessObject  {


    public SeanceRadiotherapieHistory() {
    super();
    }

    public SeanceRadiotherapieHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="seance_radiotherapie_seq")
    public Long getId() {
    return id;
    }
}

