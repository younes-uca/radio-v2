package ma.enova.radio.service.facade.admin;

import java.util.List;
import ma.enova.radio.bean.core.TypeToxiciteRth;
import ma.enova.radio.ws.dto.TypeToxiciteRthDto;
import ma.enova.radio.zynerator.service.IService;
import ma.enova.radio.dao.criteria.core.TypeToxiciteRthCriteria;
import ma.enova.radio.dao.criteria.history.TypeToxiciteRthHistoryCriteria;


public interface TypeToxiciteRthAdminService extends IService<TypeToxiciteRth, TypeToxiciteRthDto,TypeToxiciteRthCriteria, TypeToxiciteRthHistoryCriteria> {

    List<TypeToxiciteRth> findByServicesId(Long id);
    int deleteByServicesId(Long id);
    Long getNextOrdre();



}
