package ma.enova.radio.ws.converter;

import ma.enova.radio.bean.core.HistortiquePrescriptionRadiotherapie;
import ma.enova.radio.bean.core.PrescriptionRadiotherapie;
import ma.enova.radio.bean.history.HistortiquePrescriptionRadiotherapieHistory;
import ma.enova.radio.ws.dto.HistortiquePrescriptionRadiotherapieDto;
import ma.enova.radio.zynerator.converter.AbstractConverter;
import ma.enova.radio.zynerator.util.DateUtil;
import ma.enova.radio.zynerator.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HistortiquePrescriptionRadiotherapieConverter extends AbstractConverter<HistortiquePrescriptionRadiotherapie, HistortiquePrescriptionRadiotherapieDto, HistortiquePrescriptionRadiotherapieHistory> {

    @Autowired
    private StatutRadiotherapieConverter statutRadiotherapieConverter;
    @Autowired
    private PrescriptionRadiotherapieConverter prescriptionRadiotherapieConverter;
    private boolean prescriptionRadiotherapie;
    private boolean statutRadiotherapie;

    public HistortiquePrescriptionRadiotherapieConverter() {
        super(HistortiquePrescriptionRadiotherapie.class, HistortiquePrescriptionRadiotherapieDto.class, HistortiquePrescriptionRadiotherapieHistory.class);
        init(true);
    }

    @Override
    public HistortiquePrescriptionRadiotherapie toItem(HistortiquePrescriptionRadiotherapieDto dto) {

        if (dto == null) {
            return null;
        } else {
            HistortiquePrescriptionRadiotherapie item = new HistortiquePrescriptionRadiotherapie();
            if (StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if (StringUtil.isNotEmpty(dto.getDateHistortiquePrescriptionRadiotherapie()))
                item.setDateHistortiquePrescriptionRadiotherapie(DateUtil.stringEnToDate(dto.getDateHistortiquePrescriptionRadiotherapie()));
            if (StringUtil.isNotEmpty(dto.getDescription()))
                item.setDescription(dto.getDescription());
            if (dto.getPrescriptionRadiotherapie() != null && dto.getPrescriptionRadiotherapie().getId() != null) {
                item.setPrescriptionRadiotherapie(new PrescriptionRadiotherapie());
                item.getPrescriptionRadiotherapie().setId(dto.getPrescriptionRadiotherapie().getId());
            }

            if (this.statutRadiotherapie && dto.getStatutRadiotherapie() != null)
                item.setStatutRadiotherapie(statutRadiotherapieConverter.toItem(dto.getStatutRadiotherapie()));

            if (this.prescriptionRadiotherapie && dto.getPrescriptionRadiotherapie() != null)
                item.setPrescriptionRadiotherapie(prescriptionRadiotherapieConverter.toItem(dto.getPrescriptionRadiotherapie()));


            return item;
        }
    }

    @Override
    public HistortiquePrescriptionRadiotherapieDto toDto(HistortiquePrescriptionRadiotherapie item) {
        if (item == null) {
            return null;
        } else {
            prescriptionRadiotherapieConverter.init(false);
            HistortiquePrescriptionRadiotherapieDto dto = new HistortiquePrescriptionRadiotherapieDto();
            if (StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if (item.getDateHistortiquePrescriptionRadiotherapie() != null)
                dto.setDateHistortiquePrescriptionRadiotherapie(DateUtil.dateTimeToString(item.getDateHistortiquePrescriptionRadiotherapie()));
            if (StringUtil.isNotEmpty(item.getDescription()))
                dto.setDescription(item.getDescription());
            if (this.prescriptionRadiotherapie && item.getPrescriptionRadiotherapie() != null) {
                dto.setPrescriptionRadiotherapie(prescriptionRadiotherapieConverter.toDto(item.getPrescriptionRadiotherapie()));
            }
            if (this.statutRadiotherapie && item.getStatutRadiotherapie() != null) {
                dto.setStatutRadiotherapie(statutRadiotherapieConverter.toDto(item.getStatutRadiotherapie()));
            }
            return dto;
        }
    }


    public void initObject(boolean value) {
        statutRadiotherapie = value;
        prescriptionRadiotherapie = value;
    }

    public StatutRadiotherapieConverter getStatutRadiotherapieConverter() {
        return this.statutRadiotherapieConverter;
    }

    public void setStatutRadiotherapieConverter(StatutRadiotherapieConverter statutRadiotherapieConverter) {
        this.statutRadiotherapieConverter = statutRadiotherapieConverter;
    }

    public PrescriptionRadiotherapieConverter getPrescriptionRadiotherapieConverter() {
        return this.prescriptionRadiotherapieConverter;
    }

    public void setPrescriptionRadiotherapieConverter(PrescriptionRadiotherapieConverter prescriptionRadiotherapieConverter) {
        this.prescriptionRadiotherapieConverter = prescriptionRadiotherapieConverter;
    }


    public boolean isPrescriptionRadiotherapie() {
        return this.prescriptionRadiotherapie;
    }

    public void setPrescriptionRadiotherapie(boolean prescriptionRadiotherapie) {
        this.prescriptionRadiotherapie = prescriptionRadiotherapie;
    }

    public boolean isStatutRadiotherapie() {
        return this.statutRadiotherapie;
    }

    public void setStatutRadiotherapie(boolean statutRadiotherapie) {
        this.statutRadiotherapie = statutRadiotherapie;
    }
}
