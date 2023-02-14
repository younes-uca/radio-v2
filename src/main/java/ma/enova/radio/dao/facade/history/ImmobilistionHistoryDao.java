package ma.enova.radio.dao.facade.history;

import ma.enova.radio.zynerator.repository.AbstractHistoryRepository;
import ma.enova.radio.bean.history.ImmobilistionHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ImmobilistionHistoryDao extends AbstractHistoryRepository<ImmobilistionHistory,Long> {

}
