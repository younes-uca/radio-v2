package ma.enova.radio.dao.facade.core;



import ma.enova.radio.zynerator.repository.AbstractRepository;
import ma.enova.radio.bean.core.TypeToxiciteRth;
import org.springframework.stereotype.Repository;
import ma.enova.radio.bean.core.TypeToxiciteRth;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;


@Repository
public interface TypeToxiciteRthDao extends AbstractRepository<TypeToxiciteRth,Long> {
    TypeToxiciteRth findByCode(String code);
    int deleteByCode(String code);

    List<TypeToxiciteRth> findByServicesId(Long id);
    int deleteByServicesId(Long id);

    @Query(value = "SELECT MAX(item.ordre) FROM TypeToxiciteRth item where item.etablissementId = :etablissementId")
    Long findMaxOrdreByEtablissementIdOrder(@Param("etablissementId") Long etablissementId);
}
