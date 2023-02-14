package ma.enova.radio.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.radio.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "histortique_prescription_radiotherapie")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="histortique_prescription_radiotherapie_seq",sequenceName="histortique_prescription_radiotherapie_seq",allocationSize=1, initialValue = 1)
public class HistortiquePrescriptionRadiotherapieHistory extends HistBusinessObject  {


    public HistortiquePrescriptionRadiotherapieHistory() {
    super();
    }

    public HistortiquePrescriptionRadiotherapieHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="histortique_prescription_radiotherapie_seq")
    public Long getId() {
    return id;
    }
}

