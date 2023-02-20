package ma.enova.radio.service.impl.admin;

import ma.enova.radio.bean.core.DecisionTherapeutique;
import ma.enova.radio.bean.history.DecisionTherapeutiqueHistory;
import ma.enova.radio.dao.criteria.core.DecisionTherapeutiqueCriteria;
import ma.enova.radio.dao.criteria.history.DecisionTherapeutiqueHistoryCriteria;
import ma.enova.radio.dao.facade.core.DecisionTherapeutiqueDao;
import ma.enova.radio.dao.facade.history.DecisionTherapeutiqueHistoryDao;
import ma.enova.radio.dao.specification.core.DecisionTherapeutiqueSpecification;
import ma.enova.radio.service.facade.admin.DecisionTherapeutiqueAdminService;
import ma.enova.radio.service.facade.admin.ServicesAdminService;
import ma.enova.radio.ws.converter.DecisionTherapeutiqueConverter;
import ma.enova.radio.ws.dto.DecisionTherapeutiqueDto;
import ma.enova.radio.zynerator.service.AbstractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DecisionTherapeutiqueAdminServiceImpl extends AbstractServiceImpl<DecisionTherapeutique, DecisionTherapeutiqueDto,DecisionTherapeutiqueHistory, DecisionTherapeutiqueCriteria, DecisionTherapeutiqueHistoryCriteria, DecisionTherapeutiqueDao,
DecisionTherapeutiqueHistoryDao, DecisionTherapeutiqueConverter> implements DecisionTherapeutiqueAdminService {

    public Long getNextOrdre() {
        Long max = dao.findMaxOrdreByEtablissementIdOrder(getEtablissementId());
        return max != null ? max + 1 : 1;
    }

    public DecisionTherapeutique findByReferenceEntity(DecisionTherapeutique t){
        return  dao.findByName(t.getName());
    }
    public void findOrSaveAssociatedObject(DecisionTherapeutique t){
        if( t != null) {
            t.setServices(servicesService.findOrSave(t.getServices()));
        }
    }

    public List<DecisionTherapeutique> findByServicesId(Long id){
        return dao.findByServicesId(id);
    }
    public int deleteByServicesId(Long id){
        return dao.deleteByServicesId(id);
    }

    public void configure() {
        super.configure(DecisionTherapeutique.class, DecisionTherapeutiqueDto.class, DecisionTherapeutiqueHistory.class, DecisionTherapeutiqueHistoryCriteria.class, DecisionTherapeutiqueSpecification.class);
    }

    @Autowired
    private ServicesAdminService servicesService ;
    public DecisionTherapeutiqueAdminServiceImpl(DecisionTherapeutiqueDao dao, DecisionTherapeutiqueHistoryDao historyDao, DecisionTherapeutiqueConverter converter) {
        super(dao, historyDao, converter);
    }

}