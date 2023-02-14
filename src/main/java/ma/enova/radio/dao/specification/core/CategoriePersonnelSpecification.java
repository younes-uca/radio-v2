package  ma.enova.radio.dao.specification.core;




import ma.enova.radio.zynerator.specification.AbstractSpecification;
import ma.enova.radio.dao.criteria.core.CategoriePersonnelCriteria;
import ma.enova.radio.bean.core.CategoriePersonnel;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class CategoriePersonnelSpecification extends AbstractSpecification<CategoriePersonnelCriteria, CategoriePersonnel> {

    @Override
    public Predicate toPredicate(Root<CategoriePersonnel> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
        List<Predicate> predicates = new ArrayList<>();
            attachSearchElement(root, query, builder, predicates);
            if (criteria != null) {
                addPredicateId("id", criteria);
                addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
                addPredicate("code", criteria.getCode(),criteria.getCodeLike());
                addOrderAndFilter();
          }
        return getResult();
    }


    public CategoriePersonnelSpecification(CategoriePersonnelCriteria criteria) {
        super(criteria);
    }

    public CategoriePersonnelSpecification(CategoriePersonnelCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }



    }
