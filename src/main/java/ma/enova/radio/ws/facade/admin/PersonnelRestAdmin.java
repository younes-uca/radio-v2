package  ma.enova.radio.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.enova.radio.bean.core.Personnel;
import ma.enova.radio.bean.history.PersonnelHistory;
import ma.enova.radio.dao.criteria.core.PersonnelCriteria;
import ma.enova.radio.dao.criteria.history.PersonnelHistoryCriteria;
import ma.enova.radio.service.facade.admin.PersonnelAdminService;
import ma.enova.radio.ws.converter.PersonnelConverter;
import ma.enova.radio.ws.dto.PersonnelDto;
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

@Api("Manages personnel services")
@RestController
@RequestMapping("/api/personnel")
public class PersonnelRestAdmin  extends AbstractController<Personnel, PersonnelDto, PersonnelHistory, PersonnelCriteria, PersonnelHistoryCriteria, PersonnelAdminService, PersonnelConverter> {

    @ApiOperation("Finds a list of all personnels")
    @GetMapping("")
    public ResponseEntity<List<PersonnelDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  personnel")
    @PutMapping("")
    public ResponseEntity<PersonnelDto> update(@RequestBody PersonnelDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a personnel by id")
    @GetMapping("{id}")
    public ResponseEntity<PersonnelDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  personnel")
    @PostMapping("")
    public ResponseEntity<PersonnelDto> save(@RequestBody PersonnelDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of personnel")
    @DeleteMapping("/delete")
    public ResponseEntity<List<PersonnelDto>> delete(@RequestBody List<PersonnelDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified personnel")
    @DeleteMapping("")
    public ResponseEntity<PersonnelDto> delete(PersonnelDto dto) throws Exception {
            return super.delete(dto);
    }
    @ApiOperation("find by categoriePersonnel id")
    @GetMapping("categoriePersonnel/id/{id}")
    public List<Personnel> findByCategoriePersonnelId(@PathVariable Long id){
        return service.findByCategoriePersonnelId(id);
    }
    @ApiOperation("delete by categoriePersonnel id")
    @DeleteMapping("categoriePersonnel/id/{id}")
    public int deleteByCategoriePersonnelId(@PathVariable Long id){
        return service.deleteByCategoriePersonnelId(id);
    }
    @ApiOperation("find by specialite id")
    @GetMapping("specialite/id/{id}")
    public List<Personnel> findBySpecialiteId(@PathVariable Long id){
        return service.findBySpecialiteId(id);
    }
    @ApiOperation("delete by specialite id")
    @DeleteMapping("specialite/id/{id}")
    public int deleteBySpecialiteId(@PathVariable Long id){
        return service.deleteBySpecialiteId(id);
    }
    @ApiOperation("Finds personnels by criteria")
    @PostMapping("listByCriteria")
    public ResponseEntity<List<PersonnelDto>> findByCriteria(@RequestBody PersonnelCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated personnels by criteria")
    @PostMapping("paginatedListByCriteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody PersonnelCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports personnels by criteria")
    @PostMapping("exportPersonnels")
    public ResponseEntity<InputStreamResource> export(@RequestBody PersonnelCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets personnel data size by criteria")
    @PostMapping("getPersonnelsDataSize")
    public ResponseEntity<Integer> getDataSize(@RequestBody PersonnelCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets personnel history by id")
    @GetMapping("histPersonnel/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets personnel paginated history by criteria")
    @PostMapping("paginatedListHistByCriteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody PersonnelHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports personnel history by criteria")
    @PostMapping("exportPersonnelsHist")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody PersonnelHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets personnel history data size by criteria")
    @PostMapping("getHistPersonnelsDataSize")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody PersonnelHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    @ApiOperation("Gets personnel next ordre value")
    @GetMapping(value = "/getNextOrdre")
    public ResponseEntity<Long> getNextOrdre() {
        Long nextOrdre = service.getNextOrdre();
        return new ResponseEntity<>(nextOrdre, HttpStatus.OK);
    }
    public PersonnelRestAdmin (PersonnelAdminService service, PersonnelConverter converter) {
        super(service, converter);
    }


}