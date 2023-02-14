package ma.enova.radio.service.impl.admin;

import ma.enova.radio.bean.core.SeanceRadiotherapie;
import ma.enova.radio.bean.history.SeanceRadiotherapieHistory;
import ma.enova.radio.dao.criteria.core.SeanceRadiotherapieCriteria;
import ma.enova.radio.dao.criteria.history.SeanceRadiotherapieHistoryCriteria;
import ma.enova.radio.dao.facade.core.SeanceRadiotherapieDao;
import ma.enova.radio.dao.facade.history.SeanceRadiotherapieHistoryDao;
import ma.enova.radio.dao.specification.core.SeanceRadiotherapieSpecification;
import ma.enova.radio.service.facade.admin.SeanceRadiotherapieAdminService;
import ma.enova.radio.ws.converter.SeanceRadiotherapieConverter;
import ma.enova.radio.ws.dto.SeanceRadiotherapieDto;
import ma.enova.radio.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ma.enova.radio.service.facade.admin.PrescriptionRadiotherapieAdminService ;


import java.util.List;

@Service
public class SeanceRadiotherapieAdminServiceImpl extends AbstractServiceImpl<SeanceRadiotherapie, SeanceRadiotherapieDto,SeanceRadiotherapieHistory, SeanceRadiotherapieCriteria, SeanceRadiotherapieHistoryCriteria, SeanceRadiotherapieDao,
SeanceRadiotherapieHistoryDao, SeanceRadiotherapieConverter> implements SeanceRadiotherapieAdminService {


    public void findOrSaveAssociatedObject(SeanceRadiotherapie t){
        if( t != null) {
            t.setPrescriptionRadiotherapie(prescriptionRadiotherapieService.findOrSave(t.getPrescriptionRadiotherapie()));
        }
    }

    public List<SeanceRadiotherapie> findByPrescriptionRadiotherapieId(Long id){
        return dao.findByPrescriptionRadiotherapieId(id);
    }
    public int deleteByPrescriptionRadiotherapieId(Long id){
        return dao.deleteByPrescriptionRadiotherapieId(id);
    }

    public void configure() {
        super.configure(SeanceRadiotherapie.class, SeanceRadiotherapieDto.class, SeanceRadiotherapieHistory.class, SeanceRadiotherapieHistoryCriteria.class, SeanceRadiotherapieSpecification.class);
    }

    @Autowired
    private PrescriptionRadiotherapieAdminService prescriptionRadiotherapieService ;
    public SeanceRadiotherapieAdminServiceImpl(SeanceRadiotherapieDao dao, SeanceRadiotherapieHistoryDao historyDao, SeanceRadiotherapieConverter converter) {
        super(dao, historyDao, converter);
    }

}