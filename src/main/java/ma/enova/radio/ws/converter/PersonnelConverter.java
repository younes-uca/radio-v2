package  ma.enova.radio.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.enova.radio.zynerator.util.StringUtil;
import ma.enova.radio.zynerator.converter.AbstractConverter;
import ma.enova.radio.zynerator.util.DateUtil;
import ma.enova.radio.bean.history.PersonnelHistory;
import ma.enova.radio.bean.core.Personnel;
import ma.enova.radio.ws.dto.PersonnelDto;

@Component
public class PersonnelConverter extends AbstractConverter<Personnel, PersonnelDto, PersonnelHistory> {

    @Autowired
    private CategoriePersonnelConverter categoriePersonnelConverter ;
    @Autowired
    private SpecialiteConverter specialiteConverter ;
    private boolean categoriePersonnel;
    private boolean specialite;

    public  PersonnelConverter(){
        super(Personnel.class, PersonnelDto.class, PersonnelHistory.class);
    }

    @Override
    public Personnel toItem(PersonnelDto dto) {
        if (dto == null) {
            return null;
        } else {
        Personnel item = new Personnel();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getLabel()))
                item.setLabel(dto.getLabel());
           /* if(StringUtil.isNotEmpty(dto.getIpp()))
                item.setIpp(dto.getIpp());
            if(StringUtil.isNotEmpty(dto.getAdresse()))
                item.setAdresse(dto.getAdresse());
            if(StringUtil.isNotEmpty(dto.getNom()))
                item.setNom(dto.getNom());
            if(StringUtil.isNotEmpty(dto.getPrenom()))
                item.setPrenom(dto.getPrenom());
            if(StringUtil.isNotEmpty(dto.getCin()))
                item.setCin(dto.getCin());
            if(StringUtil.isNotEmpty(dto.getTelephone()))
                item.setTelephone(dto.getTelephone());
            if(StringUtil.isNotEmpty(dto.getEmail()))
                item.setEmail(dto.getEmail());
            if(StringUtil.isNotEmpty(dto.getMobile()))
                item.setMobile(dto.getMobile());
            if(dto.getExpertise() != null)
                item.setExpertise(dto.getExpertise());
            if(this.categoriePersonnel && dto.getCategoriePersonnel()!=null)
                item.setCategoriePersonnel(categoriePersonnelConverter.toItem(dto.getCategoriePersonnel())) ;

            if(this.specialite && dto.getSpecialite()!=null)
                item.setSpecialite(specialiteConverter.toItem(dto.getSpecialite())) ;
*/


        return item;
        }
    }

    @Override
    public PersonnelDto toDto(Personnel item) {
        if (item == null) {
            return null;
        } else {
            PersonnelDto dto = new PersonnelDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getLabel()))
                dto.setLabel(item.getLabel());
           /* if(StringUtil.isNotEmpty(item.getIpp()))
                dto.setIpp(item.getIpp());
            if(StringUtil.isNotEmpty(item.getAdresse()))
                dto.setAdresse(item.getAdresse());
            if(StringUtil.isNotEmpty(item.getNom()))
                dto.setNom(item.getNom());
            if(StringUtil.isNotEmpty(item.getPrenom()))
                dto.setPrenom(item.getPrenom());
            if(StringUtil.isNotEmpty(item.getCin()))
                dto.setCin(item.getCin());
            if(StringUtil.isNotEmpty(item.getTelephone()))
                dto.setTelephone(item.getTelephone());
            if(StringUtil.isNotEmpty(item.getEmail()))
                dto.setEmail(item.getEmail());
            if(StringUtil.isNotEmpty(item.getMobile()))
                dto.setMobile(item.getMobile());
                dto.setExpertise(item.getExpertise());
        if(this.categoriePersonnel && item.getCategoriePersonnel()!=null) {
            dto.setCategoriePersonnel(categoriePersonnelConverter.toDto(item.getCategoriePersonnel())) ;
        }
        if(this.specialite && item.getSpecialite()!=null) {
            dto.setSpecialite(specialiteConverter.toDto(item.getSpecialite())) ;
        }*/
        return dto;
        }
    }



    public CategoriePersonnelConverter getCategoriePersonnelConverter(){
        return this.categoriePersonnelConverter;
    }
    public void setCategoriePersonnelConverter(CategoriePersonnelConverter categoriePersonnelConverter ){
        this.categoriePersonnelConverter = categoriePersonnelConverter;
    }
    public SpecialiteConverter getSpecialiteConverter(){
        return this.specialiteConverter;
    }
    public void setSpecialiteConverter(SpecialiteConverter specialiteConverter ){
        this.specialiteConverter = specialiteConverter;
    }


    public boolean  isCategoriePersonnel(){
        return this.categoriePersonnel;
    }
    public void  setCategoriePersonnel(boolean categoriePersonnel){
        this.categoriePersonnel = categoriePersonnel;
    }
    public boolean  isSpecialite(){
        return this.specialite;
    }
    public void  setSpecialite(boolean specialite){
        this.specialite = specialite;
    }
}
