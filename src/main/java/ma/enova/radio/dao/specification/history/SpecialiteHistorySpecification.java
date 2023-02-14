package  ma.enova.radio.dao.specification.history;

import ma.enova.radio.zynerator.specification.AbstractHistorySpecification;
import ma.enova.radio.dao.criteria.history.SpecialiteHistoryCriteria;
import ma.enova.radio.bean.history.SpecialiteHistory;


public class SpecialiteHistorySpecification extends AbstractHistorySpecification<SpecialiteHistoryCriteria, SpecialiteHistory> {

    public SpecialiteHistorySpecification(SpecialiteHistoryCriteria criteria) {
        super(criteria);
    }

    public SpecialiteHistorySpecification(SpecialiteHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
