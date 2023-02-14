package  ma.enova.radio.dao.specification.history;

import ma.enova.radio.zynerator.specification.AbstractHistorySpecification;
import ma.enova.radio.dao.criteria.history.TypeConsultationRadiotherapieHistoryCriteria;
import ma.enova.radio.bean.history.TypeConsultationRadiotherapieHistory;


public class TypeConsultationRadiotherapieHistorySpecification extends AbstractHistorySpecification<TypeConsultationRadiotherapieHistoryCriteria, TypeConsultationRadiotherapieHistory> {

    public TypeConsultationRadiotherapieHistorySpecification(TypeConsultationRadiotherapieHistoryCriteria criteria) {
        super(criteria);
    }

    public TypeConsultationRadiotherapieHistorySpecification(TypeConsultationRadiotherapieHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
