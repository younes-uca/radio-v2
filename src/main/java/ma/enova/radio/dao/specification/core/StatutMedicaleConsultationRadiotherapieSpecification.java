package ma.enova.radio.dao.specification.core;


import ma.enova.radio.bean.core.StatutMedicaleConsultationRadiotherapie;
import ma.enova.radio.dao.criteria.core.StatutMedicaleConsultationRadiotherapieCriteria;
import ma.enova.radio.zynerator.specification.AbstractSpecification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class StatutMedicaleConsultationRadiotherapieSpecification extends AbstractSpecification<StatutMedicaleConsultationRadiotherapieCriteria, StatutMedicaleConsultationRadiotherapie> {

    @Override
    public Predicate toPredicate(Root<StatutMedicaleConsultationRadiotherapie> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
        List<Predicate> predicates = new ArrayList<>();
            attachSearchElement(root, query, builder, predicates);
            if (criteria != null) {
                addPredicateId("id", criteria);
                addPredicate("code", criteria.getCode(),criteria.getCodeLike());
                addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
                addPredicate("services.id", criteria.getServices());
                addPredicate("services.id", criteria.getServicess());
                addPredicate("services.code", criteria.getServices());
                addPredicate("services.code", criteria.getServicess());
                addOrderAndFilter();
          }
        return getResult();
    }


    public StatutMedicaleConsultationRadiotherapieSpecification(StatutMedicaleConsultationRadiotherapieCriteria criteria) {
        super(criteria);
    }

    public StatutMedicaleConsultationRadiotherapieSpecification(StatutMedicaleConsultationRadiotherapieCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }



    }
