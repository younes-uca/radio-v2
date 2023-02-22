package ma.enova.radio.bean.core;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.radio.zynerator.audit.AuditBusinessObjectEnhanced;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;


@Entity
@Table(name = "protocole_inclusion")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="protocole_inclusion_seq",sequenceName="protocole_inclusion_seq",allocationSize=1, initialValue = 1)
public class ProtocoleInclusion   extends AuditBusinessObjectEnhanced  {

    private Long id;

    @Column(length = 500)
    private String code;
    @Column(length = 500)
    private String libelle;
    private LocalDateTime dateInclusion ;

    private ProtocoleInclusionStatut protocoleInclusionStatut ;
    
    private Services services ;
    


    public ProtocoleInclusion(){
        super();
    }




    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="protocole_inclusion_seq")
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
    public LocalDateTime getDateInclusion(){
        return this.dateInclusion;
    }
    public void setDateInclusion(LocalDateTime dateInclusion){
        this.dateInclusion = dateInclusion;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public ProtocoleInclusionStatut getProtocoleInclusionStatut(){
        return this.protocoleInclusionStatut;
    }
    public void setProtocoleInclusionStatut(ProtocoleInclusionStatut protocoleInclusionStatut){
        this.protocoleInclusionStatut = protocoleInclusionStatut;
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
        ProtocoleInclusion protocoleInclusion = (ProtocoleInclusion) o;
        return id != null && id.equals(protocoleInclusion.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

