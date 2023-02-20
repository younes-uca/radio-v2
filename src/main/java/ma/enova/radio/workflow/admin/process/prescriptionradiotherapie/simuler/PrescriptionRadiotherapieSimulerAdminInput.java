package ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.simuler;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.radio.required.dto.dmc.DecisionTraitementDto;
import ma.enova.radio.ws.dto.ImmobilistionDto;
import ma.enova.radio.ws.dto.PersonnelDto;
import ma.enova.radio.ws.dto.PositionnementDto;
import ma.enova.radio.ws.dto.StatutRadiotherapieDto;
import ma.enova.radio.zynerator.audit.Log;
import ma.enova.radio.zynerator.process.AbstractProcessInput;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class PrescriptionRadiotherapieSimulerAdminInput extends AbstractProcessInput {

    private String dateSimulation;
    private ImmobilistionDto immobilistion;
    private PositionnementDto positionnement;
    private String fichierTraitements;
    private PersonnelDto validateurSimulation; // to del just put it in output
    private String validateurSimulationDate;// to del just put it in output (now)
    private StatutRadiotherapieDto statutRadiotherapie;// to del just put it in output

    private DecisionTraitementDto decisionTraitement;// to del just put it in output

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateSimulation() {
        return this.dateSimulation;
    }

    public void setDateSimulation(String dateSimulation) {
        this.dateSimulation = dateSimulation;
    }

    public ImmobilistionDto getImmobilistion() {
        return this.immobilistion;
    }

    public void setImmobilistion(ImmobilistionDto immobilistion) {
        this.immobilistion = immobilistion;
    }

    public PositionnementDto getPositionnement() {
        return this.positionnement;
    }

    public void setPositionnement(PositionnementDto positionnement) {
        this.positionnement = positionnement;
    }

    @Log
    public String getFichierTraitements() {
        return this.fichierTraitements;
    }

    public void setFichierTraitements(String fichierTraitements) {
        this.fichierTraitements = fichierTraitements;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getValidateurSimulationDate() {
        return this.validateurSimulationDate;
    }

    public void setValidateurSimulationDate(String validateurSimulationDate) {
        this.validateurSimulationDate = validateurSimulationDate;
    }

    public void setStatutRadiotherapieDto(StatutRadiotherapieDto statutRadiotherapie) {
        this.statutRadiotherapie = statutRadiotherapie;
    }

    public PersonnelDto getValidateurSimulation() {
        return this.validateurSimulation;
    }

    public void setValidateurSimulationDto(PersonnelDto validateurSimulation) {
        this.validateurSimulation = validateurSimulation;
    }

    public StatutRadiotherapieDto getStatutRadiotherapie() {
        return statutRadiotherapie;
    }

    public void setStatutRadiotherapie(StatutRadiotherapieDto statutRadiotherapie) {
        this.statutRadiotherapie = statutRadiotherapie;
    }

    public DecisionTraitementDto getDecisionTraitement() {
        return decisionTraitement;
    }

    public void setDecisionTraitement(DecisionTraitementDto decisionTraitement) {
        this.decisionTraitement = decisionTraitement;
    }

    public void setValidateurSimulation(PersonnelDto validateurSimulation) {
        this.validateurSimulation = validateurSimulation;
    }
}



