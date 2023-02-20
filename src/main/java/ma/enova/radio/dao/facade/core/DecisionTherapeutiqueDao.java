package ma.enova.radio.dao.facade.core;


import ma.enova.radio.bean.core.DecisionTherapeutique;
import ma.enova.radio.zynerator.repository.AbstractRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface DecisionTherapeutiqueDao extends AbstractRepository<DecisionTherapeutique,Long> {
    DecisionTherapeutique findByName(String name);
    int deleteByName(String name);

    List<DecisionTherapeutique> findByServicesId(Long id);
    int deleteByServicesId(Long id);

    @Query(value = "SELECT MAX(item.ordre) FROM DecisionTherapeutique item where item.etablissementId = :etablissementId")
    Long findMaxOrdreByEtablissementIdOrder(@Param("etablissementId") Long etablissementId);
}
