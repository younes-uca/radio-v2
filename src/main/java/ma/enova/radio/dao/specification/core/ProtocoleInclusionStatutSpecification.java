package ma.enova.radio.dao.specification.core;


import ma.enova.radio.bean.core.ProtocoleInclusionStatut;
import ma.enova.radio.dao.criteria.core.ProtocoleInclusionStatutCriteria;
import ma.enova.radio.zynerator.specification.AbstractSpecification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class ProtocoleInclusionStatutSpecification extends AbstractSpecification<ProtocoleInclusionStatutCriteria, ProtocoleInclusionStatut> {

    @Override
    public Predicate toPredicate(Root<ProtocoleInclusionStatut> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
        List<Predicate> predicates = new ArrayList<>();
            attachSearchElement(root, query, builder, predicates);
            if (criteria != null) {
                addPredicateId("id", criteria);
                addPredicate("name", criteria.getName(),criteria.getNameLike());
                addPredicate("displayText", criteria.getDisplayText(),criteria.getDisplayTextLike());
                addPredicate("services.id", criteria.getServices());
                addPredicate("services.id", criteria.getServicess());
                addPredicate("services.code", criteria.getServices());
                addPredicate("services.code", criteria.getServicess());
                addOrderAndFilter();
          }
        return getResult();
    }


    public ProtocoleInclusionStatutSpecification(ProtocoleInclusionStatutCriteria criteria) {
        super(criteria);
    }

    public ProtocoleInclusionStatutSpecification(ProtocoleInclusionStatutCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }



    }
