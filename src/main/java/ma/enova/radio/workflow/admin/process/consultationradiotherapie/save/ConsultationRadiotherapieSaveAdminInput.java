package ma.enova.radio.workflow.admin.process.consultationradiotherapie.save;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.radio.ws.dto.*;
import ma.enova.radio.zynerator.audit.Log;
import ma.enova.radio.zynerator.process.AbstractProcessInput;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConsultationRadiotherapieSaveAdminInput extends AbstractProcessInput {

    private String dateConsultation ;
    private String observation  ;

    private PersonnelDto medecin ;
    private SpecialiteDto specialite ;
    private TypeConsultationRadiotherapieDto typeConsultationRadiotherapie ;
    private TypeToxiciteRthDto typeToxiciteRth ;
    private GradeToxiciteRthDto gradeToxiciteRth ;
    private ClassificationOmsDto classificationOms ;
    private StatutMedicaleConsultationRadiotherapieDto statutMedicaleConsultationRadiotherapie ;
    private PrescriptionRadiotherapieDto prescriptionRadiotherapie ;



    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateConsultation(){
        return this.dateConsultation;
    }
    public void setDateConsultation(String dateConsultation){
        this.dateConsultation = dateConsultation;
    }

    @Log
    public String getObservation(){
        return this.observation;
    }
    public void setObservation(String observation){
        this.observation = observation;
    }


    public PersonnelDto getMedecin(){
        return this.medecin;
    }

    public void setMedecinDto(PersonnelDto medecin){
        this.medecin = medecin;
    }
    public SpecialiteDto getSpecialite(){
        return this.specialite;
    }

    public void setSpecialiteDto(SpecialiteDto specialite){
        this.specialite = specialite;
    }
    public TypeConsultationRadiotherapieDto getTypeConsultationRadiotherapie(){
        return this.typeConsultationRadiotherapie;
    }

    public void setTypeConsultationRadiotherapieDto(TypeConsultationRadiotherapieDto typeConsultationRadiotherapie){
        this.typeConsultationRadiotherapie = typeConsultationRadiotherapie;
    }
    public TypeToxiciteRthDto getTypeToxiciteRth(){
        return this.typeToxiciteRth;
    }

    public void setTypeToxiciteRthDto(TypeToxiciteRthDto typeToxiciteRth){
        this.typeToxiciteRth = typeToxiciteRth;
    }
    public GradeToxiciteRthDto getGradeToxiciteRth(){
        return this.gradeToxiciteRth;
    }

    public void setGradeToxiciteRthDto(GradeToxiciteRthDto gradeToxiciteRth){
        this.gradeToxiciteRth = gradeToxiciteRth;
    }
    public ClassificationOmsDto getClassificationOms(){
        return this.classificationOms;
    }

    public void setClassificationOmsDto(ClassificationOmsDto classificationOms){
        this.classificationOms = classificationOms;
    }
    public StatutMedicaleConsultationRadiotherapieDto getStatutMedicaleConsultationRadiotherapie(){
        return this.statutMedicaleConsultationRadiotherapie;
    }

    public void setStatutMedicaleConsultationRadiotherapieDto(StatutMedicaleConsultationRadiotherapieDto statutMedicaleConsultationRadiotherapie){
        this.statutMedicaleConsultationRadiotherapie = statutMedicaleConsultationRadiotherapie;
    }
    public PrescriptionRadiotherapieDto getPrescriptionRadiotherapie(){
        return this.prescriptionRadiotherapie;
    }

    public void setPrescriptionRadiotherapieDto(PrescriptionRadiotherapieDto prescriptionRadiotherapie){
        this.prescriptionRadiotherapie = prescriptionRadiotherapie;
    }

}



