package ma.enova.radio.service.facade.admin;

import java.util.List;
import ma.enova.radio.bean.core.Personnel;
import ma.enova.radio.ws.dto.PersonnelDto;
import ma.enova.radio.zynerator.service.IService;
import ma.enova.radio.dao.criteria.core.PersonnelCriteria;
import ma.enova.radio.dao.criteria.history.PersonnelHistoryCriteria;


public interface PersonnelAdminService extends IService<Personnel, PersonnelDto,PersonnelCriteria, PersonnelHistoryCriteria> {
/*
    List<Personnel> findByCategoriePersonnelId(Long id);
    int deleteByCategoriePersonnelId(Long id);
    List<Personnel> findBySpecialiteId(Long id);
    int deleteBySpecialiteId(Long id);*/
    Long getNextOrdre();



}
