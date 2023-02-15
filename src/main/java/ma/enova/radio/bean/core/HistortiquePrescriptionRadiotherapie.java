package ma.enova.radio.bean.core;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.radio.zynerator.audit.AuditBusinessObject;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;


@Entity
@Table(name = "histortique_prescription_radiotherapie")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name = "histortique_prescription_radiotherapie_seq", sequenceName = "histortique_prescription_radiotherapie_seq", allocationSize = 1, initialValue = 1)
public class HistortiquePrescriptionRadiotherapie extends AuditBusinessObject {

    private Long id;

    private LocalDateTime dateHistortiquePrescriptionRadiotherapie;
    @Lob
    @Column(columnDefinition = "TEXT")
    private String description;

    private PrescriptionRadiotherapie prescriptionRadiotherapie;

    private StatutRadiotherapie statutRadiotherapie;


    public HistortiquePrescriptionRadiotherapie() {
        super();
    }

    public HistortiquePrescriptionRadiotherapie(LocalDateTime dateHistortiquePrescriptionRadiotherapie, Long prescriptionRadiotherapieId,
                                                StatutRadiotherapie statutRadiotherapie) {
        this.dateHistortiquePrescriptionRadiotherapie = dateHistortiquePrescriptionRadiotherapie;
        if(this.prescriptionRadiotherapie == null){
            this.prescriptionRadiotherapie = new PrescriptionRadiotherapie();
        }
        this.prescriptionRadiotherapie.setId(prescriptionRadiotherapieId);
        this.statutRadiotherapie = statutRadiotherapie;
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "histortique_prescription_radiotherapie_seq")
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDateHistortiquePrescriptionRadiotherapie() {
        return this.dateHistortiquePrescriptionRadiotherapie;
    }

    public void setDateHistortiquePrescriptionRadiotherapie(LocalDateTime dateHistortiquePrescriptionRadiotherapie) {
        this.dateHistortiquePrescriptionRadiotherapie = dateHistortiquePrescriptionRadiotherapie;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    public PrescriptionRadiotherapie getPrescriptionRadiotherapie() {
        return this.prescriptionRadiotherapie;
    }

    public void setPrescriptionRadiotherapie(PrescriptionRadiotherapie prescriptionRadiotherapie) {
        this.prescriptionRadiotherapie = prescriptionRadiotherapie;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    public StatutRadiotherapie getStatutRadiotherapie() {
        return this.statutRadiotherapie;
    }

    public void setStatutRadiotherapie(StatutRadiotherapie statutRadiotherapie) {
        this.statutRadiotherapie = statutRadiotherapie;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HistortiquePrescriptionRadiotherapie histortiquePrescriptionRadiotherapie = (HistortiquePrescriptionRadiotherapie) o;
        return id != null && id.equals(histortiquePrescriptionRadiotherapie.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

