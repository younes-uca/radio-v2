package ma.enova.radio.dao.facade.history;

import ma.enova.radio.zynerator.repository.AbstractHistoryRepository;
import ma.enova.radio.bean.history.ServicesHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicesHistoryDao extends AbstractHistoryRepository<ServicesHistory,Long> {

}
