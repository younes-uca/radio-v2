package ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.finirtraitement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.enova.radio.zynerator.util.ListUtil;


import ma.enova.radio.ws.converter.ModaliteRadiotherapieConverter;
import ma.enova.radio.ws.converter.HistortiquePrescriptionRadiotherapieConverter;
import ma.enova.radio.ws.converter.StatutRadiotherapieConverter;
import ma.enova.radio.ws.converter.SiteConverter;
import ma.enova.radio.ws.converter.TypeTraitementConverter;
import ma.enova.radio.ws.converter.PersonnelConverter;
import ma.enova.radio.ws.converter.ViseeConverter;
import ma.enova.radio.ws.converter.SeanceRadiotherapieConverter;
import ma.enova.radio.ws.converter.PatientConverter;
import ma.enova.radio.ws.converter.ConsultationRadiotherapieConverter;
import ma.enova.radio.ws.converter.TypeToxiciteRthConverter;
import ma.enova.radio.ws.converter.TypeConsultationRadiotherapieConverter;
import ma.enova.radio.ws.converter.ProtocoleInclusionConverter;
import ma.enova.radio.ws.converter.GradeToxiciteRthConverter;
import ma.enova.radio.zynerator.util.StringUtil;
import ma.enova.radio.zynerator.process.AbstractProcessConverter;
import ma.enova.radio.zynerator.util.DateUtil;
import ma.enova.radio.bean.core.PrescriptionRadiotherapie;

@Component
public class PrescriptionRadiotherapieFinirTraitementAdminConverter extends AbstractProcessConverter<PrescriptionRadiotherapieFinirTraitementAdminInput,PrescriptionRadiotherapieFinirTraitementAdminOutput,PrescriptionRadiotherapie> {

    @Autowired
    private ModaliteRadiotherapieConverter modaliteRadiotherapieConverter ;
    @Autowired
    private HistortiquePrescriptionRadiotherapieConverter histortiquePrescriptionRadiotherapieConverter ;
    @Autowired
    private StatutRadiotherapieConverter statutRadiotherapieConverter ;
    @Autowired
    private SiteConverter siteConverter ;
    @Autowired
    private TypeTraitementConverter typeTraitementConverter ;
    @Autowired
    private PersonnelConverter personnelConverter ;
    @Autowired
    private ViseeConverter viseeConverter ;
    @Autowired
    private SeanceRadiotherapieConverter seanceRadiotherapieConverter ;
    @Autowired
    private PatientConverter patientConverter ;
    @Autowired
    private ConsultationRadiotherapieConverter consultationRadiotherapieConverter ;
    @Autowired
    private TypeToxiciteRthConverter typeToxiciteRthConverter ;
    @Autowired
    private TypeConsultationRadiotherapieConverter typeConsultationRadiotherapieConverter ;
    @Autowired
    private ProtocoleInclusionConverter protocoleInclusionConverter ;
    @Autowired
    private GradeToxiciteRthConverter gradeToxiciteRthConverter ;
    private boolean decisionTraitement;
    private boolean medecinPrescripteur;
    private boolean site;
    private boolean modaliteRadiotherapie;
    private boolean visee;
    private boolean protocoleInclusion;
    private boolean statutRadiotherapie;
    private boolean validateurSimulation;
    private boolean patient;
    private boolean typeTraitement;
    private boolean consultationRadiotherapies;
    private boolean seanceRadiotherapies;
    private boolean histortiquePrescriptionRadiotherapies;

    public PrescriptionRadiotherapieFinirTraitementAdminConverter(){
        super(PrescriptionRadiotherapie.class, PrescriptionRadiotherapieFinirTraitementAdminInput.class, PrescriptionRadiotherapieFinirTraitementAdminOutput.class);
    }

