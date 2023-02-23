package ma.enova.radio.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.enova.radio.bean.core.ProtocoleInclusionStatut;
import ma.enova.radio.bean.history.ProtocoleInclusionStatutHistory;
import ma.enova.radio.dao.criteria.core.ProtocoleInclusionStatutCriteria;
import ma.enova.radio.dao.criteria.history.ProtocoleInclusionStatutHistoryCriteria;
import ma.enova.radio.service.facade.admin.ProtocoleInclusionStatutAdminService;
import ma.enova.radio.ws.converter.ProtocoleInclusionStatutConverter;
import ma.enova.radio.ws.dto.ProtocoleInclusionStatutDto;
import ma.enova.radio.zynerator.controller.AbstractController;
import ma.enova.radio.zynerator.dto.AuditEntityDto;
import ma.enova.radio.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api("Manages protocoleInclusionStatut services")
@RestController
@RequestMapping("/api/protocoleInclusionStatut")
public class ProtocoleInclusionStatutRestAdmin extends AbstractController<ProtocoleInclusionStatut, ProtocoleInclusionStatutDto, ProtocoleInclusionStatutHistory, ProtocoleInclusionStatutCriteria, ProtocoleInclusionStatutHistoryCriteria, ProtocoleInclusionStatutAdminService, ProtocoleInclusionStatutConverter> {

    @ApiOperation("Finds a list of all protocoleInclusionStatuts")
    @GetMapping("")
    public ResponseEntity<List<ProtocoleInclusionStatutDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  protocoleInclusionStatut")
    @PutMapping("")
    public ResponseEntity<ProtocoleInclusionStatutDto> update(@RequestBody ProtocoleInclusionStatutDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a protocoleInclusionStatut by id")
    @GetMapping("{id}")
    public ResponseEntity<ProtocoleInclusionStatutDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  protocoleInclusionStatut")
    @PostMapping("")
    public ResponseEntity<ProtocoleInclusionStatutDto> save(@RequestBody ProtocoleInclusionStatutDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of protocoleInclusionStatut")
    @DeleteMapping("/delete")
    public ResponseEntity<List<ProtocoleInclusionStatutDto>> delete(@RequestBody List<ProtocoleInclusionStatutDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified protocoleInclusionStatut")
    @DeleteMapping("")
    public ResponseEntity<ProtocoleInclusionStatutDto> delete(@RequestBody ProtocoleInclusionStatutDto dto) throws Exception {
            return super.delete(dto);
    }
    @ApiOperation("find by services id")
    @GetMapping("services/id/{id}")
    public List<ProtocoleInclusionStatut> findByServicesId(@PathVariable Long id){
        return service.findByServicesId(id);
    }
    @ApiOperation("delete by services id")
    @DeleteMapping("services/id/{id}")
    public int deleteByServicesId(@PathVariable Long id){
        return service.deleteByServicesId(id);
    }
    @ApiOperation("Finds protocoleInclusionStatuts by criteria")
    @PostMapping("listByCriteria")
    public ResponseEntity<List<ProtocoleInclusionStatutDto>> findByCriteria(@RequestBody ProtocoleInclusionStatutCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated protocoleInclusionStatuts by criteria")
    @PostMapping("paginatedListByCriteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody ProtocoleInclusionStatutCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports protocoleInclusionStatuts by criteria")
    @PostMapping("exportProtocoleInclusionStatuts")
    public ResponseEntity<InputStreamResource> export(@RequestBody ProtocoleInclusionStatutCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets protocoleInclusionStatut data size by criteria")
    @PostMapping("getProtocoleInclusionStatutsDataSize")
    public ResponseEntity<Integer> getDataSize(@RequestBody ProtocoleInclusionStatutCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets protocoleInclusionStatut history by id")
    @GetMapping("histProtocoleInclusionStatut/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets protocoleInclusionStatut paginated history by criteria")
    @PostMapping("paginatedListHistByCriteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody ProtocoleInclusionStatutHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports protocoleInclusionStatut history by criteria")
    @PostMapping("exportProtocoleInclusionStatutsHist")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody ProtocoleInclusionStatutHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets protocoleInclusionStatut history data size by criteria")
    @PostMapping("getHistProtocoleInclusionStatutsDataSize")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody ProtocoleInclusionStatutHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    @ApiOperation("Gets protocoleInclusionStatut next ordre value")
    @GetMapping(value = "/getNextOrdre")
    public ResponseEntity<Long> getNextOrdre() {
        Long nextOrdre = service.getNextOrdre();
        return new ResponseEntity<>(nextOrdre, HttpStatus.OK);
    }
    public ProtocoleInclusionStatutRestAdmin(ProtocoleInclusionStatutAdminService service, ProtocoleInclusionStatutConverter converter) {
        super(service, converter);
    }


}