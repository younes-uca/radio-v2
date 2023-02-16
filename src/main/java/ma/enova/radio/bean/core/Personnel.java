package ma.enova.radio.bean.core;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.radio.zynerator.audit.AuditBusinessObjectEnhanced;
import ma.enova.radio.zynerator.security.bean.User;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "personnel")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name = "personnel_seq", sequenceName = "personnel_seq", allocationSize = 1, initialValue = 1)
public class Personnel extends User {

    private Long id;

    @Column(length = 500)
    private String ipp;
    @Lob
    @Column(columnDefinition = "TEXT")
    private String adresse;
    @Column(length = 500)
    private String cin;
    @Column(length = 500)
    private String telephone;
    @Column(length = 500)
    private String email;
    @Column(length = 500)
    private String mobile;
    @Column(columnDefinition = "boolean default false")
    private Boolean expertise = false;

    private CategoriePersonnel categoriePersonnel;

    private Specialite specialite;


    public Personnel() {
        super();
    }

    public Personnel(Long id) {
        this.id = id;
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "personnel_seq")
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIpp() {
        return this.ipp;
    }

    public void setIpp(String ipp) {
        this.ipp = ipp;
    }

    public String getAdresse() {
        return this.adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCin() {
        return this.cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getTelephone() {
        return this.telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Boolean getExpertise() {
        return this.expertise;
    }

    public void setExpertise(Boolean expertise) {
        this.expertise = expertise;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    public CategoriePersonnel getCategoriePersonnel() {
        return this.categoriePersonnel;
    }

    public void setCategoriePersonnel(CategoriePersonnel categoriePersonnel) {
        this.categoriePersonnel = categoriePersonnel;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    public Specialite getSpecialite() {
        return this.specialite;
    }

    public void setSpecialite(Specialite specialite) {
        this.specialite = specialite;
    }

    @Transient
    public String getLabel() {
        label = ipp;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personnel personnel = (Personnel) o;
        return id != null && id.equals(personnel.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

