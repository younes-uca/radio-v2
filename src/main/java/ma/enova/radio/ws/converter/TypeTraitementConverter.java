package  ma.enova.radio.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.enova.radio.zynerator.util.StringUtil;
import ma.enova.radio.zynerator.converter.AbstractConverter;
import ma.enova.radio.zynerator.util.DateUtil;
import ma.enova.radio.bean.history.TypeTraitementHistory;
import ma.enova.radio.bean.core.TypeTraitement;
import ma.enova.radio.ws.dto.TypeTraitementDto;

@Component
public class TypeTraitementConverter extends AbstractConverter<TypeTraitement, TypeTraitementDto, TypeTraitementHistory> {


    public  TypeTraitementConverter(){
        super(TypeTraitement.class, TypeTraitementDto.class, TypeTraitementHistory.class);
    }

    @Override
    public TypeTraitement toItem(TypeTraitementDto dto) {
        if (dto == null) {
            return null;
        } else {
        TypeTraitement item = new TypeTraitement();
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
    public TypeTraitementDto toDto(TypeTraitement item) {
        if (item == null) {
            return null;
        } else {
            TypeTraitementDto dto = new TypeTraitementDto();
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
