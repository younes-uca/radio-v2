package ma.enova.radio.dao.facade.core;



import ma.enova.radio.zynerator.repository.AbstractRepository;
import ma.enova.radio.bean.core.SeanceRadiotherapie;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;


@Repository
public interface SeanceRadiotherapieDao extends AbstractRepository<SeanceRadiotherapie,Long> {

    List<SeanceRadiotherapie> findByPrescriptionRadiotherapieId(Long id);
    int deleteByPrescriptionRadiotherapieId(Long id);
    
    @Modifying
    @Query(value = "UPDATE SeanceRadiotherapie seanceRadiotherapie set seanceRadiotherapie.effectue = IF (seanceRadiotherapie.effectue, 0, 1)  WHERE seanceRadiotherapie.id=:id")
    public void updateEtatEffectue(@Param("id") Long id);
    
    

}
