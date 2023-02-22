package ma.enova.radio.service.facade.admin;

import ma.enova.radio.bean.core.PrescriptionRadiotherapie;
import ma.enova.radio.dao.criteria.core.PrescriptionRadiotherapieCriteria;
import ma.enova.radio.dao.criteria.history.PrescriptionRadiotherapieHistoryCriteria;
import ma.enova.radio.ws.dto.PrescriptionRadiotherapieDto;
import ma.enova.radio.zynerator.service.IService;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;


public interface PrescriptionRadiotherapieAdminService extends IService<PrescriptionRadiotherapie, PrescriptionRadiotherapieDto, PrescriptionRadiotherapieCriteria, PrescriptionRadiotherapieHistoryCriteria> {

    List<PrescriptionRadiotherapie> findByDecisionTraitementCode(String code);

    List<PrescriptionRadiotherapie> findByPatientIpp(String ipp);
    @Transactional
    void updateAsSimuler(Long id, Long statutRadiotherapieId, LocalDateTime dateSimulation, Long immobilistion, Long positionnement, String fichierTraitement, LocalDateTime validateurSimulationDate, Long validateurId);

    void updateAsValiderSimulation(Long id, Long statutRadiotherapieId, LocalDateTime validateurSimulationDate, Long validateurId);

    void updateAsCloturerTraitement(Long id, Long statutRadiotherapieId, LocalDateTime dateFinTraitement, String cr);

    void updateStatutPrescription(PrescriptionRadiotherapie item, String codeNewStatut);
    
    void updateNombreSeanceRealise(Long id, Integer nombreSeanceRealise);

    PrescriptionRadiotherapie findWithSeance(Long id);

    List<PrescriptionRadiotherapie> findByMedecinPrescripteurId(Long id);

    int deleteByMedecinPrescripteurId(Long id);

    List<PrescriptionRadiotherapie> findBySiteId(Long id);

    int deleteBySiteId(Long id);

    List<PrescriptionRadiotherapie> findByModaliteRadiotherapieId(Long id);

    int deleteByModaliteRadiotherapieId(Long id);

    List<PrescriptionRadiotherapie> findByViseeId(Long id);

    int deleteByViseeId(Long id);

    List<PrescriptionRadiotherapie> findByProtocoleInclusionId(Long id);

    int deleteByProtocoleInclusionId(Long id);

    List<PrescriptionRadiotherapie> findByStatutRadiotherapieCode(String code);

    int deleteByStatutRadiotherapieCode(String code);

    List<PrescriptionRadiotherapie> findByValidateurSimulationId(Long id);

    int deleteByValidateurSimulationId(Long id);

    List<PrescriptionRadiotherapie> findByPatientId(Long id);

    int deleteByPatientId(Long id);

    List<PrescriptionRadiotherapie> findByTypeTraitementCode(String code);

    int deleteByTypeTraitementCode(String code);


}
