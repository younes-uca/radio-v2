package  ma.enova.radio.dao.specification.core;




import ma.enova.radio.zynerator.specification.AbstractSpecification;
import ma.enova.radio.dao.criteria.core.PersonnelCriteria;
import ma.enova.radio.bean.core.Personnel;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class PersonnelSpecification extends AbstractSpecification<PersonnelCriteria, Personnel> {

    @Override
    public Predicate toPredicate(Root<Personnel> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
        List<Predicate> predicates = new ArrayList<>();
            attachSearchElement(root, query, builder, predicates);
            if (criteria != null) {
                addPredicateId("id", criteria);
                addPredicate("ipp", criteria.getIpp(),criteria.getIppLike());
                addPredicate("nom", criteria.getNom(),criteria.getNomLike());
                addPredicate("prenom", criteria.getPrenom(),criteria.getPrenomLike());
                addPredicate("cin", criteria.getCin(),criteria.getCinLike());
                addPredicate("telephone", criteria.getTelephone(),criteria.getTelephoneLike());
                addPredicate("email", criteria.getEmail(),criteria.getEmailLike());
                addPredicate("mobile", criteria.getMobile(),criteria.getMobileLike());
                addPredicateBool("expertise", criteria.getExpertise());
                addOrderAndFilter();
          }
        return getResult();
    }


    public PersonnelSpecification(PersonnelCriteria criteria) {
        super(criteria);
    }

    public PersonnelSpecification(PersonnelCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }



    }
