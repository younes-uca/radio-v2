package ma.enova.radio.service.impl.admin;

import ma.enova.radio.bean.core.Positionnement;
import ma.enova.radio.bean.history.PositionnementHistory;
import ma.enova.radio.dao.criteria.core.PositionnementCriteria;
import ma.enova.radio.dao.criteria.history.PositionnementHistoryCriteria;
import ma.enova.radio.dao.facade.core.PositionnementDao;
import ma.enova.radio.dao.facade.history.PositionnementHistoryDao;
import ma.enova.radio.dao.specification.core.PositionnementSpecification;
import ma.enova.radio.service.facade.admin.PositionnementAdminService;
import ma.enova.radio.ws.converter.PositionnementConverter;
import ma.enova.radio.ws.dto.PositionnementDto;
import ma.enova.radio.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ma.enova.radio.service.facade.admin.ServicesAdminService ;


import java.util.List;

@Service
public class PositionnementAdminServiceImpl extends AbstractServiceImpl<Positionnement, PositionnementDto,PositionnementHistory, PositionnementCriteria, PositionnementHistoryCriteria, PositionnementDao,
PositionnementHistoryDao, PositionnementConverter> implements PositionnementAdminService {

    public Long getNextOrdre() {
        Long max = dao.findMaxOrdreByEtablissementIdOrder(getEtablissementId());
        return max != null ? max + 1 : 1;
    }

    public Positionnement findByReferenceEntity(Positionnement t){
        return  dao.findByCode(t.getCode());
    }
    public void findOrSaveAssociatedObject(Positionnement t){
        if( t != null) {
            t.setServices(servicesService.findOrSave(t.getServices()));
        }
    }

    public List<Positionnement> findByServicesId(Long id){
        return dao.findByServicesId(id);
    }
    public int deleteByServicesId(Long id){
        return dao.deleteByServicesId(id);
    }

    public void configure() {
        super.configure(Positionnement.class, PositionnementDto.class, PositionnementHistory.class, PositionnementHistoryCriteria.class, PositionnementSpecification.class);
    }

    @Autowired
    private ServicesAdminService servicesService ;
    public PositionnementAdminServiceImpl(PositionnementDao dao, PositionnementHistoryDao historyDao, PositionnementConverter converter) {
        super(dao, historyDao, converter);
    }

}