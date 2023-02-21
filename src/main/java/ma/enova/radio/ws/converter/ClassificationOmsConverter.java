package ma.enova.radio.ws.converter;

import ma.enova.radio.bean.core.ClassificationOms;
import ma.enova.radio.bean.history.ClassificationOmsHistory;
import ma.enova.radio.ws.dto.ClassificationOmsDto;
import ma.enova.radio.zynerator.converter.AbstractConverter;
import ma.enova.radio.zynerator.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClassificationOmsConverter extends AbstractConverter<ClassificationOms, ClassificationOmsDto, ClassificationOmsHistory> {

    @Autowired
    private ServicesConverter servicesConverter ;
    private boolean services;

    public  ClassificationOmsConverter(){
        super(ClassificationOms.class, ClassificationOmsDto.class, ClassificationOmsHistory.class);
    }

    @Override
    public ClassificationOms toItem(ClassificationOmsDto dto) {
        if (dto == null) {
            return null;
        } else {
        ClassificationOms item = new ClassificationOms();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if(this.services && dto.getServices()!=null)
                item.setServices(servicesConverter.toItem(dto.getServices())) ;



        return item;
        }
    }

    @Override
    public ClassificationOmsDto toDto(ClassificationOms item) {
        if (item == null) {
            return null;
        } else {
            ClassificationOmsDto dto = new ClassificationOmsDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());
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
