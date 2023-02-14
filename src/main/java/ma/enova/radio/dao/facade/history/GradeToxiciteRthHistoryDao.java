package ma.enova.radio.dao.facade.history;

import ma.enova.radio.zynerator.repository.AbstractHistoryRepository;
import ma.enova.radio.bean.history.GradeToxiciteRthHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface GradeToxiciteRthHistoryDao extends AbstractHistoryRepository<GradeToxiciteRthHistory,Long> {

}
