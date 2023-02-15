package ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.finirtraitement;

import java.util.List;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.math.BigDecimal;

import ma.enova.radio.bean.core.PrescriptionRadiotherapie;
import ma.enova.radio.ws.dto.ModaliteRadiotherapieDto;
import ma.enova.radio.ws.dto.HistortiquePrescriptionRadiotherapieDto;
import ma.enova.radio.ws.dto.StatutRadiotherapieDto;
import ma.enova.radio.ws.dto.SiteDto;
import ma.enova.radio.ws.dto.TypeTraitementDto;
import ma.enova.radio.ws.dto.PersonnelDto;
import ma.enova.radio.ws.dto.ViseeDto;
import ma.enova.radio.ws.dto.SeanceRadiotherapieDto;
import ma.enova.radio.ws.dto.PatientDto;
import ma.enova.radio.ws.dto.ConsultationRadiotherapieDto;
import ma.enova.radio.ws.dto.TypeToxiciteRthDto;
import ma.enova.radio.required.dto.dmc.DecisionTraitementDto;
import ma.enova.radio.ws.dto.TypeConsultationRadiotherapieDto;
import ma.enova.radio.ws.dto.ProtocoleInclusionDto;
import ma.enova.radio.ws.dto.GradeToxiciteRthDto;
import ma.enova.radio.zynerator.audit.Log;
import ma.enova.radio.zynerator.dto.AuditBaseDto;
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



