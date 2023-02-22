package ma.enova.radio.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.radio.zynerator.history.HistBusinessObject;

import javax.persistence.*;


@Entity
@Table(name = "protocole_inclusion")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="protocole_inclusion_seq",sequenceName="protocole_inclusion_seq",allocationSize=1, initialValue = 1)
public class ProtocoleInclusionHistory extends HistBusinessObject  {


    public ProtocoleInclusionHistory() {
    super();
    }

    public ProtocoleInclusionHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="protocole_inclusion_seq")
    public Long getId() {
    return id;
    }
}

