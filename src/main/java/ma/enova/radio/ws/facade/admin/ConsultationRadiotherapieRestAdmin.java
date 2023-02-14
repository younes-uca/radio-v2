package  ma.enova.radio.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.enova.radio.bean.core.ConsultationRadiotherapie;
import ma.enova.radio.bean.history.ConsultationRadiotherapieHistory;
import ma.enova.radio.dao.criteria.core.ConsultationRadiotherapieCriteria;
import ma.enova.radio.dao.criteria.history.ConsultationRadiotherapieHistoryCriteria;
import ma.enova.radio.service.facade.admin.ConsultationRadiotherapieAdminService;
import ma.enova.radio.ws.converter.ConsultationRadiotherapieConverter;
import ma.enova.radio.ws.dto.ConsultationRadiotherapieDto;
import ma.enova.radio.zynerator.controller.AbstractController;
import ma.enova.radio.zynerator.dto.AuditEntityDto;
import ma.enova.radio.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import ma.enova.radio.zynerator.process.Result;
import ma.enova.radio.workflow.admin.process.consultationradiotherapie.save.ConsultationRadiotherapieSaveAdminProcess ;
import ma.enova.radio.workflow.admin.process.consultationradiotherapie.save.ConsultationRadiotherapieSaveAdminInput ;
import ma.enova.radio.workflow.admin.process.consultationradiotherapie.save.ConsultationRadiotherapieSaveAdminOutput ;

@Api("Manages consultationRadiotherapie services")
@RestController
@RequestMapping("/api/consultationRadiotherapie")
public class ConsultationRadiotherapieRestAdmin  extends AbstractController<ConsultationRadiotherapie, ConsultationRadiotherapieDto, ConsultationRadiotherapieHistory, ConsultationRadiotherapieCriteria, ConsultationRadiotherapieHistoryCriteria, ConsultationRadiotherapieAdminService, ConsultationRadiotherapieConverter> {

