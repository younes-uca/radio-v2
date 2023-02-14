package ma.enova.radio.dao.facade.core;



import ma.enova.radio.zynerator.repository.AbstractRepository;
import ma.enova.radio.bean.core.Patient;
import org.springframework.stereotype.Repository;
import ma.enova.radio.bean.core.Patient;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;


@Repository
public interface PatientDao extends AbstractRepository<Patient,Long> {
    Patient findByIpp(String ipp);
    int deleteByIpp(String ipp);


    @Query(value = "SELECT MAX(item.ordre) FROM Patient item where item.etablissementId = :etablissementId")
    Long findMaxOrdreByEtablissementIdOrder(@Param("etablissementId") Long etablissementId);
}
