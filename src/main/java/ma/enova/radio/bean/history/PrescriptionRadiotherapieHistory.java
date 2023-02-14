package ma.enova.radio.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.radio.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "prescription_radiotherapie")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="prescription_radiotherapie_seq",sequenceName="prescription_radiotherapie_seq",allocationSize=1, initialValue = 1)
public class PrescriptionRadiotherapieHistory extends HistBusinessObject  {


    public PrescriptionRadiotherapieHistory() {
    super();
    }

    public PrescriptionRadiotherapieHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="prescription_radiotherapie_seq")
    public Long getId() {
    return id;
    }
}

