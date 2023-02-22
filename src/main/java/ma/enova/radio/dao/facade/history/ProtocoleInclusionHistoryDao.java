package ma.enova.radio.dao.facade.history;

import ma.enova.radio.bean.history.ProtocoleInclusionHistory;
import ma.enova.radio.zynerator.repository.AbstractHistoryRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProtocoleInclusionHistoryDao extends AbstractHistoryRepository<ProtocoleInclusionHistory,Long> {

}
