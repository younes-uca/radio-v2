package ma.enova.radio.dao.facade.history;

import ma.enova.radio.zynerator.repository.AbstractHistoryRepository;
import ma.enova.radio.bean.history.StatutRadiotherapieHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface StatutRadiotherapieHistoryDao extends AbstractHistoryRepository<StatutRadiotherapieHistory,Long> {

}
