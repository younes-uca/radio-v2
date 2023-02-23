package  ma.enova.radio.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.enova.radio.bean.core.Immobilistion;
import ma.enova.radio.bean.history.ImmobilistionHistory;
import ma.enova.radio.dao.criteria.core.ImmobilistionCriteria;
import ma.enova.radio.dao.criteria.history.ImmobilistionHistoryCriteria;
import ma.enova.radio.service.facade.admin.ImmobilistionAdminService;
import ma.enova.radio.ws.converter.ImmobilistionConverter;
import ma.enova.radio.ws.dto.ImmobilistionDto;
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

@Api("Manages immobilistion services")
@RestController
@RequestMapping("/api/immobilistion")
public class ImmobilistionRestAdmin  extends AbstractController<Immobilistion, ImmobilistionDto, ImmobilistionHistory, ImmobilistionCriteria, ImmobilistionHistoryCriteria, ImmobilistionAdminService, ImmobilistionConverter> {

    @ApiOperation("Finds a list of all immobilistions")
    @GetMapping("")
    public ResponseEntity<List<ImmobilistionDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  immobilistion")
    @PutMapping("")
    public ResponseEntity<ImmobilistionDto> update(@RequestBody ImmobilistionDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a immobilistion by id")
    @GetMapping("{id}")
    public ResponseEntity<ImmobilistionDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  immobilistion")
    @PostMapping("")
    public ResponseEntity<ImmobilistionDto> save(@RequestBody ImmobilistionDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of immobilistion")
    @DeleteMapping("/delete")
    public ResponseEntity<List<ImmobilistionDto>> delete(@RequestBody List<ImmobilistionDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified immobilistion")
    @DeleteMapping("")
    public ResponseEntity<ImmobilistionDto> delete(@RequestBody ImmobilistionDto dto) throws Exception {
            return super.delete(dto);
    }
    @ApiOperation("find by services id")
    @GetMapping("services/id/{id}")
    public List<Immobilistion> findByServicesId(@PathVariable Long id){
        return service.findByServicesId(id);
    }
    @ApiOperation("delete by services id")
    @DeleteMapping("services/id/{id}")
    public int deleteByServicesId(@PathVariable Long id){
        return service.deleteByServicesId(id);
    }
    @ApiOperation("Finds immobilistions by criteria")
    @PostMapping("listByCriteria")
    public ResponseEntity<List<ImmobilistionDto>> findByCriteria(@RequestBody ImmobilistionCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated immobilistions by criteria")
    @PostMapping("paginatedListByCriteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody ImmobilistionCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports immobilistions by criteria")
    @PostMapping("exportImmobilistions")
    public ResponseEntity<InputStreamResource> export(@RequestBody ImmobilistionCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets immobilistion data size by criteria")
    @PostMapping("getImmobilistionsDataSize")
    public ResponseEntity<Integer> getDataSize(@RequestBody ImmobilistionCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets immobilistion history by id")
    @GetMapping("histImmobilistion/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets immobilistion paginated history by criteria")
    @PostMapping("paginatedListHistByCriteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody ImmobilistionHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports immobilistion history by criteria")
    @PostMapping("exportImmobilistionsHist")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody ImmobilistionHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets immobilistion history data size by criteria")
    @PostMapping("getHistImmobilistionsDataSize")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody ImmobilistionHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    @ApiOperation("Gets immobilistion next ordre value")
    @GetMapping(value = "/getNextOrdre")
    public ResponseEntity<Long> getNextOrdre() {
        Long nextOrdre = service.getNextOrdre();
        return new ResponseEntity<>(nextOrdre, HttpStatus.OK);
    }
    public ImmobilistionRestAdmin (ImmobilistionAdminService service, ImmobilistionConverter converter) {
        super(service, converter);
    }


}