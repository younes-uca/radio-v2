package  ma.enova.radio.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.enova.radio.zynerator.util.StringUtil;
import ma.enova.radio.zynerator.converter.AbstractConverter;
import ma.enova.radio.zynerator.util.DateUtil;
import ma.enova.radio.bean.history.StatutRadiotherapieHistory;
import ma.enova.radio.bean.core.StatutRadiotherapie;
import ma.enova.radio.ws.dto.StatutRadiotherapieDto;

@Component
public class StatutRadiotherapieConverter extends AbstractConverter<StatutRadiotherapie, StatutRadiotherapieDto, StatutRadiotherapieHistory> {


    public  StatutRadiotherapieConverter(){
        super(StatutRadiotherapie.class, StatutRadiotherapieDto.class, StatutRadiotherapieHistory.class);
    }

    @Override
    public StatutRadiotherapie toItem(StatutRadiotherapieDto dto) {
        if (dto == null) {
            return null;
        } else {
        StatutRadiotherapie item = new StatutRadiotherapie();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if(StringUtil.isNotEmpty(dto.getStyle()))
                item.setStyle(dto.getStyle());


        return item;
        }
    }

    @Override
    public StatutRadiotherapieDto toDto(StatutRadiotherapie item) {
        if (item == null) {
            return null;
        } else {
            StatutRadiotherapieDto dto = new StatutRadiotherapieDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());
            if(StringUtil.isNotEmpty(item.getStyle()))
                dto.setStyle(item.getStyle());
        return dto;
        }
    }





}
