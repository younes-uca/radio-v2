package ma.enova.radio.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.radio.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "consultation_radiotherapie")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="consultation_radiotherapie_seq",sequenceName="consultation_radiotherapie_seq",allocationSize=1, initialValue = 1)
public class ConsultationRadiotherapieHistory extends HistBusinessObject  {


    public ConsultationRadiotherapieHistory() {
    super();
    }

    public ConsultationRadiotherapieHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="consultation_radiotherapie_seq")
    public Long getId() {
    return id;
    }
}

