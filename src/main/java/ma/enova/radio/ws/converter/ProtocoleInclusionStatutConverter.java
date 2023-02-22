package ma.enova.radio.ws.converter;

import ma.enova.radio.bean.core.ProtocoleInclusionStatut;
import ma.enova.radio.bean.history.ProtocoleInclusionStatutHistory;
import ma.enova.radio.ws.dto.ProtocoleInclusionStatutDto;
import ma.enova.radio.zynerator.converter.AbstractConverter;
import ma.enova.radio.zynerator.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProtocoleInclusionStatutConverter extends AbstractConverter<ProtocoleInclusionStatut, ProtocoleInclusionStatutDto, ProtocoleInclusionStatutHistory> {

    @Autowired
    private ServicesConverter servicesConverter ;
    private boolean services;

    public ProtocoleInclusionStatutConverter(){
        super(ProtocoleInclusionStatut.class, ProtocoleInclusionStatutDto.class, ProtocoleInclusionStatutHistory.class);
    }

    @Override
    public ProtocoleInclusionStatut toItem(ProtocoleInclusionStatutDto dto) {
        if (dto == null) {
            return null;
        } else {
        ProtocoleInclusionStatut item = new ProtocoleInclusionStatut();
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
    public ProtocoleInclusionStatutDto toDto(ProtocoleInclusionStatut item) {
        if (item == null) {
            return null;
        } else {
            ProtocoleInclusionStatutDto dto = new ProtocoleInclusionStatutDto();
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
