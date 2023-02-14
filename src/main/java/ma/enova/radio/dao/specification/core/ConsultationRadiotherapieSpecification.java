package  ma.enova.radio.dao.specification.core;




import ma.enova.radio.zynerator.specification.AbstractSpecification;
import ma.enova.radio.dao.criteria.core.ConsultationRadiotherapieCriteria;
import ma.enova.radio.bean.core.ConsultationRadiotherapie;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class ConsultationRadiotherapieSpecification extends AbstractSpecification<ConsultationRadiotherapieCriteria, ConsultationRadiotherapie> {

    @Override
    public Predicate toPredicate(Root<ConsultationRadiotherapie> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
        List<Predicate> predicates = new ArrayList<>();
            attachSearchElement(root, query, builder, predicates);
            if (criteria != null) {
                addPredicateId("id", criteria);
                addPredicate("dateConsultation", criteria.getDateConsultation(), criteria.getDateConsultationFrom(), criteria.getDateConsultationTo());
                addPredicate("classificationOms", criteria.getClassificationOms(),criteria.getClassificationOmsLike());
                addPredicate("statutMedicale", criteria.getStatutMedicale(),criteria.getStatutMedicaleLike());
                addOrderAndFilter();
          }
        return getResult();
    }


    public ConsultationRadiotherapieSpecification(ConsultationRadiotherapieCriteria criteria) {
        super(criteria);
    }

    public ConsultationRadiotherapieSpecification(ConsultationRadiotherapieCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }



    }
