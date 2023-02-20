package ma.enova.radio.dao.facade.history;

import ma.enova.radio.bean.history.DecisionTherapeutiqueHistory;
import ma.enova.radio.zynerator.repository.AbstractHistoryRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DecisionTherapeutiqueHistoryDao extends AbstractHistoryRepository<DecisionTherapeutiqueHistory,Long> {

}
