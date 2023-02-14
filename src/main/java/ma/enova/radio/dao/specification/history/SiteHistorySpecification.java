package  ma.enova.radio.dao.specification.history;

import ma.enova.radio.zynerator.specification.AbstractHistorySpecification;
import ma.enova.radio.dao.criteria.history.SiteHistoryCriteria;
import ma.enova.radio.bean.history.SiteHistory;


public class SiteHistorySpecification extends AbstractHistorySpecification<SiteHistoryCriteria, SiteHistory> {

    public SiteHistorySpecification(SiteHistoryCriteria criteria) {
        super(criteria);
    }

    public SiteHistorySpecification(SiteHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
