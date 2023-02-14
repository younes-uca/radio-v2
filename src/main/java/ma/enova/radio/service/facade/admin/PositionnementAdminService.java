package ma.enova.radio.service.facade.admin;

import java.util.List;
import ma.enova.radio.bean.core.Positionnement;
import ma.enova.radio.ws.dto.PositionnementDto;
import ma.enova.radio.zynerator.service.IService;
import ma.enova.radio.dao.criteria.core.PositionnementCriteria;
import ma.enova.radio.dao.criteria.history.PositionnementHistoryCriteria;


public interface PositionnementAdminService extends IService<Positionnement, PositionnementDto,PositionnementCriteria, PositionnementHistoryCriteria> {

    List<Positionnement> findByServicesId(Long id);
    int deleteByServicesId(Long id);
    Long getNextOrdre();



}
