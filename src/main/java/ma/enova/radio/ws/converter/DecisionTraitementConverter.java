package ma.enova.radio.ws.converter;

import ma.enova.radio.bean.core.DecisionTraitement;
import ma.enova.radio.bean.core.StatutRadiotherapie;
import ma.enova.radio.bean.history.DecisionTraitementHistory;
import ma.enova.radio.required.dto.dmc.DecisionTraitementDto;
import ma.enova.radio.zynerator.converter.AbstractConverter;
import ma.enova.radio.zynerator.util.DateUtil;
import ma.enova.radio.zynerator.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DecisionTraitementConverter extends AbstractConverter<DecisionTraitement, DecisionTraitementDto, DecisionTraitementHistory> {

    @Autowired
    private StatutRadiotherapieConverter statutRadiotherapieConverter;
    private boolean statutRadiotherapie;

    public DecisionTraitementConverter() {
        super(DecisionTraitement.class, DecisionTraitementDto.class, DecisionTraitementHistory.class);
    }

    @Override
    public DecisionTraitement toItem(DecisionTraitementDto dto) {
        if (dto == null) {
            return null;
        } else {
            DecisionTraitement item = new DecisionTraitement();
            if (StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if (StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if (StringUtil.isNotEmpty(dto.getDateDecisionTraitement()))
                item.setDateDecisionTraitement(DateUtil.stringToDate(dto.getDateDecisionTraitement()));

            if (StringUtil.isNotEmpty(dto.getDecisionTherapeutique()))
                item.setDecisionTherapeutique(dto.getDecisionTherapeutique());
            if (this.statutRadiotherapie && StringUtil.isNotEmpty(dto.getEtat())) {
                if(item.getStatutRadiotherapie()==null){
                    item.setStatutRadiotherapie(new StatutRadiotherapie());
                }
                item.getStatutRadiotherapie().setCode(dto.getEtat());
            }


            return item;
        }
    }

    @Override
    public DecisionTraitementDto toDto(DecisionTraitement item) {
        if (item == null) {
            return null;
        } else {
            DecisionTraitementDto dto = new DecisionTraitementDto();
            if (StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if (StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if (StringUtil.isNotEmpty(item.getDecisionTherapeutique()))
                dto.setDecisionTherapeutique(item.getDecisionTherapeutique());

            if (this.statutRadiotherapie && item.getStatutRadiotherapie()!=null && StringUtil.isNotEmpty(item.getStatutRadiotherapie().getCode())) {
                dto.setCode(item.getStatutRadiotherapie().getCode());
            }
            return dto;
        }
    }

    public StatutRadiotherapieConverter getStatutRadiotherapieConverter() {
        return statutRadiotherapieConverter;
    }

    public void setStatutRadiotherapieConverter(StatutRadiotherapieConverter statutRadiotherapieConverter) {
        this.statutRadiotherapieConverter = statutRadiotherapieConverter;
    }

    public boolean isStatutRadiotherapie() {
        return statutRadiotherapie;
    }

    public void setStatutRadiotherapie(boolean statutRadiotherapie) {
        this.statutRadiotherapie = statutRadiotherapie;
    }
}
