package ma.enova.radio.service.facade.admin;

import java.util.List;
import ma.enova.radio.bean.core.PrescriptionRadiotherapie;
import ma.enova.radio.ws.dto.PrescriptionRadiotherapieDto;
import ma.enova.radio.zynerator.service.IService;
import ma.enova.radio.dao.criteria.core.PrescriptionRadiotherapieCriteria;
import ma.enova.radio.dao.criteria.history.PrescriptionRadiotherapieHistoryCriteria;


public interface PrescriptionRadiotherapieAdminService extends IService<PrescriptionRadiotherapie, PrescriptionRadiotherapieDto,PrescriptionRadiotherapieCriteria, PrescriptionRadiotherapieHistoryCriteria> {

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
