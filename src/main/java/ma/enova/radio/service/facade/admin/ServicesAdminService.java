package ma.enova.radio.service.facade.admin;

import java.util.List;
import ma.enova.radio.bean.core.Services;
import ma.enova.radio.ws.dto.ServicesDto;
import ma.enova.radio.zynerator.service.IService;
import ma.enova.radio.dao.criteria.core.ServicesCriteria;
import ma.enova.radio.dao.criteria.history.ServicesHistoryCriteria;


public interface ServicesAdminService extends IService<Services, ServicesDto,ServicesCriteria, ServicesHistoryCriteria> {

    Long getNextOrdre();



}
