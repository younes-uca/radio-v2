package  ma.enova.radio.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.enova.radio.bean.core.TypeConsultationRadiotherapie;
import ma.enova.radio.bean.history.TypeConsultationRadiotherapieHistory;
import ma.enova.radio.dao.criteria.core.TypeConsultationRadiotherapieCriteria;
import ma.enova.radio.dao.criteria.history.TypeConsultationRadiotherapieHistoryCriteria;
import ma.enova.radio.service.facade.admin.TypeConsultationRadiotherapieAdminService;
import ma.enova.radio.ws.converter.TypeConsultationRadiotherapieConverter;
import ma.enova.radio.ws.dto.TypeConsultationRadiotherapieDto;
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

@Api("Manages typeConsultationRadiotherapie services")
@RestController
@RequestMapping("/api/typeConsultationRadiotherapie")
public class TypeConsultationRadiotherapieRestAdmin  extends AbstractController<TypeConsultationRadiotherapie, TypeConsultationRadiotherapieDto, TypeConsultationRadiotherapieHistory, TypeConsultationRadiotherapieCriteria, TypeConsultationRadiotherapieHistoryCriteria, TypeConsultationRadiotherapieAdminService, TypeConsultationRadiotherapieConverter> {

    @ApiOperation("Finds a list of all typeConsultationRadiotherapies")
    @GetMapping("")
    public ResponseEntity<List<TypeConsultationRadiotherapieDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  typeConsultationRadiotherapie")
    @PutMapping("")
    public ResponseEntity<TypeConsultationRadiotherapieDto> update(@RequestBody TypeConsultationRadiotherapieDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a typeConsultationRadiotherapie by id")
    @GetMapping("{id}")
    public ResponseEntity<TypeConsultationRadiotherapieDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  typeConsultationRadiotherapie")
    @PostMapping("")
    public ResponseEntity<TypeConsultationRadiotherapieDto> save(@RequestBody TypeConsultationRadiotherapieDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of typeConsultationRadiotherapie")
    @DeleteMapping("/delete")
    public ResponseEntity<List<TypeConsultationRadiotherapieDto>> delete(@RequestBody List<TypeConsultationRadiotherapieDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified typeConsultationRadiotherapie")
    @DeleteMapping("")
    public ResponseEntity<TypeConsultationRadiotherapieDto> delete(@RequestBody TypeConsultationRadiotherapieDto dto) throws Exception {
            return super.delete(dto);
    }
    @ApiOperation("find by services id")
    @GetMapping("services/id/{id}")
    public List<TypeConsultationRadiotherapie> findByServicesId(@PathVariable Long id){
        return service.findByServicesId(id);
    }
    @ApiOperation("delete by services id")
    @DeleteMapping("services/id/{id}")
    public int deleteByServicesId(@PathVariable Long id){
        return service.deleteByServicesId(id);
    }
    @ApiOperation("Finds typeConsultationRadiotherapies by criteria")
    @PostMapping("listByCriteria")
    public ResponseEntity<List<TypeConsultationRadiotherapieDto>> findByCriteria(@RequestBody TypeConsultationRadiotherapieCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated typeConsultationRadiotherapies by criteria")
    @PostMapping("paginatedListByCriteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody TypeConsultationRadiotherapieCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports typeConsultationRadiotherapies by criteria")
    @PostMapping("exportTypeConsultationRadiotherapies")
    public ResponseEntity<InputStreamResource> export(@RequestBody TypeConsultationRadiotherapieCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets typeConsultationRadiotherapie data size by criteria")
    @PostMapping("getTypeConsultationRadiotherapiesDataSize")
    public ResponseEntity<Integer> getDataSize(@RequestBody TypeConsultationRadiotherapieCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets typeConsultationRadiotherapie history by id")
    @GetMapping("histTypeConsultationRadiotherapie/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets typeConsultationRadiotherapie paginated history by criteria")
    @PostMapping("paginatedListHistByCriteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody TypeConsultationRadiotherapieHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports typeConsultationRadiotherapie history by criteria")
    @PostMapping("exportTypeConsultationRadiotherapiesHist")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody TypeConsultationRadiotherapieHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets typeConsultationRadiotherapie history data size by criteria")
    @PostMapping("getHistTypeConsultationRadiotherapiesDataSize")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody TypeConsultationRadiotherapieHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    @ApiOperation("Gets typeConsultationRadiotherapie next ordre value")
    @GetMapping(value = "/getNextOrdre")
    public ResponseEntity<Long> getNextOrdre() {
        Long nextOrdre = service.getNextOrdre();
        return new ResponseEntity<>(nextOrdre, HttpStatus.OK);
    }
    public TypeConsultationRadiotherapieRestAdmin (TypeConsultationRadiotherapieAdminService service, TypeConsultationRadiotherapieConverter converter) {
        super(service, converter);
    }


}