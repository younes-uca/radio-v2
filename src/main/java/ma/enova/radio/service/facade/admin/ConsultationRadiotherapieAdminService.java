package ma.enova.radio.service.facade.admin;

import ma.enova.radio.bean.core.ConsultationRadiotherapie;
import ma.enova.radio.dao.criteria.core.ConsultationRadiotherapieCriteria;
import ma.enova.radio.dao.criteria.history.ConsultationRadiotherapieHistoryCriteria;
import ma.enova.radio.ws.dto.ConsultationRadiotherapieDto;
import ma.enova.radio.zynerator.service.IService;

import java.util.List;


public interface ConsultationRadiotherapieAdminService extends IService<ConsultationRadiotherapie, ConsultationRadiotherapieDto,ConsultationRadiotherapieCriteria, ConsultationRadiotherapieHistoryCriteria> {

    List<ConsultationRadiotherapie> findByMedecinId(Long id);
    int deleteByMedecinId(Long id);
    List<ConsultationRadiotherapie> findBySpecialiteId(Long id);
    int deleteBySpecialiteId(Long id);
    List<ConsultationRadiotherapie> findByTypeConsultationRadiotherapieId(Long id);
    int deleteByTypeConsultationRadiotherapieId(Long id);
    List<ConsultationRadiotherapie> findByTypeToxiciteRthId(Long id);
    int deleteByTypeToxiciteRthId(Long id);
    List<ConsultationRadiotherapie> findByGradeToxiciteRthId(Long id);
    int deleteByGradeToxiciteRthId(Long id);
    List<ConsultationRadiotherapie> findByClassificationOmsId(Long id);
    int deleteByClassificationOmsId(Long id);
    List<ConsultationRadiotherapie> findByStatutMedicaleConsultationRadiotherapieId(Long id);
    int deleteByStatutMedicaleConsultationRadiotherapieId(Long id);
    List<ConsultationRadiotherapie> findByPrescriptionRadiotherapieId(Long id);
    int deleteByPrescriptionRadiotherapieId(Long id);



}
