package ma.enova.radio.dao.facade.core;


import ma.enova.radio.bean.core.StatutRadiotherapie;
import ma.enova.radio.zynerator.repository.AbstractRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StatutRadiotherapieDao extends AbstractRepository<StatutRadiotherapie,Long> {
    StatutRadiotherapie findByCode(String code);
    int deleteByCode(String code);


}
