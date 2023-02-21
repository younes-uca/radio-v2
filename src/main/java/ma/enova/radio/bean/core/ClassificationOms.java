package ma.enova.radio.bean.core;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.radio.zynerator.audit.AuditBusinessObjectEnhanced;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "classification_oms")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="classification_oms_seq",sequenceName="classification_oms_seq",allocationSize=1, initialValue = 1)
public class ClassificationOms   extends AuditBusinessObjectEnhanced  {

    private Long id;

    @Column(length = 500)
    private String code;
    @Column(length = 500)
    private String libelle;

    private Services services ;
    


    public ClassificationOms(){
        super();
    }




    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="classification_oms_seq")
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
        ClassificationOms classificationOms = (ClassificationOms) o;
        return id != null && id.equals(classificationOms.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

