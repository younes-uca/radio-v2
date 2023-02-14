package ma.enova.radio.dao.facade.history;

import ma.enova.radio.zynerator.repository.AbstractHistoryRepository;
import ma.enova.radio.bean.history.TypeConsultationRadiotherapieHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeConsultationRadiotherapieHistoryDao extends AbstractHistoryRepository<TypeConsultationRadiotherapieHistory,Long> {

}
