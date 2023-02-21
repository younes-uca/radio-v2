package ma.enova.radio.service.impl.admin;

import ma.enova.radio.bean.core.ClassificationOms;
import ma.enova.radio.bean.history.ClassificationOmsHistory;
import ma.enova.radio.dao.criteria.core.ClassificationOmsCriteria;
import ma.enova.radio.dao.criteria.history.ClassificationOmsHistoryCriteria;
import ma.enova.radio.dao.facade.core.ClassificationOmsDao;
import ma.enova.radio.dao.facade.history.ClassificationOmsHistoryDao;
import ma.enova.radio.dao.specification.core.ClassificationOmsSpecification;
import ma.enova.radio.service.facade.admin.ClassificationOmsAdminService;
import ma.enova.radio.service.facade.admin.ServicesAdminService;
import ma.enova.radio.ws.converter.ClassificationOmsConverter;
import ma.enova.radio.ws.dto.ClassificationOmsDto;
import ma.enova.radio.zynerator.service.AbstractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassificationOmsAdminServiceImpl extends AbstractServiceImpl<ClassificationOms, ClassificationOmsDto,ClassificationOmsHistory, ClassificationOmsCriteria, ClassificationOmsHistoryCriteria, ClassificationOmsDao,
ClassificationOmsHistoryDao, ClassificationOmsConverter> implements ClassificationOmsAdminService {

    public Long getNextOrdre() {
        Long max = dao.findMaxOrdreByEtablissementIdOrder(getEtablissementId());
        return max != null ? max + 1 : 1;
    }

    public ClassificationOms findByReferenceEntity(ClassificationOms t){
        return  dao.findByCode(t.getCode());
    }
    public void findOrSaveAssociatedObject(ClassificationOms t){
        if( t != null) {
            t.setServices(servicesService.findOrSave(t.getServices()));
        }
    }

    public List<ClassificationOms> findByServicesId(Long id){
        return dao.findByServicesId(id);
    }
    public int deleteByServicesId(Long id){
        return dao.deleteByServicesId(id);
    }

    public void configure() {
        super.configure(ClassificationOms.class, ClassificationOmsDto.class, ClassificationOmsHistory.class, ClassificationOmsHistoryCriteria.class, ClassificationOmsSpecification.class);
    }

    @Autowired
    private ServicesAdminService servicesService ;
    public ClassificationOmsAdminServiceImpl(ClassificationOmsDao dao, ClassificationOmsHistoryDao historyDao, ClassificationOmsConverter converter) {
        super(dao, historyDao, converter);
    }

}