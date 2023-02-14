package ma.enova.radio.dao.facade.history;

import ma.enova.radio.zynerator.repository.AbstractHistoryRepository;
import ma.enova.radio.bean.history.HistortiquePrescriptionRadiotherapieHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface HistortiquePrescriptionRadiotherapieHistoryDao extends AbstractHistoryRepository<HistortiquePrescriptionRadiotherapieHistory,Long> {

}
