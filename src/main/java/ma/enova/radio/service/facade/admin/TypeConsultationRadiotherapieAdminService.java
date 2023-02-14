package ma.enova.radio.service.facade.admin;

import java.util.List;
import ma.enova.radio.bean.core.TypeConsultationRadiotherapie;
import ma.enova.radio.ws.dto.TypeConsultationRadiotherapieDto;
import ma.enova.radio.zynerator.service.IService;
import ma.enova.radio.dao.criteria.core.TypeConsultationRadiotherapieCriteria;
import ma.enova.radio.dao.criteria.history.TypeConsultationRadiotherapieHistoryCriteria;


public interface TypeConsultationRadiotherapieAdminService extends IService<TypeConsultationRadiotherapie, TypeConsultationRadiotherapieDto,TypeConsultationRadiotherapieCriteria, TypeConsultationRadiotherapieHistoryCriteria> {

    List<TypeConsultationRadiotherapie> findByServicesId(Long id);
    int deleteByServicesId(Long id);
    Long getNextOrdre();



}
