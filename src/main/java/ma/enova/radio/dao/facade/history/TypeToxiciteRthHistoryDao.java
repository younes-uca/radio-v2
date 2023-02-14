package ma.enova.radio.dao.facade.history;

import ma.enova.radio.zynerator.repository.AbstractHistoryRepository;
import ma.enova.radio.bean.history.TypeToxiciteRthHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeToxiciteRthHistoryDao extends AbstractHistoryRepository<TypeToxiciteRthHistory,Long> {

}
