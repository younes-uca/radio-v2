package ma.enova.radio.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.enova.radio.bean.core.DecisionTherapeutique;
import ma.enova.radio.bean.history.DecisionTherapeutiqueHistory;
import ma.enova.radio.dao.criteria.core.DecisionTherapeutiqueCriteria;
import ma.enova.radio.dao.criteria.history.DecisionTherapeutiqueHistoryCriteria;
import ma.enova.radio.service.facade.admin.DecisionTherapeutiqueAdminService;
import ma.enova.radio.ws.converter.DecisionTherapeutiqueConverter;
import ma.enova.radio.ws.dto.DecisionTherapeutiqueDto;
import ma.enova.radio.zynerator.controller.AbstractController;
import ma.enova.radio.zynerator.dto.AuditEntityDto;
import ma.enova.radio.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api("Manages decisionTherapeutique services")
@RestController
@RequestMapping("/api/decisionTherapeutique")
public class DecisionTherapeutiqueRestAdmin extends AbstractController<DecisionTherapeutique, DecisionTherapeutiqueDto, DecisionTherapeutiqueHistory, DecisionTherapeutiqueCriteria, DecisionTherapeutiqueHistoryCriteria, DecisionTherapeutiqueAdminService, DecisionTherapeutiqueConverter> {

    @ApiOperation("Finds a list of all decisionTherapeutiques")
    @GetMapping("")
    public ResponseEntity<List<DecisionTherapeutiqueDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  decisionTherapeutique")
    @PutMapping("")
    public ResponseEntity<DecisionTherapeutiqueDto> update(@RequestBody DecisionTherapeutiqueDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a decisionTherapeutique by id")
    @GetMapping("{id}")
    public ResponseEntity<DecisionTherapeutiqueDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  decisionTherapeutique")
    @PostMapping("")
    public ResponseEntity<DecisionTherapeutiqueDto> save(@RequestBody DecisionTherapeutiqueDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of decisionTherapeutique")
    @DeleteMapping("/delete")
    public ResponseEntity<List<DecisionTherapeutiqueDto>> delete(@RequestBody List<DecisionTherapeutiqueDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified decisionTherapeutique")
    @DeleteMapping("")
    public ResponseEntity<DecisionTherapeutiqueDto> delete(@RequestBody DecisionTherapeutiqueDto dto) throws Exception {
            return super.delete(dto);
    }
    @ApiOperation("find by services id")
    @GetMapping("services/id/{id}")
    public List<DecisionTherapeutique> findByServicesId(@PathVariable Long id){
        return service.findByServicesId(id);
    }
    @ApiOperation("delete by services id")
    @DeleteMapping("services/id/{id}")
    public int deleteByServicesId(@PathVariable Long id){
        return service.deleteByServicesId(id);
    }
    @ApiOperation("Finds decisionTherapeutiques by criteria")
    @PostMapping("listByCriteria")
    public ResponseEntity<List<DecisionTherapeutiqueDto>> findByCriteria(@RequestBody DecisionTherapeutiqueCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated decisionTherapeutiques by criteria")
    @PostMapping("paginatedListByCriteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody DecisionTherapeutiqueCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports decisionTherapeutiques by criteria")
    @PostMapping("exportDecisionTherapeutiques")
    public ResponseEntity<InputStreamResource> export(@RequestBody DecisionTherapeutiqueCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets decisionTherapeutique data size by criteria")
    @PostMapping("getDecisionTherapeutiquesDataSize")
    public ResponseEntity<Integer> getDataSize(@RequestBody DecisionTherapeutiqueCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets decisionTherapeutique history by id")
    @GetMapping("histDecisionTherapeutique/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets decisionTherapeutique paginated history by criteria")
    @PostMapping("paginatedListHistByCriteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody DecisionTherapeutiqueHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports decisionTherapeutique history by criteria")
    @PostMapping("exportDecisionTherapeutiquesHist")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody DecisionTherapeutiqueHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets decisionTherapeutique history data size by criteria")
    @PostMapping("getHistDecisionTherapeutiquesDataSize")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody DecisionTherapeutiqueHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    @ApiOperation("Gets decisionTherapeutique next ordre value")
    @GetMapping(value = "/getNextOrdre")
    public ResponseEntity<Long> getNextOrdre() {
        Long nextOrdre = service.getNextOrdre();
        return new ResponseEntity<>(nextOrdre, HttpStatus.OK);
    }
    public DecisionTherapeutiqueRestAdmin(DecisionTherapeutiqueAdminService service, DecisionTherapeutiqueConverter converter) {
        super(service, converter);
    }


}