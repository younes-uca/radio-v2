package  ma.enova.radio.dao.specification.history;

import ma.enova.radio.zynerator.specification.AbstractHistorySpecification;
import ma.enova.radio.dao.criteria.history.StatutRadiotherapieHistoryCriteria;
import ma.enova.radio.bean.history.StatutRadiotherapieHistory;


public class StatutRadiotherapieHistorySpecification extends AbstractHistorySpecification<StatutRadiotherapieHistoryCriteria, StatutRadiotherapieHistory> {

    public StatutRadiotherapieHistorySpecification(StatutRadiotherapieHistoryCriteria criteria) {
        super(criteria);
    }

    public StatutRadiotherapieHistorySpecification(StatutRadiotherapieHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
