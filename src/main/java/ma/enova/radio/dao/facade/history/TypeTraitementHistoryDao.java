package ma.enova.radio.dao.facade.history;

import ma.enova.radio.zynerator.repository.AbstractHistoryRepository;
import ma.enova.radio.bean.history.TypeTraitementHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeTraitementHistoryDao extends AbstractHistoryRepository<TypeTraitementHistory,Long> {

}
