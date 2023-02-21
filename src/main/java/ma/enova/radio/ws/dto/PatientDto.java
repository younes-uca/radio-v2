package  ma.enova.radio.ws.dto;

import ma.enova.radio.zynerator.audit.Log;
import ma.enova.radio.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import com.fasterxml.jackson.annotation.JsonFormat;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class PatientDto  extends AuditBaseDto {

    private String ipp  ;
    private String nom  ;
    private String prenom  ;
    private String sexe  ;
    private String dateNaissance ;
    private String numeroDeClassement;
    private Integer age  = 0 ;



    public PatientDto(){
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
    public String getSexe(){
        return this.sexe;
    }
    public void setSexe(String sexe){
        this.sexe = sexe;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateNaissance(){
        return this.dateNaissance;
    }
    public void setDateNaissance(String dateNaissance){
        this.dateNaissance = dateNaissance;
    }

    @Log
    public String getNumeroDeClassement(){
        return this.numeroDeClassement;
    }
    public void setNumeroDeClassement(String numeroDeClassement){
        this.numeroDeClassement = numeroDeClassement;
    }

    @Log
    public Integer getAge(){
        return this.age;
    }
    public void setAge(Integer age){
        this.age = age;
    }




}
