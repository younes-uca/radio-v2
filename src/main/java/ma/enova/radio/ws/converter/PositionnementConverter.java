package ma.enova.radio.ws.converter;

import ma.enova.radio.bean.core.Positionnement;
import ma.enova.radio.bean.history.PositionnementHistory;
import ma.enova.radio.ws.dto.PositionnementDto;
import ma.enova.radio.zynerator.converter.AbstractReferentielConverter;
import ma.enova.radio.zynerator.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PositionnementConverter extends AbstractReferentielConverter<Positionnement, PositionnementDto, PositionnementHistory> {

    @Autowired
    private ServicesConverter servicesConverter;
    private boolean services;

    public PositionnementConverter() {
        super(Positionnement.class, PositionnementDto.class, PositionnementHistory.class);
    }

    @Override
    public Positionnement toItem(PositionnementDto dto) {
        if (dto == null) {
            return null;
        } else {
            Positionnement item = new Positionnement();
            if (StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if (StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if (StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if (this.services && dto.getServices() != null)
                item.setServices(servicesConverter.toItem(dto.getServices()));
            convertRefentielAttribute(dto, item);


            return item;
        }
    }

    @Override
    public PositionnementDto toDto(Positionnement item) {
        if (item == null) {
            return null;
        } else {
            PositionnementDto dto = new PositionnementDto();
            if (StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if (StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if (StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());
            if (this.services && item.getServices() != null) {
                dto.setServices(servicesConverter.toDto(item.getServices()));
            }
            convertRefentielAttribute(item, dto);

            return dto;
        }
    }


    public ServicesConverter getServicesConverter() {
        return this.servicesConverter;
    }

    public void setServicesConverter(ServicesConverter servicesConverter) {
        this.servicesConverter = servicesConverter;
    }


    public boolean isServices() {
        return this.services;
    }

    public void setServices(boolean services) {
        this.services = services;
    }
}
