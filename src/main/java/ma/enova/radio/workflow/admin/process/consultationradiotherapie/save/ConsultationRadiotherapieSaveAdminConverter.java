package ma.enova.radio.workflow.admin.process.consultationradiotherapie.save;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.enova.radio.bean.core.PrescriptionRadiotherapie;

import ma.enova.radio.ws.converter.TypeToxiciteRthConverter;
import ma.enova.radio.ws.converter.TypeConsultationRadiotherapieConverter;
import ma.enova.radio.ws.converter.PersonnelConverter;
import ma.enova.radio.ws.converter.PrescriptionRadiotherapieConverter;
import ma.enova.radio.ws.converter.GradeToxiciteRthConverter;
import ma.enova.radio.zynerator.util.StringUtil;
import ma.enova.radio.zynerator.process.AbstractProcessConverter;
import ma.enova.radio.zynerator.util.DateUtil;
import ma.enova.radio.bean.core.ConsultationRadiotherapie;

@Component
public class ConsultationRadiotherapieSaveAdminConverter extends AbstractProcessConverter<ConsultationRadiotherapieSaveAdminInput,ConsultationRadiotherapieSaveAdminOutput,ConsultationRadiotherapie> {

    @Autowired
    private TypeToxiciteRthConverter typeToxiciteRthConverter ;
    @Autowired
    private TypeConsultationRadiotherapieConverter typeConsultationRadiotherapieConverter ;
    @Autowired
    private PersonnelConverter personnelConverter ;
    @Autowired
    private PrescriptionRadiotherapieConverter prescriptionRadiotherapieConverter ;
    @Autowired
    private GradeToxiciteRthConverter gradeToxiciteRthConverter ;
    private boolean medecin;
    private boolean typeConsultationRadiotherapie;
    private boolean typeToxiciteRth;
    private boolean gradeToxiciteRth;
    private boolean prescriptionRadiotherapie;

    public ConsultationRadiotherapieSaveAdminConverter(){
        super(ConsultationRadiotherapie.class, ConsultationRadiotherapieSaveAdminInput.class, ConsultationRadiotherapieSaveAdminOutput.class);
    }

    @Override
    public ConsultationRadiotherapie toItem(ConsultationRadiotherapieSaveAdminInput input) {
        if (input == null) {
            return null;
        } else {
            ConsultationRadiotherapie item = new ConsultationRadiotherapie();
            if(StringUtil.isNotEmpty(input.getId()))
                item.setId(input.getId());
            if(StringUtil.isNotEmpty(input.getDateConsultation()))
                item.setDateConsultation(DateUtil.stringEnToDate(input.getDateConsultation()));
            if(StringUtil.isNotEmpty(input.getClassificationOms()))
                item.setClassificationOms(input.getClassificationOms());
            if(StringUtil.isNotEmpty(input.getObservation()))
                item.setObservation(input.getObservation());
            if(StringUtil.isNotEmpty(input.getStatutMedicale()))
                item.setStatutMedicale(input.getStatutMedicale());
            if(this.medecin && input.getMedecin()!=null)
                item.setMedecin(personnelConverter.toItem(input.getMedecin())) ;

            if(this.typeConsultationRadiotherapie && input.getTypeConsultationRadiotherapie()!=null)
                item.setTypeConsultationRadiotherapie(typeConsultationRadiotherapieConverter.toItem(input.getTypeConsultationRadiotherapie())) ;

            if(this.typeToxiciteRth && input.getTypeToxiciteRth()!=null)
                item.setTypeToxiciteRth(typeToxiciteRthConverter.toItem(input.getTypeToxiciteRth())) ;

            if(this.gradeToxiciteRth && input.getGradeToxiciteRth()!=null)
                item.setGradeToxiciteRth(gradeToxiciteRthConverter.toItem(input.getGradeToxiciteRth())) ;

            if(input.getPrescriptionRadiotherapie() != null && input.getPrescriptionRadiotherapie().getId() != null){
                item.setPrescriptionRadiotherapie(new PrescriptionRadiotherapie());
                item.getPrescriptionRadiotherapie().setId(input.getPrescriptionRadiotherapie().getId());
            }



        return item;
        }
    }

