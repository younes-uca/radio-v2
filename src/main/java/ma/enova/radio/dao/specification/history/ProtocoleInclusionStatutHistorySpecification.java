package ma.enova.radio.dao.specification.history;

import ma.enova.radio.bean.history.ProtocoleInclusionStatutHistory;
import ma.enova.radio.dao.criteria.history.ProtocoleInclusionStatutHistoryCriteria;
import ma.enova.radio.zynerator.specification.AbstractHistorySpecification;


public class ProtocoleInclusionStatutHistorySpecification extends AbstractHistorySpecification<ProtocoleInclusionStatutHistoryCriteria, ProtocoleInclusionStatutHistory> {

    public ProtocoleInclusionStatutHistorySpecification(ProtocoleInclusionStatutHistoryCriteria criteria) {
        super(criteria);
    }

    public ProtocoleInclusionStatutHistorySpecification(ProtocoleInclusionStatutHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
