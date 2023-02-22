package ma.enova.radio.bean.core;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.radio.zynerator.audit.AuditBusinessObjectEnhanced;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "protocole_inclusion_statut")
@JsonInclude(JsonInclude.Include.NON_NULL)
//@SequenceGenerator(name="protocole_inclusion_statut_seq",sequenceName="protocole_inclusion_statut_seq",allocationSize=1, initialValue = 1)
public class ProtocoleInclusionStatut   extends AuditBusinessObjectEnhanced  {

    private Long id;

    @Column(length = 500)
    private String name;
    @Column(length = 500)
    private String displayText;

    private Services services ;
    


    public ProtocoleInclusionStatut(){
        super();
    }




    @Id
    @Column(name = "id")
   // @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="protocole_inclusion_statut_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getDisplayText(){
        return this.displayText;
    }
    public void setDisplayText(String displayText){
        this.displayText = displayText;
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
        label = displayText;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProtocoleInclusionStatut protocoleInclusionStatut = (ProtocoleInclusionStatut) o;
        return id != null && id.equals(protocoleInclusionStatut.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

