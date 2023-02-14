package ma.enova.radio.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.radio.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "modalite_radiotherapie")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="modalite_radiotherapie_seq",sequenceName="modalite_radiotherapie_seq",allocationSize=1, initialValue = 1)
public class ModaliteRadiotherapieHistory extends HistBusinessObject  {


    public ModaliteRadiotherapieHistory() {
    super();
    }

    public ModaliteRadiotherapieHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="modalite_radiotherapie_seq")
    public Long getId() {
    return id;
    }
}

