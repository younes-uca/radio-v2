package  ma.enova.radio.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.enova.radio.bean.core.ProtocoleInclusion;
import ma.enova.radio.bean.history.ProtocoleInclusionHistory;
import ma.enova.radio.dao.criteria.core.ProtocoleInclusionCriteria;
import ma.enova.radio.dao.criteria.history.ProtocoleInclusionHistoryCriteria;
import ma.enova.radio.service.facade.admin.ProtocoleInclusionAdminService;
import ma.enova.radio.ws.converter.ProtocoleInclusionConverter;
import ma.enova.radio.ws.dto.ProtocoleInclusionDto;
import ma.enova.radio.zynerator.controller.AbstractController;
import ma.enova.radio.zynerator.dto.AuditEntityDto;
import ma.enova.radio.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.springframework.http.HttpStatus;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import ma.enova.radio.zynerator.process.Result;

@Api("Manages protocoleInclusion services")
@RestController
@RequestMapping("/api/protocoleInclusion")
public class ProtocoleInclusionRestAdmin  extends AbstractController<ProtocoleInclusion, ProtocoleInclusionDto, ProtocoleInclusionHistory, ProtocoleInclusionCriteria, ProtocoleInclusionHistoryCriteria, ProtocoleInclusionAdminService, ProtocoleInclusionConverter> {

    @ApiOperation("Finds a list of all protocoleInclusions")
    @GetMapping("")
    public ResponseEntity<List<ProtocoleInclusionDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  protocoleInclusion")
    @PutMapping("")
    public ResponseEntity<ProtocoleInclusionDto> update(@RequestBody ProtocoleInclusionDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a protocoleInclusion by id")
    @GetMapping("{id}")
    public ResponseEntity<ProtocoleInclusionDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  protocoleInclusion")
    @PostMapping("")
    public ResponseEntity<ProtocoleInclusionDto> save(@RequestBody ProtocoleInclusionDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of protocoleInclusion")
    @DeleteMapping("/delete")
    public ResponseEntity<List<ProtocoleInclusionDto>> delete(@RequestBody List<ProtocoleInclusionDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified protocoleInclusion")
    @DeleteMapping("")
    public ResponseEntity<ProtocoleInclusionDto> delete(@RequestBody ProtocoleInclusionDto dto) throws Exception {
            return super.delete(dto);
    }
    @ApiOperation("find by services id")
    @GetMapping("services/id/{id}")
    public List<ProtocoleInclusion> findByServicesId(@PathVariable Long id){
        return service.findByServicesId(id);
    }
    @ApiOperation("delete by services id")
    @DeleteMapping("services/id/{id}")
    public int deleteByServicesId(@PathVariable Long id){
        return service.deleteByServicesId(id);
    }
    @ApiOperation("Finds protocoleInclusions by criteria")
    @PostMapping("listByCriteria")
    public ResponseEntity<List<ProtocoleInclusionDto>> findByCriteria(@RequestBody ProtocoleInclusionCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated protocoleInclusions by criteria")
    @PostMapping("paginatedListByCriteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody ProtocoleInclusionCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports protocoleInclusions by criteria")
    @PostMapping("exportProtocoleInclusions")
    public ResponseEntity<InputStreamResource> export(@RequestBody ProtocoleInclusionCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets protocoleInclusion data size by criteria")
    @PostMapping("getProtocoleInclusionsDataSize")
    public ResponseEntity<Integer> getDataSize(@RequestBody ProtocoleInclusionCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets protocoleInclusion history by id")
    @GetMapping("histProtocoleInclusion/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets protocoleInclusion paginated history by criteria")
    @PostMapping("paginatedListHistByCriteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody ProtocoleInclusionHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports protocoleInclusion history by criteria")
    @PostMapping("exportProtocoleInclusionsHist")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody ProtocoleInclusionHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets protocoleInclusion history data size by criteria")
    @PostMapping("getHistProtocoleInclusionsDataSize")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody ProtocoleInclusionHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    @ApiOperation("Gets protocoleInclusion next ordre value")
    @GetMapping(value = "/getNextOrdre")
    public ResponseEntity<Long> getNextOrdre() {
        Long nextOrdre = service.getNextOrdre();
        return new ResponseEntity<>(nextOrdre, HttpStatus.OK);
    }
    public ProtocoleInclusionRestAdmin (ProtocoleInclusionAdminService service, ProtocoleInclusionConverter converter) {
        super(service, converter);
    }


}