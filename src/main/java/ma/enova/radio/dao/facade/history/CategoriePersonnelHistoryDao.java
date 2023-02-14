package ma.enova.radio.dao.facade.history;

import ma.enova.radio.zynerator.repository.AbstractHistoryRepository;
import ma.enova.radio.bean.history.CategoriePersonnelHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriePersonnelHistoryDao extends AbstractHistoryRepository<CategoriePersonnelHistory,Long> {

}
