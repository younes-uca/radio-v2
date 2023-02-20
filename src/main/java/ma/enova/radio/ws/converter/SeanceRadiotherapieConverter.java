package ma.enova.radio.ws.converter;

import ma.enova.radio.bean.core.PrescriptionRadiotherapie;
import ma.enova.radio.bean.core.SeanceRadiotherapie;
import ma.enova.radio.bean.history.SeanceRadiotherapieHistory;
import ma.enova.radio.ws.dto.PrescriptionRadiotherapieDto;
import ma.enova.radio.ws.dto.SeanceRadiotherapieDto;
import ma.enova.radio.zynerator.converter.AbstractConverter;
import ma.enova.radio.zynerator.util.DateUtil;
import ma.enova.radio.zynerator.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SeanceRadiotherapieConverter extends AbstractConverter<SeanceRadiotherapie, SeanceRadiotherapieDto, SeanceRadiotherapieHistory> {

    @Autowired
    private PrescriptionRadiotherapieConverter prescriptionRadiotherapieConverter;
    private boolean prescriptionRadiotherapie;

    public SeanceRadiotherapieConverter() {
        super(SeanceRadiotherapie.class, SeanceRadiotherapieDto.class, SeanceRadiotherapieHistory.class);
    }

    @Override
    public SeanceRadiotherapie toItem(SeanceRadiotherapieDto dto) {
        if (dto == null) {
            return null;
        } else {
            SeanceRadiotherapie item = new SeanceRadiotherapie();
            if (StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if (StringUtil.isNotEmpty(dto.getCodeRdv()))
                item.setCodeRdv(dto.getCodeRdv());
            if (StringUtil.isNotEmpty(dto.getDatePrevu()))
                item.setDatePrevu(DateUtil.stringToDate(dto.getDatePrevu()));
            if (StringUtil.isNotEmpty(dto.getDateRealisation()))
                item.setDateRealisation(DateUtil.stringEnToDate(dto.getDateRealisation()));
            if (StringUtil.isNotEmpty(dto.getNumero()))
                item.setNumero(dto.getNumero());
            if (dto.getEffectue() != null)
                item.setEffectue(dto.getEffectue());
            if (StringUtil.isNotEmpty(dto.getCr()))
                item.setCr(dto.getCr());
            if (StringUtil.isNotEmpty(dto.getFichiers()))
                item.setFichiers(dto.getFichiers());
            if (dto.getPrescriptionRadiotherapie() != null && dto.getPrescriptionRadiotherapie().getId() != null) {
                item.setPrescriptionRadiotherapie(new PrescriptionRadiotherapie());
                item.getPrescriptionRadiotherapie().setId(dto.getPrescriptionRadiotherapie().getId());
            }


            return item;
        }
    }

    @Override
    public SeanceRadiotherapieDto toDto(SeanceRadiotherapie item) {
        if (item == null) {
            return null;
        } else {
            SeanceRadiotherapieDto dto = new SeanceRadiotherapieDto();
            if (StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if (StringUtil.isNotEmpty(item.getCodeRdv()))
                dto.setCodeRdv(item.getCodeRdv());
            if (item.getDatePrevu() != null)
                dto.setDatePrevu(DateUtil.dateToString(item.getDatePrevu()));
            if (item.getDateRealisation() != null)
                dto.setDateRealisation(DateUtil.dateToString(item.getDateRealisation()));
            if (StringUtil.isNotEmpty(item.getNumero()))
                dto.setNumero(item.getNumero());
            dto.setEffectue(item.getEffectue());
            if (StringUtil.isNotEmpty(item.getCr()))
                dto.setCr(item.getCr());
            if (StringUtil.isNotEmpty(item.getFichiers()))
                dto.setFichiers(item.getFichiers());
            if (this.prescriptionRadiotherapie && item.getPrescriptionRadiotherapie() != null) {
                //dto.setPrescriptionRadiotherapie(prescriptionRadiotherapieConverter.toDto(item.getPrescriptionRadiotherapie()));
                if(dto.getPrescriptionRadiotherapie()==null){
                    dto.setPrescriptionRadiotherapie(new PrescriptionRadiotherapieDto());
                }
                dto.getPrescriptionRadiotherapie().setId(item.getPrescriptionRadiotherapie().getId());
            }
            return dto;
        }
    }

    @Override
    public void initObject(boolean value) {
        this.prescriptionRadiotherapie = value;
    }

   /* public PrescriptionRadiotherapieConverter getPrescriptionRadiotherapieConverter() {
        return this.prescriptionRadiotherapieConverter;
    }

    public void setPrescriptionRadiotherapieConverter(PrescriptionRadiotherapieConverter prescriptionRadiotherapieConverter) {
        this.prescriptionRadiotherapieConverter = prescriptionRadiotherapieConverter;
    }*/


    public boolean isPrescriptionRadiotherapie() {
        return this.prescriptionRadiotherapie;
    }

    public void setPrescriptionRadiotherapie(boolean prescriptionRadiotherapie) {
        this.prescriptionRadiotherapie = prescriptionRadiotherapie;
    }
}
