package  ma.enova.radio.dao.criteria.core;



import ma.enova.radio.zynerator.criteria.BaseCriteria;
import java.util.List;



public class PersonnelCriteria extends BaseCriteria {

    private String ipp;
    private String ippLike;
    private String nom;
    private String nomLike;
    private String prenom;
    private String prenomLike;
    private String cin;
    private String cinLike;
    private String telephone;
    private String telephoneLike;
    private String email;
    private String emailLike;
    private String mobile;
    private String mobileLike;
    private Boolean expertise;



    public PersonnelCriteria(){}

    public String getIpp(){
        return this.ipp;
    }
    public void setIpp(String ipp){
        this.ipp = ipp;
    }
    public String getIppLike(){
        return this.ippLike;
    }
    public void setIppLike(String ippLike){
        this.ippLike = ippLike;
    }

    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public String getNomLike(){
        return this.nomLike;
    }
    public void setNomLike(String nomLike){
        this.nomLike = nomLike;
    }

    public String getPrenom(){
        return this.prenom;
    }
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }
    public String getPrenomLike(){
        return this.prenomLike;
    }
    public void setPrenomLike(String prenomLike){
        this.prenomLike = prenomLike;
    }

    public String getCin(){
        return this.cin;
    }
    public void setCin(String cin){
        this.cin = cin;
    }
    public String getCinLike(){
        return this.cinLike;
    }
    public void setCinLike(String cinLike){
        this.cinLike = cinLike;
    }

    public String getTelephone(){
        return this.telephone;
    }
    public void setTelephone(String telephone){
        this.telephone = telephone;
    }
    public String getTelephoneLike(){
        return this.telephoneLike;
    }
    public void setTelephoneLike(String telephoneLike){
        this.telephoneLike = telephoneLike;
    }

    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmailLike(){
        return this.emailLike;
    }
    public void setEmailLike(String emailLike){
        this.emailLike = emailLike;
    }

    public String getMobile(){
        return this.mobile;
    }
    public void setMobile(String mobile){
        this.mobile = mobile;
    }
    public String getMobileLike(){
        return this.mobileLike;
    }
    public void setMobileLike(String mobileLike){
        this.mobileLike = mobileLike;
    }

    public Boolean getExpertise(){
        return this.expertise;
    }
    public void setExpertise(Boolean expertise){
        this.expertise = expertise;
    }

}
