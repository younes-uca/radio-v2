package  ma.enova.radio.dao.specification.history;

import ma.enova.radio.zynerator.specification.AbstractHistorySpecification;
import ma.enova.radio.dao.criteria.history.ModaliteRadiotherapieHistoryCriteria;
import ma.enova.radio.bean.history.ModaliteRadiotherapieHistory;


public class ModaliteRadiotherapieHistorySpecification extends AbstractHistorySpecification<ModaliteRadiotherapieHistoryCriteria, ModaliteRadiotherapieHistory> {

    public ModaliteRadiotherapieHistorySpecification(ModaliteRadiotherapieHistoryCriteria criteria) {
        super(criteria);
    }

    public ModaliteRadiotherapieHistorySpecification(ModaliteRadiotherapieHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
