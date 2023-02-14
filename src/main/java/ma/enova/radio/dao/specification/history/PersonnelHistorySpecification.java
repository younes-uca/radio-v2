package  ma.enova.radio.dao.specification.history;

import ma.enova.radio.zynerator.specification.AbstractHistorySpecification;
import ma.enova.radio.dao.criteria.history.PersonnelHistoryCriteria;
import ma.enova.radio.bean.history.PersonnelHistory;


public class PersonnelHistorySpecification extends AbstractHistorySpecification<PersonnelHistoryCriteria, PersonnelHistory> {

    public PersonnelHistorySpecification(PersonnelHistoryCriteria criteria) {
        super(criteria);
    }

    public PersonnelHistorySpecification(PersonnelHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
