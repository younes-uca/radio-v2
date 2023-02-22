package ma.enova.radio.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.radio.zynerator.history.HistBusinessObject;

import javax.persistence.*;


@Entity
@Table(name = "protocole_inclusion_statut")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="protocole_inclusion_statut_seq",sequenceName="protocole_inclusion_statut_seq",allocationSize=1, initialValue = 1)
public class ProtocoleInclusionStatutHistory extends HistBusinessObject  {


    public ProtocoleInclusionStatutHistory() {
    super();
    }

    public ProtocoleInclusionStatutHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="protocole_inclusion_statut_seq")
    public Long getId() {
    return id;
    }
}

