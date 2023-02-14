package ma.enova.radio.bean.core;

import java.util.Objects;





import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.radio.zynerator.audit.AuditBusinessObjectEnhanced;
import javax.persistence.*;
import java.util.Objects;






@Entity
@Table(name = "categorie_personnel")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="categorie_personnel_seq",sequenceName="categorie_personnel_seq",allocationSize=1, initialValue = 1)
public class CategoriePersonnel   extends AuditBusinessObjectEnhanced  {

    private Long id;

    @Column(length = 500)
    private String libelle;
    @Column(length = 500)
    private String code;

    private Services services ;
    


    public CategoriePersonnel(){
        super();
    }




    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="categorie_personnel_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
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
        CategoriePersonnel categoriePersonnel = (CategoriePersonnel) o;
        return id != null && id.equals(categoriePersonnel.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

