package  ma.enova.radio.dao.specification.core;




import ma.enova.radio.zynerator.specification.AbstractSpecification;
import ma.enova.radio.dao.criteria.core.TypeTraitementCriteria;
import ma.enova.radio.bean.core.TypeTraitement;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class TypeTraitementSpecification extends AbstractSpecification<TypeTraitementCriteria, TypeTraitement> {

    @Override
    public Predicate toPredicate(Root<TypeTraitement> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
        List<Predicate> predicates = new ArrayList<>();
            attachSearchElement(root, query, builder, predicates);
            if (criteria != null) {
                addPredicateId("id", criteria);
                addPredicate("code", criteria.getCode(),criteria.getCodeLike());
                addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
                addPredicate("style", criteria.getStyle(),criteria.getStyleLike());
                addOrderAndFilter();
          }
        return getResult();
    }


    public TypeTraitementSpecification(TypeTraitementCriteria criteria) {
        super(criteria);
    }

    public TypeTraitementSpecification(TypeTraitementCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }



    }
