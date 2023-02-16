package ma.enova.radio.dao.facade.core;



import ma.enova.radio.zynerator.repository.AbstractRepository;
import ma.enova.radio.bean.core.HistortiquePrescriptionRadiotherapie;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface HistortiquePrescriptionRadiotherapieDao extends AbstractRepository<HistortiquePrescriptionRadiotherapie,Long> {

    List<HistortiquePrescriptionRadiotherapie> findByPrescriptionRadiotherapieId(Long id);
    HistortiquePrescriptionRadiotherapie findByPrescriptionRadiotherapieIdAndStatutRadiotherapieCode(Long id,String code);
    int deleteByPrescriptionRadiotherapieId(Long id);
    List<HistortiquePrescriptionRadiotherapie> findByStatutRadiotherapieCode(String code);
    int deleteByStatutRadiotherapieCode(String code);

}
