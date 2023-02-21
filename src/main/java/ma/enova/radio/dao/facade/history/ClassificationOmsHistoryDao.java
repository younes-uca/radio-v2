package ma.enova.radio.dao.facade.history;

import ma.enova.radio.bean.history.ClassificationOmsHistory;
import ma.enova.radio.zynerator.repository.AbstractHistoryRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassificationOmsHistoryDao extends AbstractHistoryRepository<ClassificationOmsHistory,Long> {

}
