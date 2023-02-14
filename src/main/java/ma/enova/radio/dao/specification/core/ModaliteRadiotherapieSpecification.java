package  ma.enova.radio.dao.specification.core;




import ma.enova.radio.zynerator.specification.AbstractSpecification;
import ma.enova.radio.dao.criteria.core.ModaliteRadiotherapieCriteria;
import ma.enova.radio.bean.core.ModaliteRadiotherapie;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class ModaliteRadiotherapieSpecification extends AbstractSpecification<ModaliteRadiotherapieCriteria, ModaliteRadiotherapie> {

    @Override
    public Predicate toPredicate(Root<ModaliteRadiotherapie> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
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


    public ModaliteRadiotherapieSpecification(ModaliteRadiotherapieCriteria criteria) {
        super(criteria);
    }

    public ModaliteRadiotherapieSpecification(ModaliteRadiotherapieCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }



    }
