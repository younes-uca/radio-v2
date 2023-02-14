package ma.enova.radio.service.impl.admin;

import ma.enova.radio.bean.core.Patient;
import ma.enova.radio.bean.history.PatientHistory;
import ma.enova.radio.dao.criteria.core.PatientCriteria;
import ma.enova.radio.dao.criteria.history.PatientHistoryCriteria;
import ma.enova.radio.dao.facade.core.PatientDao;
import ma.enova.radio.dao.facade.history.PatientHistoryDao;
import ma.enova.radio.dao.specification.core.PatientSpecification;
import ma.enova.radio.service.facade.admin.PatientAdminService;
import ma.enova.radio.ws.converter.PatientConverter;
import ma.enova.radio.ws.dto.PatientDto;
import ma.enova.radio.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;
import java.util.List;




import java.util.List;

@Service
public class PatientAdminServiceImpl extends AbstractServiceImpl<Patient, PatientDto,PatientHistory, PatientCriteria, PatientHistoryCriteria, PatientDao,
PatientHistoryDao, PatientConverter> implements PatientAdminService {

    public Long getNextOrdre() {
        Long max = dao.findMaxOrdreByEtablissementIdOrder(getEtablissementId());
        return max != null ? max + 1 : 1;
    }

    public Patient findByReferenceEntity(Patient t){
        return  dao.findByIpp(t.getIpp());
    }
    public void findOrSaveAssociatedObject(Patient t){
        if( t != null) {
        }
    }


    public void configure() {
        super.configure(Patient.class, PatientDto.class, PatientHistory.class, PatientHistoryCriteria.class, PatientSpecification.class);
    }

    public PatientAdminServiceImpl(PatientDao dao, PatientHistoryDao historyDao, PatientConverter converter) {
        super(dao, historyDao, converter);
    }

}