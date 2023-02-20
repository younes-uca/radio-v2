package ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.finirtraitement;

import com.fasterxml.jackson.annotation.JsonFormat;

import ma.enova.radio.zynerator.audit.Log;
import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.radio.zynerator.process.AbstractProcessInput;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class PrescriptionRadiotherapieFinirTraitementAdminInput extends AbstractProcessInput {
    private String dateFinTraitement;
    private String compteRendu;
    private String fichierTraitements;


    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateFinTraitement() {
        return this.dateFinTraitement;
    }

    public void setDateFinTraitement(String dateFinTraitement) {
        this.dateFinTraitement = dateFinTraitement;
    }
    @Log
    public String getFichierTraitements(){
        return this.fichierTraitements;
    }
    public void setFichierTraitements(String fichierTraitements){
        this.fichierTraitements = fichierTraitements;
    }

    @Log
    public String getCompteRendu(){
        return this.compteRendu;
    }
    public void setCompteRendu(String compteRendu){
        this.compteRendu = compteRendu;
    }

}



