package ma.enova.radio.service.facade.admin;

import java.util.List;
import ma.enova.radio.bean.core.TypeTraitement;
import ma.enova.radio.ws.dto.TypeTraitementDto;
import ma.enova.radio.zynerator.service.IService;
import ma.enova.radio.dao.criteria.core.TypeTraitementCriteria;
import ma.enova.radio.dao.criteria.history.TypeTraitementHistoryCriteria;


public interface TypeTraitementAdminService extends IService<TypeTraitement, TypeTraitementDto,TypeTraitementCriteria, TypeTraitementHistoryCriteria> {




}
