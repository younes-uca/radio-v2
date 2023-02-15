package ma.enova.radio.dao.specification.history;

import ma.enova.radio.bean.history.DecisionTraitementHistory;
import ma.enova.radio.dao.criteria.history.DecisionTraitementHistoryCriteria;
import ma.enova.radio.zynerator.specification.AbstractHistorySpecification;


public class DecisionTraitementHistorySpecification extends AbstractHistorySpecification<DecisionTraitementHistoryCriteria, DecisionTraitementHistory> {

    public DecisionTraitementHistorySpecification(DecisionTraitementHistoryCriteria criteria) {
        super(criteria);
    }

    public DecisionTraitementHistorySpecification(DecisionTraitementHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
