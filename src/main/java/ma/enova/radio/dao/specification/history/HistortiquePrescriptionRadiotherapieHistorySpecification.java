package  ma.enova.radio.dao.specification.history;

import ma.enova.radio.zynerator.specification.AbstractHistorySpecification;
import ma.enova.radio.dao.criteria.history.HistortiquePrescriptionRadiotherapieHistoryCriteria;
import ma.enova.radio.bean.history.HistortiquePrescriptionRadiotherapieHistory;


public class HistortiquePrescriptionRadiotherapieHistorySpecification extends AbstractHistorySpecification<HistortiquePrescriptionRadiotherapieHistoryCriteria, HistortiquePrescriptionRadiotherapieHistory> {

    public HistortiquePrescriptionRadiotherapieHistorySpecification(HistortiquePrescriptionRadiotherapieHistoryCriteria criteria) {
        super(criteria);
    }

    public HistortiquePrescriptionRadiotherapieHistorySpecification(HistortiquePrescriptionRadiotherapieHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
