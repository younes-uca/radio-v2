package  ma.enova.radio.dao.specification.history;

import ma.enova.radio.zynerator.specification.AbstractHistorySpecification;
import ma.enova.radio.dao.criteria.history.FrequenceRadiotherapieHistoryCriteria;
import ma.enova.radio.bean.history.FrequenceRadiotherapieHistory;


public class FrequenceRadiotherapieHistorySpecification extends AbstractHistorySpecification<FrequenceRadiotherapieHistoryCriteria, FrequenceRadiotherapieHistory> {

    public FrequenceRadiotherapieHistorySpecification(FrequenceRadiotherapieHistoryCriteria criteria) {
        super(criteria);
    }

    public FrequenceRadiotherapieHistorySpecification(FrequenceRadiotherapieHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
