package ma.enova.radio.service.facade.admin;

import java.util.List;
import ma.enova.radio.bean.core.SeanceRadiotherapie;
import ma.enova.radio.ws.dto.SeanceRadiotherapieDto;
import ma.enova.radio.zynerator.service.IService;
import ma.enova.radio.dao.criteria.core.SeanceRadiotherapieCriteria;
import ma.enova.radio.dao.criteria.history.SeanceRadiotherapieHistoryCriteria;


public interface SeanceRadiotherapieAdminService extends IService<SeanceRadiotherapie, SeanceRadiotherapieDto,SeanceRadiotherapieCriteria, SeanceRadiotherapieHistoryCriteria> {

    List<SeanceRadiotherapie> findByPrescriptionRadiotherapieId(Long id);
    int deleteByPrescriptionRadiotherapieId(Long id);
    
    public void updateEtatEffectue(Long id);



}
