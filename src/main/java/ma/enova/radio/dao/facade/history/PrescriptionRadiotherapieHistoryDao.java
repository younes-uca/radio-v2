package ma.enova.radio.dao.facade.history;

import ma.enova.radio.zynerator.repository.AbstractHistoryRepository;
import ma.enova.radio.bean.history.PrescriptionRadiotherapieHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface PrescriptionRadiotherapieHistoryDao extends AbstractHistoryRepository<PrescriptionRadiotherapieHistory,Long> {

}
