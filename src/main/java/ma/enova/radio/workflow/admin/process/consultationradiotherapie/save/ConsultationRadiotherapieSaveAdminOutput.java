package ma.enova.radio.workflow.admin.process.consultationradiotherapie.save;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.radio.ws.dto.*;
import ma.enova.radio.zynerator.audit.Log;
import ma.enova.radio.zynerator.process.AbstractProcessOutput;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConsultationRadiotherapieSaveAdminOutput  extends AbstractProcessOutput {

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

    public void setMedecin(PersonnelDto medecin){
        this.medecin = medecin;
    }
    public SpecialiteDto getSpecialite(){
        return this.specialite;
    }

    public void setSpecialite(SpecialiteDto specialite){
        this.specialite = specialite;
    }
    public TypeConsultationRadiotherapieDto getTypeConsultationRadiotherapie(){
        return this.typeConsultationRadiotherapie;
    }

    public void setTypeConsultationRadiotherapie(TypeConsultationRadiotherapieDto typeConsultationRadiotherapie){
        this.typeConsultationRadiotherapie = typeConsultationRadiotherapie;
    }
    public TypeToxiciteRthDto getTypeToxiciteRth(){
        return this.typeToxiciteRth;
    }

    public void setTypeToxiciteRth(TypeToxiciteRthDto typeToxiciteRth){
        this.typeToxiciteRth = typeToxiciteRth;
    }
    public GradeToxiciteRthDto getGradeToxiciteRth(){
        return this.gradeToxiciteRth;
    }

    public void setGradeToxiciteRth(GradeToxiciteRthDto gradeToxiciteRth){
        this.gradeToxiciteRth = gradeToxiciteRth;
    }
    public ClassificationOmsDto getClassificationOms(){
        return this.classificationOms;
    }

    public void setClassificationOms(ClassificationOmsDto classificationOms){
        this.classificationOms = classificationOms;
    }
    public StatutMedicaleConsultationRadiotherapieDto getStatutMedicaleConsultationRadiotherapie(){
        return this.statutMedicaleConsultationRadiotherapie;
    }

    public void setStatutMedicaleConsultationRadiotherapie(StatutMedicaleConsultationRadiotherapieDto statutMedicaleConsultationRadiotherapie){
        this.statutMedicaleConsultationRadiotherapie = statutMedicaleConsultationRadiotherapie;
    }
    public PrescriptionRadiotherapieDto getPrescriptionRadiotherapie(){
        return this.prescriptionRadiotherapie;
    }

    public void setPrescriptionRadiotherapie(PrescriptionRadiotherapieDto prescriptionRadiotherapie){
        this.prescriptionRadiotherapie = prescriptionRadiotherapie;
    }

}
