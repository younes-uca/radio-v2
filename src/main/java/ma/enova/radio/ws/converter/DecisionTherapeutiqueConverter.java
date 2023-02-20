package ma.enova.radio.ws.converter;

import ma.enova.radio.bean.core.DecisionTherapeutique;
import ma.enova.radio.bean.history.DecisionTherapeutiqueHistory;
import ma.enova.radio.ws.dto.DecisionTherapeutiqueDto;
import ma.enova.radio.zynerator.converter.AbstractConverter;
import ma.enova.radio.zynerator.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DecisionTherapeutiqueConverter extends AbstractConverter<DecisionTherapeutique, DecisionTherapeutiqueDto, DecisionTherapeutiqueHistory> {

    @Autowired
    private ServicesConverter servicesConverter ;
    private boolean services;

    public DecisionTherapeutiqueConverter(){
        super(DecisionTherapeutique.class, DecisionTherapeutiqueDto.class, DecisionTherapeutiqueHistory.class);
    }

    @Override
    public DecisionTherapeutique toItem(DecisionTherapeutiqueDto dto) {
        if (dto == null) {
            return null;
        } else {
        DecisionTherapeutique item = new DecisionTherapeutique();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getName()))
                item.setName(dto.getName());
            if(StringUtil.isNotEmpty(dto.getDisplayText()))
                item.setDisplayText(dto.getDisplayText());
            if(this.services && dto.getServices()!=null)
                item.setServices(servicesConverter.toItem(dto.getServices())) ;



        return item;
        }
    }

    @Override
    public DecisionTherapeutiqueDto toDto(DecisionTherapeutique item) {
        if (item == null) {
            return null;
        } else {
            DecisionTherapeutiqueDto dto = new DecisionTherapeutiqueDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getName()))
                dto.setName(item.getName());
            if(StringUtil.isNotEmpty(item.getDisplayText()))
                dto.setDisplayText(item.getDisplayText());
        if(this.services && item.getServices()!=null) {
            dto.setServices(servicesConverter.toDto(item.getServices())) ;
        }
        return dto;
        }
    }


    public void initObject(boolean value) {
        this.services = value;
    }


    public ServicesConverter getServicesConverter(){
        return this.servicesConverter;
    }
    public void setServicesConverter(ServicesConverter servicesConverter ){
        this.servicesConverter = servicesConverter;
    }


    public boolean  isServices(){
        return this.services;
    }
    public void  setServices(boolean services){
        this.services = services;
    }
}
