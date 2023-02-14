package  ma.enova.radio.ws.dto;

import ma.enova.radio.zynerator.audit.Log;
import ma.enova.radio.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class PersonnelDto  extends AuditBaseDto {

    private String ipp  ;
    private String adresse  ;
    private String nom  ;
    private String prenom  ;
    private String cin  ;
    private String telephone  ;
    private String email  ;
    private String mobile  ;
    private Boolean expertise  ;

    private CategoriePersonnelDto categoriePersonnel ;
    private SpecialiteDto specialite ;


    public PersonnelDto(){
        super();
    }



    @Log
    public String getIpp(){
        return this.ipp;
    }
    public void setIpp(String ipp){
        this.ipp = ipp;
    }

    @Log
    public String getAdresse(){
        return this.adresse;
    }
    public void setAdresse(String adresse){
        this.adresse = adresse;
    }

    @Log
    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }

    @Log
    public String getPrenom(){
        return this.prenom;
    }
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }

    @Log
    public String getCin(){
        return this.cin;
    }
    public void setCin(String cin){
        this.cin = cin;
    }

    @Log
    public String getTelephone(){
        return this.telephone;
    }
    public void setTelephone(String telephone){
        this.telephone = telephone;
    }

    @Log
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    @Log
    public String getMobile(){
        return this.mobile;
    }
    public void setMobile(String mobile){
        this.mobile = mobile;
    }

    @Log
    public Boolean getExpertise(){
        return this.expertise;
    }
    public void setExpertise(Boolean expertise){
        this.expertise = expertise;
    }


    public CategoriePersonnelDto getCategoriePersonnel(){
        return this.categoriePersonnel;
    }

    public void setCategoriePersonnel(CategoriePersonnelDto categoriePersonnel){
        this.categoriePersonnel = categoriePersonnel;
    }
    public SpecialiteDto getSpecialite(){
        return this.specialite;
    }

    public void setSpecialite(SpecialiteDto specialite){
        this.specialite = specialite;
    }


}
