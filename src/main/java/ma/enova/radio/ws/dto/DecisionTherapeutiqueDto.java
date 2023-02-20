package ma.enova.radio.ws.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.radio.zynerator.audit.Log;
import ma.enova.radio.zynerator.dto.AuditBaseDto;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class DecisionTherapeutiqueDto extends AuditBaseDto {

    private String name  ;
    private String displayText  ;

    private ServicesDto services ;


    public DecisionTherapeutiqueDto(){
        super();
    }



    @Log
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    @Log
    public String getDisplayText(){
        return this.displayText;
    }
    public void setDisplayText(String displayText){
        this.displayText = displayText;
    }


    public ServicesDto getServices(){
        return this.services;
    }

    public void setServices(ServicesDto services){
        this.services = services;
    }


}
