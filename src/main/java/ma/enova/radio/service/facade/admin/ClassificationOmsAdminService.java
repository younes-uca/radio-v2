package ma.enova.radio.service.facade.admin;

import ma.enova.radio.bean.core.ClassificationOms;
import ma.enova.radio.dao.criteria.core.ClassificationOmsCriteria;
import ma.enova.radio.dao.criteria.history.ClassificationOmsHistoryCriteria;
import ma.enova.radio.ws.dto.ClassificationOmsDto;
import ma.enova.radio.zynerator.service.IService;

import java.util.List;


public interface ClassificationOmsAdminService extends IService<ClassificationOms, ClassificationOmsDto,ClassificationOmsCriteria, ClassificationOmsHistoryCriteria> {

    List<ClassificationOms> findByServicesId(Long id);
    int deleteByServicesId(Long id);
    Long getNextOrdre();



}
