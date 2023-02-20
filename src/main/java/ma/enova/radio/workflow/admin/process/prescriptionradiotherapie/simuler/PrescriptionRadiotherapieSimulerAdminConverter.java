package ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.simuler;

import ma.enova.radio.bean.core.PrescriptionRadiotherapie;
import ma.enova.radio.ws.converter.*;
import ma.enova.radio.zynerator.process.AbstractProcessConverter;
import ma.enova.radio.zynerator.util.DateUtil;
import ma.enova.radio.zynerator.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PrescriptionRadiotherapieSimulerAdminConverter extends AbstractProcessConverter<PrescriptionRadiotherapieSimulerAdminInput, PrescriptionRadiotherapieSimulerAdminOutput, PrescriptionRadiotherapie> {
    @Autowired
    private StatutRadiotherapieConverter statutRadiotherapieConverter;
    @Autowired
    private PersonnelConverter personnelConverter;
    @Autowired
    private ImmobilistionConverter immobilistionConverter;
    @Autowired
    private PositionnementConverter positionnementConverter;

    @Autowired
    private DecisionTraitementConverter decisionTraitementConverter;


    public PrescriptionRadiotherapieSimulerAdminConverter() {
        super(PrescriptionRadiotherapie.class, PrescriptionRadiotherapieSimulerAdminInput.class, PrescriptionRadiotherapieSimulerAdminOutput.class);
    }

    @Override
    public PrescriptionRadiotherapie toItem(PrescriptionRadiotherapieSimulerAdminInput input) {
        if (input == null) {
            return null;
        } else {
            PrescriptionRadiotherapie item = new PrescriptionRadiotherapie();
            if (StringUtil.isNotEmpty(input.getId()))
                item.setId(input.getId());

            if (StringUtil.isNotEmpty(input.getDateSimulation()))
                item.setDateSimulation(DateUtil.stringEnToDate(input.getDateSimulation()));

            if (StringUtil.isNotEmpty(input.getFichierTraitements()))
                item.setFichierTraitements(input.getFichierTraitements());
            if (false && StringUtil.isNotEmpty(input.getValidateurSimulationDate()))
                item.setValidateurSimulationDate(DateUtil.stringEnToDate(input.getValidateurSimulationDate()));

            if (input.getStatutRadiotherapie() != null)
                item.setStatutRadiotherapie(statutRadiotherapieConverter.toItem(input.getStatutRadiotherapie()));

            if (input.getValidateurSimulation() != null)
                item.setValidateurSimulation(personnelConverter.toItem(input.getValidateurSimulation()));
            if (input.getDecisionTraitement() != null)
                item.setDecisionTraitement(decisionTraitementConverter.toItem(input.getDecisionTraitement()));


            if (input.getImmobilistion() != null)
                item.setImmobilistion(immobilistionConverter.toItem(input.getImmobilistion()));
            if (input.getPositionnement() != null)
                item.setPositionnement(positionnementConverter.toItem(input.getPositionnement()));

            return item;
        }
    }

    @Override
    public PrescriptionRadiotherapieSimulerAdminOutput toOutput(PrescriptionRadiotherapie item) {
        if (item == null) {
            return null;
        } else {
            PrescriptionRadiotherapieSimulerAdminOutput output = new PrescriptionRadiotherapieSimulerAdminOutput();
            if (StringUtil.isNotEmpty(item.getId()))
                output.setId(item.getId());

            if (item.getDateSimulation() != null)
                output.setDateSimulation(DateUtil.dateToStringForBean(item.getDateSimulation()));
            if (item.getImmobilistion() != null)
                output.setImmobilistion(immobilistionConverter.toDto(item.getImmobilistion()));
            if (item.getPositionnement() != null)
                output.setPositionnement(positionnementConverter.toDto(item.getPositionnement()));
            if (StringUtil.isNotEmpty(item.getFichierTraitements()))
                output.setFichierTraitements(item.getFichierTraitements());
            if (false && item.getValidateurSimulationDate() != null)
                output.setValidateurSimulationDate(DateUtil.dateToStringForBean(item.getValidateurSimulationDate()));
            /* if (item.getDatePrescription() != null)
                output.setDatePrescription(DateUtil.dateToString(item.getDatePrescription()));
            output.setRcc(item.getRcc());
            if (StringUtil.isNotEmpty(item.getDose()))
                output.setDose(item.getDose());
            if (StringUtil.isNotEmpty(item.getFractionnement()))
                output.setFractionnement(item.getFractionnement());
            if (StringUtil.isNotEmpty(item.getEtalement()))
                output.setEtalement(item.getEtalement());
            if (StringUtil.isNotEmpty(item.getFrequenceRadiotherapie()))
                output.setFrequenceRadiotherapie(item.getFrequenceRadiotherapie());
            if (item.getDateSouhaiteDebutTraitement() != null)
                output.setDateSouhaiteDebutTraitement(DateUtil.dateToString(item.getDateSouhaiteDebutTraitement()));
            if (StringUtil.isNotEmpty(item.getObservation()))
                output.setObservation(item.getObservation());
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
            if (StringUtil.isNotEmpty(item.getFrequenceRadiotherapie()))
                output.setFrequenceRadiotherapie(item.getFrequenceRadiotherapie());

            if (StringUtil.isNotEmpty(item.getNombreTotalSeance()))
                output.setNombreTotalSeance(item.getNombreTotalSeance());
            if (this.decisionTraitement && item.getDecisionTraitement() != null) {
                output.setDecisionTraitement(decisionTraitementConverter.toDto(item.getDecisionTraitement()));
            }
            if (this.medecinPrescripteur && item.getMedecinPrescripteur() != null) {
                output.setMedecinPrescripteur(personnelConverter.toDto(item.getMedecinPrescripteur()));
            }
            if (this.site && item.getSite() != null) {
                output.setSite(siteConverter.toDto(item.getSite()));
            }
            if (this.modaliteRadiotherapie && item.getModaliteRadiotherapie() != null) {
                output.setModaliteRadiotherapie(modaliteRadiotherapieConverter.toDto(item.getModaliteRadiotherapie()));
            }
            if (this.visee && item.getVisee() != null) {
                output.setVisee(viseeConverter.toDto(item.getVisee()));
            }
            if (this.protocoleInclusion && item.getProtocoleInclusion() != null) {
                output.setProtocoleInclusion(protocoleInclusionConverter.toDto(item.getProtocoleInclusion()));
            }
            if (this.statutRadiotherapie && item.getStatutRadiotherapie() != null) {
                output.setStatutRadiotherapie(statutRadiotherapieConverter.toDto(item.getStatutRadiotherapie()));
            }
            if (this.validateurSimulation && item.getValidateurSimulation() != null) {
                output.setValidateurSimulation(personnelConverter.toDto(item.getValidateurSimulation()));
            }
            if (this.patient && item.getPatient() != null) {
                output.setPatient(patientConverter.toDto(item.getPatient()));
            }
            if (this.typeTraitement && item.getTypeTraitement() != null) {
                output.setTypeTraitement(typeTraitementConverter.toDto(item.getTypeTraitement()));
            }

            if (this.seanceRadiotherapies && ListUtil.isNotEmpty(item.getSeanceRadiotherapies())) {
                seanceRadiotherapieConverter.init(true);
                seanceRadiotherapieConverter.setPrescriptionRadiotherapie(false);
                output.setSeanceRadiotherapies(seanceRadiotherapieConverter.toDto(item.getSeanceRadiotherapies()));
                seanceRadiotherapieConverter.setPrescriptionRadiotherapie(true);
            }*/

            return output;
        }
    }


}