    @Override
    public PrescriptionRadiotherapie toItem(PrescriptionRadiotherapieFinirTraitementAdminInput input) {
        if (input == null) {
            return null;
        } else {
            PrescriptionRadiotherapie item = new PrescriptionRadiotherapie();
            if(StringUtil.isNotEmpty(input.getId()))
                item.setId(input.getId());
            if(StringUtil.isNotEmpty(input.getDatePrescription()))
                item.setDatePrescription(DateUtil.stringEnToDate(input.getDatePrescription()));
            if(input.getRcc() != null)
                item.setRcc(input.getRcc());
            if(StringUtil.isNotEmpty(input.getDose()))
                item.setDose(input.getDose());
            if(StringUtil.isNotEmpty(input.getFractionnement()))
                item.setFractionnement(input.getFractionnement());
            if(StringUtil.isNotEmpty(input.getEtalement()))
                item.setEtalement(input.getEtalement());
            if(StringUtil.isNotEmpty(input.getFrequenceRadiotherapie()))
                item.setFrequenceRadiotherapie(input.getFrequenceRadiotherapie());
            if(StringUtil.isNotEmpty(input.getDateSouhaiteDebutTraitement()))
                item.setDateSouhaiteDebutTraitement(DateUtil.stringEnToDate(input.getDateSouhaiteDebutTraitement()));
            if(StringUtil.isNotEmpty(input.getObservation()))
                item.setObservation(input.getObservation());
            if(StringUtil.isNotEmpty(input.getDateSimulation()))
                item.setDateSimulation(DateUtil.stringEnToDate(input.getDateSimulation()));
            if(StringUtil.isNotEmpty(input.getImmobilistion()))
                item.setImmobilistion(input.getImmobilistion());
            if(StringUtil.isNotEmpty(input.getPositionnement()))
                item.setPositionnement(input.getPositionnement());
            if(StringUtil.isNotEmpty(input.getFichierTraitements()))
                item.setFichierTraitements(input.getFichierTraitements());
            if(StringUtil.isNotEmpty(input.getValidateurSimulationDate()))
                item.setValidateurSimulationDate(DateUtil.stringEnToDate(input.getValidateurSimulationDate()));
            if(StringUtil.isNotEmpty(input.getDatePrevu()))
                item.setDatePrevu(DateUtil.stringEnToDate(input.getDatePrevu()));
            if(StringUtil.isNotEmpty(input.getDateDebutTraitement()))
                item.setDateDebutTraitement(DateUtil.stringEnToDate(input.getDateDebutTraitement()));
            if(StringUtil.isNotEmpty(input.getDateFinTraitement()))
                item.setDateFinTraitement(DateUtil.stringEnToDate(input.getDateFinTraitement()));
            if(StringUtil.isNotEmpty(input.getDateDecisionTraitement()))
                item.setDateDecisionTraitement(DateUtil.stringEnToDate(input.getDateDecisionTraitement()));
            if(StringUtil.isNotEmpty(input.getCompteRendu()))
                item.setCompteRendu(input.getCompteRendu());
            if(input.getActif() != null)
                item.setActif(input.getActif());
            if(StringUtil.isNotEmpty(input.getNombreSeanceRealise()))
                item.setNombreSeanceRealise(input.getNombreSeanceRealise());
            if(StringUtil.isNotEmpty(input.getNombreTotalSeance()))
                item.setNombreTotalSeance(input.getNombreTotalSeance());
            if(this.decisionTraitement && input.getDecisionTraitement()!=null)
                item.setDecisionTraitement(input.getDecisionTraitement()) ;

            if(this.medecinPrescripteur && input.getMedecinPrescripteur()!=null)
                item.setMedecinPrescripteur(personnelConverter.toItem(input.getMedecinPrescripteur())) ;

            if(this.site && input.getSite()!=null)
                item.setSite(siteConverter.toItem(input.getSite())) ;

            if(this.modaliteRadiotherapie && input.getModaliteRadiotherapie()!=null)
                item.setModaliteRadiotherapie(modaliteRadiotherapieConverter.toItem(input.getModaliteRadiotherapie())) ;

            if(this.visee && input.getVisee()!=null)
                item.setVisee(viseeConverter.toItem(input.getVisee())) ;

            if(this.protocoleInclusion && input.getProtocoleInclusion()!=null)
                item.setProtocoleInclusion(protocoleInclusionConverter.toItem(input.getProtocoleInclusion())) ;

            if(this.statutRadiotherapie && input.getStatutRadiotherapie()!=null)
                item.setStatutRadiotherapie(statutRadiotherapieConverter.toItem(input.getStatutRadiotherapie())) ;

            if(this.validateurSimulation && input.getValidateurSimulation()!=null)
                item.setValidateurSimulation(personnelConverter.toItem(input.getValidateurSimulation())) ;

            if(this.patient && input.getPatient()!=null)
                item.setPatient(patientConverter.toItem(input.getPatient())) ;

            if(this.typeTraitement && input.getTypeTraitement()!=null)
                item.setTypeTraitement(typeTraitementConverter.toItem(input.getTypeTraitement())) ;


            if(this.consultationRadiotherapies && ListUtil.isNotEmpty(input.getConsultationRadiotherapies()))
                item.setConsultationRadiotherapies(consultationRadiotherapieConverter.toItem(input.getConsultationRadiotherapies()));
            if(this.seanceRadiotherapies && ListUtil.isNotEmpty(input.getSeanceRadiotherapies()))
                item.setSeanceRadiotherapies(seanceRadiotherapieConverter.toItem(input.getSeanceRadiotherapies()));
            if(this.histortiquePrescriptionRadiotherapies && ListUtil.isNotEmpty(input.getHistortiquePrescriptionRadiotherapies()))
                item.setHistortiquePrescriptionRadiotherapies(histortiquePrescriptionRadiotherapieConverter.toItem(input.getHistortiquePrescriptionRadiotherapies()));

        return item;
        }
    }

