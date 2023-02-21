package ma.enova.radio.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.radio.zynerator.history.HistBusinessObject;

import javax.persistence.*;


@Entity
@Table(name = "statut_medicale_consultation_radiotherapie")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="statut_medicale_consultation_radiotherapie_seq",sequenceName="statut_medicale_consultation_radiotherapie_seq",allocationSize=1, initialValue = 1)
public class StatutMedicaleConsultationRadiotherapieHistory extends HistBusinessObject  {


    public StatutMedicaleConsultationRadiotherapieHistory() {
    super();
    }

    public StatutMedicaleConsultationRadiotherapieHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="statut_medicale_consultation_radiotherapie_seq")
    public Long getId() {
    return id;
    }
}

