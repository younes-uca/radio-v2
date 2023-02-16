package ma.enova.radio.dao.specification.core;


import ma.enova.radio.bean.core.PrescriptionRadiotherapie;
import ma.enova.radio.dao.criteria.core.PrescriptionRadiotherapieCriteria;
import ma.enova.radio.zynerator.specification.AbstractSpecification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class PrescriptionRadiotherapieSpecification extends AbstractSpecification<PrescriptionRadiotherapieCriteria, PrescriptionRadiotherapie> {

    @Override
    public Predicate toPredicate(Root<PrescriptionRadiotherapie> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
        List<Predicate> predicates = new ArrayList<>();
        attachSearchElement(root, query, builder, predicates);
        if (criteria != null) {
            addPredicateId("id", criteria);
            addPredicate("datePrescription", criteria.getDatePrescription(), criteria.getDatePrescriptionFrom(), criteria.getDatePrescriptionTo());
            addPredicateBool("rcc", criteria.getRcc());
            addPredicateBigDecimal("dose", criteria.getDose());
            addPredicateBigDecimal("dose", criteria.getDoseMin(), criteria.getDoseMax());
            addPredicateInt("fractionnement", criteria.getFractionnement());
            addPredicateInt("fractionnement", criteria.getFractionnementMin(), criteria.getFractionnementMax());
            addPredicateInt("etalement", criteria.getEtalement());
            addPredicateInt("etalement", criteria.getEtalementMin(), criteria.getEtalementMax());
            addPredicate("frequenceRadiotherapie", criteria.getFrequenceRadiotherapie(), criteria.getFrequenceRadiotherapieLike());
            addPredicate("dateSouhaiteDebutTraitement", criteria.getDateSouhaiteDebutTraitement(), criteria.getDateSouhaiteDebutTraitementFrom(), criteria.getDateSouhaiteDebutTraitementTo());
            addPredicate("dateSimulation", criteria.getDateSimulation(), criteria.getDateSimulationFrom(), criteria.getDateSimulationTo());
            addPredicate("immobilistion", criteria.getImmobilistion(), criteria.getImmobilistionLike());
            addPredicate("positionnement", criteria.getPositionnement(), criteria.getPositionnementLike());
            addPredicate("fichierTraitements", criteria.getFichierTraitements(), criteria.getFichierTraitementsLike());
            addPredicate("validateurSimulationDate", criteria.getValidateurSimulationDate(), criteria.getValidateurSimulationDateFrom(), criteria.getValidateurSimulationDateTo());
            addPredicate("datePrevu", criteria.getDatePrevu(), criteria.getDatePrevuFrom(), criteria.getDatePrevuTo());
            addPredicate("dateDebutTraitement", criteria.getDateDebutTraitement(), criteria.getDateDebutTraitementFrom(), criteria.getDateDebutTraitementTo());
            addPredicate("dateFinTraitement", criteria.getDateFinTraitement(), criteria.getDateFinTraitementFrom(), criteria.getDateFinTraitementTo());
            addPredicate("dateDecisionTraitement", criteria.getDateDecisionTraitement(), criteria.getDateDecisionTraitementFrom(), criteria.getDateDecisionTraitementTo());
            addPredicate("compteRendu", criteria.getCompteRendu(), criteria.getCompteRenduLike());
            addPredicateBool("actif", criteria.getActif());
            addPredicateInt("nombreSeanceRealise", criteria.getNombreSeanceRealise());
            addPredicateInt("nombreSeanceRealise", criteria.getNombreSeanceRealiseMin(), criteria.getNombreSeanceRealiseMax());
            addPredicateInt("nombreTotalSeance", criteria.getNombreTotalSeance());
            addPredicateInt("nombreTotalSeance", criteria.getNombreTotalSeanceMin(), criteria.getNombreTotalSeanceMax());
            addPredicateFk("decisionTraitement", "id", criteria.getDecisionTraitement() == null ? null : criteria.getDecisionTraitement().getId());
            addPredicateFk("decisionTraitement", "code", criteria.getDecisionTraitement() == null ? null : criteria.getDecisionTraitement().getCode());
            addPredicateFk("patient", "ipp", criteria.getPatient() == null ? null : criteria.getPatient().getIpp());
            addPredicateFk("patient", "id", criteria.getPatient() == null ? null : criteria.getPatient().getId());
            addPredicateFk("statutRadiotherapie", "code", criteria.getStatutRadiotherapie() == null ? null : criteria.getStatutRadiotherapie().getCode());
            addPredicateFk("statutRadiotherapie", "id", criteria.getStatutRadiotherapie() == null ? null : criteria.getStatutRadiotherapie().getId());
            addOrderAndFilter();
        }
        return getResult();
    }


    public PrescriptionRadiotherapieSpecification(PrescriptionRadiotherapieCriteria criteria) {
        super(criteria);
    }

    public PrescriptionRadiotherapieSpecification(PrescriptionRadiotherapieCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }


}
