package ma.enova.radio.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.enova.radio.bean.core.Specialite;
import ma.enova.radio.bean.history.SpecialiteHistory;
import ma.enova.radio.dao.criteria.core.SpecialiteCriteria;
import ma.enova.radio.dao.criteria.history.SpecialiteHistoryCriteria;
import ma.enova.radio.service.facade.admin.SpecialiteAdminService;
import ma.enova.radio.ws.converter.SpecialiteConverter;
import ma.enova.radio.ws.dto.SpecialiteDto;
import ma.enova.radio.zynerator.controller.AbstractController;
import ma.enova.radio.zynerator.dto.AuditEntityDto;
import ma.enova.radio.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api("Manages specialite services")
@RestController
@RequestMapping("/api/specialite")
public class SpecialiteRestAdmin  extends AbstractController<Specialite, SpecialiteDto, SpecialiteHistory, SpecialiteCriteria, SpecialiteHistoryCriteria, SpecialiteAdminService, SpecialiteConverter> {

    @ApiOperation("Finds a list of all specialites")
    @GetMapping("")
    public ResponseEntity<List<SpecialiteDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Updates the specified  specialite")
    @PutMapping("")
    public ResponseEntity<SpecialiteDto> update(@RequestBody SpecialiteDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a specialite by id")
    @GetMapping("{id}")
    public ResponseEntity<SpecialiteDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  specialite")
    @PostMapping("")
    public ResponseEntity<SpecialiteDto> save(@RequestBody SpecialiteDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of specialite")
    @DeleteMapping("/delete")
    public ResponseEntity<List<SpecialiteDto>> delete(@RequestBody List<SpecialiteDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified specialite")
    @DeleteMapping("")
    public ResponseEntity<SpecialiteDto> delete(@RequestBody SpecialiteDto dto) throws Exception {
            return super.delete(dto);
    }
    @ApiOperation("find by services id")
    @GetMapping("services/id/{id}")
    public List<Specialite> findByServicesId(@PathVariable Long id){
        return service.findByServicesId(id);
    }
    @ApiOperation("delete by services id")
    @DeleteMapping("services/id/{id}")
    public int deleteByServicesId(@PathVariable Long id){
        return service.deleteByServicesId(id);
    }
    @ApiOperation("Finds specialites by criteria")
    @PostMapping("listByCriteria")
    public ResponseEntity<List<SpecialiteDto>> findByCriteria(@RequestBody SpecialiteCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated specialites by criteria")
    @PostMapping("paginatedListByCriteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody SpecialiteCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports specialites by criteria")
    @PostMapping("exportSpecialites")
    public ResponseEntity<InputStreamResource> export(@RequestBody SpecialiteCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets specialite data size by criteria")
    @PostMapping("getSpecialitesDataSize")
    public ResponseEntity<Integer> getDataSize(@RequestBody SpecialiteCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets specialite history by id")
    @GetMapping("histSpecialite/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets specialite paginated history by criteria")
    @PostMapping("paginatedListHistByCriteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody SpecialiteHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports specialite history by criteria")
    @PostMapping("exportSpecialitesHist")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody SpecialiteHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets specialite history data size by criteria")
    @PostMapping("getHistSpecialitesDataSize")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody SpecialiteHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    @ApiOperation("Gets specialite next ordre value")
    @GetMapping(value = "/getNextOrdre")
    public ResponseEntity<Long> getNextOrdre() {
        Long nextOrdre = service.getNextOrdre();
        return new ResponseEntity<>(nextOrdre, HttpStatus.OK);
    }
    public SpecialiteRestAdmin (SpecialiteAdminService service, SpecialiteConverter converter) {
        super(service, converter);
    }


}