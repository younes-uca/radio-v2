package ma.enova.radio.service.facade.admin;

import ma.enova.radio.bean.core.DecisionTherapeutique;
import ma.enova.radio.dao.criteria.core.DecisionTherapeutiqueCriteria;
import ma.enova.radio.dao.criteria.history.DecisionTherapeutiqueHistoryCriteria;
import ma.enova.radio.ws.dto.DecisionTherapeutiqueDto;
import ma.enova.radio.zynerator.service.IService;

import java.util.List;


public interface DecisionTherapeutiqueAdminService extends IService<DecisionTherapeutique, DecisionTherapeutiqueDto,DecisionTherapeutiqueCriteria, DecisionTherapeutiqueHistoryCriteria> {

    List<DecisionTherapeutique> findByServicesId(Long id);
    int deleteByServicesId(Long id);
    Long getNextOrdre();



}
