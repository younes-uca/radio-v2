package ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.util;


import ma.enova.radio.bean.core.*;
import ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.save.PrescriptionRadiotherapieSaveAdminInput;
import ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.save.PrescriptionRadiotherapieSaveAdminOutput;
import ma.enova.radio.zynerator.process.Result;
import ma.enova.radio.zynerator.util.DateUtil;
import ma.enova.radio.zynerator.util.StringUtil;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class RadiotherapieValidator {
    public static void validateFraction(Integer fractionnement, Result result) {
        if (fractionnement == null || fractionnement <= 0) {
            result.addErrorMessage("radiotherapie.commun.fractionnement.stritectement-positif");
        }
    }
    public static void validateFrequenceRadio(String frequenceRadiotherapie, Result result) {
        List<String> frequenceRadiotherapies = Arrays.asList("heure", "jour", "semaine", "mois");
        if (StringUtil.isEmpty(frequenceRadiotherapie)) {
            result.addErrorMessage("radiotherapie.commun.frequenceRadiotherapie.obligatoire");
        } else if (!frequenceRadiotherapies.contains(frequenceRadiotherapie)) {
            result.addErrorMessage("radiotherapie.commun.frequenceRadiotherapie.valeur-non-conforme");
        }
    }
    public static void validatePatient(Patient patient, Result result) {
        if (patient == null || StringUtil.isEmpty(patient.getIpp())) {
            result.addErrorMessage("radiotherapie.commun.patient.ipp-obligatoire");
        }
    }
    public static void validateDateTraitement(LocalDateTime dateSouhaiteDebutTraitement, Result result) {
        if (dateSouhaiteDebutTraitement == null) {
            result.addErrorMessage("radiotherapie.commun.dateDebutTraitement-obligatoire");
        } else if (DateUtil.isBeforeNow(dateSouhaiteDebutTraitement)) {
            result.addErrorMessage("radiotherapie.commun.dateDebutTraitement.inferieur-aujoudhui");
        }
    }
    public static void validateStatutRadiotherapie(StatutRadiotherapie statutRadiotherapie, Result<PrescriptionRadiotherapieSaveAdminInput, PrescriptionRadiotherapieSaveAdminOutput, PrescriptionRadiotherapie> result) {
        if (statutRadiotherapie == null || StringUtil.isEmpty(statutRadiotherapie.getCode())) {
            result.addErrorMessage("radiotherapie.commun.statut.obligatoire");
        }
    }

    public static void validateVisee(Visee visee, Result<PrescriptionRadiotherapieSaveAdminInput, PrescriptionRadiotherapieSaveAdminOutput, PrescriptionRadiotherapie> result) {
        if (visee == null || StringUtil.isEmpty(visee.getCode())) {
            result.addErrorMessage("radiotherapie.commun.visee.obligatoire");
        }
    }

    public static void validateProtocoleInclusion(ProtocoleInclusion protocoleInclusion, Result<PrescriptionRadiotherapieSaveAdminInput, PrescriptionRadiotherapieSaveAdminOutput, PrescriptionRadiotherapie> result) {
        if (protocoleInclusion == null || StringUtil.isEmpty(protocoleInclusion.getCode())) {
            result.addErrorMessage("radiotherapie.commun.protocole-inclusion.obligatoire");
        }
    }

    public static void validatePersonnel(Personnel medecinPrescripteur, Result<PrescriptionRadiotherapieSaveAdminInput, PrescriptionRadiotherapieSaveAdminOutput, PrescriptionRadiotherapie> result) {
        if (medecinPrescripteur == null || StringUtil.isEmpty(medecinPrescripteur.getIpp())) {
            result.addErrorMessage("radiotherapie.commun.medecin-prescripteur.obligatoire");
        }
    }

    public static void validateModaliteRadiotherapie(ModaliteRadiotherapie modaliteRadiotherapie, Result<PrescriptionRadiotherapieSaveAdminInput, PrescriptionRadiotherapieSaveAdminOutput, PrescriptionRadiotherapie> result) {
        if (modaliteRadiotherapie == null || StringUtil.isEmpty(modaliteRadiotherapie.getCode())) {
            result.addErrorMessage("radiotherapie.commun.modalite-radiotherapie.obligatoire");
        }
    }

    public static void validateSite(Site site, Result<PrescriptionRadiotherapieSaveAdminInput, PrescriptionRadiotherapieSaveAdminOutput, PrescriptionRadiotherapie> result) {
        if (site == null || StringUtil.isEmpty(site.getCode())) {
            result.addErrorMessage("radiotherapie.commun.site.obligatoire");
        }
    }

    public static void validateDecisionTraitement(DecisionTraitement decisionTraitement, Result<PrescriptionRadiotherapieSaveAdminInput, PrescriptionRadiotherapieSaveAdminOutput, PrescriptionRadiotherapie> result) {
        if (decisionTraitement == null || StringUtil.isEmpty(decisionTraitement.getCode())) {
            result.addErrorMessage("radiotherapie.commun.decision-traitement.obligatoire");
        }
    }
}
