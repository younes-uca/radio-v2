package  ma.enova.radio.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.enova.radio.bean.core.PrescriptionRadiotherapie;

import ma.enova.radio.zynerator.util.StringUtil;
import ma.enova.radio.zynerator.converter.AbstractConverter;
import ma.enova.radio.zynerator.util.DateUtil;
import ma.enova.radio.bean.history.ConsultationRadiotherapieHistory;
import ma.enova.radio.bean.core.ConsultationRadiotherapie;
import ma.enova.radio.ws.dto.ConsultationRadiotherapieDto;

@Component
public class ConsultationRadiotherapieConverter extends AbstractConverter<ConsultationRadiotherapie, ConsultationRadiotherapieDto, ConsultationRadiotherapieHistory> {

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

    public  ConsultationRadiotherapieConverter(){
        super(ConsultationRadiotherapie.class, ConsultationRadiotherapieDto.class, ConsultationRadiotherapieHistory.class);
    }

    @Override
    public ConsultationRadiotherapie toItem(ConsultationRadiotherapieDto dto) {
        if (dto == null) {
            return null;
        } else {
        ConsultationRadiotherapie item = new ConsultationRadiotherapie();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getDateConsultation()))
                item.setDateConsultation(DateUtil.stringEnToDate(dto.getDateConsultation()));
            if(StringUtil.isNotEmpty(dto.getClassificationOms()))
                item.setClassificationOms(dto.getClassificationOms());
            if(StringUtil.isNotEmpty(dto.getObservation()))
                item.setObservation(dto.getObservation());
            if(StringUtil.isNotEmpty(dto.getStatutMedicale()))
                item.setStatutMedicale(dto.getStatutMedicale());
            if(this.medecin && dto.getMedecin()!=null)
                item.setMedecin(personnelConverter.toItem(dto.getMedecin())) ;

            if(this.typeConsultationRadiotherapie && dto.getTypeConsultationRadiotherapie()!=null)
                item.setTypeConsultationRadiotherapie(typeConsultationRadiotherapieConverter.toItem(dto.getTypeConsultationRadiotherapie())) ;

            if(this.typeToxiciteRth && dto.getTypeToxiciteRth()!=null)
                item.setTypeToxiciteRth(typeToxiciteRthConverter.toItem(dto.getTypeToxiciteRth())) ;

            if(this.gradeToxiciteRth && dto.getGradeToxiciteRth()!=null)
                item.setGradeToxiciteRth(gradeToxiciteRthConverter.toItem(dto.getGradeToxiciteRth())) ;

            if(dto.getPrescriptionRadiotherapie() != null && dto.getPrescriptionRadiotherapie().getId() != null){
                item.setPrescriptionRadiotherapie(new PrescriptionRadiotherapie());
                item.getPrescriptionRadiotherapie().setId(dto.getPrescriptionRadiotherapie().getId());
            }



        return item;
        }
    }

    @Override
    public ConsultationRadiotherapieDto toDto(ConsultationRadiotherapie item) {
        if (item == null) {
            return null;
        } else {
            ConsultationRadiotherapieDto dto = new ConsultationRadiotherapieDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(item.getDateConsultation()!=null)
                dto.setDateConsultation(DateUtil.dateTimeToString(item.getDateConsultation()));
            if(StringUtil.isNotEmpty(item.getClassificationOms()))
                dto.setClassificationOms(item.getClassificationOms());
            if(StringUtil.isNotEmpty(item.getObservation()))
                dto.setObservation(item.getObservation());
            if(StringUtil.isNotEmpty(item.getStatutMedicale()))
                dto.setStatutMedicale(item.getStatutMedicale());
        if(this.medecin && item.getMedecin()!=null) {
            dto.setMedecin(personnelConverter.toDto(item.getMedecin())) ;
        }
        if(this.typeConsultationRadiotherapie && item.getTypeConsultationRadiotherapie()!=null) {
            dto.setTypeConsultationRadiotherapie(typeConsultationRadiotherapieConverter.toDto(item.getTypeConsultationRadiotherapie())) ;
        }
        if(this.typeToxiciteRth && item.getTypeToxiciteRth()!=null) {
            dto.setTypeToxiciteRth(typeToxiciteRthConverter.toDto(item.getTypeToxiciteRth())) ;
        }
        if(this.gradeToxiciteRth && item.getGradeToxiciteRth()!=null) {
            dto.setGradeToxiciteRth(gradeToxiciteRthConverter.toDto(item.getGradeToxiciteRth())) ;
        }
        if(this.prescriptionRadiotherapie && item.getPrescriptionRadiotherapie()!=null) {
            dto.setPrescriptionRadiotherapie(prescriptionRadiotherapieConverter.toDto(item.getPrescriptionRadiotherapie())) ;
        }
        return dto;
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
