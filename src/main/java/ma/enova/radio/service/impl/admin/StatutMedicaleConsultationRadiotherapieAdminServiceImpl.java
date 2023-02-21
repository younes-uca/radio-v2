package ma.enova.radio.service.impl.admin;

import ma.enova.radio.bean.core.StatutMedicaleConsultationRadiotherapie;
import ma.enova.radio.bean.history.StatutMedicaleConsultationRadiotherapieHistory;
import ma.enova.radio.dao.criteria.core.StatutMedicaleConsultationRadiotherapieCriteria;
import ma.enova.radio.dao.criteria.history.StatutMedicaleConsultationRadiotherapieHistoryCriteria;
import ma.enova.radio.dao.facade.core.StatutMedicaleConsultationRadiotherapieDao;
import ma.enova.radio.dao.facade.history.StatutMedicaleConsultationRadiotherapieHistoryDao;
import ma.enova.radio.dao.specification.core.StatutMedicaleConsultationRadiotherapieSpecification;
import ma.enova.radio.service.facade.admin.ServicesAdminService;
import ma.enova.radio.service.facade.admin.StatutMedicaleConsultationRadiotherapieAdminService;
import ma.enova.radio.ws.converter.StatutMedicaleConsultationRadiotherapieConverter;
import ma.enova.radio.ws.dto.StatutMedicaleConsultationRadiotherapieDto;
import ma.enova.radio.zynerator.service.AbstractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatutMedicaleConsultationRadiotherapieAdminServiceImpl extends AbstractServiceImpl<StatutMedicaleConsultationRadiotherapie, StatutMedicaleConsultationRadiotherapieDto,StatutMedicaleConsultationRadiotherapieHistory, StatutMedicaleConsultationRadiotherapieCriteria, StatutMedicaleConsultationRadiotherapieHistoryCriteria, StatutMedicaleConsultationRadiotherapieDao,
StatutMedicaleConsultationRadiotherapieHistoryDao, StatutMedicaleConsultationRadiotherapieConverter> implements StatutMedicaleConsultationRadiotherapieAdminService {

    public Long getNextOrdre() {
        Long max = dao.findMaxOrdreByEtablissementIdOrder(getEtablissementId());
        return max != null ? max + 1 : 1;
    }

    public StatutMedicaleConsultationRadiotherapie findByReferenceEntity(StatutMedicaleConsultationRadiotherapie t){
        return  dao.findByCode(t.getCode());
    }
    public void findOrSaveAssociatedObject(StatutMedicaleConsultationRadiotherapie t){
        if( t != null) {
            t.setServices(servicesService.findOrSave(t.getServices()));
        }
    }

    public List<StatutMedicaleConsultationRadiotherapie> findByServicesId(Long id){
        return dao.findByServicesId(id);
    }
    public int deleteByServicesId(Long id){
        return dao.deleteByServicesId(id);
    }

    public void configure() {
        super.configure(StatutMedicaleConsultationRadiotherapie.class, StatutMedicaleConsultationRadiotherapieDto.class, StatutMedicaleConsultationRadiotherapieHistory.class, StatutMedicaleConsultationRadiotherapieHistoryCriteria.class, StatutMedicaleConsultationRadiotherapieSpecification.class);
    }

    @Autowired
    private ServicesAdminService servicesService ;
    public StatutMedicaleConsultationRadiotherapieAdminServiceImpl(StatutMedicaleConsultationRadiotherapieDao dao, StatutMedicaleConsultationRadiotherapieHistoryDao historyDao, StatutMedicaleConsultationRadiotherapieConverter converter) {
        super(dao, historyDao, converter);
    }

}