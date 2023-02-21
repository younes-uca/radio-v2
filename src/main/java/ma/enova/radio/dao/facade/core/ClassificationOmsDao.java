package ma.enova.radio.dao.facade.core;


import ma.enova.radio.bean.core.ClassificationOms;
import ma.enova.radio.zynerator.repository.AbstractRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ClassificationOmsDao extends AbstractRepository<ClassificationOms,Long> {
    ClassificationOms findByCode(String code);
    int deleteByCode(String code);

    List<ClassificationOms> findByServicesId(Long id);
    int deleteByServicesId(Long id);

    @Query(value = "SELECT MAX(item.ordre) FROM ClassificationOms item where item.etablissementId = :etablissementId")
    Long findMaxOrdreByEtablissementIdOrder(@Param("etablissementId") Long etablissementId);
}
