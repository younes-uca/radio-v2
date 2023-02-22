package ma.enova.radio.service.facade.admin;

import ma.enova.radio.bean.core.ProtocoleInclusionStatut;
import ma.enova.radio.dao.criteria.core.ProtocoleInclusionStatutCriteria;
import ma.enova.radio.dao.criteria.history.ProtocoleInclusionStatutHistoryCriteria;
import ma.enova.radio.ws.dto.ProtocoleInclusionStatutDto;
import ma.enova.radio.zynerator.service.IService;

import java.util.List;


public interface ProtocoleInclusionStatutAdminService extends IService<ProtocoleInclusionStatut, ProtocoleInclusionStatutDto,ProtocoleInclusionStatutCriteria, ProtocoleInclusionStatutHistoryCriteria> {

    List<ProtocoleInclusionStatut> findByServicesId(Long id);
    int deleteByServicesId(Long id);
    Long getNextOrdre();



}
