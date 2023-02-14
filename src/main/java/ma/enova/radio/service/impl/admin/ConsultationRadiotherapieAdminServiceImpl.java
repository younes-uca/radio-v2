package ma.enova.radio.service.impl.admin;

import ma.enova.radio.bean.core.ConsultationRadiotherapie;
import ma.enova.radio.bean.history.ConsultationRadiotherapieHistory;
import ma.enova.radio.dao.criteria.core.ConsultationRadiotherapieCriteria;
import ma.enova.radio.dao.criteria.history.ConsultationRadiotherapieHistoryCriteria;
import ma.enova.radio.dao.facade.core.ConsultationRadiotherapieDao;
import ma.enova.radio.dao.facade.history.ConsultationRadiotherapieHistoryDao;
import ma.enova.radio.dao.specification.core.ConsultationRadiotherapieSpecification;
import ma.enova.radio.service.facade.admin.ConsultationRadiotherapieAdminService;
import ma.enova.radio.ws.converter.ConsultationRadiotherapieConverter;
import ma.enova.radio.ws.dto.ConsultationRadiotherapieDto;
import ma.enova.radio.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ma.enova.radio.service.facade.admin.TypeToxiciteRthAdminService ;
import ma.enova.radio.service.facade.admin.TypeConsultationRadiotherapieAdminService ;
import ma.enova.radio.service.facade.admin.PersonnelAdminService ;
import ma.enova.radio.service.facade.admin.PrescriptionRadiotherapieAdminService ;
import ma.enova.radio.service.facade.admin.GradeToxiciteRthAdminService ;


import java.util.List;

@Service
public class ConsultationRadiotherapieAdminServiceImpl extends AbstractServiceImpl<ConsultationRadiotherapie, ConsultationRadiotherapieDto,ConsultationRadiotherapieHistory, ConsultationRadiotherapieCriteria, ConsultationRadiotherapieHistoryCriteria, ConsultationRadiotherapieDao,
ConsultationRadiotherapieHistoryDao, ConsultationRadiotherapieConverter> implements ConsultationRadiotherapieAdminService {


    public void findOrSaveAssociatedObject(ConsultationRadiotherapie t){
        if( t != null) {
            t.setMedecin(personnelService.findOrSave(t.getMedecin()));
            t.setTypeConsultationRadiotherapie(typeConsultationRadiotherapieService.findOrSave(t.getTypeConsultationRadiotherapie()));
            t.setTypeToxiciteRth(typeToxiciteRthService.findOrSave(t.getTypeToxiciteRth()));
            t.setGradeToxiciteRth(gradeToxiciteRthService.findOrSave(t.getGradeToxiciteRth()));
            t.setPrescriptionRadiotherapie(prescriptionRadiotherapieService.findOrSave(t.getPrescriptionRadiotherapie()));
        }
    }

    public List<ConsultationRadiotherapie> findByMedecinId(Long id){
        return dao.findByMedecinId(id);
    }
    public int deleteByMedecinId(Long id){
        return dao.deleteByMedecinId(id);
    }
    public List<ConsultationRadiotherapie> findByTypeConsultationRadiotherapieId(Long id){
        return dao.findByTypeConsultationRadiotherapieId(id);
    }
    public int deleteByTypeConsultationRadiotherapieId(Long id){
        return dao.deleteByTypeConsultationRadiotherapieId(id);
    }
    public List<ConsultationRadiotherapie> findByTypeToxiciteRthId(Long id){
        return dao.findByTypeToxiciteRthId(id);
    }
    public int deleteByTypeToxiciteRthId(Long id){
        return dao.deleteByTypeToxiciteRthId(id);
    }
    public List<ConsultationRadiotherapie> findByGradeToxiciteRthId(Long id){
        return dao.findByGradeToxiciteRthId(id);
    }
    public int deleteByGradeToxiciteRthId(Long id){
        return dao.deleteByGradeToxiciteRthId(id);
    }
    public List<ConsultationRadiotherapie> findByPrescriptionRadiotherapieId(Long id){
        return dao.findByPrescriptionRadiotherapieId(id);
    }
    public int deleteByPrescriptionRadiotherapieId(Long id){
        return dao.deleteByPrescriptionRadiotherapieId(id);
    }

    public void configure() {
        super.configure(ConsultationRadiotherapie.class, ConsultationRadiotherapieDto.class, ConsultationRadiotherapieHistory.class, ConsultationRadiotherapieHistoryCriteria.class, ConsultationRadiotherapieSpecification.class);
    }

    @Autowired
    private TypeToxiciteRthAdminService typeToxiciteRthService ;
    @Autowired
    private TypeConsultationRadiotherapieAdminService typeConsultationRadiotherapieService ;
    @Autowired
    private PersonnelAdminService personnelService ;
    @Autowired
    private PrescriptionRadiotherapieAdminService prescriptionRadiotherapieService ;
    @Autowired
    private GradeToxiciteRthAdminService gradeToxiciteRthService ;
    public ConsultationRadiotherapieAdminServiceImpl(ConsultationRadiotherapieDao dao, ConsultationRadiotherapieHistoryDao historyDao, ConsultationRadiotherapieConverter converter) {
        super(dao, historyDao, converter);
    }

}