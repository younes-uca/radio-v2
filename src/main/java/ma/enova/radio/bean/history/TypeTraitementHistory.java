package ma.enova.radio.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.radio.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "type_traitement")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="type_traitement_seq",sequenceName="type_traitement_seq",allocationSize=1, initialValue = 1)
public class TypeTraitementHistory extends HistBusinessObject  {


    public TypeTraitementHistory() {
    super();
    }

    public TypeTraitementHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="type_traitement_seq")
    public Long getId() {
    return id;
    }
}