    @ApiOperation("save a consultationRadiotherapie")
    @PostMapping("process/save")
    public ResponseEntity<Result<ConsultationRadiotherapieSaveAdminInput,ConsultationRadiotherapieSaveAdminOutput, ConsultationRadiotherapie>> saveProcess(@RequestBody ConsultationRadiotherapieSaveAdminInput input) throws Exception {
        Result<ConsultationRadiotherapieSaveAdminInput, ConsultationRadiotherapieSaveAdminOutput, ConsultationRadiotherapie> result = consultationRadiotherapieSaveAdminProcess.execute(input);
        return new ResponseEntity<>(result, result.getStatus());
    }
    @ApiOperation("Finds a list of all consultationRadiotherapies")
    @GetMapping("")
    public ResponseEntity<List<ConsultationRadiotherapieDto>> findAll() throws Exception {
        return super.findAll();
    }
    @ApiOperation("Updates the specified  consultationRadiotherapie")
    @PutMapping("")
    public ResponseEntity<ConsultationRadiotherapieDto> update(@RequestBody ConsultationRadiotherapieDto dto) throws Exception {
        return super.update(dto);
    }
    @ApiOperation("Finds a consultationRadiotherapie by id")
    @GetMapping("{id}")
    public ResponseEntity<ConsultationRadiotherapieDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  consultationRadiotherapie")
    @PostMapping("")
    public ResponseEntity<ConsultationRadiotherapieDto> save(@RequestBody ConsultationRadiotherapieDto dto) throws Exception {
        return super.save(dto);
    }
    @ApiOperation("Delete list of consultationRadiotherapie")
    @DeleteMapping("/delete")
    public ResponseEntity<List<ConsultationRadiotherapieDto>> delete(@RequestBody List<ConsultationRadiotherapieDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified consultationRadiotherapie")
    @DeleteMapping("")
    public ResponseEntity<ConsultationRadiotherapieDto> delete(ConsultationRadiotherapieDto dto) throws Exception {
            return super.delete(dto);
    }
    @ApiOperation("find by medecin id")
    @GetMapping("medecin/id/{id}")
    public List<ConsultationRadiotherapie> findByMedecinId(@PathVariable Long id){
        return service.findByMedecinId(id);
    }
    @ApiOperation("delete by medecin id")
    @DeleteMapping("medecin/id/{id}")
    public int deleteByMedecinId(@PathVariable Long id){
        return service.deleteByMedecinId(id);
    }
    @ApiOperation("find by typeConsultationRadiotherapie id")
    @GetMapping("typeConsultationRadiotherapie/id/{id}")
    public List<ConsultationRadiotherapie> findByTypeConsultationRadiotherapieId(@PathVariable Long id){
        return service.findByTypeConsultationRadiotherapieId(id);
    }
    @ApiOperation("delete by typeConsultationRadiotherapie id")
    @DeleteMapping("typeConsultationRadiotherapie/id/{id}")
    public int deleteByTypeConsultationRadiotherapieId(@PathVariable Long id){
        return service.deleteByTypeConsultationRadiotherapieId(id);
    }
    @ApiOperation("find by typeToxiciteRth id")
    @GetMapping("typeToxiciteRth/id/{id}")
    public List<ConsultationRadiotherapie> findByTypeToxiciteRthId(@PathVariable Long id){
        return service.findByTypeToxiciteRthId(id);
    }
    @ApiOperation("delete by typeToxiciteRth id")
    @DeleteMapping("typeToxiciteRth/id/{id}")
    public int deleteByTypeToxiciteRthId(@PathVariable Long id){
        return service.deleteByTypeToxiciteRthId(id);
    }
    @ApiOperation("find by gradeToxiciteRth id")
    @GetMapping("gradeToxiciteRth/id/{id}")
    public List<ConsultationRadiotherapie> findByGradeToxiciteRthId(@PathVariable Long id){
        return service.findByGradeToxiciteRthId(id);
    }
    @ApiOperation("delete by gradeToxiciteRth id")
    @DeleteMapping("gradeToxiciteRth/id/{id}")
    public int deleteByGradeToxiciteRthId(@PathVariable Long id){
        return service.deleteByGradeToxiciteRthId(id);
    }
    @ApiOperation("find by prescriptionRadiotherapie id")
    @GetMapping("prescriptionRadiotherapie/id/{id}")
    public List<ConsultationRadiotherapie> findByPrescriptionRadiotherapieId(@PathVariable Long id){
        return service.findByPrescriptionRadiotherapieId(id);
    }
    @ApiOperation("delete by prescriptionRadiotherapie id")
    @DeleteMapping("prescriptionRadiotherapie/id/{id}")
    public int deleteByPrescriptionRadiotherapieId(@PathVariable Long id){
        return service.deleteByPrescriptionRadiotherapieId(id);
    }
    @ApiOperation("Finds consultationRadiotherapies by criteria")
    @PostMapping("listByCriteria")
    public ResponseEntity<List<ConsultationRadiotherapieDto>> findByCriteria(@RequestBody ConsultationRadiotherapieCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated consultationRadiotherapies by criteria")
    @PostMapping("paginatedListByCriteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody ConsultationRadiotherapieCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports consultationRadiotherapies by criteria")
    @PostMapping("exportConsultationRadiotherapies")
    public ResponseEntity<InputStreamResource> export(@RequestBody ConsultationRadiotherapieCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets consultationRadiotherapie data size by criteria")
    @PostMapping("getConsultationRadiotherapiesDataSize")
    public ResponseEntity<Integer> getDataSize(@RequestBody ConsultationRadiotherapieCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets consultationRadiotherapie history by id")
    @GetMapping("histConsultationRadiotherapie/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets consultationRadiotherapie paginated history by criteria")
    @PostMapping("paginatedListHistByCriteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody ConsultationRadiotherapieHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports consultationRadiotherapie history by criteria")
    @PostMapping("exportConsultationRadiotherapiesHist")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody ConsultationRadiotherapieHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets consultationRadiotherapie history data size by criteria")
    @PostMapping("getHistConsultationRadiotherapiesDataSize")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody ConsultationRadiotherapieHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public ConsultationRadiotherapieRestAdmin (ConsultationRadiotherapieAdminService service, ConsultationRadiotherapieConverter converter) {
        super(service, converter);
    }

    @Autowired
    private ConsultationRadiotherapieSaveAdminProcess consultationRadiotherapieSaveAdminProcess;

}