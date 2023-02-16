package ma.enova.radio.bean.core;

import java.time.LocalDate;
import java.util.Objects;

import java.time.LocalDateTime;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;



import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.radio.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;






@Entity
@Table(name = "seance_radiotherapie")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="seance_radiotherapie_seq",sequenceName="seance_radiotherapie_seq",allocationSize=1, initialValue = 1)
public class SeanceRadiotherapie   extends AuditBusinessObject  {

    private Long id;

    @Column(length = 500)
    private String codeRdv;
    private LocalDate datePrevu ;
    private LocalDateTime dateRealisation ;
    private Integer numero = 0;
    @Column(columnDefinition = "boolean default false")
    private Boolean effectue = false;
    @Column(length = 500)
    private String cr;
    @Column(length = 500)
    private String fichiers;

    private PrescriptionRadiotherapie prescriptionRadiotherapie ;
    


    public SeanceRadiotherapie(){
        super();
    }




    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="seance_radiotherapie_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getCodeRdv(){
        return this.codeRdv;
    }
    public void setCodeRdv(String codeRdv){
        this.codeRdv = codeRdv;
    }
    public LocalDate getDatePrevu(){
        return this.datePrevu;
    }
    public void setDatePrevu(LocalDate datePrevu){
        this.datePrevu = datePrevu;
    }
    public LocalDateTime getDateRealisation(){
        return this.dateRealisation;
    }
    public void setDateRealisation(LocalDateTime dateRealisation){
        this.dateRealisation = dateRealisation;
    }
    public Integer getNumero(){
        return this.numero;
    }
    public void setNumero(Integer numero){
        this.numero = numero;
    }
    public Boolean  getEffectue(){
        return this.effectue;
    }
    public void setEffectue(Boolean effectue){
        this.effectue = effectue;
    }
    public String getCr(){
        return this.cr;
    }
    public void setCr(String cr){
        this.cr = cr;
    }
    public String getFichiers(){
        return this.fichiers;
    }
    public void setFichiers(String fichiers){
        this.fichiers = fichiers;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public PrescriptionRadiotherapie getPrescriptionRadiotherapie(){
        return this.prescriptionRadiotherapie;
    }
    public void setPrescriptionRadiotherapie(PrescriptionRadiotherapie prescriptionRadiotherapie){
        this.prescriptionRadiotherapie = prescriptionRadiotherapie;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SeanceRadiotherapie seanceRadiotherapie = (SeanceRadiotherapie) o;
        return id != null && id.equals(seanceRadiotherapie.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

