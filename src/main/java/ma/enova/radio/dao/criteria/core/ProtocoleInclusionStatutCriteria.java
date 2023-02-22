package ma.enova.radio.dao.criteria.core;


import ma.enova.radio.zynerator.criteria.BaseCriteria;

import java.util.List;



public class ProtocoleInclusionStatutCriteria extends BaseCriteria {

    private String name;
    private String nameLike;
    private String displayText;
    private String displayTextLike;

    private ServicesCriteria services ;
    private List<ServicesCriteria> servicess ;


    public ProtocoleInclusionStatutCriteria(){}

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getNameLike(){
        return this.nameLike;
    }
    public void setNameLike(String nameLike){
        this.nameLike = nameLike;
    }

    public String getDisplayText(){
        return this.displayText;
    }
    public void setDisplayText(String displayText){
        this.displayText = displayText;
    }
    public String getDisplayTextLike(){
        return this.displayTextLike;
    }
    public void setDisplayTextLike(String displayTextLike){
        this.displayTextLike = displayTextLike;
    }


    public ServicesCriteria getServices(){
        return this.services;
    }

    public void setServices(ServicesCriteria services){
        this.services = services;
    }
    public List<ServicesCriteria> getServicess(){
        return this.servicess;
    }

    public void setServicess(List<ServicesCriteria> servicess){
        this.servicess = servicess;
    }
}
