package ma.enova.radio.service.facade.admin;

import java.util.List;
import ma.enova.radio.bean.core.StatutRadiotherapie;
import ma.enova.radio.ws.dto.StatutRadiotherapieDto;
import ma.enova.radio.zynerator.service.IService;
import ma.enova.radio.dao.criteria.core.StatutRadiotherapieCriteria;
import ma.enova.radio.dao.criteria.history.StatutRadiotherapieHistoryCriteria;


public interface StatutRadiotherapieAdminService extends IService<StatutRadiotherapie, StatutRadiotherapieDto,StatutRadiotherapieCriteria, StatutRadiotherapieHistoryCriteria> {


    StatutRadiotherapie findByCode(String code);
}
