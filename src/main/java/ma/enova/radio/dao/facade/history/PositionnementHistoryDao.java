package ma.enova.radio.dao.facade.history;

import ma.enova.radio.zynerator.repository.AbstractHistoryRepository;
import ma.enova.radio.bean.history.PositionnementHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface PositionnementHistoryDao extends AbstractHistoryRepository<PositionnementHistory,Long> {

}
