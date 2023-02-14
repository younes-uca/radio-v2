package  ma.enova.radio.dao.criteria.core;



import ma.enova.radio.zynerator.criteria.BaseCriteria;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonFormat;
import ma.enova.radio.zynerator.criteria.BaseCriteria;
import java.time.LocalDateTime;



public class SeanceRadiotherapieCriteria extends BaseCriteria {

    private String codeRdv;
    private String codeRdvLike;
    private LocalDateTime datePrevu;
    private LocalDateTime datePrevuFrom;
    private LocalDateTime datePrevuTo;
    private LocalDateTime dateRealisation;
    private LocalDateTime dateRealisationFrom;
    private LocalDateTime dateRealisationTo;
    private String numero;
    private String numeroMin;
    private String numeroMax;
    private Boolean effectue;
    private String cr;
    private String crLike;
    private String fichiers;
    private String fichiersLike;



    public SeanceRadiotherapieCriteria(){}

    public String getCodeRdv(){
        return this.codeRdv;
    }
    public void setCodeRdv(String codeRdv){
        this.codeRdv = codeRdv;
    }
    public String getCodeRdvLike(){
        return this.codeRdvLike;
    }
    public void setCodeRdvLike(String codeRdvLike){
        this.codeRdvLike = codeRdvLike;
    }

    public LocalDateTime getDatePrevu(){
        return this.datePrevu;
    }
    public void setDatePrevu(LocalDateTime datePrevu){
        this.datePrevu = datePrevu;
    }
    public LocalDateTime getDatePrevuFrom(){
        return this.datePrevuFrom;
    }
    public void setDatePrevuFrom(LocalDateTime datePrevuFrom){
        this.datePrevuFrom = datePrevuFrom;
    }
    public LocalDateTime getDatePrevuTo(){
        return this.datePrevuTo;
    }
    public void setDatePrevuTo(LocalDateTime datePrevuTo){
        this.datePrevuTo = datePrevuTo;
    }
    public LocalDateTime getDateRealisation(){
        return this.dateRealisation;
    }
    public void setDateRealisation(LocalDateTime dateRealisation){
        this.dateRealisation = dateRealisation;
    }
    public LocalDateTime getDateRealisationFrom(){
        return this.dateRealisationFrom;
    }
    public void setDateRealisationFrom(LocalDateTime dateRealisationFrom){
        this.dateRealisationFrom = dateRealisationFrom;
    }
    public LocalDateTime getDateRealisationTo(){
        return this.dateRealisationTo;
    }
    public void setDateRealisationTo(LocalDateTime dateRealisationTo){
        this.dateRealisationTo = dateRealisationTo;
    }
    public String getNumero(){
        return this.numero;
    }
    public void setNumero(String numero){
        this.numero = numero;
    }   
    public String getNumeroMin(){
        return this.numeroMin;
    }
    public void setNumeroMin(String numeroMin){
        this.numeroMin = numeroMin;
    }
    public String getNumeroMax(){
        return this.numeroMax;
    }
    public void setNumeroMax(String numeroMax){
        this.numeroMax = numeroMax;
    }
      
    public Boolean getEffectue(){
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
    public String getCrLike(){
        return this.crLike;
    }
    public void setCrLike(String crLike){
        this.crLike = crLike;
    }

    public String getFichiers(){
        return this.fichiers;
    }
    public void setFichiers(String fichiers){
        this.fichiers = fichiers;
    }
    public String getFichiersLike(){
        return this.fichiersLike;
    }
    public void setFichiersLike(String fichiersLike){
        this.fichiersLike = fichiersLike;
    }


}
