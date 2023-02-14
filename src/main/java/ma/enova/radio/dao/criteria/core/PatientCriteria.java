package  ma.enova.radio.dao.criteria.core;



import ma.enova.radio.zynerator.criteria.BaseCriteria;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonFormat;
import ma.enova.radio.zynerator.criteria.BaseCriteria;
import java.time.LocalDateTime;



public class PatientCriteria extends BaseCriteria {

    private String ipp;
    private String ippLike;
    private String nom;
    private String nomLike;
    private String prenom;
    private String prenomLike;
    private String sexe;
    private String sexeLike;
    private LocalDateTime dateNaissance;
    private LocalDateTime dateNaissanceFrom;
    private LocalDateTime dateNaissanceTo;
    private String numeroClassement;
    private String numeroClassementLike;
    private String age;
    private String ageMin;
    private String ageMax;



    public PatientCriteria(){}

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

    public String getSexe(){
        return this.sexe;
    }
    public void setSexe(String sexe){
        this.sexe = sexe;
    }
    public String getSexeLike(){
        return this.sexeLike;
    }
    public void setSexeLike(String sexeLike){
        this.sexeLike = sexeLike;
    }

    public LocalDateTime getDateNaissance(){
        return this.dateNaissance;
    }
    public void setDateNaissance(LocalDateTime dateNaissance){
        this.dateNaissance = dateNaissance;
    }
    public LocalDateTime getDateNaissanceFrom(){
        return this.dateNaissanceFrom;
    }
    public void setDateNaissanceFrom(LocalDateTime dateNaissanceFrom){
        this.dateNaissanceFrom = dateNaissanceFrom;
    }
    public LocalDateTime getDateNaissanceTo(){
        return this.dateNaissanceTo;
    }
    public void setDateNaissanceTo(LocalDateTime dateNaissanceTo){
        this.dateNaissanceTo = dateNaissanceTo;
    }
    public String getNumeroClassement(){
        return this.numeroClassement;
    }
    public void setNumeroClassement(String numeroClassement){
        this.numeroClassement = numeroClassement;
    }
    public String getNumeroClassementLike(){
        return this.numeroClassementLike;
    }
    public void setNumeroClassementLike(String numeroClassementLike){
        this.numeroClassementLike = numeroClassementLike;
    }

    public String getAge(){
        return this.age;
    }
    public void setAge(String age){
        this.age = age;
    }   
    public String getAgeMin(){
        return this.ageMin;
    }
    public void setAgeMin(String ageMin){
        this.ageMin = ageMin;
    }
    public String getAgeMax(){
        return this.ageMax;
    }
    public void setAgeMax(String ageMax){
        this.ageMax = ageMax;
    }
      

}
