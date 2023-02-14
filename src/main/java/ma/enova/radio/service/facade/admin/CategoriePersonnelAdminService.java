package ma.enova.radio.service.facade.admin;

import java.util.List;
import ma.enova.radio.bean.core.CategoriePersonnel;
import ma.enova.radio.ws.dto.CategoriePersonnelDto;
import ma.enova.radio.zynerator.service.IService;
import ma.enova.radio.dao.criteria.core.CategoriePersonnelCriteria;
import ma.enova.radio.dao.criteria.history.CategoriePersonnelHistoryCriteria;


public interface CategoriePersonnelAdminService extends IService<CategoriePersonnel, CategoriePersonnelDto,CategoriePersonnelCriteria, CategoriePersonnelHistoryCriteria> {

    List<CategoriePersonnel> findByServicesId(Long id);
    int deleteByServicesId(Long id);
    Long getNextOrdre();



}
