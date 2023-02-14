package ma.enova.radio.service.facade.admin;

import java.util.List;
import ma.enova.radio.bean.core.ProtocoleInclusion;
import ma.enova.radio.ws.dto.ProtocoleInclusionDto;
import ma.enova.radio.zynerator.service.IService;
import ma.enova.radio.dao.criteria.core.ProtocoleInclusionCriteria;
import ma.enova.radio.dao.criteria.history.ProtocoleInclusionHistoryCriteria;


public interface ProtocoleInclusionAdminService extends IService<ProtocoleInclusion, ProtocoleInclusionDto,ProtocoleInclusionCriteria, ProtocoleInclusionHistoryCriteria> {

    List<ProtocoleInclusion> findByServicesId(Long id);
    int deleteByServicesId(Long id);
    Long getNextOrdre();



}
