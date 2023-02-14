package  ma.enova.radio.dao.specification.history;

import ma.enova.radio.zynerator.specification.AbstractHistorySpecification;
import ma.enova.radio.dao.criteria.history.CategoriePersonnelHistoryCriteria;
import ma.enova.radio.bean.history.CategoriePersonnelHistory;


public class CategoriePersonnelHistorySpecification extends AbstractHistorySpecification<CategoriePersonnelHistoryCriteria, CategoriePersonnelHistory> {

    public CategoriePersonnelHistorySpecification(CategoriePersonnelHistoryCriteria criteria) {
        super(criteria);
    }

    public CategoriePersonnelHistorySpecification(CategoriePersonnelHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
