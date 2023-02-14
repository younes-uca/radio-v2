package ma.enova.radio.service.impl.admin;

import ma.enova.radio.bean.core.PrescriptionRadiotherapie;
import ma.enova.radio.bean.history.PrescriptionRadiotherapieHistory;
import ma.enova.radio.dao.criteria.core.PrescriptionRadiotherapieCriteria;
import ma.enova.radio.dao.criteria.history.PrescriptionRadiotherapieHistoryCriteria;
import ma.enova.radio.dao.facade.core.PrescriptionRadiotherapieDao;
import ma.enova.radio.dao.facade.history.PrescriptionRadiotherapieHistoryDao;
import ma.enova.radio.dao.specification.core.PrescriptionRadiotherapieSpecification;
import ma.enova.radio.service.facade.admin.PrescriptionRadiotherapieAdminService;
import ma.enova.radio.ws.converter.PrescriptionRadiotherapieConverter;
import ma.enova.radio.ws.dto.PrescriptionRadiotherapieDto;
import ma.enova.radio.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ma.enova.radio.service.facade.admin.ModaliteRadiotherapieAdminService ;
import ma.enova.radio.service.facade.admin.SeanceRadiotherapieAdminService ;
import ma.enova.radio.service.facade.admin.PatientAdminService ;
import ma.enova.radio.service.facade.admin.HistortiquePrescriptionRadiotherapieAdminService ;
import ma.enova.radio.service.facade.admin.StatutRadiotherapieAdminService ;
import ma.enova.radio.service.facade.admin.SiteAdminService ;
import ma.enova.radio.service.facade.admin.TypeTraitementAdminService ;
import ma.enova.radio.service.facade.admin.PersonnelAdminService ;
import ma.enova.radio.service.facade.admin.ConsultationRadiotherapieAdminService ;
import ma.enova.radio.service.facade.admin.ViseeAdminService ;
import ma.enova.radio.service.facade.admin.ProtocoleInclusionAdminService ;


import java.util.List;

