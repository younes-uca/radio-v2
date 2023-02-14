package ma.enova.radio.dao.facade.history;

import ma.enova.radio.zynerator.repository.AbstractHistoryRepository;
import ma.enova.radio.bean.history.PatientHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientHistoryDao extends AbstractHistoryRepository<PatientHistory,Long> {

}