    @Override
    public ConsultationRadiotherapieSaveAdminOutput toOutput(ConsultationRadiotherapie item) {
        if (item == null) {
            return null;
        } else {
            ConsultationRadiotherapieSaveAdminOutput output = new ConsultationRadiotherapieSaveAdminOutput();
            if(StringUtil.isNotEmpty(item.getId()))
                output.setId(item.getId());
            if(item.getDateConsultation()!=null)
                output.setDateConsultation(DateUtil.dateTimeToString(item.getDateConsultation()));
            if(StringUtil.isNotEmpty(item.getClassificationOms()))
                output.setClassificationOms(item.getClassificationOms());
            if(StringUtil.isNotEmpty(item.getObservation()))
                output.setObservation(item.getObservation());
            if(StringUtil.isNotEmpty(item.getStatutMedicale()))
                output.setStatutMedicale(item.getStatutMedicale());
            if(this.medecin && item.getMedecin()!=null) {
                output.setMedecin(personnelConverter.toDto(item.getMedecin())) ;
    }
            if(this.typeConsultationRadiotherapie && item.getTypeConsultationRadiotherapie()!=null) {
                output.setTypeConsultationRadiotherapie(typeConsultationRadiotherapieConverter.toDto(item.getTypeConsultationRadiotherapie())) ;
    }
            if(this.typeToxiciteRth && item.getTypeToxiciteRth()!=null) {
                output.setTypeToxiciteRth(typeToxiciteRthConverter.toDto(item.getTypeToxiciteRth())) ;
    }
            if(this.gradeToxiciteRth && item.getGradeToxiciteRth()!=null) {
                output.setGradeToxiciteRth(gradeToxiciteRthConverter.toDto(item.getGradeToxiciteRth())) ;
    }
            if(this.prescriptionRadiotherapie && item.getPrescriptionRadiotherapie()!=null) {
                output.setPrescriptionRadiotherapie(prescriptionRadiotherapieConverter.toDto(item.getPrescriptionRadiotherapie())) ;
    }
        return output;
    }
}



    public TypeToxiciteRthConverter getTypeToxiciteRthConverter(){
        return this.typeToxiciteRthConverter;
    }
    public void setTypeToxiciteRthConverter(TypeToxiciteRthConverter typeToxiciteRthConverter ){
        this.typeToxiciteRthConverter = typeToxiciteRthConverter;
    }
    public TypeConsultationRadiotherapieConverter getTypeConsultationRadiotherapieConverter(){
        return this.typeConsultationRadiotherapieConverter;
    }
    public void setTypeConsultationRadiotherapieConverter(TypeConsultationRadiotherapieConverter typeConsultationRadiotherapieConverter ){
        this.typeConsultationRadiotherapieConverter = typeConsultationRadiotherapieConverter;
    }
    public PersonnelConverter getPersonnelConverter(){
        return this.personnelConverter;
    }
    public void setPersonnelConverter(PersonnelConverter personnelConverter ){
        this.personnelConverter = personnelConverter;
    }
    public PrescriptionRadiotherapieConverter getPrescriptionRadiotherapieConverter(){
        return this.prescriptionRadiotherapieConverter;
    }
    public void setPrescriptionRadiotherapieConverter(PrescriptionRadiotherapieConverter prescriptionRadiotherapieConverter ){
        this.prescriptionRadiotherapieConverter = prescriptionRadiotherapieConverter;
    }
    public GradeToxiciteRthConverter getGradeToxiciteRthConverter(){
        return this.gradeToxiciteRthConverter;
    }
    public void setGradeToxiciteRthConverter(GradeToxiciteRthConverter gradeToxiciteRthConverter ){
        this.gradeToxiciteRthConverter = gradeToxiciteRthConverter;
    }


    public boolean  isMedecin(){
        return this.medecin;
    }
    public void  setMedecin(boolean medecin){
        this.medecin = medecin;
    }
    public boolean  isTypeConsultationRadiotherapie(){
        return this.typeConsultationRadiotherapie;
    }
    public void  setTypeConsultationRadiotherapie(boolean typeConsultationRadiotherapie){
        this.typeConsultationRadiotherapie = typeConsultationRadiotherapie;
    }
    public boolean  isTypeToxiciteRth(){
        return this.typeToxiciteRth;
    }
    public void  setTypeToxiciteRth(boolean typeToxiciteRth){
        this.typeToxiciteRth = typeToxiciteRth;
    }
    public boolean  isGradeToxiciteRth(){
        return this.gradeToxiciteRth;
    }
    public void  setGradeToxiciteRth(boolean gradeToxiciteRth){
        this.gradeToxiciteRth = gradeToxiciteRth;
    }
    public boolean  isPrescriptionRadiotherapie(){
        return this.prescriptionRadiotherapie;
    }
    public void  setPrescriptionRadiotherapie(boolean prescriptionRadiotherapie){
        this.prescriptionRadiotherapie = prescriptionRadiotherapie;
    }
}
