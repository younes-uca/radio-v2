package ma.enova.radio.dao.facade.history;

import ma.enova.radio.bean.history.ProtocoleInclusionStatutHistory;
import ma.enova.radio.zynerator.repository.AbstractHistoryRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProtocoleInclusionStatutHistoryDao extends AbstractHistoryRepository<ProtocoleInclusionStatutHistory,Long> {

}
