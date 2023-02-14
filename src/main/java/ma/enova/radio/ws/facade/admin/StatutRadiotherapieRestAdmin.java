package  ma.enova.radio.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.enova.radio.bean.core.StatutRadiotherapie;
import ma.enova.radio.bean.history.StatutRadiotherapieHistory;
import ma.enova.radio.dao.criteria.core.StatutRadiotherapieCriteria;
import ma.enova.radio.dao.criteria.history.StatutRadiotherapieHistoryCriteria;
import ma.enova.radio.service.facade.admin.StatutRadiotherapieAdminService;
import ma.enova.radio.ws.converter.StatutRadiotherapieConverter;
import ma.enova.radio.ws.dto.StatutRadiotherapieDto;
import ma.enova.radio.zynerator.controller.AbstractController;
import ma.enova.radio.zynerator.dto.AuditEntityDto;
import ma.enova.radio.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import ma.enova.radio.zynerator.process.Result;

@Api("Manages statutRadiotherapie services")
@RestController
@RequestMapping("/api/statutRadiotherapie")
public class StatutRadiotherapieRestAdmin  extends AbstractController<StatutRadiotherapie, StatutRadiotherapieDto, StatutRadiotherapieHistory, StatutRadiotherapieCriteria, StatutRadiotherapieHistoryCriteria, StatutRadiotherapieAdminService, StatutRadiotherapieConverter> {

    @ApiOperation("Finds a list of all statutRadiotherapies")
    @GetMapping("")
    public ResponseEntity<List<StatutRadiotherapieDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  statutRadiotherapie")
    @PutMapping("")
    public ResponseEntity<StatutRadiotherapieDto> update(@RequestBody StatutRadiotherapieDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a statutRadiotherapie by id")
    @GetMapping("{id}")
    public ResponseEntity<StatutRadiotherapieDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  statutRadiotherapie")
    @PostMapping("")
    public ResponseEntity<StatutRadiotherapieDto> save(@RequestBody StatutRadiotherapieDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of statutRadiotherapie")
    @DeleteMapping("/delete")
    public ResponseEntity<List<StatutRadiotherapieDto>> delete(@RequestBody List<StatutRadiotherapieDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified statutRadiotherapie")
    @DeleteMapping("")
    public ResponseEntity<StatutRadiotherapieDto> delete(StatutRadiotherapieDto dto) throws Exception {
            return super.delete(dto);
    }
    @ApiOperation("Finds statutRadiotherapies by criteria")
    @PostMapping("listByCriteria")
    public ResponseEntity<List<StatutRadiotherapieDto>> findByCriteria(@RequestBody StatutRadiotherapieCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated statutRadiotherapies by criteria")
    @PostMapping("paginatedListByCriteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody StatutRadiotherapieCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports statutRadiotherapies by criteria")
    @PostMapping("exportStatutRadiotherapies")
    public ResponseEntity<InputStreamResource> export(@RequestBody StatutRadiotherapieCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets statutRadiotherapie data size by criteria")
    @PostMapping("getStatutRadiotherapiesDataSize")
    public ResponseEntity<Integer> getDataSize(@RequestBody StatutRadiotherapieCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets statutRadiotherapie history by id")
    @GetMapping("histStatutRadiotherapie/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets statutRadiotherapie paginated history by criteria")
    @PostMapping("paginatedListHistByCriteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody StatutRadiotherapieHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports statutRadiotherapie history by criteria")
    @PostMapping("exportStatutRadiotherapiesHist")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody StatutRadiotherapieHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets statutRadiotherapie history data size by criteria")
    @PostMapping("getHistStatutRadiotherapiesDataSize")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody StatutRadiotherapieHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public StatutRadiotherapieRestAdmin (StatutRadiotherapieAdminService service, StatutRadiotherapieConverter converter) {
        super(service, converter);
    }


}