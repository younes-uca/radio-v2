package ma.enova.radio.service.impl.admin;

import ma.enova.radio.bean.core.ProtocoleInclusion;
import ma.enova.radio.bean.history.ProtocoleInclusionHistory;
import ma.enova.radio.dao.criteria.core.ProtocoleInclusionCriteria;
import ma.enova.radio.dao.criteria.history.ProtocoleInclusionHistoryCriteria;
import ma.enova.radio.dao.facade.core.ProtocoleInclusionDao;
import ma.enova.radio.dao.facade.history.ProtocoleInclusionHistoryDao;
import ma.enova.radio.dao.specification.core.ProtocoleInclusionSpecification;
import ma.enova.radio.service.facade.admin.ProtocoleInclusionAdminService;
import ma.enova.radio.service.facade.admin.ProtocoleInclusionStatutAdminService;
import ma.enova.radio.service.facade.admin.ServicesAdminService;
import ma.enova.radio.ws.converter.ProtocoleInclusionConverter;
import ma.enova.radio.ws.dto.ProtocoleInclusionDto;
import ma.enova.radio.zynerator.service.AbstractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProtocoleInclusionAdminServiceImpl extends AbstractServiceImpl<ProtocoleInclusion, ProtocoleInclusionDto,ProtocoleInclusionHistory, ProtocoleInclusionCriteria, ProtocoleInclusionHistoryCriteria, ProtocoleInclusionDao,
ProtocoleInclusionHistoryDao, ProtocoleInclusionConverter> implements ProtocoleInclusionAdminService {

    public Long getNextOrdre() {
        Long max = dao.findMaxOrdreByEtablissementIdOrder(getEtablissementId());
        return max != null ? max + 1 : 1;
    }

    public ProtocoleInclusion findByReferenceEntity(ProtocoleInclusion t){
        findOrSaveAssociatedObject(t);
        return  dao.findByCode(t.getCode());
    }

    public void findOrSaveAssociatedObject(ProtocoleInclusion t){
        if( t != null) {
            t.setProtocoleInclusionStatut(protocoleInclusionStatutService.findOrSave(t.getProtocoleInclusionStatut()));
            t.setServices(servicesService.findOrSave(t.getServices()));
        }
    }

    public List<ProtocoleInclusion> findByProtocoleInclusionStatutId(Long id){
        return dao.findByProtocoleInclusionStatutId(id);
    }
    public int deleteByProtocoleInclusionStatutId(Long id){
        return dao.deleteByProtocoleInclusionStatutId(id);
    }
    public List<ProtocoleInclusion> findByServicesId(Long id){
        return dao.findByServicesId(id);
    }
    public int deleteByServicesId(Long id){
        return dao.deleteByServicesId(id);
    }

    public void configure() {
        super.configure(ProtocoleInclusion.class, ProtocoleInclusionDto.class, ProtocoleInclusionHistory.class, ProtocoleInclusionHistoryCriteria.class, ProtocoleInclusionSpecification.class);
    }

    @Autowired
    private ProtocoleInclusionStatutAdminService protocoleInclusionStatutService ;
    @Autowired
    private ServicesAdminService servicesService ;
    public ProtocoleInclusionAdminServiceImpl(ProtocoleInclusionDao dao, ProtocoleInclusionHistoryDao historyDao, ProtocoleInclusionConverter converter) {
        super(dao, historyDao, converter);
    }

}