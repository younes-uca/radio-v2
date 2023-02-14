package  ma.enova.radio.dao.specification.core;




import ma.enova.radio.zynerator.specification.AbstractSpecification;
import ma.enova.radio.dao.criteria.core.PositionnementCriteria;
import ma.enova.radio.bean.core.Positionnement;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class PositionnementSpecification extends AbstractSpecification<PositionnementCriteria, Positionnement> {

    @Override
    public Predicate toPredicate(Root<Positionnement> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
        List<Predicate> predicates = new ArrayList<>();
            attachSearchElement(root, query, builder, predicates);
            if (criteria != null) {
                addPredicateId("id", criteria);
                addPredicate("code", criteria.getCode(),criteria.getCodeLike());
                addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
                addOrderAndFilter();
          }
        return getResult();
    }


    public PositionnementSpecification(PositionnementCriteria criteria) {
        super(criteria);
    }

    public PositionnementSpecification(PositionnementCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }



    }
