package  ma.enova.radio.dao.specification.core;




import ma.enova.radio.zynerator.specification.AbstractSpecification;
import ma.enova.radio.dao.criteria.core.SeanceRadiotherapieCriteria;
import ma.enova.radio.bean.core.SeanceRadiotherapie;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class SeanceRadiotherapieSpecification extends AbstractSpecification<SeanceRadiotherapieCriteria, SeanceRadiotherapie> {

    @Override
    public Predicate toPredicate(Root<SeanceRadiotherapie> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
        List<Predicate> predicates = new ArrayList<>();
            attachSearchElement(root, query, builder, predicates);
            if (criteria != null) {
                addPredicateId("id", criteria);
                addPredicate("codeRdv", criteria.getCodeRdv(),criteria.getCodeRdvLike());
                addPredicate("datePrevu", criteria.getDatePrevu(), criteria.getDatePrevuFrom(), criteria.getDatePrevuTo());
                addPredicate("dateRealisation", criteria.getDateRealisation(), criteria.getDateRealisationFrom(), criteria.getDateRealisationTo());
                 addPredicateInt("numero", criteria.getNumero());
                 addPredicateInt("numero", criteria.getNumeroMin(), criteria.getNumeroMax());
                addPredicateBool("effectue", criteria.getEffectue());
                addPredicate("cr", criteria.getCr(),criteria.getCrLike());
                addPredicate("fichiers", criteria.getFichiers(),criteria.getFichiersLike());
                addOrderAndFilter();
          }
        return getResult();
    }


    public SeanceRadiotherapieSpecification(SeanceRadiotherapieCriteria criteria) {
        super(criteria);
    }

    public SeanceRadiotherapieSpecification(SeanceRadiotherapieCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }



    }
