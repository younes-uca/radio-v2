package  ma.enova.radio.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.enova.radio.bean.core.HistortiquePrescriptionRadiotherapie;
import ma.enova.radio.bean.history.HistortiquePrescriptionRadiotherapieHistory;
import ma.enova.radio.dao.criteria.core.HistortiquePrescriptionRadiotherapieCriteria;
import ma.enova.radio.dao.criteria.history.HistortiquePrescriptionRadiotherapieHistoryCriteria;
import ma.enova.radio.service.facade.admin.HistortiquePrescriptionRadiotherapieAdminService;
import ma.enova.radio.ws.converter.HistortiquePrescriptionRadiotherapieConverter;
import ma.enova.radio.ws.dto.HistortiquePrescriptionRadiotherapieDto;
import ma.enova.radio.zynerator.controller.AbstractController;
import ma.enova.radio.zynerator.dto.AuditEntityDto;
import ma.enova.radio.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import ma.enova.radio.zynerator.process.Result;

@Api("Manages histortiquePrescriptionRadiotherapie services")
@RestController
@RequestMapping("/api/histortiquePrescriptionRadiotherapie")
public class HistortiquePrescriptionRadiotherapieRestAdmin  extends AbstractController<HistortiquePrescriptionRadiotherapie, HistortiquePrescriptionRadiotherapieDto, HistortiquePrescriptionRadiotherapieHistory, HistortiquePrescriptionRadiotherapieCriteria, HistortiquePrescriptionRadiotherapieHistoryCriteria, HistortiquePrescriptionRadiotherapieAdminService, HistortiquePrescriptionRadiotherapieConverter> {

    @ApiOperation("Finds a list of all histortiquePrescriptionRadiotherapies")
    @GetMapping("")
    public ResponseEntity<List<HistortiquePrescriptionRadiotherapieDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  histortiquePrescriptionRadiotherapie")
    @PutMapping("")
    public ResponseEntity<HistortiquePrescriptionRadiotherapieDto> update(@RequestBody HistortiquePrescriptionRadiotherapieDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a histortiquePrescriptionRadiotherapie by id")
    @GetMapping("{id}")
    public ResponseEntity<HistortiquePrescriptionRadiotherapieDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  histortiquePrescriptionRadiotherapie")
    @PostMapping("")
    public ResponseEntity<HistortiquePrescriptionRadiotherapieDto> save(@RequestBody HistortiquePrescriptionRadiotherapieDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of histortiquePrescriptionRadiotherapie")
    @DeleteMapping("/delete")
    public ResponseEntity<List<HistortiquePrescriptionRadiotherapieDto>> delete(@RequestBody List<HistortiquePrescriptionRadiotherapieDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified histortiquePrescriptionRadiotherapie")
    @DeleteMapping("")
    public ResponseEntity<HistortiquePrescriptionRadiotherapieDto> delete(HistortiquePrescriptionRadiotherapieDto dto) throws Exception {
            return super.delete(dto);
    }
    @ApiOperation("find by prescriptionRadiotherapie id")
    @GetMapping("prescriptionRadiotherapie/id/{id}")
    public List<HistortiquePrescriptionRadiotherapie> findByPrescriptionRadiotherapieId(@PathVariable Long id){
        return service.findByPrescriptionRadiotherapieId(id);
    }
    @ApiOperation("delete by prescriptionRadiotherapie id")
    @DeleteMapping("prescriptionRadiotherapie/id/{id}")
    public int deleteByPrescriptionRadiotherapieId(@PathVariable Long id){
        return service.deleteByPrescriptionRadiotherapieId(id);
    }
    @ApiOperation("find by statutRadiotherapie code")
    @GetMapping("statutRadiotherapie/code/{code}")
    public List<HistortiquePrescriptionRadiotherapie> findByStatutRadiotherapieCode(@PathVariable String code){
        return service.findByStatutRadiotherapieCode(code);
    }
    @ApiOperation("delete by statutRadiotherapie code")
    @DeleteMapping("statutRadiotherapie/code/{code}")
    public int deleteByStatutRadiotherapieCode(@PathVariable String code){
        return service.deleteByStatutRadiotherapieCode(code);
    }
    @ApiOperation("Finds histortiquePrescriptionRadiotherapies by criteria")
    @PostMapping("listByCriteria")
    public ResponseEntity<List<HistortiquePrescriptionRadiotherapieDto>> findByCriteria(@RequestBody HistortiquePrescriptionRadiotherapieCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated histortiquePrescriptionRadiotherapies by criteria")
    @PostMapping("paginatedListByCriteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody HistortiquePrescriptionRadiotherapieCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports histortiquePrescriptionRadiotherapies by criteria")
    @PostMapping("exportHistortiquePrescriptionRadiotherapies")
    public ResponseEntity<InputStreamResource> export(@RequestBody HistortiquePrescriptionRadiotherapieCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets histortiquePrescriptionRadiotherapie data size by criteria")
    @PostMapping("getHistortiquePrescriptionRadiotherapiesDataSize")
    public ResponseEntity<Integer> getDataSize(@RequestBody HistortiquePrescriptionRadiotherapieCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets histortiquePrescriptionRadiotherapie history by id")
    @GetMapping("histHistortiquePrescriptionRadiotherapie/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets histortiquePrescriptionRadiotherapie paginated history by criteria")
    @PostMapping("paginatedListHistByCriteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody HistortiquePrescriptionRadiotherapieHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports histortiquePrescriptionRadiotherapie history by criteria")
    @PostMapping("exportHistortiquePrescriptionRadiotherapiesHist")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody HistortiquePrescriptionRadiotherapieHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets histortiquePrescriptionRadiotherapie history data size by criteria")
    @PostMapping("getHistHistortiquePrescriptionRadiotherapiesDataSize")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody HistortiquePrescriptionRadiotherapieHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public HistortiquePrescriptionRadiotherapieRestAdmin (HistortiquePrescriptionRadiotherapieAdminService service, HistortiquePrescriptionRadiotherapieConverter converter) {
        super(service, converter);
    }


}