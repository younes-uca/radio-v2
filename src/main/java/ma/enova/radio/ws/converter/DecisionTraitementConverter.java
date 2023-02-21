package ma.enova.radio.ws.converter;

import ma.enova.radio.bean.core.DecisionTraitement;
import ma.enova.radio.bean.core.StatutRadiotherapie;
import ma.enova.radio.bean.history.DecisionTraitementHistory;
import ma.enova.radio.ws.dto.DecisionTraitementDto;
import ma.enova.radio.zynerator.converter.AbstractConverter;
import ma.enova.radio.zynerator.util.DateUtil;
import ma.enova.radio.zynerator.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DecisionTraitementConverter extends AbstractConverter<DecisionTraitement, DecisionTraitementDto, DecisionTraitementHistory> {
    @Autowired
    private DecisionTherapeutiqueConverter decisionTherapeutiqueConverter;
    @Autowired
    private StatutRadiotherapieConverter statutRadiotherapieConverter;
    private boolean decisionTherapeutique;
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

            if (this.decisionTherapeutique && dto.getDecisionTherapeutique() != null)
                item.setDecisionTherapeutique(decisionTherapeutiqueConverter.toItem(dto.getDecisionTherapeutique()));

            if (this.statutRadiotherapie && StringUtil.isNotEmpty(dto.getEtat())) {
                if (item.getStatutRadiotherapie() == null) {
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
            if (this.decisionTherapeutique && item.getDecisionTherapeutique() != null) {
                dto.setDecisionTherapeutique(decisionTherapeutiqueConverter.toDto(item.getDecisionTherapeutique()));
            }
            if (item.getDateDecisionTraitement() != null)
                dto.setDateDecisionTraitement(DateUtil.dateToString(item.getDateDecisionTraitement()));
            if (this.statutRadiotherapie && item.getStatutRadiotherapie() != null && StringUtil.isNotEmpty(item.getStatutRadiotherapie().getCode())) {
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

    public DecisionTherapeutiqueConverter getDecisionTherapeutiqueConverter() {
        return decisionTherapeutiqueConverter;
    }

    public void setDecisionTherapeutiqueConverter(DecisionTherapeutiqueConverter decisionTherapeutiqueConverter) {
        this.decisionTherapeutiqueConverter = decisionTherapeutiqueConverter;
    }

    public boolean isDecisionTherapeutique() {
        return decisionTherapeutique;
    }

    public void setDecisionTherapeutique(boolean decisionTherapeutique) {
        this.decisionTherapeutique = decisionTherapeutique;
    }

    public boolean isStatutRadiotherapie() {
        return statutRadiotherapie;
    }

    public void setStatutRadiotherapie(boolean statutRadiotherapie) {
        this.statutRadiotherapie = statutRadiotherapie;
    }
}
