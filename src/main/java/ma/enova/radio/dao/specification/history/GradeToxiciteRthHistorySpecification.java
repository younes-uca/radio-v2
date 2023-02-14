package  ma.enova.radio.dao.specification.history;

import ma.enova.radio.zynerator.specification.AbstractHistorySpecification;
import ma.enova.radio.dao.criteria.history.GradeToxiciteRthHistoryCriteria;
import ma.enova.radio.bean.history.GradeToxiciteRthHistory;


public class GradeToxiciteRthHistorySpecification extends AbstractHistorySpecification<GradeToxiciteRthHistoryCriteria, GradeToxiciteRthHistory> {

    public GradeToxiciteRthHistorySpecification(GradeToxiciteRthHistoryCriteria criteria) {
        super(criteria);
    }

    public GradeToxiciteRthHistorySpecification(GradeToxiciteRthHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
