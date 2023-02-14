package  ma.enova.radio.dao.specification.history;

import ma.enova.radio.zynerator.specification.AbstractHistorySpecification;
import ma.enova.radio.dao.criteria.history.ConsultationRadiotherapieHistoryCriteria;
import ma.enova.radio.bean.history.ConsultationRadiotherapieHistory;


public class ConsultationRadiotherapieHistorySpecification extends AbstractHistorySpecification<ConsultationRadiotherapieHistoryCriteria, ConsultationRadiotherapieHistory> {

    public ConsultationRadiotherapieHistorySpecification(ConsultationRadiotherapieHistoryCriteria criteria) {
        super(criteria);
    }

    public ConsultationRadiotherapieHistorySpecification(ConsultationRadiotherapieHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
