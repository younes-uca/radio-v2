package ma.enova.radio.service.impl.admin;

import ma.enova.radio.bean.core.ConsultationRadiotherapie;
import ma.enova.radio.bean.history.ConsultationRadiotherapieHistory;
import ma.enova.radio.dao.criteria.core.ConsultationRadiotherapieCriteria;
import ma.enova.radio.dao.criteria.history.ConsultationRadiotherapieHistoryCriteria;
import ma.enova.radio.dao.facade.core.ConsultationRadiotherapieDao;
import ma.enova.radio.dao.facade.history.ConsultationRadiotherapieHistoryDao;
import ma.enova.radio.dao.specification.core.ConsultationRadiotherapieSpecification;
import ma.enova.radio.service.facade.admin.*;
import ma.enova.radio.ws.converter.ConsultationRadiotherapieConverter;
import ma.enova.radio.ws.dto.ConsultationRadiotherapieDto;
import ma.enova.radio.zynerator.service.AbstractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultationRadiotherapieAdminServiceImpl extends AbstractServiceImpl<ConsultationRadiotherapie, ConsultationRadiotherapieDto,ConsultationRadiotherapieHistory, ConsultationRadiotherapieCriteria, ConsultationRadiotherapieHistoryCriteria, ConsultationRadiotherapieDao,
ConsultationRadiotherapieHistoryDao, ConsultationRadiotherapieConverter> implements ConsultationRadiotherapieAdminService {


    public void findOrSaveAssociatedObject(ConsultationRadiotherapie t){
        if( t != null) {
            t.setMedecin(personnelService.findOrSave(t.getMedecin()));
            t.setSpecialite(specialiteService.findOrSave(t.getSpecialite()));
            t.setTypeConsultationRadiotherapie(typeConsultationRadiotherapieService.findOrSave(t.getTypeConsultationRadiotherapie()));
            t.setTypeToxiciteRth(typeToxiciteRthService.findOrSave(t.getTypeToxiciteRth()));
            t.setGradeToxiciteRth(gradeToxiciteRthService.findOrSave(t.getGradeToxiciteRth()));
            t.setClassificationOms(classificationOmsService.findOrSave(t.getClassificationOms()));
            t.setStatutMedicaleConsultationRadiotherapie(statutMedicaleConsultationRadiotherapieService.findOrSave(t.getStatutMedicaleConsultationRadiotherapie()));
            t.setPrescriptionRadiotherapie(prescriptionRadiotherapieService.findOrSave(t.getPrescriptionRadiotherapie()));
        }
    }

    public List<ConsultationRadiotherapie> findByMedecinId(Long id){
        return dao.findByMedecinId(id);
    }
    public int deleteByMedecinId(Long id){
        return dao.deleteByMedecinId(id);
    }
    public List<ConsultationRadiotherapie> findBySpecialiteId(Long id){
        return dao.findBySpecialiteId(id);
    }
    public int deleteBySpecialiteId(Long id){
        return dao.deleteBySpecialiteId(id);
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
    public List<ConsultationRadiotherapie> findByClassificationOmsId(Long id){
        return dao.findByClassificationOmsId(id);
    }
    public int deleteByClassificationOmsId(Long id){
        return dao.deleteByClassificationOmsId(id);
    }
    public List<ConsultationRadiotherapie> findByStatutMedicaleConsultationRadiotherapieId(Long id){
        return dao.findByStatutMedicaleConsultationRadiotherapieId(id);
    }
    public int deleteByStatutMedicaleConsultationRadiotherapieId(Long id){
        return dao.deleteByStatutMedicaleConsultationRadiotherapieId(id);
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
    private PersonnelAdminService personnelService ;
    @Autowired
    private TypeToxiciteRthAdminService typeToxiciteRthService ;
    @Autowired
    private GradeToxiciteRthAdminService gradeToxiciteRthService ;
    @Autowired
    private TypeConsultationRadiotherapieAdminService typeConsultationRadiotherapieService ;
    @Autowired
    private StatutMedicaleConsultationRadiotherapieAdminService statutMedicaleConsultationRadiotherapieService ;
    @Autowired
    private PrescriptionRadiotherapieAdminService prescriptionRadiotherapieService ;
    @Autowired
    private ClassificationOmsAdminService classificationOmsService ;
    @Autowired
    private SpecialiteAdminService specialiteService ;
    public ConsultationRadiotherapieAdminServiceImpl(ConsultationRadiotherapieDao dao, ConsultationRadiotherapieHistoryDao historyDao, ConsultationRadiotherapieConverter converter) {
        super(dao, historyDao, converter);
    }

}