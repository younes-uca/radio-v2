package  ma.enova.radio.dao.specification.history;

import ma.enova.radio.zynerator.specification.AbstractHistorySpecification;
import ma.enova.radio.dao.criteria.history.ImmobilistionHistoryCriteria;
import ma.enova.radio.bean.history.ImmobilistionHistory;


public class ImmobilistionHistorySpecification extends AbstractHistorySpecification<ImmobilistionHistoryCriteria, ImmobilistionHistory> {

    public ImmobilistionHistorySpecification(ImmobilistionHistoryCriteria criteria) {
        super(criteria);
    }

    public ImmobilistionHistorySpecification(ImmobilistionHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
