package  ma.enova.radio.dao.specification.history;

import ma.enova.radio.zynerator.specification.AbstractHistorySpecification;
import ma.enova.radio.dao.criteria.history.ProtocoleInclusionHistoryCriteria;
import ma.enova.radio.bean.history.ProtocoleInclusionHistory;


public class ProtocoleInclusionHistorySpecification extends AbstractHistorySpecification<ProtocoleInclusionHistoryCriteria, ProtocoleInclusionHistory> {

    public ProtocoleInclusionHistorySpecification(ProtocoleInclusionHistoryCriteria criteria) {
        super(criteria);
    }

    public ProtocoleInclusionHistorySpecification(ProtocoleInclusionHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
