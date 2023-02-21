package ma.enova.radio.dao.facade.core;


import ma.enova.radio.bean.core.StatutMedicaleConsultationRadiotherapie;
import ma.enova.radio.zynerator.repository.AbstractRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface StatutMedicaleConsultationRadiotherapieDao extends AbstractRepository<StatutMedicaleConsultationRadiotherapie,Long> {
    StatutMedicaleConsultationRadiotherapie findByCode(String code);
    int deleteByCode(String code);

    List<StatutMedicaleConsultationRadiotherapie> findByServicesId(Long id);
    int deleteByServicesId(Long id);

    @Query(value = "SELECT MAX(item.ordre) FROM StatutMedicaleConsultationRadiotherapie item where item.etablissementId = :etablissementId")
    Long findMaxOrdreByEtablissementIdOrder(@Param("etablissementId") Long etablissementId);
}
