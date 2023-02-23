package  ma.enova.radio.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.enova.radio.bean.core.TypeTraitement;
import ma.enova.radio.bean.history.TypeTraitementHistory;
import ma.enova.radio.dao.criteria.core.TypeTraitementCriteria;
import ma.enova.radio.dao.criteria.history.TypeTraitementHistoryCriteria;
import ma.enova.radio.service.facade.admin.TypeTraitementAdminService;
import ma.enova.radio.ws.converter.TypeTraitementConverter;
import ma.enova.radio.ws.dto.TypeTraitementDto;
import ma.enova.radio.zynerator.controller.AbstractController;
import ma.enova.radio.zynerator.dto.AuditEntityDto;
import ma.enova.radio.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import ma.enova.radio.zynerator.process.Result;

@Api("Manages typeTraitement services")
@RestController
@RequestMapping("/api/typeTraitement")
public class TypeTraitementRestAdmin  extends AbstractController<TypeTraitement, TypeTraitementDto, TypeTraitementHistory, TypeTraitementCriteria, TypeTraitementHistoryCriteria, TypeTraitementAdminService, TypeTraitementConverter> {

    @ApiOperation("Finds a list of all typeTraitements")
    @GetMapping("")
    public ResponseEntity<List<TypeTraitementDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  typeTraitement")
    @PutMapping("")
    public ResponseEntity<TypeTraitementDto> update(@RequestBody TypeTraitementDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a typeTraitement by id")
    @GetMapping("{id}")
    public ResponseEntity<TypeTraitementDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  typeTraitement")
    @PostMapping("")
    public ResponseEntity<TypeTraitementDto> save(@RequestBody TypeTraitementDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of typeTraitement")
    @DeleteMapping("/delete")
    public ResponseEntity<List<TypeTraitementDto>> delete(@RequestBody List<TypeTraitementDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified typeTraitement")
    @DeleteMapping("")
    public ResponseEntity<TypeTraitementDto> delete(@RequestBody TypeTraitementDto dto) throws Exception {
            return super.delete(dto);
    }
    @ApiOperation("Finds typeTraitements by criteria")
    @PostMapping("listByCriteria")
    public ResponseEntity<List<TypeTraitementDto>> findByCriteria(@RequestBody TypeTraitementCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated typeTraitements by criteria")
    @PostMapping("paginatedListByCriteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody TypeTraitementCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports typeTraitements by criteria")
    @PostMapping("exportTypeTraitements")
    public ResponseEntity<InputStreamResource> export(@RequestBody TypeTraitementCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets typeTraitement data size by criteria")
    @PostMapping("getTypeTraitementsDataSize")
    public ResponseEntity<Integer> getDataSize(@RequestBody TypeTraitementCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets typeTraitement history by id")
    @GetMapping("histTypeTraitement/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets typeTraitement paginated history by criteria")
    @PostMapping("paginatedListHistByCriteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody TypeTraitementHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports typeTraitement history by criteria")
    @PostMapping("exportTypeTraitementsHist")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody TypeTraitementHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets typeTraitement history data size by criteria")
    @PostMapping("getHistTypeTraitementsDataSize")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody TypeTraitementHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public TypeTraitementRestAdmin (TypeTraitementAdminService service, TypeTraitementConverter converter) {
        super(service, converter);
    }


}