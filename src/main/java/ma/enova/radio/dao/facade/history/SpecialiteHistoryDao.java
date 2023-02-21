package ma.enova.radio.dao.facade.history;

import ma.enova.radio.bean.history.SpecialiteHistory;
import ma.enova.radio.zynerator.repository.AbstractHistoryRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecialiteHistoryDao extends AbstractHistoryRepository<SpecialiteHistory,Long> {

}
