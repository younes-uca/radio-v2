package ma.enova.radio.service.impl.admin;

import ma.enova.radio.bean.core.Specialite;
import ma.enova.radio.bean.history.SpecialiteHistory;
import ma.enova.radio.dao.criteria.core.SpecialiteCriteria;
import ma.enova.radio.dao.criteria.history.SpecialiteHistoryCriteria;
import ma.enova.radio.dao.facade.core.SpecialiteDao;
import ma.enova.radio.dao.facade.history.SpecialiteHistoryDao;
import ma.enova.radio.dao.specification.core.SpecialiteSpecification;
import ma.enova.radio.service.facade.admin.SpecialiteAdminService;
import ma.enova.radio.ws.converter.SpecialiteConverter;
import ma.enova.radio.ws.dto.SpecialiteDto;
import ma.enova.radio.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ma.enova.radio.service.facade.admin.ServicesAdminService ;


import java.util.List;

@Service
public class SpecialiteAdminServiceImpl extends AbstractServiceImpl<Specialite, SpecialiteDto,SpecialiteHistory, SpecialiteCriteria, SpecialiteHistoryCriteria, SpecialiteDao,
SpecialiteHistoryDao, SpecialiteConverter> implements SpecialiteAdminService {

    public Long getNextOrdre() {
        Long max = dao.findMaxOrdreByEtablissementIdOrder(getEtablissementId());
        return max != null ? max + 1 : 1;
    }

    public Specialite findByReferenceEntity(Specialite t){
        return  dao.findByCode(t.getCode());
    }
    public void findOrSaveAssociatedObject(Specialite t){
        if( t != null) {
            t.setServices(servicesService.findOrSave(t.getServices()));
        }
    }

    public List<Specialite> findByServicesId(Long id){
        return dao.findByServicesId(id);
    }
    public int deleteByServicesId(Long id){
        return dao.deleteByServicesId(id);
    }

    public void configure() {
        super.configure(Specialite.class, SpecialiteDto.class, SpecialiteHistory.class, SpecialiteHistoryCriteria.class, SpecialiteSpecification.class);
    }

    @Autowired
    private ServicesAdminService servicesService ;
    public SpecialiteAdminServiceImpl(SpecialiteDao dao, SpecialiteHistoryDao historyDao, SpecialiteConverter converter) {
        super(dao, historyDao, converter);
    }

}