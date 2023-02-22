package ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.save;

import ma.enova.radio.bean.core.PrescriptionRadiotherapie;
import ma.enova.radio.bean.core.StatutRadiotherapie;
import ma.enova.radio.ws.converter.*;
import ma.enova.radio.zynerator.process.AbstractProcessConverter;
import ma.enova.radio.zynerator.util.DateUtil;
import ma.enova.radio.zynerator.util.ListUtil;
import ma.enova.radio.zynerator.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PrescriptionRadiotherapieSaveAdminConverter extends AbstractProcessConverter<PrescriptionRadiotherapieSaveAdminInput, PrescriptionRadiotherapieSaveAdminOutput, PrescriptionRadiotherapie> {


    public PrescriptionRadiotherapieSaveAdminConverter() {
        super(PrescriptionRadiotherapie.class, PrescriptionRadiotherapieSaveAdminInput.class, PrescriptionRadiotherapieSaveAdminOutput.class);
    }

    @Override
    public PrescriptionRadiotherapie toItem(PrescriptionRadiotherapieSaveAdminInput input) {
        if (input == null) {
            return null;
        } else {
            PrescriptionRadiotherapie item = new PrescriptionRadiotherapie();
            if (StringUtil.isNotEmpty(input.getId()))
                item.setId(input.getId());
            if (StringUtil.isNotEmpty(input.getDatePrescription()))
                item.setDatePrescription(DateUtil.stringToDate(input.getDatePrescription()));
            if (input.getRcc() != null)
                item.setRcc(input.getRcc());
            if (StringUtil.isNotEmpty(input.getDose()))
                item.setDose(input.getDose());
            if (StringUtil.isNotEmpty(input.getFractionnement()))
                item.setFractionnement(input.getFractionnement());
            if (StringUtil.isNotEmpty(input.getEtalement()))
                item.setEtalement(input.getEtalement());

            if (StringUtil.isNotEmpty(input.getDateSouhaiteDebutTraitement()))
                item.setDateSouhaiteDebutTraitement(DateUtil.stringToDate(input.getDateSouhaiteDebutTraitement()));
            if (StringUtil.isNotEmpty(input.getDateDebutTraitement()))
                item.setDateDebutTraitement(DateUtil.stringToDate(input.getDateDebutTraitement()));
            if (StringUtil.isNotEmpty(input.getObservation()))
                item.setObservation(input.getObservation());

            if (StringUtil.isNotEmpty(input.getCompteRendu()))
                item.setCompteRendu(input.getCompteRendu());
            if (input.getActif() != null)
                item.setActif(input.getActif());
            if (StringUtil.isNotEmpty(input.getNombreSeanceRealise()))
                item.setNombreSeanceRealise(input.getNombreSeanceRealise());
            if (StringUtil.isNotEmpty(input.getNombreTotalSeance()))
                item.setNombreTotalSeance(input.getNombreTotalSeance());


            if (input.getFrequenceRadiotherapie() != null)
                item.setFrequenceRadiotherapie(frequenceRadiotherapieConverter.toItem(input.getFrequenceRadiotherapie()));

            if (input.getDecisionTraitement() != null) {
                item.setDecisionTraitement(decisionTraitementConverter.toItem(input.getDecisionTraitement()));
                if (StringUtil.isNotEmpty(input.getDecisionTraitement().getLabel())) {
                    item.getDecisionTraitement().setCode(input.getDecisionTraitement().getLabel());
                }
            }

            if (input.getMedecinPrescripteur() != null)
                item.setMedecinPrescripteur(personnelConverter.toItem(input.getMedecinPrescripteur()));

            if (input.getSite() != null)
                item.setSite(siteConverter.toItem(input.getSite()));

            if (input.getModaliteRadiotherapie() != null)
                item.setModaliteRadiotherapie(modaliteRadiotherapieConverter.toItem(input.getModaliteRadiotherapie()));

            if (input.getVisee() != null)
                item.setVisee(viseeConverter.toItem(input.getVisee()));

            if (input.getProtocoleInclusion() != null)
                item.setProtocoleInclusion(protocoleInclusionConverter.toItem(input.getProtocoleInclusion()));

            if (input.getStatutRadiotherapie() != null) {
                item.setStatutRadiotherapie(statutRadiotherapieConverter.toItem(input.getStatutRadiotherapie()));
               // item.setStatutRadiotherapie(new StatutRadiotherapie(input.getStatutRadiotherapie()));
            }

            if (input.getPatient() != null)
                item.setPatient(patientConverter.toItem(input.getPatient()));

            if (input.getTypeTraitement() != null)
                item.setTypeTraitement(typeTraitementConverter.toItem(input.getTypeTraitement()));

            if (input.getImmobilistion() != null)
                item.setImmobilistion(immobilistionConverter.toItem(input.getImmobilistion()));

            if (input.getPositionnement() != null)
                item.setPositionnement(positionnementConverter.toItem(input.getPositionnement()));

            return item;
        }
    }

    @Override
    public PrescriptionRadiotherapieSaveAdminOutput toOutput(PrescriptionRadiotherapie item) {
        if (item == null) {
            return null;
        } else {
            PrescriptionRadiotherapieSaveAdminOutput output = new PrescriptionRadiotherapieSaveAdminOutput();
            if (StringUtil.isNotEmpty(item.getId()))
                output.setId(item.getId());
            if (item.getDatePrescription() != null)
                output.setDatePrescription(DateUtil.dateToString(item.getDatePrescription()));
            output.setRcc(item.getRcc());
            if (StringUtil.isNotEmpty(item.getDose()))
                output.setDose(item.getDose());
            if (StringUtil.isNotEmpty(item.getFractionnement()))
                output.setFractionnement(item.getFractionnement());
            if (StringUtil.isNotEmpty(item.getEtalement()))
                output.setEtalement(item.getEtalement());

            if (item.getDateSouhaiteDebutTraitement() != null)
                output.setDateSouhaiteDebutTraitement(DateUtil.dateToString(item.getDateSouhaiteDebutTraitement()));
            if (StringUtil.isNotEmpty(item.getObservation()))
                output.setObservation(item.getObservation());
            if (item.getDateSimulation() != null)
                output.setDateSimulation(DateUtil.dateToString(item.getDateSimulation()));


            if (StringUtil.isNotEmpty(item.getFichierTraitements()))
                output.setFichierTraitements(item.getFichierTraitements());
            if (item.getValidateurSimulationDate() != null)
                output.setValidateurSimulationDate(DateUtil.dateToString(item.getValidateurSimulationDate()));
            if (item.getDatePrevu() != null)
                output.setDatePrevu(DateUtil.dateToString(item.getDatePrevu()));
            if (item.getDateDebutTraitement() != null)
                output.setDateDebutTraitement(DateUtil.dateToString(item.getDateDebutTraitement()));
            if (item.getDateFinTraitement() != null)
                output.setDateFinTraitement(DateUtil.dateToString(item.getDateFinTraitement()));
            if (item.getDateDecisionTraitement() != null)
                output.setDateDecisionTraitement(DateUtil.dateToString(item.getDateDecisionTraitement()));
            if (StringUtil.isNotEmpty(item.getCompteRendu()))
                output.setCompteRendu(item.getCompteRendu());
            output.setActif(item.getActif());
            if (StringUtil.isNotEmpty(item.getNombreSeanceRealise()))
                output.setNombreSeanceRealise(item.getNombreSeanceRealise());

            if (StringUtil.isNotEmpty(item.getNombreTotalSeance()))
                output.setNombreTotalSeance(item.getNombreTotalSeance());

            if (item.getImmobilistion() != null)
                output.setImmobilistion(immobilistionConverter.toDto(item.getImmobilistion()));
            if (item.getPositionnement() != null)
                output.setPositionnement(positionnementConverter.toDto(item.getPositionnement()));

            if (item.getFrequenceRadiotherapie() != null)
                output.setFrequenceRadiotherapie(frequenceRadiotherapieConverter.toDto(item.getFrequenceRadiotherapie()));
            if (item.getDecisionTraitement() != null) {
                output.setDecisionTraitement(decisionTraitementConverter.toDto(item.getDecisionTraitement()));
            }
            if (item.getMedecinPrescripteur() != null) {
                output.setMedecinPrescripteur(personnelConverter.toDto(item.getMedecinPrescripteur()));
            }
            if (item.getSite() != null) {
                output.setSite(siteConverter.toDto(item.getSite()));
            }
            if (item.getModaliteRadiotherapie() != null) {
                output.setModaliteRadiotherapie(modaliteRadiotherapieConverter.toDto(item.getModaliteRadiotherapie()));
            }
            if (item.getVisee() != null) {
                output.setVisee(viseeConverter.toDto(item.getVisee()));
            }
            if (item.getProtocoleInclusion() != null) {
                output.setProtocoleInclusion(protocoleInclusionConverter.toDto(item.getProtocoleInclusion()));
            }
            if (item.getStatutRadiotherapie() != null) {
                output.setStatutRadiotherapie(statutRadiotherapieConverter.toDto(item.getStatutRadiotherapie()));
            }
            if (item.getValidateurSimulation() != null) {
                output.setValidateurSimulation(personnelConverter.toDto(item.getValidateurSimulation()));
            }
            if (item.getPatient() != null) {
                output.setPatient(patientConverter.toDto(item.getPatient()));
            }
            if (item.getTypeTraitement() != null) {
                output.setTypeTraitement(typeTraitementConverter.toDto(item.getTypeTraitement()));
            }

            if (ListUtil.isNotEmpty(item.getSeanceRadiotherapies())) {
                seanceRadiotherapieConverter.init(true);
                seanceRadiotherapieConverter.setPrescriptionRadiotherapie(false);
                output.setSeanceRadiotherapies(seanceRadiotherapieConverter.toDto(item.getSeanceRadiotherapies()));
                seanceRadiotherapieConverter.setPrescriptionRadiotherapie(true);
            }

            return output;
        }
    }


    @Autowired
    private ModaliteRadiotherapieConverter modaliteRadiotherapieConverter;
    @Autowired
    private HistortiquePrescriptionRadiotherapieConverter histortiquePrescriptionRadiotherapieConverter;
    @Autowired
    private StatutRadiotherapieConverter statutRadiotherapieConverter;
    @Autowired
    private SiteConverter siteConverter;
    @Autowired
    private TypeTraitementConverter typeTraitementConverter;
    @Autowired
    private PersonnelConverter personnelConverter;
    @Autowired
    private ViseeConverter viseeConverter;
    @Autowired
    private SeanceRadiotherapieConverter seanceRadiotherapieConverter;
    @Autowired
    private PatientConverter patientConverter;
    @Autowired
    private ConsultationRadiotherapieConverter consultationRadiotherapieConverter;
    @Autowired
    private TypeToxiciteRthConverter typeToxiciteRthConverter;
    @Autowired
    private TypeConsultationRadiotherapieConverter typeConsultationRadiotherapieConverter;
    @Autowired
    private ProtocoleInclusionConverter protocoleInclusionConverter;
    @Autowired
    private GradeToxiciteRthConverter gradeToxiciteRthConverter;
    @Autowired
    private DecisionTraitementConverter decisionTraitementConverter;
    @Autowired
    private FrequenceRadiotherapieConverter frequenceRadiotherapieConverter;
    @Autowired
    private PositionnementConverter positionnementConverter;
    @Autowired
    private ImmobilistionConverter immobilistionConverter;
}
