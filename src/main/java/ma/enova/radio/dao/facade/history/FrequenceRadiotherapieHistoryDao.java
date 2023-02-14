package ma.enova.radio.dao.facade.history;

import ma.enova.radio.zynerator.repository.AbstractHistoryRepository;
import ma.enova.radio.bean.history.FrequenceRadiotherapieHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface FrequenceRadiotherapieHistoryDao extends AbstractHistoryRepository<FrequenceRadiotherapieHistory,Long> {

}
