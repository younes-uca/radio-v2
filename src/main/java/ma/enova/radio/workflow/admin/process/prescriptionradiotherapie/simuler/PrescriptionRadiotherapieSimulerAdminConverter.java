package ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.simuler;

import ma.enova.radio.bean.core.PrescriptionRadiotherapie;
import ma.enova.radio.ws.converter.HistortiquePrescriptionRadiotherapieConverter;
import ma.enova.radio.ws.converter.ModaliteRadiotherapieConverter;
import ma.enova.radio.ws.converter.PersonnelConverter;
import ma.enova.radio.ws.converter.StatutRadiotherapieConverter;
import ma.enova.radio.zynerator.process.AbstractProcessConverter;
import ma.enova.radio.zynerator.util.DateUtil;
import ma.enova.radio.zynerator.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PrescriptionRadiotherapieSimulerAdminConverter extends AbstractProcessConverter<PrescriptionRadiotherapieSimulerAdminInput, PrescriptionRadiotherapieSimulerAdminOutput, PrescriptionRadiotherapie> {

    @Autowired
    private ModaliteRadiotherapieConverter modaliteRadiotherapieConverter;
    @Autowired
    private HistortiquePrescriptionRadiotherapieConverter histortiquePrescriptionRadiotherapieConverter;
    @Autowired
    private StatutRadiotherapieConverter statutRadiotherapieConverter;

    @Autowired
    private PersonnelConverter personnelConverter;

    private boolean medecinPrescripteur;

    private boolean statutRadiotherapie;
    private boolean validateurSimulation;


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
            if (StringUtil.isNotEmpty(input.getImmobilistion()))
                item.setImmobilistion(input.getImmobilistion());
            if (StringUtil.isNotEmpty(input.getPositionnement()))
                item.setPositionnement(input.getPositionnement());
            if (StringUtil.isNotEmpty(input.getFichierTraitements()))
                item.setFichierTraitements(input.getFichierTraitements());
            if (StringUtil.isNotEmpty(input.getValidateurSimulationDate()))
                item.setValidateurSimulationDate(DateUtil.stringEnToDate(input.getValidateurSimulationDate()));

            if (this.statutRadiotherapie && input.getStatutRadiotherapie() != null)
                item.setStatutRadiotherapie(statutRadiotherapieConverter.toItem(input.getStatutRadiotherapie()));

            if (this.validateurSimulation && input.getValidateurSimulation() != null)
                item.setValidateurSimulation(personnelConverter.toItem(input.getValidateurSimulation()));


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
                output.setDateSimulation(DateUtil.dateTimeToString(item.getDateSimulation()));
            if (StringUtil.isNotEmpty(item.getImmobilistion()))
                output.setImmobilistion(item.getImmobilistion());
            if (StringUtil.isNotEmpty(item.getPositionnement()))
                output.setPositionnement(item.getPositionnement());
            if (StringUtil.isNotEmpty(item.getFichierTraitements()))
                output.setFichierTraitements(item.getFichierTraitements());
            if (item.getValidateurSimulationDate() != null)
                output.setValidateurSimulationDate(DateUtil.dateTimeToString(item.getValidateurSimulationDate()));
            if (this.statutRadiotherapie && item.getStatutRadiotherapie() != null) {
                output.setStatutRadiotherapie(statutRadiotherapieConverter.toDto(item.getStatutRadiotherapie()));
            }
            if (this.validateurSimulation && item.getValidateurSimulation() != null) {
                output.setValidateurSimulation(personnelConverter.toDto(item.getValidateurSimulation()));
            }
            return output;
        }
    }


    public ModaliteRadiotherapieConverter getModaliteRadiotherapieConverter() {
        return this.modaliteRadiotherapieConverter;
    }

    public void setModaliteRadiotherapieConverter(ModaliteRadiotherapieConverter modaliteRadiotherapieConverter) {
        this.modaliteRadiotherapieConverter = modaliteRadiotherapieConverter;
    }

    public HistortiquePrescriptionRadiotherapieConverter getHistortiquePrescriptionRadiotherapieConverter() {
        return this.histortiquePrescriptionRadiotherapieConverter;
    }

    public void setHistortiquePrescriptionRadiotherapieConverter(HistortiquePrescriptionRadiotherapieConverter histortiquePrescriptionRadiotherapieConverter) {
        this.histortiquePrescriptionRadiotherapieConverter = histortiquePrescriptionRadiotherapieConverter;
    }

    public StatutRadiotherapieConverter getStatutRadiotherapieConverter() {
        return this.statutRadiotherapieConverter;
    }

    public void setStatutRadiotherapieConverter(StatutRadiotherapieConverter statutRadiotherapieConverter) {
        this.statutRadiotherapieConverter = statutRadiotherapieConverter;
    }

    public PersonnelConverter getPersonnelConverter() {
        return this.personnelConverter;
    }

    public void setPersonnelConverter(PersonnelConverter personnelConverter) {
        this.personnelConverter = personnelConverter;
    }

    public boolean isMedecinPrescripteur() {
        return this.medecinPrescripteur;
    }

    public void setMedecinPrescripteur(boolean medecinPrescripteur) {
        this.medecinPrescripteur = medecinPrescripteur;
    }

    public boolean isStatutRadiotherapie() {
        return this.statutRadiotherapie;
    }

    public void setStatutRadiotherapie(boolean statutRadiotherapie) {
        this.statutRadiotherapie = statutRadiotherapie;
    }

    public boolean isValidateurSimulation() {
        return this.validateurSimulation;
    }

    public void setValidateurSimulation(boolean validateurSimulation) {
        this.validateurSimulation = validateurSimulation;
    }

}
