package ma.enova.radio.ws.converter;

import ma.enova.radio.bean.core.StatutMedicaleConsultationRadiotherapie;
import ma.enova.radio.bean.history.StatutMedicaleConsultationRadiotherapieHistory;
import ma.enova.radio.ws.dto.StatutMedicaleConsultationRadiotherapieDto;
import ma.enova.radio.zynerator.converter.AbstractConverter;
import ma.enova.radio.zynerator.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StatutMedicaleConsultationRadiotherapieConverter extends AbstractConverter<StatutMedicaleConsultationRadiotherapie, StatutMedicaleConsultationRadiotherapieDto, StatutMedicaleConsultationRadiotherapieHistory> {

    @Autowired
    private ServicesConverter servicesConverter ;
    private boolean services;

    public  StatutMedicaleConsultationRadiotherapieConverter(){
        super(StatutMedicaleConsultationRadiotherapie.class, StatutMedicaleConsultationRadiotherapieDto.class, StatutMedicaleConsultationRadiotherapieHistory.class);
    }

    @Override
    public StatutMedicaleConsultationRadiotherapie toItem(StatutMedicaleConsultationRadiotherapieDto dto) {
        if (dto == null) {
            return null;
        } else {
        StatutMedicaleConsultationRadiotherapie item = new StatutMedicaleConsultationRadiotherapie();
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
    public StatutMedicaleConsultationRadiotherapieDto toDto(StatutMedicaleConsultationRadiotherapie item) {
        if (item == null) {
            return null;
        } else {
            StatutMedicaleConsultationRadiotherapieDto dto = new StatutMedicaleConsultationRadiotherapieDto();
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
