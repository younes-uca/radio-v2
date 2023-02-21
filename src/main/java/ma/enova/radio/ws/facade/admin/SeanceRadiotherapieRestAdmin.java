package  ma.enova.radio.ws.facade.admin;


import java.util.List;

import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.enova.radio.bean.core.SeanceRadiotherapie;
import ma.enova.radio.bean.history.SeanceRadiotherapieHistory;
import ma.enova.radio.dao.criteria.core.SeanceRadiotherapieCriteria;
import ma.enova.radio.dao.criteria.history.SeanceRadiotherapieHistoryCriteria;
import ma.enova.radio.service.facade.admin.SeanceRadiotherapieAdminService;
import ma.enova.radio.ws.converter.SeanceRadiotherapieConverter;
import ma.enova.radio.ws.dto.SeanceRadiotherapieDto;
import ma.enova.radio.zynerator.controller.AbstractController;
import ma.enova.radio.zynerator.dto.AuditEntityDto;
import ma.enova.radio.zynerator.util.PaginatedList;

@Api("Manages seanceRadiotherapie services")
@RestController
@RequestMapping("/api/seanceRadiotherapie")
public class SeanceRadiotherapieRestAdmin  extends AbstractController<SeanceRadiotherapie, SeanceRadiotherapieDto, SeanceRadiotherapieHistory, SeanceRadiotherapieCriteria, SeanceRadiotherapieHistoryCriteria, SeanceRadiotherapieAdminService, SeanceRadiotherapieConverter> {

    @ApiOperation("Finds a list of all seanceRadiotherapies")
    @GetMapping("")
    public ResponseEntity<List<SeanceRadiotherapieDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  seanceRadiotherapie")
    @PutMapping("")
    public ResponseEntity<SeanceRadiotherapieDto> update(@RequestBody SeanceRadiotherapieDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a seanceRadiotherapie by id")
    @GetMapping("{id}")
    public ResponseEntity<SeanceRadiotherapieDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  seanceRadiotherapie")
    @PostMapping("")
    public ResponseEntity<SeanceRadiotherapieDto> save(@RequestBody SeanceRadiotherapieDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of seanceRadiotherapie")
    @DeleteMapping("/delete")
    public ResponseEntity<List<SeanceRadiotherapieDto>> delete(@RequestBody List<SeanceRadiotherapieDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified seanceRadiotherapie")
    @DeleteMapping("")
    public ResponseEntity<SeanceRadiotherapieDto> delete(SeanceRadiotherapieDto dto) throws Exception {
            return super.delete(dto);
    }
    @ApiOperation("find by prescriptionRadiotherapie id")
    @GetMapping("prescriptionRadiotherapie/id/{id}")
    public List<SeanceRadiotherapie> findByPrescriptionRadiotherapieId(@PathVariable Long id){
        return service.findByPrescriptionRadiotherapieId(id);
    }
    @ApiOperation("delete by prescriptionRadiotherapie id")
    @DeleteMapping("prescriptionRadiotherapie/id/{id}")
    public int deleteByPrescriptionRadiotherapieId(@PathVariable Long id){
        return service.deleteByPrescriptionRadiotherapieId(id);
    }
    @ApiOperation("Finds seanceRadiotherapies by criteria")
    @PostMapping("listByCriteria")
    public ResponseEntity<List<SeanceRadiotherapieDto>> findByCriteria(@RequestBody SeanceRadiotherapieCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated seanceRadiotherapies by criteria")
    @PostMapping("paginatedListByCriteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody SeanceRadiotherapieCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports seanceRadiotherapies by criteria")
    @PostMapping("exportSeanceRadiotherapies")
    public ResponseEntity<InputStreamResource> export(@RequestBody SeanceRadiotherapieCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets seanceRadiotherapie data size by criteria")
    @PostMapping("getSeanceRadiotherapiesDataSize")
    public ResponseEntity<Integer> getDataSize(@RequestBody SeanceRadiotherapieCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("update etat of Effectue")
    @PostMapping("/updateEtatEffectue")
    public ResponseEntity<Void> updateEtatEffectue(@RequestBody SeanceRadiotherapieDto dto) throws Exception {
    	service.updateEtatEffectue(dto);
    	return new ResponseEntity<>(HttpStatus.OK);

    }
    
    @ApiOperation("Gets seanceRadiotherapie history by id")
    @GetMapping("histSeanceRadiotherapie/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets seanceRadiotherapie paginated history by criteria")
    @PostMapping("paginatedListHistByCriteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody SeanceRadiotherapieHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports seanceRadiotherapie history by criteria")
    @PostMapping("exportSeanceRadiotherapiesHist")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody SeanceRadiotherapieHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets seanceRadiotherapie history data size by criteria")
    @PostMapping("getHistSeanceRadiotherapiesDataSize")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody SeanceRadiotherapieHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public SeanceRadiotherapieRestAdmin (SeanceRadiotherapieAdminService service, SeanceRadiotherapieConverter converter) {
        super(service, converter);
    }


}