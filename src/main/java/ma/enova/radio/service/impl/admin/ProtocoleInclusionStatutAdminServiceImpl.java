package ma.enova.radio.service.impl.admin;

import ma.enova.radio.bean.core.ProtocoleInclusionStatut;
import ma.enova.radio.bean.history.ProtocoleInclusionStatutHistory;
import ma.enova.radio.dao.criteria.core.ProtocoleInclusionStatutCriteria;
import ma.enova.radio.dao.criteria.history.ProtocoleInclusionStatutHistoryCriteria;
import ma.enova.radio.dao.facade.core.ProtocoleInclusionStatutDao;
import ma.enova.radio.dao.facade.history.ProtocoleInclusionStatutHistoryDao;
import ma.enova.radio.dao.specification.core.ProtocoleInclusionStatutSpecification;
import ma.enova.radio.service.facade.admin.ProtocoleInclusionStatutAdminService;
import ma.enova.radio.service.facade.admin.ServicesAdminService;
import ma.enova.radio.ws.converter.ProtocoleInclusionStatutConverter;
import ma.enova.radio.ws.dto.ProtocoleInclusionStatutDto;
import ma.enova.radio.zynerator.service.AbstractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProtocoleInclusionStatutAdminServiceImpl extends AbstractServiceImpl<ProtocoleInclusionStatut, ProtocoleInclusionStatutDto, ProtocoleInclusionStatutHistory, ProtocoleInclusionStatutCriteria, ProtocoleInclusionStatutHistoryCriteria, ProtocoleInclusionStatutDao,
        ProtocoleInclusionStatutHistoryDao, ProtocoleInclusionStatutConverter> implements ProtocoleInclusionStatutAdminService {

    public Long getNextOrdre() {
        Long max = dao.findMaxOrdreByEtablissementIdOrder(getEtablissementId());
        return max != null ? max + 1 : 1;
    }

    public void findOrSaveAssociatedObject(ProtocoleInclusionStatut t) {
        if (t != null) {
            t.setServices(servicesService.findOrSave(t.getServices()));
        }
    }

    public List<ProtocoleInclusionStatut> findByServicesId(Long id) {
        return dao.findByServicesId(id);
    }

    public int deleteByServicesId(Long id) {
        return dao.deleteByServicesId(id);
    }

    public void configure() {
        super.configure(ProtocoleInclusionStatut.class, ProtocoleInclusionStatutDto.class, ProtocoleInclusionStatutHistory.class, ProtocoleInclusionStatutHistoryCriteria.class, ProtocoleInclusionStatutSpecification.class);
    }

    @Autowired
    private ServicesAdminService servicesService;

    public ProtocoleInclusionStatutAdminServiceImpl(ProtocoleInclusionStatutDao dao, ProtocoleInclusionStatutHistoryDao historyDao, ProtocoleInclusionStatutConverter converter) {
        super(dao, historyDao, converter);
    }

}