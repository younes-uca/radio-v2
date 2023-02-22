package ma.enova.radio.dao.facade.core;


import ma.enova.radio.bean.core.ProtocoleInclusion;
import ma.enova.radio.zynerator.repository.AbstractRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProtocoleInclusionDao extends AbstractRepository<ProtocoleInclusion,Long> {
    ProtocoleInclusion findByCode(String code);
    int deleteByCode(String code);

    List<ProtocoleInclusion> findByProtocoleInclusionStatutId(Long id);
    int deleteByProtocoleInclusionStatutId(Long id);
    List<ProtocoleInclusion> findByServicesId(Long id);
    int deleteByServicesId(Long id);

    @Query(value = "SELECT MAX(item.ordre) FROM ProtocoleInclusion item where item.etablissementId = :etablissementId")
    Long findMaxOrdreByEtablissementIdOrder(@Param("etablissementId") Long etablissementId);
}
