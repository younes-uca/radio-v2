package  ma.enova.radio.dao.specification.history;

import ma.enova.radio.zynerator.specification.AbstractHistorySpecification;
import ma.enova.radio.dao.criteria.history.PositionnementHistoryCriteria;
import ma.enova.radio.bean.history.PositionnementHistory;


public class PositionnementHistorySpecification extends AbstractHistorySpecification<PositionnementHistoryCriteria, PositionnementHistory> {

    public PositionnementHistorySpecification(PositionnementHistoryCriteria criteria) {
        super(criteria);
    }

    public PositionnementHistorySpecification(PositionnementHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
