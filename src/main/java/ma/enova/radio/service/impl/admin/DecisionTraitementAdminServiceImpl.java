package ma.enova.radio.service.impl.admin;

import ma.enova.radio.bean.core.DecisionTraitement;
import ma.enova.radio.bean.history.DecisionTraitementHistory;
import ma.enova.radio.dao.criteria.core.DecisionTraitementCriteria;
import ma.enova.radio.dao.criteria.history.DecisionTraitementHistoryCriteria;
import ma.enova.radio.dao.facade.core.DecisionTraitementDao;
import ma.enova.radio.dao.facade.history.DecisionTraitementHistoryDao;
import ma.enova.radio.dao.specification.core.DecisionTraitementSpecification;
import ma.enova.radio.service.facade.admin.DecisionTherapeutiqueAdminService;
import ma.enova.radio.service.facade.admin.DecisionTraitementAdminService;
import ma.enova.radio.service.facade.admin.StatutRadiotherapieAdminService;
import ma.enova.radio.ws.converter.DecisionTraitementConverter;
import ma.enova.radio.ws.dto.DecisionTraitementDto;
import ma.enova.radio.zynerator.service.AbstractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DecisionTraitementAdminServiceImpl extends AbstractServiceImpl<DecisionTraitement, DecisionTraitementDto,DecisionTraitementHistory, DecisionTraitementCriteria, DecisionTraitementHistoryCriteria, DecisionTraitementDao,
DecisionTraitementHistoryDao, DecisionTraitementConverter> implements DecisionTraitementAdminService {


    public void findOrSaveAssociatedObject(DecisionTraitement t){
        if( t != null) {
            //t.setDecisionTherapeutique(decisionTherapeutiqueService.findOrSave(t.getDecisionTherapeutique()));
            t.setStatutRadiotherapie(statutRadiotherapieService.findOrSave(t.getStatutRadiotherapie()));
        }
    }
/*

    public List<DecisionTraitement> findByDecisionTherapeutiqueId(Long id){
        return dao.findByDecisionTherapeutiqueId(id);
    }
    public int deleteByDecisionTherapeutiqueId(Long id){
        return dao.deleteByDecisionTherapeutiqueId(id);
    }
    public List<DecisionTraitement> findByStatutRadiotherapieCode(String code){
        return dao.findByStatutRadiotherapieCode(code);
    }
     public int deleteByStatutRadiotherapieCode(String code){
        return dao.deleteByStatutRadiotherapieCode(code);
    }
*/

    public void configure() {
        super.configure(DecisionTraitement.class, DecisionTraitementDto.class, DecisionTraitementHistory.class, DecisionTraitementHistoryCriteria.class, DecisionTraitementSpecification.class);
    }

    private DecisionTherapeutiqueAdminService decisionTherapeutiqueService ;
    @Autowired
    private StatutRadiotherapieAdminService statutRadiotherapieService ;
    public DecisionTraitementAdminServiceImpl(DecisionTraitementDao dao, DecisionTraitementHistoryDao historyDao, DecisionTraitementConverter converter) {
        super(dao, historyDao, converter);
    }

}