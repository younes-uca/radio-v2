package  ma.enova.radio.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.enova.radio.bean.core.Patient;
import ma.enova.radio.bean.history.PatientHistory;
import ma.enova.radio.dao.criteria.core.PatientCriteria;
import ma.enova.radio.dao.criteria.history.PatientHistoryCriteria;
import ma.enova.radio.service.facade.admin.PatientAdminService;
import ma.enova.radio.ws.converter.PatientConverter;
import ma.enova.radio.ws.dto.PatientDto;
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

@Api("Manages patient services")
@RestController
@RequestMapping("/api/patient")
public class PatientRestAdmin  extends AbstractController<Patient, PatientDto, PatientHistory, PatientCriteria, PatientHistoryCriteria, PatientAdminService, PatientConverter> {

    @ApiOperation("Finds a list of all patients")
    @GetMapping("")
    public ResponseEntity<List<PatientDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  patient")
    @PutMapping("")
    public ResponseEntity<PatientDto> update(@RequestBody PatientDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a patient by id")
    @GetMapping("{id}")
    public ResponseEntity<PatientDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  patient")
    @PostMapping("")
    public ResponseEntity<PatientDto> save(@RequestBody PatientDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of patient")
    @DeleteMapping("/delete")
    public ResponseEntity<List<PatientDto>> delete(@RequestBody List<PatientDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified patient")
    @DeleteMapping("")
    public ResponseEntity<PatientDto> delete(@RequestBody PatientDto dto) throws Exception {
            return super.delete(dto);
    }
    @ApiOperation("Finds patients by criteria")
    @PostMapping("listByCriteria")
    public ResponseEntity<List<PatientDto>> findByCriteria(@RequestBody PatientCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated patients by criteria")
    @PostMapping("paginatedListByCriteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody PatientCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports patients by criteria")
    @PostMapping("exportPatients")
    public ResponseEntity<InputStreamResource> export(@RequestBody PatientCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets patient data size by criteria")
    @PostMapping("getPatientsDataSize")
    public ResponseEntity<Integer> getDataSize(@RequestBody PatientCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets patient history by id")
    @GetMapping("histPatient/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets patient paginated history by criteria")
    @PostMapping("paginatedListHistByCriteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody PatientHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports patient history by criteria")
    @PostMapping("exportPatientsHist")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody PatientHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets patient history data size by criteria")
    @PostMapping("getHistPatientsDataSize")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody PatientHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    @ApiOperation("Gets patient next ordre value")
    @GetMapping(value = "/getNextOrdre")
    public ResponseEntity<Long> getNextOrdre() {
        Long nextOrdre = service.getNextOrdre();
        return new ResponseEntity<>(nextOrdre, HttpStatus.OK);
    }
    public PatientRestAdmin (PatientAdminService service, PatientConverter converter) {
        super(service, converter);
    }


}