package ma.enova.radio.dao.facade.core;



import ma.enova.radio.zynerator.repository.AbstractRepository;
import ma.enova.radio.bean.core.GradeToxiciteRth;
import org.springframework.stereotype.Repository;
import ma.enova.radio.bean.core.GradeToxiciteRth;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;


@Repository
public interface GradeToxiciteRthDao extends AbstractRepository<GradeToxiciteRth,Long> {
    GradeToxiciteRth findByCode(String code);
    int deleteByCode(String code);

    List<GradeToxiciteRth> findByServicesId(Long id);
    int deleteByServicesId(Long id);

    @Query(value = "SELECT MAX(item.ordre) FROM GradeToxiciteRth item where item.etablissementId = :etablissementId")
    Long findMaxOrdreByEtablissementIdOrder(@Param("etablissementId") Long etablissementId);
}
