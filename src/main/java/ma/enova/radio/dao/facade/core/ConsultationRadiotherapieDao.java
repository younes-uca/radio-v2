package ma.enova.radio.dao.facade.core;


import ma.enova.radio.bean.core.ConsultationRadiotherapie;
import ma.enova.radio.zynerator.repository.AbstractRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ConsultationRadiotherapieDao extends AbstractRepository<ConsultationRadiotherapie,Long> {

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
