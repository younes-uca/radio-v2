package ma.enova.radio.dao.facade.history;

import ma.enova.radio.zynerator.repository.AbstractHistoryRepository;
import ma.enova.radio.bean.history.SeanceRadiotherapieHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface SeanceRadiotherapieHistoryDao extends AbstractHistoryRepository<SeanceRadiotherapieHistory,Long> {

}
