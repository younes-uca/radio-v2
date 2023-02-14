package ma.enova.radio.service.impl.admin;

import ma.enova.radio.bean.core.TypeTraitement;
import ma.enova.radio.bean.history.TypeTraitementHistory;
import ma.enova.radio.dao.criteria.core.TypeTraitementCriteria;
import ma.enova.radio.dao.criteria.history.TypeTraitementHistoryCriteria;
import ma.enova.radio.dao.facade.core.TypeTraitementDao;
import ma.enova.radio.dao.facade.history.TypeTraitementHistoryDao;
import ma.enova.radio.dao.specification.core.TypeTraitementSpecification;
import ma.enova.radio.service.facade.admin.TypeTraitementAdminService;
import ma.enova.radio.ws.converter.TypeTraitementConverter;
import ma.enova.radio.ws.dto.TypeTraitementDto;
import ma.enova.radio.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;
import java.util.List;




import java.util.List;

@Service
public class TypeTraitementAdminServiceImpl extends AbstractServiceImpl<TypeTraitement, TypeTraitementDto,TypeTraitementHistory, TypeTraitementCriteria, TypeTraitementHistoryCriteria, TypeTraitementDao,
TypeTraitementHistoryDao, TypeTraitementConverter> implements TypeTraitementAdminService {


    public TypeTraitement findByReferenceEntity(TypeTraitement t){
        return  dao.findByCode(t.getCode());
    }
    public void findOrSaveAssociatedObject(TypeTraitement t){
        if( t != null) {
        }
    }


    public void configure() {
        super.configure(TypeTraitement.class, TypeTraitementDto.class, TypeTraitementHistory.class, TypeTraitementHistoryCriteria.class, TypeTraitementSpecification.class);
    }

    public TypeTraitementAdminServiceImpl(TypeTraitementDao dao, TypeTraitementHistoryDao historyDao, TypeTraitementConverter converter) {
        super(dao, historyDao, converter);
    }

}