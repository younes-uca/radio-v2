package ma.enova.radio.ws.converter;

import ma.enova.radio.bean.core.Visee;
import ma.enova.radio.bean.history.ViseeHistory;
import ma.enova.radio.ws.dto.ViseeDto;
import ma.enova.radio.zynerator.converter.AbstractReferentielConverter;
import ma.enova.radio.zynerator.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ViseeConverter extends AbstractReferentielConverter<Visee, ViseeDto, ViseeHistory> {

    @Autowired
    private ServicesConverter servicesConverter;
    private boolean services;

    public ViseeConverter() {
        super(Visee.class, ViseeDto.class, ViseeHistory.class);
    }

    @Override
    public Visee toItem(ViseeDto dto) {
        if (dto == null) {
            return null;
        } else {
            Visee item = new Visee();
            if (StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if (StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if (StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if (StringUtil.isNotEmpty(dto.getDescription()))
                item.setDescription(dto.getDescription());
            if (this.services && dto.getServices() != null)
                item.setServices(servicesConverter.toItem(dto.getServices()));
            convertRefentielAttribute(dto, item);


            return item;
        }
    }

    @Override
    public ViseeDto toDto(Visee item) {
        if (item == null) {
            return null;
        } else {
            ViseeDto dto = new ViseeDto();
            if (StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if (StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if (StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());
            if (StringUtil.isNotEmpty(item.getDescription()))
                dto.setDescription(item.getDescription());
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
