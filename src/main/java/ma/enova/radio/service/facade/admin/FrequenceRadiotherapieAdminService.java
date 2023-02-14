package ma.enova.radio.service.facade.admin;

import java.util.List;
import ma.enova.radio.bean.core.FrequenceRadiotherapie;
import ma.enova.radio.ws.dto.FrequenceRadiotherapieDto;
import ma.enova.radio.zynerator.service.IService;
import ma.enova.radio.dao.criteria.core.FrequenceRadiotherapieCriteria;
import ma.enova.radio.dao.criteria.history.FrequenceRadiotherapieHistoryCriteria;


public interface FrequenceRadiotherapieAdminService extends IService<FrequenceRadiotherapie, FrequenceRadiotherapieDto,FrequenceRadiotherapieCriteria, FrequenceRadiotherapieHistoryCriteria> {

    List<FrequenceRadiotherapie> findByServicesId(Long id);
    int deleteByServicesId(Long id);
    Long getNextOrdre();



}
