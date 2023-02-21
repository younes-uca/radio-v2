package  ma.enova.radio.ws.converter;

import org.springframework.stereotype.Component;


import ma.enova.radio.zynerator.util.StringUtil;
import ma.enova.radio.zynerator.converter.AbstractConverter;
import ma.enova.radio.zynerator.util.DateUtil;
import ma.enova.radio.bean.history.PatientHistory;
import ma.enova.radio.bean.core.Patient;
import ma.enova.radio.ws.dto.PatientDto;

@Component
public class PatientConverter extends AbstractConverter<Patient, PatientDto, PatientHistory> {


    public  PatientConverter(){
        super(Patient.class, PatientDto.class, PatientHistory.class);
    }

    @Override
    public Patient toItem(PatientDto dto) {
        if (dto == null) {
            return null;
        } else {
        Patient item = new Patient();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getIpp()))
                item.setIpp(dto.getIpp());
            if(StringUtil.isNotEmpty(dto.getNom()))
                item.setNom(dto.getNom());
            if(StringUtil.isNotEmpty(dto.getPrenom()))
                item.setPrenom(dto.getPrenom());
            if(StringUtil.isNotEmpty(dto.getSexe()))
                item.setSexe(dto.getSexe());
            if(StringUtil.isNotEmpty(dto.getDateNaissance()))
                item.setDateNaissance(DateUtil.stringEnToDate(dto.getDateNaissance()));
            if(StringUtil.isNotEmpty(dto.getNumeroClassement()))
                item.setNumeroDeClassement(dto.getNumeroClassement());
            if(StringUtil.isNotEmpty(dto.getAge()))
                item.setAge(dto.getAge());


        return item;
        }
    }

    @Override
    public PatientDto toDto(Patient item) {
        if (item == null) {
            return null;
        } else {
            PatientDto dto = new PatientDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getIpp()))
                dto.setIpp(item.getIpp());
            if(StringUtil.isNotEmpty(item.getNom()))
                dto.setNom(item.getNom());
            if(StringUtil.isNotEmpty(item.getPrenom()))
                dto.setPrenom(item.getPrenom());
            if(StringUtil.isNotEmpty(item.getSexe()))
                dto.setSexe(item.getSexe());
            if(item.getDateNaissance()!=null)
                dto.setDateNaissance(DateUtil.dateTimeToString(item.getDateNaissance()));
            if(StringUtil.isNotEmpty(item.getNumeroDeClassement()))
                dto.setNumeroClassement(item.getNumeroDeClassement());
            if(StringUtil.isNotEmpty(item.getAge()))
                dto.setAge(item.getAge());
        return dto;
        }
    }





}
