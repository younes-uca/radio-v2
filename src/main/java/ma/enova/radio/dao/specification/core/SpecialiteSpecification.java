package  ma.enova.radio.dao.specification.core;




import ma.enova.radio.zynerator.specification.AbstractSpecification;
import ma.enova.radio.dao.criteria.core.SpecialiteCriteria;
import ma.enova.radio.bean.core.Specialite;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class SpecialiteSpecification extends AbstractSpecification<SpecialiteCriteria, Specialite> {

    @Override
    public Predicate toPredicate(Root<Specialite> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
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


    public SpecialiteSpecification(SpecialiteCriteria criteria) {
        super(criteria);
    }

    public SpecialiteSpecification(SpecialiteCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }



    }
