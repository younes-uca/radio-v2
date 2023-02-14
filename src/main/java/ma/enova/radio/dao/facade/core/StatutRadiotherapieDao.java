package ma.enova.radio.dao.facade.core;



import ma.enova.radio.zynerator.repository.AbstractRepository;
import ma.enova.radio.bean.core.StatutRadiotherapie;
import org.springframework.stereotype.Repository;
import ma.enova.radio.bean.core.StatutRadiotherapie;
import java.util.List;


@Repository
public interface StatutRadiotherapieDao extends AbstractRepository<StatutRadiotherapie,Long> {
    StatutRadiotherapie findByCode(String code);
    int deleteByCode(String code);


}
