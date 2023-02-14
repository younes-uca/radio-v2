package ma.enova.radio.service.facade.admin;

import java.util.List;
import ma.enova.radio.bean.core.Specialite;
import ma.enova.radio.ws.dto.SpecialiteDto;
import ma.enova.radio.zynerator.service.IService;
import ma.enova.radio.dao.criteria.core.SpecialiteCriteria;
import ma.enova.radio.dao.criteria.history.SpecialiteHistoryCriteria;


public interface SpecialiteAdminService extends IService<Specialite, SpecialiteDto,SpecialiteCriteria, SpecialiteHistoryCriteria> {

    List<Specialite> findByServicesId(Long id);
    int deleteByServicesId(Long id);
    Long getNextOrdre();



}
