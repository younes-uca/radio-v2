package ma.enova.radio.dao.facade.core;


import ma.enova.radio.bean.core.PrescriptionRadiotherapie;
import ma.enova.radio.zynerator.repository.AbstractRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;


@Repository
public interface PrescriptionRadiotherapieDao extends AbstractRepository<PrescriptionRadiotherapie, Long> {


    @Modifying
    @Query(value = "UPDATE PrescriptionRadiotherapie p set p.statutRadiotherapie.id=:statutRadiotherapieId , p.dateSimulation =:dateSimulation , p.immobilistion.id=:immobilistion , p.positionnement.id=:positionnement , p.fichierTraitements =:fichierTraitement , p.validateurSimulationDate =:validateurSimulationDate , p.validateurSimulation.id=:validateurId   WHERE p.id=:id")
    public void updateAsSimuler(@Param("id") Long id, @Param("statutRadiotherapieId") Long statutRadiotherapieId, @Param("dateSimulation") LocalDateTime dateSimulation, @Param("immobilistion") Long immobilistion, @Param("positionnement") Long positionnement, @Param("fichierTraitement") String fichierTraitement, @Param("validateurSimulationDate") LocalDateTime validateurSimulationDate, @Param("validateurId") Long validateurId);

    @Modifying
    @Query(value = "UPDATE PrescriptionRadiotherapie p set p.statutRadiotherapie.id=:statutRadiotherapieId , p.validateurSimulationDate =:validateurSimulationDate , p.validateurSimulation.id=:validateurId  WHERE p.id=:id")
    public void updateAsValiderSimulation(@Param("id") Long id, @Param("statutRadiotherapieId") Long statutRadiotherapieId, @Param("validateurSimulationDate") LocalDateTime validateurSimulationDate, @Param("validateurId") Long validateurId);

    @Modifying
    @Query(value = "UPDATE PrescriptionRadiotherapie p set p.statutRadiotherapie.id=:statutRadiotherapieId , p.dateFinTraitement =:dateFinTraitement , p.compteRendu=:compteRendu  WHERE p.id=:id")
    public void updateAsCloturerTraitement(@Param("id") Long id, @Param("statutRadiotherapieId") Long statutRadiotherapieId, @Param("dateFinTraitement") LocalDateTime dateFinTraitement, @Param("compteRendu") String compteRendu);

    @Modifying
    @Query(value = "UPDATE PrescriptionRadiotherapie p set p.nombreSeanceRealise=:nombreSeanceRealise   WHERE p.id=:id")
    public void updateNombreSeanceRealise(@Param("id") Long id, @Param("nombreSeanceRealise") Integer nombreSeanceRealise);

    List<PrescriptionRadiotherapie> findByDecisionTraitementCode(String code);

    List<PrescriptionRadiotherapie> findByPatientIpp(String ipp);

    List<PrescriptionRadiotherapie> findByMedecinPrescripteurId(Long id);

    int deleteByMedecinPrescripteurId(Long id);

    List<PrescriptionRadiotherapie> findBySiteId(Long id);

    int deleteBySiteId(Long id);

    List<PrescriptionRadiotherapie> findByModaliteRadiotherapieId(Long id);

    int deleteByModaliteRadiotherapieId(Long id);

    List<PrescriptionRadiotherapie> findByViseeId(Long id);

    int deleteByViseeId(Long id);

    List<PrescriptionRadiotherapie> findByProtocoleInclusionId(Long id);

    int deleteByProtocoleInclusionId(Long id);

    List<PrescriptionRadiotherapie> findByStatutRadiotherapieCode(String code);

    int deleteByStatutRadiotherapieCode(String code);

    List<PrescriptionRadiotherapie> findByValidateurSimulationId(Long id);

    int deleteByValidateurSimulationId(Long id);

    List<PrescriptionRadiotherapie> findByPatientId(Long id);

    int deleteByPatientId(Long id);

    List<PrescriptionRadiotherapie> findByTypeTraitementCode(String code);

    int deleteByTypeTraitementCode(String code);

}
