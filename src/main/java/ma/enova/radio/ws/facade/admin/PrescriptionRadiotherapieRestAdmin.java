package ma.enova.radio.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.enova.radio.bean.core.PrescriptionRadiotherapie;
import ma.enova.radio.bean.history.PrescriptionRadiotherapieHistory;
import ma.enova.radio.constant.StatutRadioTherapieConstant;
import ma.enova.radio.dao.criteria.core.PrescriptionRadiotherapieCriteria;
import ma.enova.radio.dao.criteria.history.PrescriptionRadiotherapieHistoryCriteria;
import ma.enova.radio.service.facade.admin.PrescriptionRadiotherapieAdminService;
import ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.finirtraitement.PrescriptionRadiotherapieFinirTraitementAdminInput;
import ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.finirtraitement.PrescriptionRadiotherapieFinirTraitementAdminOutput;
import ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.finirtraitement.PrescriptionRadiotherapieFinirTraitementAdminProcess;
import ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.save.PrescriptionRadiotherapieSaveAdminInput;
import ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.save.PrescriptionRadiotherapieSaveAdminOutput;
import ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.save.PrescriptionRadiotherapieSaveAdminProcess;
import ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.simuler.PrescriptionRadiotherapieSimulerAdminInput;
import ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.simuler.PrescriptionRadiotherapieSimulerAdminOutput;
import ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.simuler.PrescriptionRadiotherapieSimulerAdminProcess;
import ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.suivreconsultation.PrescriptionRadiotherapieSuivreConsultationAdminInput;
import ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.suivreconsultation.PrescriptionRadiotherapieSuivreConsultationAdminOutput;
import ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.suivreconsultation.PrescriptionRadiotherapieSuivreConsultationAdminProcess;
import ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.validatephysicien.PrescriptionRadiotherapieValidatePhysicienAdminInput;
import ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.validatephysicien.PrescriptionRadiotherapieValidatePhysicienAdminOutput;
import ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.validatephysicien.PrescriptionRadiotherapieValidatePhysicienAdminProcess;
import ma.enova.radio.ws.converter.PrescriptionRadiotherapieConverter;
import ma.enova.radio.ws.dto.PrescriptionRadiotherapieDto;
import ma.enova.radio.zynerator.controller.AbstractController;
import ma.enova.radio.zynerator.dto.AuditEntityDto;
import ma.enova.radio.zynerator.process.Result;
import ma.enova.radio.zynerator.util.PaginatedList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api("Manages prescriptionRadiotherapie services")
@RestController
@RequestMapping("/api/prescriptionRadiotherapie")
public class PrescriptionRadiotherapieRestAdmin extends AbstractController<PrescriptionRadiotherapie, PrescriptionRadiotherapieDto, PrescriptionRadiotherapieHistory, PrescriptionRadiotherapieCriteria, PrescriptionRadiotherapieHistoryCriteria, PrescriptionRadiotherapieAdminService, PrescriptionRadiotherapieConverter> {

    @ApiOperation("find by statutRadiotherapie ENATTENTEPRESCRIPTION")
    @GetMapping("statutRadiotherapie/code/en-attente-prescritpion")
    public ResponseEntity<List<PrescriptionRadiotherapieDto>> findByStatutRadiotherapieEnAttentePrescription() {
        return getResponseEntity(service.findByStatutRadiotherapieCode(StatutRadioTherapieConstant.EN_ATTENTE_PRESCRIPTION));
    }

    @ApiOperation("find by statutRadiotherapie ENATTENTESIMULATION")
    @GetMapping("statutRadiotherapie/code/en-attente-simulation")
    public List<PrescriptionRadiotherapie> findByStatutRadiotherapieEnAttenteSimulation() {
        return service.findByStatutRadiotherapieCode(StatutRadioTherapieConstant.EN_ATTENTE_SIMULATION);
    }

    @ApiOperation("find by statutRadiotherapie ENCOURSTRAITEMENT")
    @GetMapping("statutRadiotherapie/code/en-cours-traitement")
    public List<PrescriptionRadiotherapie> findByStatutRadiotherapieEnCoursTraitement() {
        return service.findByStatutRadiotherapieCode(StatutRadioTherapieConstant.EN_COURS_TRAITEMENT);
    }