    @Override
    public PrescriptionRadiotherapieFinirTraitementAdminOutput toOutput(PrescriptionRadiotherapie item) {
        if (item == null) {
            return null;
        } else {
            PrescriptionRadiotherapieFinirTraitementAdminOutput output = new PrescriptionRadiotherapieFinirTraitementAdminOutput();
            if(StringUtil.isNotEmpty(item.getId()))
                output.setId(item.getId());
            if(item.getDatePrescription()!=null)
                output.setDatePrescription(DateUtil.dateTimeToString(item.getDatePrescription()));
                output.setRcc(item.getRcc());
            if(StringUtil.isNotEmpty(item.getDose()))
                output.setDose(item.getDose());
            if(StringUtil.isNotEmpty(item.getFractionnement()))
                output.setFractionnement(item.getFractionnement());
            if(StringUtil.isNotEmpty(item.getEtalement()))
                output.setEtalement(item.getEtalement());
            if(StringUtil.isNotEmpty(item.getFrequenceRadiotherapie()))
                output.setFrequenceRadiotherapie(item.getFrequenceRadiotherapie());
            if(item.getDateSouhaiteDebutTraitement()!=null)
                output.setDateSouhaiteDebutTraitement(DateUtil.dateTimeToString(item.getDateSouhaiteDebutTraitement()));
            if(StringUtil.isNotEmpty(item.getObservation()))
                output.setObservation(item.getObservation());
            if(item.getDateSimulation()!=null)
                output.setDateSimulation(DateUtil.dateTimeToString(item.getDateSimulation()));
            if(StringUtil.isNotEmpty(item.getImmobilistion()))
                output.setImmobilistion(item.getImmobilistion());
            if(StringUtil.isNotEmpty(item.getPositionnement()))
                output.setPositionnement(item.getPositionnement());
            if(StringUtil.isNotEmpty(item.getFichierTraitements()))
                output.setFichierTraitements(item.getFichierTraitements());
            if(item.getValidateurSimulationDate()!=null)
                output.setValidateurSimulationDate(DateUtil.dateTimeToString(item.getValidateurSimulationDate()));
            if(item.getDatePrevu()!=null)
                output.setDatePrevu(DateUtil.dateTimeToString(item.getDatePrevu()));
            if(item.getDateDebutTraitement()!=null)
                output.setDateDebutTraitement(DateUtil.dateTimeToString(item.getDateDebutTraitement()));
            if(item.getDateFinTraitement()!=null)
                output.setDateFinTraitement(DateUtil.dateTimeToString(item.getDateFinTraitement()));
            if(item.getDateDecisionTraitement()!=null)
                output.setDateDecisionTraitement(DateUtil.dateTimeToString(item.getDateDecisionTraitement()));
            if(StringUtil.isNotEmpty(item.getCompteRendu()))
                output.setCompteRendu(item.getCompteRendu());
                output.setActif(item.getActif());
            if(StringUtil.isNotEmpty(item.getNombreSeanceRealise()))
                output.setNombreSeanceRealise(item.getNombreSeanceRealise());
            if(StringUtil.isNotEmpty(item.getNombreTotalSeance()))
                output.setNombreTotalSeance(item.getNombreTotalSeance());
            if(this.decisionTraitement && item.getDecisionTraitement()!=null) {
                output.setDecisionTraitement(item.getDecisionTraitement()) ;
    }
            if(this.medecinPrescripteur && item.getMedecinPrescripteur()!=null) {
                output.setMedecinPrescripteur(personnelConverter.toDto(item.getMedecinPrescripteur())) ;
    }
            if(this.site && item.getSite()!=null) {
                output.setSite(siteConverter.toDto(item.getSite())) ;
    }
            if(this.modaliteRadiotherapie && item.getModaliteRadiotherapie()!=null) {
                output.setModaliteRadiotherapie(modaliteRadiotherapieConverter.toDto(item.getModaliteRadiotherapie())) ;
    }
            if(this.visee && item.getVisee()!=null) {
                output.setVisee(viseeConverter.toDto(item.getVisee())) ;
    }
            if(this.protocoleInclusion && item.getProtocoleInclusion()!=null) {
                output.setProtocoleInclusion(protocoleInclusionConverter.toDto(item.getProtocoleInclusion())) ;
    }
            if(this.statutRadiotherapie && item.getStatutRadiotherapie()!=null) {
                output.setStatutRadiotherapie(statutRadiotherapieConverter.toDto(item.getStatutRadiotherapie())) ;
    }
            if(this.validateurSimulation && item.getValidateurSimulation()!=null) {
                output.setValidateurSimulation(personnelConverter.toDto(item.getValidateurSimulation())) ;
    }
            if(this.patient && item.getPatient()!=null) {
                output.setPatient(patientConverter.toDto(item.getPatient())) ;
    }
            if(this.typeTraitement && item.getTypeTraitement()!=null) {
                output.setTypeTraitement(typeTraitementConverter.toDto(item.getTypeTraitement())) ;
    }
        if(this.consultationRadiotherapies && ListUtil.isNotEmpty(item.getConsultationRadiotherapies())){
            consultationRadiotherapieConverter.init(true);
            consultationRadiotherapieConverter.setPrescriptionRadiotherapie(false);
            output.setConsultationRadiotherapies(consultationRadiotherapieConverter.toDto(item.getConsultationRadiotherapies()));
            consultationRadiotherapieConverter.setPrescriptionRadiotherapie(true);

        }
        if(this.seanceRadiotherapies && ListUtil.isNotEmpty(item.getSeanceRadiotherapies())){
            seanceRadiotherapieConverter.init(true);
            seanceRadiotherapieConverter.setPrescriptionRadiotherapie(false);
            output.setSeanceRadiotherapies(seanceRadiotherapieConverter.toDto(item.getSeanceRadiotherapies()));
            seanceRadiotherapieConverter.setPrescriptionRadiotherapie(true);

        }
        if(this.histortiquePrescriptionRadiotherapies && ListUtil.isNotEmpty(item.getHistortiquePrescriptionRadiotherapies())){
            histortiquePrescriptionRadiotherapieConverter.init(true);
            histortiquePrescriptionRadiotherapieConverter.setPrescriptionRadiotherapie(false);
            output.setHistortiquePrescriptionRadiotherapies(histortiquePrescriptionRadiotherapieConverter.toDto(item.getHistortiquePrescriptionRadiotherapies()));
            histortiquePrescriptionRadiotherapieConverter.setPrescriptionRadiotherapie(true);

        }
        return output;
    }
}



