package ma.enova.radio.service.impl.admin;

import ma.enova.radio.bean.core.HistortiquePrescriptionRadiotherapie;
import ma.enova.radio.bean.history.HistortiquePrescriptionRadiotherapieHistory;
import ma.enova.radio.dao.criteria.core.HistortiquePrescriptionRadiotherapieCriteria;
import ma.enova.radio.dao.criteria.history.HistortiquePrescriptionRadiotherapieHistoryCriteria;
import ma.enova.radio.dao.facade.core.HistortiquePrescriptionRadiotherapieDao;
import ma.enova.radio.dao.facade.history.HistortiquePrescriptionRadiotherapieHistoryDao;
import ma.enova.radio.dao.specification.core.HistortiquePrescriptionRadiotherapieSpecification;
import ma.enova.radio.service.facade.admin.HistortiquePrescriptionRadiotherapieAdminService;
import ma.enova.radio.ws.converter.HistortiquePrescriptionRadiotherapieConverter;
import ma.enova.radio.ws.dto.HistortiquePrescriptionRadiotherapieDto;
import ma.enova.radio.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ma.enova.radio.service.facade.admin.StatutRadiotherapieAdminService ;
import ma.enova.radio.service.facade.admin.PrescriptionRadiotherapieAdminService ;


import java.util.List;

@Service
public class HistortiquePrescriptionRadiotherapieAdminServiceImpl extends AbstractServiceImpl<HistortiquePrescriptionRadiotherapie, HistortiquePrescriptionRadiotherapieDto,HistortiquePrescriptionRadiotherapieHistory, HistortiquePrescriptionRadiotherapieCriteria, HistortiquePrescriptionRadiotherapieHistoryCriteria, HistortiquePrescriptionRadiotherapieDao,
HistortiquePrescriptionRadiotherapieHistoryDao, HistortiquePrescriptionRadiotherapieConverter> implements HistortiquePrescriptionRadiotherapieAdminService {


    public void findOrSaveAssociatedObject(HistortiquePrescriptionRadiotherapie t){
        if( t != null) {
            t.setPrescriptionRadiotherapie(prescriptionRadiotherapieService.findOrSave(t.getPrescriptionRadiotherapie()));
            t.setStatutRadiotherapie(statutRadiotherapieService.findOrSave(t.getStatutRadiotherapie()));
        }
    }

    public List<HistortiquePrescriptionRadiotherapie> findByPrescriptionRadiotherapieId(Long id){
        return dao.findByPrescriptionRadiotherapieId(id);
    }
    public int deleteByPrescriptionRadiotherapieId(Long id){
        return dao.deleteByPrescriptionRadiotherapieId(id);
    }
    public List<HistortiquePrescriptionRadiotherapie> findByStatutRadiotherapieCode(String code){
        return dao.findByStatutRadiotherapieCode(code);
    }
     public int deleteByStatutRadiotherapieCode(String code){
        return dao.deleteByStatutRadiotherapieCode(code);
    }

    public void configure() {
        super.configure(HistortiquePrescriptionRadiotherapie.class, HistortiquePrescriptionRadiotherapieDto.class, HistortiquePrescriptionRadiotherapieHistory.class, HistortiquePrescriptionRadiotherapieHistoryCriteria.class, HistortiquePrescriptionRadiotherapieSpecification.class);
    }

    @Autowired
    private StatutRadiotherapieAdminService statutRadiotherapieService ;
    @Autowired
    private PrescriptionRadiotherapieAdminService prescriptionRadiotherapieService ;
    public HistortiquePrescriptionRadiotherapieAdminServiceImpl(HistortiquePrescriptionRadiotherapieDao dao, HistortiquePrescriptionRadiotherapieHistoryDao historyDao, HistortiquePrescriptionRadiotherapieConverter converter) {
        super(dao, historyDao, converter);
    }

}