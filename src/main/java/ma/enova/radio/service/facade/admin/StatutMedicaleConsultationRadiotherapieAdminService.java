package ma.enova.radio.service.facade.admin;

import ma.enova.radio.bean.core.StatutMedicaleConsultationRadiotherapie;
import ma.enova.radio.dao.criteria.core.StatutMedicaleConsultationRadiotherapieCriteria;
import ma.enova.radio.dao.criteria.history.StatutMedicaleConsultationRadiotherapieHistoryCriteria;
import ma.enova.radio.ws.dto.StatutMedicaleConsultationRadiotherapieDto;
import ma.enova.radio.zynerator.service.IService;

import java.util.List;


public interface StatutMedicaleConsultationRadiotherapieAdminService extends IService<StatutMedicaleConsultationRadiotherapie, StatutMedicaleConsultationRadiotherapieDto,StatutMedicaleConsultationRadiotherapieCriteria, StatutMedicaleConsultationRadiotherapieHistoryCriteria> {

    List<StatutMedicaleConsultationRadiotherapie> findByServicesId(Long id);
    int deleteByServicesId(Long id);
    Long getNextOrdre();



}
