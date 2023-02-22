package ma.enova.radio.service.facade.admin;

import ma.enova.radio.bean.core.ProtocoleInclusion;
import ma.enova.radio.dao.criteria.core.ProtocoleInclusionCriteria;
import ma.enova.radio.dao.criteria.history.ProtocoleInclusionHistoryCriteria;
import ma.enova.radio.ws.dto.ProtocoleInclusionDto;
import ma.enova.radio.zynerator.service.IService;

import java.util.List;


public interface ProtocoleInclusionAdminService extends IService<ProtocoleInclusion, ProtocoleInclusionDto,ProtocoleInclusionCriteria, ProtocoleInclusionHistoryCriteria> {

    List<ProtocoleInclusion> findByProtocoleInclusionStatutId(Long id);
    int deleteByProtocoleInclusionStatutId(Long id);
    List<ProtocoleInclusion> findByServicesId(Long id);
    int deleteByServicesId(Long id);
    Long getNextOrdre();



}
