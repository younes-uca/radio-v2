package ma.enova.radio.dao.facade.history;

import ma.enova.radio.bean.history.DecisionTraitementHistory;
import ma.enova.radio.bean.history.ViseeHistory;
import ma.enova.radio.zynerator.repository.AbstractHistoryRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DecisionTraitementHistoryDao extends AbstractHistoryRepository<DecisionTraitementHistory,Long> {

}
