package ma.enova.radio.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.radio.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "site")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="site_seq",sequenceName="site_seq",allocationSize=1, initialValue = 1)
public class SiteHistory extends HistBusinessObject  {


    public SiteHistory() {
    super();
    }

    public SiteHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="site_seq")
    public Long getId() {
    return id;
    }
}

