package ma.enova.radio.dao.facade.core;


import ma.enova.radio.bean.core.DecisionTraitement;
import ma.enova.radio.zynerator.repository.AbstractRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DecisionTraitementDao extends AbstractRepository<DecisionTraitement, Long> {
    DecisionTraitement findByCode(String code);

    int deleteByCode(String code);
}