    @ApiOperation("find by statutRadiotherapie FINTRAITEMENT")
    @GetMapping("statutRadiotherapie/code/fin-traitement")
    public List<PrescriptionRadiotherapie> findByStatutRadiotherapieFinTraitement() {
        return service.findByStatutRadiotherapieCode(StatutRadioTherapieConstant.FIN_TRAITEMENT);
    }

    @ApiOperation("save a prescriptionRadiotherapie")
    @PostMapping("process/save")
    public ResponseEntity<Result<PrescriptionRadiotherapieSaveAdminInput, PrescriptionRadiotherapieSaveAdminOutput, PrescriptionRadiotherapie>> saveProcess(@RequestBody PrescriptionRadiotherapieSaveAdminInput input) throws Exception {
        Result<PrescriptionRadiotherapieSaveAdminInput, PrescriptionRadiotherapieSaveAdminOutput, PrescriptionRadiotherapie> result = prescriptionRadiotherapieSaveAdminProcess.execute(input);
        return new ResponseEntity<>(result, result.getStatus());
    }

    @ApiOperation("simuler a prescriptionRadiotherapie")
    @PostMapping("process/simuler")
    public ResponseEntity<Result<PrescriptionRadiotherapieSimulerAdminInput, PrescriptionRadiotherapieSimulerAdminOutput, PrescriptionRadiotherapie>> simulerProcess(@RequestBody PrescriptionRadiotherapieSimulerAdminInput input) throws Exception {
        Result<PrescriptionRadiotherapieSimulerAdminInput, PrescriptionRadiotherapieSimulerAdminOutput, PrescriptionRadiotherapie> result = prescriptionRadiotherapieSimulerAdminProcess.execute(input);
        return new ResponseEntity<>(result, result.getStatus());
    }

    @ApiOperation("validatePhysicien a prescriptionRadiotherapie")
    @PostMapping("process/validatephysicien")
    public ResponseEntity<Result<PrescriptionRadiotherapieValidatePhysicienAdminInput, PrescriptionRadiotherapieValidatePhysicienAdminOutput, PrescriptionRadiotherapie>> validatePhysicienProcess(@RequestBody PrescriptionRadiotherapieValidatePhysicienAdminInput input) throws Exception {
        Result<PrescriptionRadiotherapieValidatePhysicienAdminInput, PrescriptionRadiotherapieValidatePhysicienAdminOutput, PrescriptionRadiotherapie> result = prescriptionRadiotherapieValidatePhysicienAdminProcess.execute(input);
        return new ResponseEntity<>(result, result.getStatus());
    }

    @ApiOperation("suivreConsultation a prescriptionRadiotherapie")
    @PostMapping("process/suivreconsultation")
    public ResponseEntity<Result<PrescriptionRadiotherapieSuivreConsultationAdminInput, PrescriptionRadiotherapieSuivreConsultationAdminOutput, PrescriptionRadiotherapie>> suivreConsultationProcess(@RequestBody PrescriptionRadiotherapieSuivreConsultationAdminInput input) throws Exception {
        Result<PrescriptionRadiotherapieSuivreConsultationAdminInput, PrescriptionRadiotherapieSuivreConsultationAdminOutput, PrescriptionRadiotherapie> result = prescriptionRadiotherapieSuivreConsultationAdminProcess.execute(input);
        return new ResponseEntity<>(result, result.getStatus());
    }

    @ApiOperation("finirTraitement a prescriptionRadiotherapie")
    @PostMapping("process/finirtraitement")
    public ResponseEntity<Result<PrescriptionRadiotherapieFinirTraitementAdminInput, PrescriptionRadiotherapieFinirTraitementAdminOutput, PrescriptionRadiotherapie>> finirTraitementProcess(@RequestBody PrescriptionRadiotherapieFinirTraitementAdminInput input) throws Exception {
        Result<PrescriptionRadiotherapieFinirTraitementAdminInput, PrescriptionRadiotherapieFinirTraitementAdminOutput, PrescriptionRadiotherapie> result = prescriptionRadiotherapieFinirTraitementAdminProcess.execute(input);
        return new ResponseEntity<>(result, result.getStatus());
    }

    @ApiOperation("findByDecisionTraitementCode")
    @GetMapping("/decision-traitement/code/{code}")
    public List<PrescriptionRadiotherapie> findByDecisionTraitementCode(@PathVariable String code) {
        return service.findByDecisionTraitementCode(code);
    }