@Service
public class PrescriptionRadiotherapieAdminServiceImpl extends AbstractServiceImpl<PrescriptionRadiotherapie, PrescriptionRadiotherapieDto,PrescriptionRadiotherapieHistory, PrescriptionRadiotherapieCriteria, PrescriptionRadiotherapieHistoryCriteria, PrescriptionRadiotherapieDao,
PrescriptionRadiotherapieHistoryDao, PrescriptionRadiotherapieConverter> implements PrescriptionRadiotherapieAdminService {

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    public PrescriptionRadiotherapie create(PrescriptionRadiotherapie t) {
        super.create(t);
        if (t.getConsultationRadiotherapies() != null) {
                t.getConsultationRadiotherapies().forEach(element-> {
                    element.setPrescriptionRadiotherapie(t);
                    consultationRadiotherapieService.create(element);
            });
        }
        if (t.getSeanceRadiotherapies() != null) {
                t.getSeanceRadiotherapies().forEach(element-> {
                    element.setPrescriptionRadiotherapie(t);
                    seanceRadiotherapieService.create(element);
            });
        }
        if (t.getHistortiquePrescriptionRadiotherapies() != null) {
                t.getHistortiquePrescriptionRadiotherapies().forEach(element-> {
                    element.setPrescriptionRadiotherapie(t);
                    histortiquePrescriptionRadiotherapieService.create(element);
            });
        }
        return t;
    }

    public PrescriptionRadiotherapie findWithAssociatedLists(Long id){
        PrescriptionRadiotherapie result = dao.findById(id).orElse(null);
        if(result!=null && result.getId() != null) {
            result.setConsultationRadiotherapies(consultationRadiotherapieService.findByPrescriptionRadiotherapieId(id));
            result.setSeanceRadiotherapies(seanceRadiotherapieService.findByPrescriptionRadiotherapieId(id));
            result.setHistortiquePrescriptionRadiotherapies(histortiquePrescriptionRadiotherapieService.findByPrescriptionRadiotherapieId(id));
        }
        return result;
    }

    @Transactional
    public void delete(List<PrescriptionRadiotherapie> list){
        if(list != null ) {
            for (PrescriptionRadiotherapie element : list) {
                //constructAndSaveHistory(dto, ACTION_TYPE.DELETE); TODO
                consultationRadiotherapieService.deleteByPrescriptionRadiotherapieId(element.getId());
                seanceRadiotherapieService.deleteByPrescriptionRadiotherapieId(element.getId());
                histortiquePrescriptionRadiotherapieService.deleteByPrescriptionRadiotherapieId(element.getId());
                dao.deleteById(element.getId());
            }
        }
    }

    public void updateWithAssociatedLists(PrescriptionRadiotherapie prescriptionRadiotherapie){
    if(prescriptionRadiotherapie !=null && prescriptionRadiotherapie.getId() != null){
            //List<List<ConsultationRadiotherapie>> resultConsultationRadiotherapies= consultationRadiotherapieService.getToBeSavedAndToBeDeleted(consultationRadiotherapieService.findByPrescriptionRadiotherapieId(prescriptionRadiotherapie.getId()),prescriptionRadiotherapie.getConsultationRadiotherapies());
            //consultationRadiotherapieService.delete(resultConsultationRadiotherapies.get(1));
            //associateConsultationRadiotherapie(prescriptionRadiotherapie,resultConsultationRadiotherapies.get(0));
            //consultationRadiotherapieService.update(resultConsultationRadiotherapies.get(0));
            //List<List<SeanceRadiotherapie>> resultSeanceRadiotherapies= seanceRadiotherapieService.getToBeSavedAndToBeDeleted(seanceRadiotherapieService.findByPrescriptionRadiotherapieId(prescriptionRadiotherapie.getId()),prescriptionRadiotherapie.getSeanceRadiotherapies());
            //seanceRadiotherapieService.delete(resultSeanceRadiotherapies.get(1));
            //associateSeanceRadiotherapie(prescriptionRadiotherapie,resultSeanceRadiotherapies.get(0));
            //seanceRadiotherapieService.update(resultSeanceRadiotherapies.get(0));
            //List<List<HistortiquePrescriptionRadiotherapie>> resultHistortiquePrescriptionRadiotherapies= histortiquePrescriptionRadiotherapieService.getToBeSavedAndToBeDeleted(histortiquePrescriptionRadiotherapieService.findByPrescriptionRadiotherapieId(prescriptionRadiotherapie.getId()),prescriptionRadiotherapie.getHistortiquePrescriptionRadiotherapies());
            //histortiquePrescriptionRadiotherapieService.delete(resultHistortiquePrescriptionRadiotherapies.get(1));
            //associateHistortiquePrescriptionRadiotherapie(prescriptionRadiotherapie,resultHistortiquePrescriptionRadiotherapies.get(0));
            //histortiquePrescriptionRadiotherapieService.update(resultHistortiquePrescriptionRadiotherapies.get(0));
    }
    }

    public void findOrSaveAssociatedObject(PrescriptionRadiotherapie t){
        if( t != null) {
            t.setMedecinPrescripteur(personnelService.findOrSave(t.getMedecinPrescripteur()));
            t.setSite(siteService.findOrSave(t.getSite()));
            t.setModaliteRadiotherapie(modaliteRadiotherapieService.findOrSave(t.getModaliteRadiotherapie()));
            t.setVisee(viseeService.findOrSave(t.getVisee()));
            t.setProtocoleInclusion(protocoleInclusionService.findOrSave(t.getProtocoleInclusion()));
            t.setStatutRadiotherapie(statutRadiotherapieService.findOrSave(t.getStatutRadiotherapie()));
            t.setValidateurSimulation(personnelService.findOrSave(t.getValidateurSimulation()));
            t.setPatient(patientService.findOrSave(t.getPatient()));
            t.setTypeTraitement(typeTraitementService.findOrSave(t.getTypeTraitement()));
        }
    }

    public List<PrescriptionRadiotherapie> findByMedecinPrescripteurId(Long id){
        return dao.findByMedecinPrescripteurId(id);
    }
    public int deleteByMedecinPrescripteurId(Long id){
        return dao.deleteByMedecinPrescripteurId(id);
    }
    public List<PrescriptionRadiotherapie> findBySiteId(Long id){
        return dao.findBySiteId(id);
    }
    public int deleteBySiteId(Long id){
        return dao.deleteBySiteId(id);
    }
    public List<PrescriptionRadiotherapie> findByModaliteRadiotherapieId(Long id){
        return dao.findByModaliteRadiotherapieId(id);
    }
    public int deleteByModaliteRadiotherapieId(Long id){
        return dao.deleteByModaliteRadiotherapieId(id);
    }
    public List<PrescriptionRadiotherapie> findByViseeId(Long id){
        return dao.findByViseeId(id);
    }
    public int deleteByViseeId(Long id){
        return dao.deleteByViseeId(id);
    }
    public List<PrescriptionRadiotherapie> findByProtocoleInclusionId(Long id){
        return dao.findByProtocoleInclusionId(id);
    }
    public int deleteByProtocoleInclusionId(Long id){
        return dao.deleteByProtocoleInclusionId(id);
    }
    public List<PrescriptionRadiotherapie> findByStatutRadiotherapieCode(String code){
        return dao.findByStatutRadiotherapieCode(code);
    }
     public int deleteByStatutRadiotherapieCode(String code){
        return dao.deleteByStatutRadiotherapieCode(code);
    }
    public List<PrescriptionRadiotherapie> findByValidateurSimulationId(Long id){
        return dao.findByValidateurSimulationId(id);
    }
    public int deleteByValidateurSimulationId(Long id){
        return dao.deleteByValidateurSimulationId(id);
    }
    public List<PrescriptionRadiotherapie> findByPatientId(Long id){
        return dao.findByPatientId(id);
    }
    public int deleteByPatientId(Long id){
        return dao.deleteByPatientId(id);
    }
    public List<PrescriptionRadiotherapie> findByTypeTraitementCode(String code){
        return dao.findByTypeTraitementCode(code);
    }
     public int deleteByTypeTraitementCode(String code){
        return dao.deleteByTypeTraitementCode(code);
    }

    public void configure() {
        super.configure(PrescriptionRadiotherapie.class, PrescriptionRadiotherapieDto.class, PrescriptionRadiotherapieHistory.class, PrescriptionRadiotherapieHistoryCriteria.class, PrescriptionRadiotherapieSpecification.class);
    }

    @Autowired
    private ModaliteRadiotherapieAdminService modaliteRadiotherapieService ;
    @Autowired
    private SeanceRadiotherapieAdminService seanceRadiotherapieService ;
    @Autowired
    private PatientAdminService patientService ;
    @Autowired
    private HistortiquePrescriptionRadiotherapieAdminService histortiquePrescriptionRadiotherapieService ;
    @Autowired
    private StatutRadiotherapieAdminService statutRadiotherapieService ;
    @Autowired
    private SiteAdminService siteService ;
    @Autowired
    private TypeTraitementAdminService typeTraitementService ;
    @Autowired
    private PersonnelAdminService personnelService ;
    @Autowired
    private ConsultationRadiotherapieAdminService consultationRadiotherapieService ;
    @Autowired
    private ViseeAdminService viseeService ;
    @Autowired
    private ProtocoleInclusionAdminService protocoleInclusionService ;
    public PrescriptionRadiotherapieAdminServiceImpl(PrescriptionRadiotherapieDao dao, PrescriptionRadiotherapieHistoryDao historyDao, PrescriptionRadiotherapieConverter converter) {
        super(dao, historyDao, converter);
    }

}