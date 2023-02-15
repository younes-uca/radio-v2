package ma.enova.radio.service.facade.admin;

import ma.enova.radio.bean.core.HistortiquePrescriptionRadiotherapie;
import ma.enova.radio.bean.core.StatutRadiotherapie;
import ma.enova.radio.dao.criteria.core.HistortiquePrescriptionRadiotherapieCriteria;
import ma.enova.radio.dao.criteria.history.HistortiquePrescriptionRadiotherapieHistoryCriteria;
import ma.enova.radio.ws.dto.HistortiquePrescriptionRadiotherapieDto;
import ma.enova.radio.zynerator.service.IService;

import java.util.List;


public interface HistortiquePrescriptionRadiotherapieAdminService extends IService<HistortiquePrescriptionRadiotherapie, HistortiquePrescriptionRadiotherapieDto, HistortiquePrescriptionRadiotherapieCriteria, HistortiquePrescriptionRadiotherapieHistoryCriteria> {

    List<HistortiquePrescriptionRadiotherapie> findByPrescriptionRadiotherapieId(Long id);

    int deleteByPrescriptionRadiotherapieId(Long id);

    List<HistortiquePrescriptionRadiotherapie> findByStatutRadiotherapieCode(String code);

    int deleteByStatutRadiotherapieCode(String code);

    int createFromPrescription(Long prescriptionRadiotherapieId, StatutRadiotherapie statutRadiotherapie);
}
