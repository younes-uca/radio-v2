package ma.enova.radio.dao.facade.core;



import ma.enova.radio.zynerator.repository.AbstractRepository;
import ma.enova.radio.bean.core.TypeConsultationRadiotherapie;
import org.springframework.stereotype.Repository;
import ma.enova.radio.bean.core.TypeConsultationRadiotherapie;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;


@Repository
public interface TypeConsultationRadiotherapieDao extends AbstractRepository<TypeConsultationRadiotherapie,Long> {
    TypeConsultationRadiotherapie findByCode(String code);
    int deleteByCode(String code);

    List<TypeConsultationRadiotherapie> findByServicesId(Long id);
    int deleteByServicesId(Long id);

    @Query(value = "SELECT MAX(item.ordre) FROM TypeConsultationRadiotherapie item where item.etablissementId = :etablissementId")
    Long findMaxOrdreByEtablissementIdOrder(@Param("etablissementId") Long etablissementId);
}
