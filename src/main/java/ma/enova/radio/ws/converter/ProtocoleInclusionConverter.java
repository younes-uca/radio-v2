package  ma.enova.radio.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.enova.radio.zynerator.util.StringUtil;
import ma.enova.radio.zynerator.converter.AbstractConverter;
import ma.enova.radio.zynerator.util.DateUtil;
import ma.enova.radio.bean.history.ProtocoleInclusionHistory;
import ma.enova.radio.bean.core.ProtocoleInclusion;
import ma.enova.radio.ws.dto.ProtocoleInclusionDto;

@Component
public class ProtocoleInclusionConverter extends AbstractConverter<ProtocoleInclusion, ProtocoleInclusionDto, ProtocoleInclusionHistory> {

    @Autowired
    private ServicesConverter servicesConverter ;
    private boolean services;

    public  ProtocoleInclusionConverter(){
        super(ProtocoleInclusion.class, ProtocoleInclusionDto.class, ProtocoleInclusionHistory.class);
    }

    @Override
    public ProtocoleInclusion toItem(ProtocoleInclusionDto dto) {
        if (dto == null) {
            return null;
        } else {
        ProtocoleInclusion item = new ProtocoleInclusion();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if(StringUtil.isNotEmpty(dto.getDateInclusion()))
                item.setDateInclusion(DateUtil.stringEnToDate(dto.getDateInclusion()));
            if(StringUtil.isNotEmpty(dto.getProtocoleInclusionStatut()))
                item.setProtocoleInclusionStatut(dto.getProtocoleInclusionStatut());
            if(this.services && dto.getServices()!=null)
                item.setServices(servicesConverter.toItem(dto.getServices())) ;



        return item;
        }
    }

    @Override
    public ProtocoleInclusionDto toDto(ProtocoleInclusion item) {
        if (item == null) {
            return null;
        } else {
            ProtocoleInclusionDto dto = new ProtocoleInclusionDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());
            if(item.getDateInclusion()!=null)
                dto.setDateInclusion(DateUtil.dateTimeToString(item.getDateInclusion()));
            if(StringUtil.isNotEmpty(item.getProtocoleInclusionStatut()))
                dto.setProtocoleInclusionStatut(item.getProtocoleInclusionStatut());
        if(this.services && item.getServices()!=null) {
            dto.setServices(servicesConverter.toDto(item.getServices())) ;
        }
        return dto;
        }
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
