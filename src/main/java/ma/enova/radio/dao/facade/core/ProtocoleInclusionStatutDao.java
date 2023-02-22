package ma.enova.radio.dao.facade.core;


import ma.enova.radio.bean.core.ProtocoleInclusionStatut;
import ma.enova.radio.zynerator.repository.AbstractRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProtocoleInclusionStatutDao extends AbstractRepository<ProtocoleInclusionStatut,Long> {
    ProtocoleInclusionStatut findByName(String name);
    int deleteByName(String name);

    List<ProtocoleInclusionStatut> findByServicesId(Long id);
    int deleteByServicesId(Long id);

    @Query(value = "SELECT MAX(item.ordre) FROM ProtocoleInclusionStatut item where item.etablissementId = :etablissementId")
    Long findMaxOrdreByEtablissementIdOrder(@Param("etablissementId") Long etablissementId);
}
