package ma.enova.radio.service.facade.admin;

import ma.enova.radio.bean.core.DecisionTraitement;
import ma.enova.radio.dao.criteria.core.DecisionTraitementCriteria;
import ma.enova.radio.dao.criteria.history.DecisionTraitementHistoryCriteria;
import ma.enova.radio.ws.dto.DecisionTraitementDto;
import ma.enova.radio.zynerator.service.IService;


public interface DecisionTraitementAdminService extends IService<DecisionTraitement, DecisionTraitementDto, DecisionTraitementCriteria, DecisionTraitementHistoryCriteria> {


}
