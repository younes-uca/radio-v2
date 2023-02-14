package  ma.enova.radio.dao.specification.history;

import ma.enova.radio.zynerator.specification.AbstractHistorySpecification;
import ma.enova.radio.dao.criteria.history.SeanceRadiotherapieHistoryCriteria;
import ma.enova.radio.bean.history.SeanceRadiotherapieHistory;


public class SeanceRadiotherapieHistorySpecification extends AbstractHistorySpecification<SeanceRadiotherapieHistoryCriteria, SeanceRadiotherapieHistory> {

    public SeanceRadiotherapieHistorySpecification(SeanceRadiotherapieHistoryCriteria criteria) {
        super(criteria);
    }

    public SeanceRadiotherapieHistorySpecification(SeanceRadiotherapieHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
