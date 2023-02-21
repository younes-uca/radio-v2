package ma.enova.radio.dao.facade.history;

import ma.enova.radio.bean.history.StatutMedicaleConsultationRadiotherapieHistory;
import ma.enova.radio.zynerator.repository.AbstractHistoryRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatutMedicaleConsultationRadiotherapieHistoryDao extends AbstractHistoryRepository<StatutMedicaleConsultationRadiotherapieHistory,Long> {

}
