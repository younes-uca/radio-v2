package ma.enova.radio.dao.facade.history;

import ma.enova.radio.bean.history.ConsultationRadiotherapieHistory;
import ma.enova.radio.zynerator.repository.AbstractHistoryRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultationRadiotherapieHistoryDao extends AbstractHistoryRepository<ConsultationRadiotherapieHistory,Long> {

}
