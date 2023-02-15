package ma.enova.radio.service.impl.admin;

import ma.enova.radio.bean.core.StatutRadiotherapie;
import ma.enova.radio.bean.history.StatutRadiotherapieHistory;
import ma.enova.radio.dao.criteria.core.StatutRadiotherapieCriteria;
import ma.enova.radio.dao.criteria.history.StatutRadiotherapieHistoryCriteria;
import ma.enova.radio.dao.facade.core.StatutRadiotherapieDao;
import ma.enova.radio.dao.facade.history.StatutRadiotherapieHistoryDao;
import ma.enova.radio.dao.specification.core.StatutRadiotherapieSpecification;
import ma.enova.radio.service.facade.admin.StatutRadiotherapieAdminService;
import ma.enova.radio.ws.converter.StatutRadiotherapieConverter;
import ma.enova.radio.ws.dto.StatutRadiotherapieDto;
import ma.enova.radio.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class StatutRadiotherapieAdminServiceImpl extends AbstractServiceImpl<StatutRadiotherapie, StatutRadiotherapieDto, StatutRadiotherapieHistory, StatutRadiotherapieCriteria, StatutRadiotherapieHistoryCriteria, StatutRadiotherapieDao,
        StatutRadiotherapieHistoryDao, StatutRadiotherapieConverter> implements StatutRadiotherapieAdminService {


    public StatutRadiotherapie findByReferenceEntity(StatutRadiotherapie t) {
        return dao.findByCode(t.getCode());
    }

    public void findOrSaveAssociatedObject(StatutRadiotherapie t) {
        if (t != null) {
        }
    }


    public void configure() {
        super.configure(StatutRadiotherapie.class, StatutRadiotherapieDto.class, StatutRadiotherapieHistory.class, StatutRadiotherapieHistoryCriteria.class, StatutRadiotherapieSpecification.class);
    }

    public StatutRadiotherapieAdminServiceImpl(StatutRadiotherapieDao dao, StatutRadiotherapieHistoryDao historyDao, StatutRadiotherapieConverter converter) {
        super(dao, historyDao, converter);
    }

    @Override
    public StatutRadiotherapie findByCode(String code) {
        return dao.findByCode(code);
    }
}