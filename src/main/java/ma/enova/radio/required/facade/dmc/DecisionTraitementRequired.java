package  ma.enova.radio.required.facade.dmc;

import ma.enova.radio.required.dto.dmc.DecisionTraitementDto;
import ma.enova.radio.required.criteria.dmc.DecisionTraitementCriteria;
import ma.enova.radio.zynerator.required.AbstractRequired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/api/admin/decisionTraitement")
public class DecisionTraitementRequired extends AbstractRequired<DecisionTraitementDto, DecisionTraitementDto[]> {

    @Autowired
    RestTemplate restTemplate;

@Value("${ms.config.ms2.admin.url}")
    private String msUrl;
    private String localUrl = "decisionTraitement/";


    @GetMapping("")
    public List<DecisionTraitementDto> findAll() {
        return super.findAll();
    }

    @PostMapping("listByCriteria")
    public List<DecisionTraitementDto> findByCriteria(@RequestBody DecisionTraitementCriteria criteria) {
        return super.findByCriteria(criteria);
    }

    public DecisionTraitementRequired() {
        super(DecisionTraitementDto.class, DecisionTraitementDto[].class);
    }

    @Override
    public RestTemplate getRestTemplate() {
        return restTemplate;
    }
    @Override
    public String getMsUrl() {
        return msUrl;
    }
    @Override
    public String getLocalUrl() {
        return localUrl;
    }
}
