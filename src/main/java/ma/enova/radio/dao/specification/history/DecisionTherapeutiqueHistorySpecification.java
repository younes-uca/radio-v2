package ma.enova.radio.dao.specification.history;

import ma.enova.radio.bean.history.DecisionTherapeutiqueHistory;
import ma.enova.radio.dao.criteria.history.DecisionTherapeutiqueHistoryCriteria;
import ma.enova.radio.zynerator.specification.AbstractHistorySpecification;


public class DecisionTherapeutiqueHistorySpecification extends AbstractHistorySpecification<DecisionTherapeutiqueHistoryCriteria, DecisionTherapeutiqueHistory> {

    public DecisionTherapeutiqueHistorySpecification(DecisionTherapeutiqueHistoryCriteria criteria) {
        super(criteria);
    }

    public DecisionTherapeutiqueHistorySpecification(DecisionTherapeutiqueHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
