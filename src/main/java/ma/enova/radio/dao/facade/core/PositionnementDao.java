package ma.enova.radio.dao.facade.core;



import ma.enova.radio.zynerator.repository.AbstractRepository;
import ma.enova.radio.bean.core.Positionnement;
import org.springframework.stereotype.Repository;
import ma.enova.radio.bean.core.Positionnement;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;


@Repository
public interface PositionnementDao extends AbstractRepository<Positionnement,Long> {
    Positionnement findByCode(String code);
    int deleteByCode(String code);

    List<Positionnement> findByServicesId(Long id);
    int deleteByServicesId(Long id);

    @Query(value = "SELECT MAX(item.ordre) FROM Positionnement item where item.etablissementId = :etablissementId")
    Long findMaxOrdreByEtablissementIdOrder(@Param("etablissementId") Long etablissementId);
}
