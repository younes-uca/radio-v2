package  ma.enova.radio.dao.specification.history;

import ma.enova.radio.zynerator.specification.AbstractHistorySpecification;
import ma.enova.radio.dao.criteria.history.TypeTraitementHistoryCriteria;
import ma.enova.radio.bean.history.TypeTraitementHistory;


public class TypeTraitementHistorySpecification extends AbstractHistorySpecification<TypeTraitementHistoryCriteria, TypeTraitementHistory> {

    public TypeTraitementHistorySpecification(TypeTraitementHistoryCriteria criteria) {
        super(criteria);
    }

    public TypeTraitementHistorySpecification(TypeTraitementHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
