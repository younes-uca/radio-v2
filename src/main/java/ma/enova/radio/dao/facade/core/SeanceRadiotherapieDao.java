package ma.enova.radio.dao.facade.core;



import ma.enova.radio.zynerator.repository.AbstractRepository;
import ma.enova.radio.bean.core.SeanceRadiotherapie;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface SeanceRadiotherapieDao extends AbstractRepository<SeanceRadiotherapie,Long> {

    List<SeanceRadiotherapie> findByPrescriptionRadiotherapieId(Long id);
    int deleteByPrescriptionRadiotherapieId(Long id);

}
