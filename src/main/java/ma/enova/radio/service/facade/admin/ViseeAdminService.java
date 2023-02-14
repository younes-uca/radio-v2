package ma.enova.radio.service.facade.admin;

import java.util.List;
import ma.enova.radio.bean.core.Visee;
import ma.enova.radio.ws.dto.ViseeDto;
import ma.enova.radio.zynerator.service.IService;
import ma.enova.radio.dao.criteria.core.ViseeCriteria;
import ma.enova.radio.dao.criteria.history.ViseeHistoryCriteria;


public interface ViseeAdminService extends IService<Visee, ViseeDto,ViseeCriteria, ViseeHistoryCriteria> {

    List<Visee> findByServicesId(Long id);
    int deleteByServicesId(Long id);
    Long getNextOrdre();



}
