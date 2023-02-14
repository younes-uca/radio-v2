package ma.enova.radio.service.impl.admin;

import ma.enova.radio.bean.core.Site;
import ma.enova.radio.bean.history.SiteHistory;
import ma.enova.radio.dao.criteria.core.SiteCriteria;
import ma.enova.radio.dao.criteria.history.SiteHistoryCriteria;
import ma.enova.radio.dao.facade.core.SiteDao;
import ma.enova.radio.dao.facade.history.SiteHistoryDao;
import ma.enova.radio.dao.specification.core.SiteSpecification;
import ma.enova.radio.service.facade.admin.SiteAdminService;
import ma.enova.radio.ws.converter.SiteConverter;
import ma.enova.radio.ws.dto.SiteDto;
import ma.enova.radio.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ma.enova.radio.service.facade.admin.ServicesAdminService ;


import java.util.List;

@Service
public class SiteAdminServiceImpl extends AbstractServiceImpl<Site, SiteDto,SiteHistory, SiteCriteria, SiteHistoryCriteria, SiteDao,
SiteHistoryDao, SiteConverter> implements SiteAdminService {

    public Long getNextOrdre() {
        Long max = dao.findMaxOrdreByEtablissementIdOrder(getEtablissementId());
        return max != null ? max + 1 : 1;
    }

    public Site findByReferenceEntity(Site t){
        return  dao.findByCode(t.getCode());
    }
    public void findOrSaveAssociatedObject(Site t){
        if( t != null) {
            t.setServices(servicesService.findOrSave(t.getServices()));
        }
    }

    public List<Site> findByServicesId(Long id){
        return dao.findByServicesId(id);
    }
    public int deleteByServicesId(Long id){
        return dao.deleteByServicesId(id);
    }

    public void configure() {
        super.configure(Site.class, SiteDto.class, SiteHistory.class, SiteHistoryCriteria.class, SiteSpecification.class);
    }

    @Autowired
    private ServicesAdminService servicesService ;
    public SiteAdminServiceImpl(SiteDao dao, SiteHistoryDao historyDao, SiteConverter converter) {
        super(dao, historyDao, converter);
    }

}