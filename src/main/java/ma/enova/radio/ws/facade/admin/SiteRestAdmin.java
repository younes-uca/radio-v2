package  ma.enova.radio.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.enova.radio.bean.core.Site;
import ma.enova.radio.bean.history.SiteHistory;
import ma.enova.radio.dao.criteria.core.SiteCriteria;
import ma.enova.radio.dao.criteria.history.SiteHistoryCriteria;
import ma.enova.radio.service.facade.admin.SiteAdminService;
import ma.enova.radio.ws.converter.SiteConverter;
import ma.enova.radio.ws.dto.SiteDto;
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

@Api("Manages site services")
@RestController
@RequestMapping("/api/site")
public class SiteRestAdmin  extends AbstractController<Site, SiteDto, SiteHistory, SiteCriteria, SiteHistoryCriteria, SiteAdminService, SiteConverter> {

    @ApiOperation("Finds a list of all sites")
    @GetMapping("")
    public ResponseEntity<List<SiteDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  site")
    @PutMapping("")
    public ResponseEntity<SiteDto> update(@RequestBody SiteDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a site by id")
    @GetMapping("{id}")
    public ResponseEntity<SiteDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  site")
    @PostMapping("")
    public ResponseEntity<SiteDto> save(@RequestBody SiteDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of site")
    @DeleteMapping("/delete")
    public ResponseEntity<List<SiteDto>> delete(@RequestBody List<SiteDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified site")
    @DeleteMapping("")
    public ResponseEntity<SiteDto> delete(@RequestBody SiteDto dto) throws Exception {
            return super.delete(dto);
    }
    @ApiOperation("find by services id")
    @GetMapping("services/id/{id}")
    public List<Site> findByServicesId(@PathVariable Long id){
        return service.findByServicesId(id);
    }
    @ApiOperation("delete by services id")
    @DeleteMapping("services/id/{id}")
    public int deleteByServicesId(@PathVariable Long id){
        return service.deleteByServicesId(id);
    }
    @ApiOperation("Finds sites by criteria")
    @PostMapping("listByCriteria")
    public ResponseEntity<List<SiteDto>> findByCriteria(@RequestBody SiteCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated sites by criteria")
    @PostMapping("paginatedListByCriteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody SiteCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports sites by criteria")
    @PostMapping("exportSites")
    public ResponseEntity<InputStreamResource> export(@RequestBody SiteCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets site data size by criteria")
    @PostMapping("getSitesDataSize")
    public ResponseEntity<Integer> getDataSize(@RequestBody SiteCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets site history by id")
    @GetMapping("histSite/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets site paginated history by criteria")
    @PostMapping("paginatedListHistByCriteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody SiteHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports site history by criteria")
    @PostMapping("exportSitesHist")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody SiteHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets site history data size by criteria")
    @PostMapping("getHistSitesDataSize")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody SiteHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    @ApiOperation("Gets site next ordre value")
    @GetMapping(value = "/getNextOrdre")
    public ResponseEntity<Long> getNextOrdre() {
        Long nextOrdre = service.getNextOrdre();
        return new ResponseEntity<>(nextOrdre, HttpStatus.OK);
    }
    public SiteRestAdmin (SiteAdminService service, SiteConverter converter) {
        super(service, converter);
    }


}