    @ApiOperation("findByPatientIpp")
    @GetMapping("/patient/ipp/{ipp}")
    public List<PrescriptionRadiotherapie> findByPatientIpp(@PathVariable String ipp) {
        return service.findByPatientIpp(ipp);
    }

    @ApiOperation("Finds a list of all prescriptionRadiotherapies")
    @GetMapping("")
    public ResponseEntity<List<PrescriptionRadiotherapieDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Updates the specified  prescriptionRadiotherapie")
    @PutMapping("")
    public ResponseEntity<PrescriptionRadiotherapieDto> update(@RequestBody PrescriptionRadiotherapieDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Finds a prescriptionRadiotherapie by id")
    @GetMapping("{id}")
    public ResponseEntity<PrescriptionRadiotherapieDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }

    @ApiOperation("Saves the specified  prescriptionRadiotherapie")
    @PostMapping("")
    public ResponseEntity<PrescriptionRadiotherapieDto> save(@RequestBody PrescriptionRadiotherapieDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Delete list of prescriptionRadiotherapie")
    @DeleteMapping("/delete")
    public ResponseEntity<List<PrescriptionRadiotherapieDto>> delete(@RequestBody List<PrescriptionRadiotherapieDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }

    @ApiOperation("Delete the specified prescriptionRadiotherapie")
    @DeleteMapping("")
    public ResponseEntity<PrescriptionRadiotherapieDto> delete(PrescriptionRadiotherapieDto dto) throws Exception {
        return super.delete(dto);
    }

    @ApiOperation("find by medecinPrescripteur id")
    @GetMapping("medecinPrescripteur/id/{id}")
    public List<PrescriptionRadiotherapie> findByMedecinPrescripteurId(@PathVariable Long id) {
        return service.findByMedecinPrescripteurId(id);
    }

    @ApiOperation("delete by medecinPrescripteur id")
    @DeleteMapping("medecinPrescripteur/id/{id}")
    public int deleteByMedecinPrescripteurId(@PathVariable Long id) {
        return service.deleteByMedecinPrescripteurId(id);
    }

    @ApiOperation("find by site id")
    @GetMapping("site/id/{id}")
    public List<PrescriptionRadiotherapie> findBySiteId(@PathVariable Long id) {
        return service.findBySiteId(id);
    }

    @ApiOperation("delete by site id")
    @DeleteMapping("site/id/{id}")
    public int deleteBySiteId(@PathVariable Long id) {
        return service.deleteBySiteId(id);
    }

    @ApiOperation("find by modaliteRadiotherapie id")
    @GetMapping("modaliteRadiotherapie/id/{id}")
    public List<PrescriptionRadiotherapie> findByModaliteRadiotherapieId(@PathVariable Long id) {
        return service.findByModaliteRadiotherapieId(id);
    }

    @ApiOperation("delete by modaliteRadiotherapie id")
    @DeleteMapping("modaliteRadiotherapie/id/{id}")
    public int deleteByModaliteRadiotherapieId(@PathVariable Long id) {
        return service.deleteByModaliteRadiotherapieId(id);
    }

    @ApiOperation("find by visee id")
    @GetMapping("visee/id/{id}")
    public List<PrescriptionRadiotherapie> findByViseeId(@PathVariable Long id) {
        return service.findByViseeId(id);
    }

    @ApiOperation("delete by visee id")
    @DeleteMapping("visee/id/{id}")
    public int deleteByViseeId(@PathVariable Long id) {
        return service.deleteByViseeId(id);
    }

    @ApiOperation("find by protocoleInclusion id")
    @GetMapping("protocoleInclusion/id/{id}")
    public List<PrescriptionRadiotherapie> findByProtocoleInclusionId(@PathVariable Long id) {
        return service.findByProtocoleInclusionId(id);
    }

    @ApiOperation("delete by protocoleInclusion id")
    @DeleteMapping("protocoleInclusion/id/{id}")
    public int deleteByProtocoleInclusionId(@PathVariable Long id) {
        return service.deleteByProtocoleInclusionId(id);
    }

    @ApiOperation("find by statutRadiotherapie code")
    @GetMapping("statutRadiotherapie/code/{code}")
    public List<PrescriptionRadiotherapie> findByStatutRadiotherapieCode(@PathVariable String code) {
        return service.findByStatutRadiotherapieCode(code);
    }

    @ApiOperation("delete by statutRadiotherapie code")
    @DeleteMapping("statutRadiotherapie/code/{code}")
    public int deleteByStatutRadiotherapieCode(@PathVariable String code) {
        return service.deleteByStatutRadiotherapieCode(code);
    }

    @ApiOperation("find by validateurSimulation id")
    @GetMapping("validateurSimulation/id/{id}")
    public List<PrescriptionRadiotherapie> findByValidateurSimulationId(@PathVariable Long id) {
        return service.findByValidateurSimulationId(id);
    }

    @ApiOperation("delete by validateurSimulation id")
    @DeleteMapping("validateurSimulation/id/{id}")
    public int deleteByValidateurSimulationId(@PathVariable Long id) {
        return service.deleteByValidateurSimulationId(id);
    }

    @ApiOperation("find by patient id")
    @GetMapping("patient/id/{id}")
    public List<PrescriptionRadiotherapie> findByPatientId(@PathVariable Long id) {
        return service.findByPatientId(id);
    }

    @ApiOperation("delete by patient id")
    @DeleteMapping("patient/id/{id}")
    public int deleteByPatientId(@PathVariable Long id) {
        return service.deleteByPatientId(id);
    }

    @ApiOperation("find by typeTraitement code")
    @GetMapping("typeTraitement/code/{code}")
    public List<PrescriptionRadiotherapie> findByTypeTraitementCode(@PathVariable String code) {
        return service.findByTypeTraitementCode(code);
    }

    @ApiOperation("delete by typeTraitement code")
    @DeleteMapping("typeTraitement/code/{code}")
    public int deleteByTypeTraitementCode(@PathVariable String code) {
        return service.deleteByTypeTraitementCode(code);
    }

    @ApiOperation("Finds a prescriptionRadiotherapie and associated list by id")
    @GetMapping("detail/id/{id}")
    public ResponseEntity<PrescriptionRadiotherapieDto> findWithAssociatedLists(@PathVariable Long id) {
        return super.findWithAssociatedLists(id);
    }

    @ApiOperation("Finds prescriptionRadiotherapies by criteria")
    @PostMapping("listByCriteria")
    public ResponseEntity<List<PrescriptionRadiotherapieDto>> findByCriteria(@RequestBody PrescriptionRadiotherapieCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated prescriptionRadiotherapies by criteria")
    @PostMapping("paginatedListByCriteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody PrescriptionRadiotherapieCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports prescriptionRadiotherapies by criteria")
    @PostMapping("exportPrescriptionRadiotherapies")
    public ResponseEntity<InputStreamResource> export(@RequestBody PrescriptionRadiotherapieCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets prescriptionRadiotherapie data size by criteria")
    @PostMapping("getPrescriptionRadiotherapiesDataSize")
    public ResponseEntity<Integer> getDataSize(@RequestBody PrescriptionRadiotherapieCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets prescriptionRadiotherapie history by id")
    @GetMapping("histPrescriptionRadiotherapie/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets prescriptionRadiotherapie paginated history by criteria")
    @PostMapping("paginatedListHistByCriteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody PrescriptionRadiotherapieHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports prescriptionRadiotherapie history by criteria")
    @PostMapping("exportPrescriptionRadiotherapiesHist")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody PrescriptionRadiotherapieHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets prescriptionRadiotherapie history data size by criteria")
    @PostMapping("getHistPrescriptionRadiotherapiesDataSize")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody PrescriptionRadiotherapieHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }

    public PrescriptionRadiotherapieRestAdmin(PrescriptionRadiotherapieAdminService service, PrescriptionRadiotherapieConverter converter) {
        super(service, converter);
    }

    @Autowired
    private PrescriptionRadiotherapieSaveAdminProcess prescriptionRadiotherapieSaveAdminProcess;
    @Autowired
    private PrescriptionRadiotherapieSimulerAdminProcess prescriptionRadiotherapieSimulerAdminProcess;
    @Autowired
    private PrescriptionRadiotherapieValidatePhysicienAdminProcess prescriptionRadiotherapieValidatePhysicienAdminProcess;
    @Autowired
    private PrescriptionRadiotherapieSuivreConsultationAdminProcess prescriptionRadiotherapieSuivreConsultationAdminProcess;
    @Autowired
    private PrescriptionRadiotherapieFinirTraitementAdminProcess prescriptionRadiotherapieFinirTraitementAdminProcess;

}