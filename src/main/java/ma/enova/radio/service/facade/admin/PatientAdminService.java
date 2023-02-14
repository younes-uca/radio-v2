package ma.enova.radio.service.facade.admin;

import java.util.List;
import ma.enova.radio.bean.core.Patient;
import ma.enova.radio.ws.dto.PatientDto;
import ma.enova.radio.zynerator.service.IService;
import ma.enova.radio.dao.criteria.core.PatientCriteria;
import ma.enova.radio.dao.criteria.history.PatientHistoryCriteria;


public interface PatientAdminService extends IService<Patient, PatientDto,PatientCriteria, PatientHistoryCriteria> {

    Long getNextOrdre();



}
