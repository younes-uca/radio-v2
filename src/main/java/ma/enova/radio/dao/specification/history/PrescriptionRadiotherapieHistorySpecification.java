package  ma.enova.radio.dao.specification.history;

import ma.enova.radio.zynerator.specification.AbstractHistorySpecification;
import ma.enova.radio.dao.criteria.history.PrescriptionRadiotherapieHistoryCriteria;
import ma.enova.radio.bean.history.PrescriptionRadiotherapieHistory;


public class PrescriptionRadiotherapieHistorySpecification extends AbstractHistorySpecification<PrescriptionRadiotherapieHistoryCriteria, PrescriptionRadiotherapieHistory> {

    public PrescriptionRadiotherapieHistorySpecification(PrescriptionRadiotherapieHistoryCriteria criteria) {
        super(criteria);
    }

    public PrescriptionRadiotherapieHistorySpecification(PrescriptionRadiotherapieHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
