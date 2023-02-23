package  ma.enova.radio.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.enova.radio.bean.core.CategoriePersonnel;
import ma.enova.radio.bean.history.CategoriePersonnelHistory;
import ma.enova.radio.dao.criteria.core.CategoriePersonnelCriteria;
import ma.enova.radio.dao.criteria.history.CategoriePersonnelHistoryCriteria;
import ma.enova.radio.service.facade.admin.CategoriePersonnelAdminService;
import ma.enova.radio.ws.converter.CategoriePersonnelConverter;
import ma.enova.radio.ws.dto.CategoriePersonnelDto;
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

@Api("Manages categoriePersonnel services")
@RestController
@RequestMapping("/api/categoriePersonnel")
public class CategoriePersonnelRestAdmin  extends AbstractController<CategoriePersonnel, CategoriePersonnelDto, CategoriePersonnelHistory, CategoriePersonnelCriteria, CategoriePersonnelHistoryCriteria, CategoriePersonnelAdminService, CategoriePersonnelConverter> {

    @ApiOperation("Finds a list of all categoriePersonnels")
    @GetMapping("")
    public ResponseEntity<List<CategoriePersonnelDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  categoriePersonnel")
    @PutMapping("")
    public ResponseEntity<CategoriePersonnelDto> update(@RequestBody CategoriePersonnelDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a categoriePersonnel by id")
    @GetMapping("{id}")
    public ResponseEntity<CategoriePersonnelDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  categoriePersonnel")
    @PostMapping("")
    public ResponseEntity<CategoriePersonnelDto> save(@RequestBody CategoriePersonnelDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of categoriePersonnel")
    @DeleteMapping("/delete")
    public ResponseEntity<List<CategoriePersonnelDto>> delete(@RequestBody List<CategoriePersonnelDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified categoriePersonnel")
    @DeleteMapping("")
    public ResponseEntity<CategoriePersonnelDto> delete(@RequestBody CategoriePersonnelDto dto) throws Exception {
            return super.delete(dto);
    }
    @ApiOperation("find by services id")
    @GetMapping("services/id/{id}")
    public List<CategoriePersonnel> findByServicesId(@PathVariable Long id){
        return service.findByServicesId(id);
    }
    @ApiOperation("delete by services id")
    @DeleteMapping("services/id/{id}")
    public int deleteByServicesId(@PathVariable Long id){
        return service.deleteByServicesId(id);
    }
    @ApiOperation("Finds categoriePersonnels by criteria")
    @PostMapping("listByCriteria")
    public ResponseEntity<List<CategoriePersonnelDto>> findByCriteria(@RequestBody CategoriePersonnelCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated categoriePersonnels by criteria")
    @PostMapping("paginatedListByCriteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody CategoriePersonnelCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports categoriePersonnels by criteria")
    @PostMapping("exportCategoriePersonnels")
    public ResponseEntity<InputStreamResource> export(@RequestBody CategoriePersonnelCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets categoriePersonnel data size by criteria")
    @PostMapping("getCategoriePersonnelsDataSize")
    public ResponseEntity<Integer> getDataSize(@RequestBody CategoriePersonnelCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets categoriePersonnel history by id")
    @GetMapping("histCategoriePersonnel/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets categoriePersonnel paginated history by criteria")
    @PostMapping("paginatedListHistByCriteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody CategoriePersonnelHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports categoriePersonnel history by criteria")
    @PostMapping("exportCategoriePersonnelsHist")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody CategoriePersonnelHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets categoriePersonnel history data size by criteria")
    @PostMapping("getHistCategoriePersonnelsDataSize")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody CategoriePersonnelHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    @ApiOperation("Gets categoriePersonnel next ordre value")
    @GetMapping(value = "/getNextOrdre")
    public ResponseEntity<Long> getNextOrdre() {
        Long nextOrdre = service.getNextOrdre();
        return new ResponseEntity<>(nextOrdre, HttpStatus.OK);
    }
    public CategoriePersonnelRestAdmin (CategoriePersonnelAdminService service, CategoriePersonnelConverter converter) {
        super(service, converter);
    }


}