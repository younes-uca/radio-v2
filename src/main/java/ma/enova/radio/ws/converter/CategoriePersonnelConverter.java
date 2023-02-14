package  ma.enova.radio.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.enova.radio.zynerator.util.StringUtil;
import ma.enova.radio.zynerator.converter.AbstractConverter;
import ma.enova.radio.zynerator.util.DateUtil;
import ma.enova.radio.bean.history.CategoriePersonnelHistory;
import ma.enova.radio.bean.core.CategoriePersonnel;
import ma.enova.radio.ws.dto.CategoriePersonnelDto;

@Component
public class CategoriePersonnelConverter extends AbstractConverter<CategoriePersonnel, CategoriePersonnelDto, CategoriePersonnelHistory> {

    @Autowired
    private ServicesConverter servicesConverter ;
    private boolean services;

    public  CategoriePersonnelConverter(){
        super(CategoriePersonnel.class, CategoriePersonnelDto.class, CategoriePersonnelHistory.class);
    }

    @Override
    public CategoriePersonnel toItem(CategoriePersonnelDto dto) {
        if (dto == null) {
            return null;
        } else {
        CategoriePersonnel item = new CategoriePersonnel();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(this.services && dto.getServices()!=null)
                item.setServices(servicesConverter.toItem(dto.getServices())) ;



        return item;
        }
    }

    @Override
    public CategoriePersonnelDto toDto(CategoriePersonnel item) {
        if (item == null) {
            return null;
        } else {
            CategoriePersonnelDto dto = new CategoriePersonnelDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
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
