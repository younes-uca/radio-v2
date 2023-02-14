package ma.enova.radio.service.facade.admin;

import java.util.List;
import ma.enova.radio.bean.core.Immobilistion;
import ma.enova.radio.ws.dto.ImmobilistionDto;
import ma.enova.radio.zynerator.service.IService;
import ma.enova.radio.dao.criteria.core.ImmobilistionCriteria;
import ma.enova.radio.dao.criteria.history.ImmobilistionHistoryCriteria;


public interface ImmobilistionAdminService extends IService<Immobilistion, ImmobilistionDto,ImmobilistionCriteria, ImmobilistionHistoryCriteria> {

    List<Immobilistion> findByServicesId(Long id);
    int deleteByServicesId(Long id);
    Long getNextOrdre();



}
