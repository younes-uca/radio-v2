package ma.enova.radio.service.impl.admin;

import ma.enova.radio.bean.core.Personnel;
import ma.enova.radio.bean.history.PersonnelHistory;
import ma.enova.radio.dao.criteria.core.PersonnelCriteria;
import ma.enova.radio.dao.criteria.history.PersonnelHistoryCriteria;
import ma.enova.radio.dao.facade.core.PersonnelDao;
import ma.enova.radio.dao.facade.history.PersonnelHistoryDao;
import ma.enova.radio.dao.specification.core.PersonnelSpecification;
import ma.enova.radio.service.facade.admin.PersonnelAdminService;
import ma.enova.radio.ws.converter.PersonnelConverter;
import ma.enova.radio.ws.dto.PersonnelDto;
import ma.enova.radio.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ma.enova.radio.service.facade.admin.CategoriePersonnelAdminService ;
import ma.enova.radio.service.facade.admin.SpecialiteAdminService ;


import java.util.List;

@Service
public class PersonnelAdminServiceImpl extends AbstractServiceImpl<Personnel, PersonnelDto,PersonnelHistory, PersonnelCriteria, PersonnelHistoryCriteria, PersonnelDao,
PersonnelHistoryDao, PersonnelConverter> implements PersonnelAdminService {

    public Long getNextOrdre() {
        Long max = dao.findMaxOrdreByEtablissementIdOrder(getEtablissementId());
        return max != null ? max + 1 : 1;
    }

    public Personnel findByReferenceEntity(Personnel t){
        return  dao.findByIpp(t.getIpp());
    }
    public void findOrSaveAssociatedObject(Personnel t){
        if( t != null) {
            t.setCategoriePersonnel(categoriePersonnelService.findOrSave(t.getCategoriePersonnel()));
            t.setSpecialite(specialiteService.findOrSave(t.getSpecialite()));
        }
    }

    public List<Personnel> findByCategoriePersonnelId(Long id){
        return dao.findByCategoriePersonnelId(id);
    }
    public int deleteByCategoriePersonnelId(Long id){
        return dao.deleteByCategoriePersonnelId(id);
    }
    public List<Personnel> findBySpecialiteId(Long id){
        return dao.findBySpecialiteId(id);
    }
    public int deleteBySpecialiteId(Long id){
        return dao.deleteBySpecialiteId(id);
    }

    public void configure() {
        super.configure(Personnel.class, PersonnelDto.class, PersonnelHistory.class, PersonnelHistoryCriteria.class, PersonnelSpecification.class);
    }

    @Autowired
    private CategoriePersonnelAdminService categoriePersonnelService ;
    @Autowired
    private SpecialiteAdminService specialiteService ;
    public PersonnelAdminServiceImpl(PersonnelDao dao, PersonnelHistoryDao historyDao, PersonnelConverter converter) {
        super(dao, historyDao, converter);
    }

}