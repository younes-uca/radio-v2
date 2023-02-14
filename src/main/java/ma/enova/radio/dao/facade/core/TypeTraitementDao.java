package ma.enova.radio.dao.facade.core;



import ma.enova.radio.zynerator.repository.AbstractRepository;
import ma.enova.radio.bean.core.TypeTraitement;
import org.springframework.stereotype.Repository;
import ma.enova.radio.bean.core.TypeTraitement;
import java.util.List;


@Repository
public interface TypeTraitementDao extends AbstractRepository<TypeTraitement,Long> {
    TypeTraitement findByCode(String code);
    int deleteByCode(String code);


}
