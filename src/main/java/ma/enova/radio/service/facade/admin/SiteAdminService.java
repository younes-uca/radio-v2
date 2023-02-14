package ma.enova.radio.service.facade.admin;

import java.util.List;
import ma.enova.radio.bean.core.Site;
import ma.enova.radio.ws.dto.SiteDto;
import ma.enova.radio.zynerator.service.IService;
import ma.enova.radio.dao.criteria.core.SiteCriteria;
import ma.enova.radio.dao.criteria.history.SiteHistoryCriteria;


public interface SiteAdminService extends IService<Site, SiteDto,SiteCriteria, SiteHistoryCriteria> {

    List<Site> findByServicesId(Long id);
    int deleteByServicesId(Long id);
    Long getNextOrdre();



}
