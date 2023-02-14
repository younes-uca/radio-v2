package ma.enova.radio.dao.facade.core;



import ma.enova.radio.zynerator.repository.AbstractRepository;
import ma.enova.radio.bean.core.Specialite;
import org.springframework.stereotype.Repository;
import ma.enova.radio.bean.core.Specialite;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;


@Repository
public interface SpecialiteDao extends AbstractRepository<Specialite,Long> {
    Specialite findByCode(String code);
    int deleteByCode(String code);

    List<Specialite> findByServicesId(Long id);
    int deleteByServicesId(Long id);

    @Query(value = "SELECT MAX(item.ordre) FROM Specialite item where item.etablissementId = :etablissementId")
    Long findMaxOrdreByEtablissementIdOrder(@Param("etablissementId") Long etablissementId);
}
