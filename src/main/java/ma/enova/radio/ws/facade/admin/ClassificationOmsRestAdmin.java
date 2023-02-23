package ma.enova.radio.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.enova.radio.bean.core.ClassificationOms;
import ma.enova.radio.bean.history.ClassificationOmsHistory;
import ma.enova.radio.dao.criteria.core.ClassificationOmsCriteria;
import ma.enova.radio.dao.criteria.history.ClassificationOmsHistoryCriteria;
import ma.enova.radio.service.facade.admin.ClassificationOmsAdminService;
import ma.enova.radio.ws.converter.ClassificationOmsConverter;
import ma.enova.radio.ws.dto.ClassificationOmsDto;
import ma.enova.radio.zynerator.controller.AbstractController;
import ma.enova.radio.zynerator.dto.AuditEntityDto;
import ma.enova.radio.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api("Manages classificationOms services")
@RestController
@RequestMapping("/api/classificationOms")
public class ClassificationOmsRestAdmin  extends AbstractController<ClassificationOms, ClassificationOmsDto, ClassificationOmsHistory, ClassificationOmsCriteria, ClassificationOmsHistoryCriteria, ClassificationOmsAdminService, ClassificationOmsConverter> {

    @ApiOperation("Finds a list of all classificationOmss")
    @GetMapping("")
    public ResponseEntity<List<ClassificationOmsDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  classificationOms")
    @PutMapping("")
    public ResponseEntity<ClassificationOmsDto> update(@RequestBody ClassificationOmsDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a classificationOms by id")
    @GetMapping("{id}")
    public ResponseEntity<ClassificationOmsDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  classificationOms")
    @PostMapping("")
    public ResponseEntity<ClassificationOmsDto> save(@RequestBody ClassificationOmsDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of classificationOms")
    @DeleteMapping("/delete")
    public ResponseEntity<List<ClassificationOmsDto>> delete(@RequestBody List<ClassificationOmsDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified classificationOms")
    @DeleteMapping("")
    public ResponseEntity<ClassificationOmsDto> delete(@RequestBody ClassificationOmsDto dto) throws Exception {
            return super.delete(dto);
    }
    @ApiOperation("find by services id")
    @GetMapping("services/id/{id}")
    public List<ClassificationOms> findByServicesId(@PathVariable Long id){
        return service.findByServicesId(id);
    }
    @ApiOperation("delete by services id")
    @DeleteMapping("services/id/{id}")
    public int deleteByServicesId(@PathVariable Long id){
        return service.deleteByServicesId(id);
    }
    @ApiOperation("Finds classificationOmss by criteria")
    @PostMapping("listByCriteria")
    public ResponseEntity<List<ClassificationOmsDto>> findByCriteria(@RequestBody ClassificationOmsCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated classificationOmss by criteria")
    @PostMapping("paginatedListByCriteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody ClassificationOmsCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports classificationOmss by criteria")
    @PostMapping("exportClassificationOmss")
    public ResponseEntity<InputStreamResource> export(@RequestBody ClassificationOmsCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets classificationOms data size by criteria")
    @PostMapping("getClassificationOmssDataSize")
    public ResponseEntity<Integer> getDataSize(@RequestBody ClassificationOmsCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets classificationOms history by id")
    @GetMapping("histClassificationOms/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets classificationOms paginated history by criteria")
    @PostMapping("paginatedListHistByCriteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody ClassificationOmsHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports classificationOms history by criteria")
    @PostMapping("exportClassificationOmssHist")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody ClassificationOmsHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets classificationOms history data size by criteria")
    @PostMapping("getHistClassificationOmssDataSize")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody ClassificationOmsHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    @ApiOperation("Gets classificationOms next ordre value")
    @GetMapping(value = "/getNextOrdre")
    public ResponseEntity<Long> getNextOrdre() {
        Long nextOrdre = service.getNextOrdre();
        return new ResponseEntity<>(nextOrdre, HttpStatus.OK);
    }
    public ClassificationOmsRestAdmin (ClassificationOmsAdminService service, ClassificationOmsConverter converter) {
        super(service, converter);
    }


}