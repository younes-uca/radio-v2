package ma.enova.radio.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.radio.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "frequence_radiotherapie")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="frequence_radiotherapie_seq",sequenceName="frequence_radiotherapie_seq",allocationSize=1, initialValue = 1)
public class FrequenceRadiotherapieHistory extends HistBusinessObject  {


    public FrequenceRadiotherapieHistory() {
    super();
    }

    public FrequenceRadiotherapieHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="frequence_radiotherapie_seq")
    public Long getId() {
    return id;
    }
}

