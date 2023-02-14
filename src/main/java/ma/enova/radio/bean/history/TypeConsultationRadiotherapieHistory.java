package ma.enova.radio.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.radio.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "type_consultation_radiotherapie")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="type_consultation_radiotherapie_seq",sequenceName="type_consultation_radiotherapie_seq",allocationSize=1, initialValue = 1)
public class TypeConsultationRadiotherapieHistory extends HistBusinessObject  {


    public TypeConsultationRadiotherapieHistory() {
    super();
    }

    public TypeConsultationRadiotherapieHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="type_consultation_radiotherapie_seq")
    public Long getId() {
    return id;
    }
}

