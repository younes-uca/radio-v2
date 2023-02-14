package  ma.enova.radio.dao.specification.history;

import ma.enova.radio.zynerator.specification.AbstractHistorySpecification;
import ma.enova.radio.dao.criteria.history.TypeToxiciteRthHistoryCriteria;
import ma.enova.radio.bean.history.TypeToxiciteRthHistory;


public class TypeToxiciteRthHistorySpecification extends AbstractHistorySpecification<TypeToxiciteRthHistoryCriteria, TypeToxiciteRthHistory> {

    public TypeToxiciteRthHistorySpecification(TypeToxiciteRthHistoryCriteria criteria) {
        super(criteria);
    }

    public TypeToxiciteRthHistorySpecification(TypeToxiciteRthHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
