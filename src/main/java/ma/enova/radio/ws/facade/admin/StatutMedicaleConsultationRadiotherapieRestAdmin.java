package ma.enova.radio.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.enova.radio.bean.core.StatutMedicaleConsultationRadiotherapie;
import ma.enova.radio.bean.history.StatutMedicaleConsultationRadiotherapieHistory;
import ma.enova.radio.dao.criteria.core.StatutMedicaleConsultationRadiotherapieCriteria;
import ma.enova.radio.dao.criteria.history.StatutMedicaleConsultationRadiotherapieHistoryCriteria;
import ma.enova.radio.service.facade.admin.StatutMedicaleConsultationRadiotherapieAdminService;
import ma.enova.radio.ws.converter.StatutMedicaleConsultationRadiotherapieConverter;
import ma.enova.radio.ws.dto.StatutMedicaleConsultationRadiotherapieDto;
import ma.enova.radio.zynerator.controller.AbstractController;
import ma.enova.radio.zynerator.dto.AuditEntityDto;
import ma.enova.radio.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api("Manages statutMedicaleConsultationRadiotherapie services")
@RestController
@RequestMapping("/api/statutMedicaleConsultationRadiotherapie")
public class StatutMedicaleConsultationRadiotherapieRestAdmin  extends AbstractController<StatutMedicaleConsultationRadiotherapie, StatutMedicaleConsultationRadiotherapieDto, StatutMedicaleConsultationRadiotherapieHistory, StatutMedicaleConsultationRadiotherapieCriteria, StatutMedicaleConsultationRadiotherapieHistoryCriteria, StatutMedicaleConsultationRadiotherapieAdminService, StatutMedicaleConsultationRadiotherapieConverter> {

    @ApiOperation("Finds a list of all statutMedicaleConsultationRadiotherapies")
    @GetMapping("")
    public ResponseEntity<List<StatutMedicaleConsultationRadiotherapieDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  statutMedicaleConsultationRadiotherapie")
    @PutMapping("")
    public ResponseEntity<StatutMedicaleConsultationRadiotherapieDto> update(@RequestBody StatutMedicaleConsultationRadiotherapieDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a statutMedicaleConsultationRadiotherapie by id")
    @GetMapping("{id}")
    public ResponseEntity<StatutMedicaleConsultationRadiotherapieDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  statutMedicaleConsultationRadiotherapie")
    @PostMapping("")
    public ResponseEntity<StatutMedicaleConsultationRadiotherapieDto> save(@RequestBody StatutMedicaleConsultationRadiotherapieDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of statutMedicaleConsultationRadiotherapie")
    @DeleteMapping("/delete")
    public ResponseEntity<List<StatutMedicaleConsultationRadiotherapieDto>> delete(@RequestBody List<StatutMedicaleConsultationRadiotherapieDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified statutMedicaleConsultationRadiotherapie")
    @DeleteMapping("")
    public ResponseEntity<StatutMedicaleConsultationRadiotherapieDto> delete(StatutMedicaleConsultationRadiotherapieDto dto) throws Exception {
            return super.delete(dto);
    }
    @ApiOperation("find by services id")
    @GetMapping("services/id/{id}")
    public List<StatutMedicaleConsultationRadiotherapie> findByServicesId(@PathVariable Long id){
        return service.findByServicesId(id);
    }
    @ApiOperation("delete by services id")
    @DeleteMapping("services/id/{id}")
    public int deleteByServicesId(@PathVariable Long id){
        return service.deleteByServicesId(id);
    }
    @ApiOperation("Finds statutMedicaleConsultationRadiotherapies by criteria")
    @PostMapping("listByCriteria")
    public ResponseEntity<List<StatutMedicaleConsultationRadiotherapieDto>> findByCriteria(@RequestBody StatutMedicaleConsultationRadiotherapieCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated statutMedicaleConsultationRadiotherapies by criteria")
    @PostMapping("paginatedListByCriteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody StatutMedicaleConsultationRadiotherapieCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports statutMedicaleConsultationRadiotherapies by criteria")
    @PostMapping("exportStatutMedicaleConsultationRadiotherapies")
    public ResponseEntity<InputStreamResource> export(@RequestBody StatutMedicaleConsultationRadiotherapieCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets statutMedicaleConsultationRadiotherapie data size by criteria")
    @PostMapping("getStatutMedicaleConsultationRadiotherapiesDataSize")
    public ResponseEntity<Integer> getDataSize(@RequestBody StatutMedicaleConsultationRadiotherapieCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets statutMedicaleConsultationRadiotherapie history by id")
    @GetMapping("histStatutMedicaleConsultationRadiotherapie/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets statutMedicaleConsultationRadiotherapie paginated history by criteria")
    @PostMapping("paginatedListHistByCriteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody StatutMedicaleConsultationRadiotherapieHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports statutMedicaleConsultationRadiotherapie history by criteria")
    @PostMapping("exportStatutMedicaleConsultationRadiotherapiesHist")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody StatutMedicaleConsultationRadiotherapieHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets statutMedicaleConsultationRadiotherapie history data size by criteria")
    @PostMapping("getHistStatutMedicaleConsultationRadiotherapiesDataSize")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody StatutMedicaleConsultationRadiotherapieHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    @ApiOperation("Gets statutMedicaleConsultationRadiotherapie next ordre value")
    @GetMapping(value = "/getNextOrdre")
    public ResponseEntity<Long> getNextOrdre() {
        Long nextOrdre = service.getNextOrdre();
        return new ResponseEntity<>(nextOrdre, HttpStatus.OK);
    }
    public StatutMedicaleConsultationRadiotherapieRestAdmin (StatutMedicaleConsultationRadiotherapieAdminService service, StatutMedicaleConsultationRadiotherapieConverter converter) {
        super(service, converter);
    }


}