package ma.enova.radio.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.radio.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "categorie_personnel")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="categorie_personnel_seq",sequenceName="categorie_personnel_seq",allocationSize=1, initialValue = 1)
public class CategoriePersonnelHistory extends HistBusinessObject  {


    public CategoriePersonnelHistory() {
    super();
    }

    public CategoriePersonnelHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="categorie_personnel_seq")
    public Long getId() {
    return id;
    }
}