    public ModaliteRadiotherapieConverter getModaliteRadiotherapieConverter(){
        return this.modaliteRadiotherapieConverter;
    }
    public void setModaliteRadiotherapieConverter(ModaliteRadiotherapieConverter modaliteRadiotherapieConverter ){
        this.modaliteRadiotherapieConverter = modaliteRadiotherapieConverter;
    }
    public HistortiquePrescriptionRadiotherapieConverter getHistortiquePrescriptionRadiotherapieConverter(){
        return this.histortiquePrescriptionRadiotherapieConverter;
    }
    public void setHistortiquePrescriptionRadiotherapieConverter(HistortiquePrescriptionRadiotherapieConverter histortiquePrescriptionRadiotherapieConverter ){
        this.histortiquePrescriptionRadiotherapieConverter = histortiquePrescriptionRadiotherapieConverter;
    }
    public StatutRadiotherapieConverter getStatutRadiotherapieConverter(){
        return this.statutRadiotherapieConverter;
    }
    public void setStatutRadiotherapieConverter(StatutRadiotherapieConverter statutRadiotherapieConverter ){
        this.statutRadiotherapieConverter = statutRadiotherapieConverter;
    }
    public SiteConverter getSiteConverter(){
        return this.siteConverter;
    }
    public void setSiteConverter(SiteConverter siteConverter ){
        this.siteConverter = siteConverter;
    }
    public TypeTraitementConverter getTypeTraitementConverter(){
        return this.typeTraitementConverter;
    }
    public void setTypeTraitementConverter(TypeTraitementConverter typeTraitementConverter ){
        this.typeTraitementConverter = typeTraitementConverter;
    }
    public PersonnelConverter getPersonnelConverter(){
        return this.personnelConverter;
    }
    public void setPersonnelConverter(PersonnelConverter personnelConverter ){
        this.personnelConverter = personnelConverter;
    }
    public ViseeConverter getViseeConverter(){
        return this.viseeConverter;
    }
    public void setViseeConverter(ViseeConverter viseeConverter ){
        this.viseeConverter = viseeConverter;
    }
    public SeanceRadiotherapieConverter getSeanceRadiotherapieConverter(){
        return this.seanceRadiotherapieConverter;
    }
    public void setSeanceRadiotherapieConverter(SeanceRadiotherapieConverter seanceRadiotherapieConverter ){
        this.seanceRadiotherapieConverter = seanceRadiotherapieConverter;
    }
    public PatientConverter getPatientConverter(){
        return this.patientConverter;
    }
    public void setPatientConverter(PatientConverter patientConverter ){
        this.patientConverter = patientConverter;
    }
    public ConsultationRadiotherapieConverter getConsultationRadiotherapieConverter(){
        return this.consultationRadiotherapieConverter;
    }
    public void setConsultationRadiotherapieConverter(ConsultationRadiotherapieConverter consultationRadiotherapieConverter ){
        this.consultationRadiotherapieConverter = consultationRadiotherapieConverter;
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
    public ProtocoleInclusionConverter getProtocoleInclusionConverter(){
        return this.protocoleInclusionConverter;
    }
    public void setProtocoleInclusionConverter(ProtocoleInclusionConverter protocoleInclusionConverter ){
        this.protocoleInclusionConverter = protocoleInclusionConverter;
    }
    public GradeToxiciteRthConverter getGradeToxiciteRthConverter(){
        return this.gradeToxiciteRthConverter;
    }
    public void setGradeToxiciteRthConverter(GradeToxiciteRthConverter gradeToxiciteRthConverter ){
        this.gradeToxiciteRthConverter = gradeToxiciteRthConverter;
    }


    public boolean  isDecisionTraitement(){
        return this.decisionTraitement;
    }
    public void  setDecisionTraitement(boolean decisionTraitement){
        this.decisionTraitement = decisionTraitement;
    }
    public boolean  isMedecinPrescripteur(){
        return this.medecinPrescripteur;
    }
    public void  setMedecinPrescripteur(boolean medecinPrescripteur){
        this.medecinPrescripteur = medecinPrescripteur;
    }
    public boolean  isSite(){
        return this.site;
    }
    public void  setSite(boolean site){
        this.site = site;
    }
    public boolean  isModaliteRadiotherapie(){
        return this.modaliteRadiotherapie;
    }
    public void  setModaliteRadiotherapie(boolean modaliteRadiotherapie){
        this.modaliteRadiotherapie = modaliteRadiotherapie;
    }
    public boolean  isVisee(){
        return this.visee;
    }
    public void  setVisee(boolean visee){
        this.visee = visee;
    }
    public boolean  isProtocoleInclusion(){
        return this.protocoleInclusion;
    }
    public void  setProtocoleInclusion(boolean protocoleInclusion){
        this.protocoleInclusion = protocoleInclusion;
    }
    public boolean  isStatutRadiotherapie(){
        return this.statutRadiotherapie;
    }
    public void  setStatutRadiotherapie(boolean statutRadiotherapie){
        this.statutRadiotherapie = statutRadiotherapie;
    }
    public boolean  isValidateurSimulation(){
        return this.validateurSimulation;
    }
    public void  setValidateurSimulation(boolean validateurSimulation){
        this.validateurSimulation = validateurSimulation;
    }
    public boolean  isPatient(){
        return this.patient;
    }
    public void  setPatient(boolean patient){
        this.patient = patient;
    }
    public boolean  isTypeTraitement(){
        return this.typeTraitement;
    }
    public void  setTypeTraitement(boolean typeTraitement){
        this.typeTraitement = typeTraitement;
    }
    public boolean  isConsultationRadiotherapies(){
        return this.consultationRadiotherapies ;
    }
    public void  setConsultationRadiotherapies(boolean consultationRadiotherapies ){
        this.consultationRadiotherapies  = consultationRadiotherapies ;
    }
    public boolean  isSeanceRadiotherapies(){
        return this.seanceRadiotherapies ;
    }
    public void  setSeanceRadiotherapies(boolean seanceRadiotherapies ){
        this.seanceRadiotherapies  = seanceRadiotherapies ;
    }
    public boolean  isHistortiquePrescriptionRadiotherapies(){
        return this.histortiquePrescriptionRadiotherapies ;
    }
    public void  setHistortiquePrescriptionRadiotherapies(boolean histortiquePrescriptionRadiotherapies ){
        this.histortiquePrescriptionRadiotherapies  = histortiquePrescriptionRadiotherapies ;
    }
}
