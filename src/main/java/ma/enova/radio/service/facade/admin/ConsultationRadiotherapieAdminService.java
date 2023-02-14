package ma.enova.radio.service.facade.admin;

import java.util.List;
import ma.enova.radio.bean.core.ConsultationRadiotherapie;
import ma.enova.radio.ws.dto.ConsultationRadiotherapieDto;
import ma.enova.radio.zynerator.service.IService;
import ma.enova.radio.dao.criteria.core.ConsultationRadiotherapieCriteria;
import ma.enova.radio.dao.criteria.history.ConsultationRadiotherapieHistoryCriteria;


public interface ConsultationRadiotherapieAdminService extends IService<ConsultationRadiotherapie, ConsultationRadiotherapieDto,ConsultationRadiotherapieCriteria, ConsultationRadiotherapieHistoryCriteria> {

    List<ConsultationRadiotherapie> findByMedecinId(Long id);
    int deleteByMedecinId(Long id);
    List<ConsultationRadiotherapie> findByTypeConsultationRadiotherapieId(Long id);
    int deleteByTypeConsultationRadiotherapieId(Long id);
    List<ConsultationRadiotherapie> findByTypeToxiciteRthId(Long id);
    int deleteByTypeToxiciteRthId(Long id);
    List<ConsultationRadiotherapie> findByGradeToxiciteRthId(Long id);
    int deleteByGradeToxiciteRthId(Long id);
    List<ConsultationRadiotherapie> findByPrescriptionRadiotherapieId(Long id);
    int deleteByPrescriptionRadiotherapieId(Long id);



}
