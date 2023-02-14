package ma.enova.radio.service.facade.admin;

import java.util.List;
import ma.enova.radio.bean.core.ModaliteRadiotherapie;
import ma.enova.radio.ws.dto.ModaliteRadiotherapieDto;
import ma.enova.radio.zynerator.service.IService;
import ma.enova.radio.dao.criteria.core.ModaliteRadiotherapieCriteria;
import ma.enova.radio.dao.criteria.history.ModaliteRadiotherapieHistoryCriteria;


public interface ModaliteRadiotherapieAdminService extends IService<ModaliteRadiotherapie, ModaliteRadiotherapieDto,ModaliteRadiotherapieCriteria, ModaliteRadiotherapieHistoryCriteria> {

    List<ModaliteRadiotherapie> findByServicesId(Long id);
    int deleteByServicesId(Long id);
    Long getNextOrdre();



}
