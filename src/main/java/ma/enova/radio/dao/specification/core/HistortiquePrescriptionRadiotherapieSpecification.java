package ma.enova.radio.dao.specification.core;


import ma.enova.radio.bean.core.HistortiquePrescriptionRadiotherapie;
import ma.enova.radio.dao.criteria.core.HistortiquePrescriptionRadiotherapieCriteria;
import ma.enova.radio.zynerator.specification.AbstractSpecification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class HistortiquePrescriptionRadiotherapieSpecification extends AbstractSpecification<HistortiquePrescriptionRadiotherapieCriteria, HistortiquePrescriptionRadiotherapie> {

    @Override
    public Predicate toPredicate(Root<HistortiquePrescriptionRadiotherapie> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
        List<Predicate> predicates = new ArrayList<>();
        attachSearchElement(root, query, builder, predicates);
        if (criteria != null) {
            addPredicateId("id", criteria);
            addPredicate("dateHistortiquePrescriptionRadiotherapie", criteria.getDateHistortiquePrescriptionRadiotherapie(), criteria.getDateHistortiquePrescriptionRadiotherapieFrom(), criteria.getDateHistortiquePrescriptionRadiotherapieTo());
            addPredicateFk("prescriptionRadiotherapie", "id", criteria.getPrescriptionRadiotherapie() == null ? null : criteria.getPrescriptionRadiotherapie().getId());
            addPredicateFk("statutRadiotherapie", "id", criteria.getStatutRadiotherapie() == null ? null : criteria.getStatutRadiotherapie().getId());
            addPredicateFk("statutRadiotherapie", "code", criteria.getStatutRadiotherapie() == null ? null : criteria.getStatutRadiotherapie().getCode());
            addOrderAndFilter();
        }
        return getResult();
    }


    public HistortiquePrescriptionRadiotherapieSpecification(HistortiquePrescriptionRadiotherapieCriteria criteria) {
        super(criteria);
    }

    public HistortiquePrescriptionRadiotherapieSpecification(HistortiquePrescriptionRadiotherapieCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }


}
