package ma.enova.radio.service.impl.admin;

import ma.enova.radio.bean.core.Immobilistion;
import ma.enova.radio.bean.history.ImmobilistionHistory;
import ma.enova.radio.dao.criteria.core.ImmobilistionCriteria;
import ma.enova.radio.dao.criteria.history.ImmobilistionHistoryCriteria;
import ma.enova.radio.dao.facade.core.ImmobilistionDao;
import ma.enova.radio.dao.facade.history.ImmobilistionHistoryDao;
import ma.enova.radio.dao.specification.core.ImmobilistionSpecification;
import ma.enova.radio.service.facade.admin.ImmobilistionAdminService;
import ma.enova.radio.ws.converter.ImmobilistionConverter;
import ma.enova.radio.ws.dto.ImmobilistionDto;
import ma.enova.radio.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ma.enova.radio.service.facade.admin.ServicesAdminService ;


import java.util.List;

@Service
public class ImmobilistionAdminServiceImpl extends AbstractServiceImpl<Immobilistion, ImmobilistionDto,ImmobilistionHistory, ImmobilistionCriteria, ImmobilistionHistoryCriteria, ImmobilistionDao,
ImmobilistionHistoryDao, ImmobilistionConverter> implements ImmobilistionAdminService {

    public Long getNextOrdre() {
        Long max = dao.findMaxOrdreByEtablissementIdOrder(getEtablissementId());
        return max != null ? max + 1 : 1;
    }

    public Immobilistion findByReferenceEntity(Immobilistion t){
        return  dao.findByCode(t.getCode());
    }
    public void findOrSaveAssociatedObject(Immobilistion t){
        if( t != null) {
            t.setServices(servicesService.findOrSave(t.getServices()));
        }
    }

    public List<Immobilistion> findByServicesId(Long id){
        return dao.findByServicesId(id);
    }
    public int deleteByServicesId(Long id){
        return dao.deleteByServicesId(id);
    }

    public void configure() {
        super.configure(Immobilistion.class, ImmobilistionDto.class, ImmobilistionHistory.class, ImmobilistionHistoryCriteria.class, ImmobilistionSpecification.class);
    }

    @Autowired
    private ServicesAdminService servicesService ;
    public ImmobilistionAdminServiceImpl(ImmobilistionDao dao, ImmobilistionHistoryDao historyDao, ImmobilistionConverter converter) {
        super(dao, historyDao, converter);
    }

}