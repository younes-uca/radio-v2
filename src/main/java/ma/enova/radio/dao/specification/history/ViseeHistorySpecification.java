package  ma.enova.radio.dao.specification.history;

import ma.enova.radio.zynerator.specification.AbstractHistorySpecification;
import ma.enova.radio.dao.criteria.history.ViseeHistoryCriteria;
import ma.enova.radio.bean.history.ViseeHistory;


public class ViseeHistorySpecification extends AbstractHistorySpecification<ViseeHistoryCriteria, ViseeHistory> {

    public ViseeHistorySpecification(ViseeHistoryCriteria criteria) {
        super(criteria);
    }

    public ViseeHistorySpecification(ViseeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
