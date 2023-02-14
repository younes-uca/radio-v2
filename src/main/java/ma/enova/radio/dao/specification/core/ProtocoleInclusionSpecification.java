package  ma.enova.radio.dao.specification.core;




import ma.enova.radio.zynerator.specification.AbstractSpecification;
import ma.enova.radio.dao.criteria.core.ProtocoleInclusionCriteria;
import ma.enova.radio.bean.core.ProtocoleInclusion;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class ProtocoleInclusionSpecification extends AbstractSpecification<ProtocoleInclusionCriteria, ProtocoleInclusion> {

    @Override
    public Predicate toPredicate(Root<ProtocoleInclusion> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
        List<Predicate> predicates = new ArrayList<>();
            attachSearchElement(root, query, builder, predicates);
            if (criteria != null) {
                addPredicateId("id", criteria);
                addPredicate("code", criteria.getCode(),criteria.getCodeLike());
                addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
                addPredicate("dateInclusion", criteria.getDateInclusion(), criteria.getDateInclusionFrom(), criteria.getDateInclusionTo());
                addPredicate("protocoleInclusionStatut", criteria.getProtocoleInclusionStatut(),criteria.getProtocoleInclusionStatutLike());
                addOrderAndFilter();
          }
        return getResult();
    }


    public ProtocoleInclusionSpecification(ProtocoleInclusionCriteria criteria) {
        super(criteria);
    }

    public ProtocoleInclusionSpecification(ProtocoleInclusionCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }



    }
