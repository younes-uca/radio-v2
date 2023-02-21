package ma.enova.radio.bean.core;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.radio.zynerator.audit.AuditBusinessObjectEnhanced;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "statut_medicale_consultation_radiotherapie")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="statut_medicale_consultation_radiotherapie_seq",sequenceName="statut_medicale_consultation_radiotherapie_seq",allocationSize=1, initialValue = 1)
public class StatutMedicaleConsultationRadiotherapie   extends AuditBusinessObjectEnhanced  {

    private Long id;

    @Column(length = 500)
    private String code;
    @Column(length = 500)
    private String libelle;

    private Services services ;
    


    public StatutMedicaleConsultationRadiotherapie(){
        super();
    }




    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="statut_medicale_consultation_radiotherapie_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }
    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Services getServices(){
        return this.services;
    }
    public void setServices(Services services){
        this.services = services;
    }

    @Transient
    public String getLabel() {
        label = libelle;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StatutMedicaleConsultationRadiotherapie statutMedicaleConsultationRadiotherapie = (StatutMedicaleConsultationRadiotherapie) o;
        return id != null && id.equals(statutMedicaleConsultationRadiotherapie.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

