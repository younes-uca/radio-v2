package ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.simuler;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.radio.ws.dto.PersonnelDto;
import ma.enova.radio.ws.dto.StatutRadiotherapieDto;
import ma.enova.radio.zynerator.audit.Log;
import ma.enova.radio.zynerator.process.AbstractProcessOutput;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class PrescriptionRadiotherapieSimulerAdminOutput extends AbstractProcessOutput {

    private String dateSimulation;
    private String immobilistion;
    private String positionnement;
    private String fichierTraitements;
    private PersonnelDto validateurSimulation;
    private String validateurSimulationDate;
    private StatutRadiotherapieDto statutRadiotherapie;

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateSimulation() {
        return this.dateSimulation;
    }

    public void setDateSimulation(String dateSimulation) {
        this.dateSimulation = dateSimulation;
    }

    @Log
    public String getImmobilistion() {
        return this.immobilistion;
    }

    public void setImmobilistion(String immobilistion) {
        this.immobilistion = immobilistion;
    }

    @Log
    public String getPositionnement() {
        return this.positionnement;
    }

    public void setPositionnement(String positionnement) {
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
}
