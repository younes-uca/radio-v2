package ma.enova.radio.dao.facade.core;



import ma.enova.radio.zynerator.repository.AbstractRepository;
import ma.enova.radio.bean.core.Immobilistion;
import org.springframework.stereotype.Repository;
import ma.enova.radio.bean.core.Immobilistion;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;


@Repository
public interface ImmobilistionDao extends AbstractRepository<Immobilistion,Long> {
    Immobilistion findByCode(String code);
    int deleteByCode(String code);

    List<Immobilistion> findByServicesId(Long id);
    int deleteByServicesId(Long id);

    @Query(value = "SELECT MAX(item.ordre) FROM Immobilistion item where item.etablissementId = :etablissementId")
    Long findMaxOrdreByEtablissementIdOrder(@Param("etablissementId") Long etablissementId);
}
