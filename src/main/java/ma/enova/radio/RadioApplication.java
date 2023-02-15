package ma.enova.radio;

import ma.enova.radio.bean.core.*;
import ma.enova.radio.service.facade.admin.*;
import ma.enova.radio.zynerator.security.bean.Permission;
import ma.enova.radio.zynerator.security.bean.Role;
import ma.enova.radio.zynerator.security.bean.User;
import ma.enova.radio.zynerator.security.common.AuthoritiesConstants;
import ma.enova.radio.zynerator.security.service.facade.RoleService;
import ma.enova.radio.zynerator.security.service.facade.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
//@EnableFeignClients("ma.enova.radio.required.facade")
public class RadioApplication {
    public static ConfigurableApplicationContext ctx;

    public static void main(String[] args) {
        ctx = SpringApplication.run(RadioApplication.class, args);
    }


    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static ConfigurableApplicationContext getCtx() {
        return ctx;
    }

    @Bean
    public CommandLineRunner demo(UserService userService, RoleService roleService
                                  //, TypeTraitementAdminService typeTraitementAdminService, StatutRadiotherapieAdminService statutRadiotherapieAdminService
    ) {
        return (args) -> {
            if (true) {
                Map<String, String> etats = new HashMap<>();
                etats.put("en-attente-prescription", "EN_ATTENTE_PRESCRIPTION");
                etats.put("en-attente-simulation", "EN_ATTENTE_SIMULATION");
                etats.put("en-attente-validation", "EN_ATTENTE_VALIDATION");
                etats.put("en-cours-traitement", "EN_COURS_TRAITEMENT");
                etats.put("fin-traitement", "FIN_TRAITEMENT");

                createModalite();
                createVisee();
                createPatient();
                createSite();
                createPersonnel();
                createProtocoleInclusion();
                createTypeTraitement();

                createGradeToxiciteRth();
                createImmobilistion();
                createPositionnement();
                createTypeToxiciteRth();

          /*  etats.entrySet().stream().forEach(e->typeTraitementAdminService.save(new TypeTraitement(e.getKey(),e.getValue())));
            etats.entrySet().stream().forEach(e->statutRadiotherapieAdminService.save(new StatutRadiotherapie(e.getKey(),e.getValue())));
*/

                // Role admin

                User userForAdmin = new User("admin");

                Role roleForAdmin = new Role();
                roleForAdmin.setAuthority(AuthoritiesConstants.ADMIN);
                List<Permission> permissionsForAdmin = new ArrayList<>();
                roleForAdmin.setPermissions(permissionsForAdmin);
                if (userForAdmin.getRoles() == null)
                    userForAdmin.setRoles(new ArrayList<>());

                userForAdmin.getRoles().add(roleForAdmin);
                userService.save(userForAdmin);
            }
        };
    }

    private void createModalite() {
        String prefix = "modalite ";
        for (int i = 1; i < 100; i++) {
            ModaliteRadiotherapie item = new ModaliteRadiotherapie();
            item.setOrdre(1L * i);
            item.setLibelle(prefix + i);
            item.setCode(prefix + i);
            modaliteRadiotherapieService.create(item);
        }
    }

    private void createPatient() {
        String prefix = "patient ";
        for (int i = 1; i < 100; i++) {
            Patient item = new Patient();
            item.setOrdre(1L * i);
            item.setIpp(prefix + i);
            item.setNom(prefix + i);
            item.setPrenom(prefix + i);
            item.setAge(i * 10);
            item.setSexe(i % 2 == 0 ? "Male" : "Female");
            patientService.create(item);

        }
    }

    private void createSite() {
        String prefix = "site ";
        for (int i = 1; i < 100; i++) {
            Site item = new Site();
            item.setOrdre(1L * i);
            item.setLibelle(prefix + i);
            item.setCode(prefix + i);
            siteService.create(item);

        }
    }

    private void createTypeTraitement() {
        String prefix = "typeTraitement ";
        for (int i = 1; i < 100; i++) {
            TypeTraitement item = new TypeTraitement();
            item.setLibelle(prefix + i);
            item.setCode(prefix + i);
            typeTraitementService.create(item);

        }
    }

    private void createPersonnel() {
        String prefix = "personnel ";
        for (int i = 1; i < 100; i++) {
            Personnel item = new Personnel();
            item.setIpp(prefix + i);
            item.setNom(prefix + i);
            item.setPrenom(prefix + i);
            personnelService.create(item);

        }
    }

    private void createVisee() {
        String prefix = "visee ";
        for (int i = 1; i < 100; i++) {
            Visee item = new Visee();
            item.setOrdre(1L * i);
            item.setLibelle(prefix + i);
            item.setCode(prefix + i);
            viseeService.create(item);

        }
    }

    private void createProtocoleInclusion() {
        String prefix = "protocoleInclusion ";
        for (int i = 1; i < 100; i++) {
            ProtocoleInclusion item = new ProtocoleInclusion();
            item.setOrdre(1L * i);
            item.setLibelle(prefix + i);
            item.setCode(prefix + i);
            protocoleInclusionService.create(item);

        }
    }

    private void createGradeToxiciteRth() {
        String prefix = "gradeToxiciteRth ";
        for (int i = 1; i < 100; i++) {
            GradeToxiciteRth item = new GradeToxiciteRth();
            item.setOrdre(1L * i);
            item.setLibelle(prefix + i);
            item.setCode(prefix + i);
            gradeToxiciteRthService.create(item);

        }
    }

    private void createTypeToxiciteRth() {
        String prefix = "typeToxiciteRth ";
        for (int i = 1; i < 100; i++) {
            TypeToxiciteRth item = new TypeToxiciteRth();
            item.setOrdre(1L * i);
            item.setLibelle(prefix + i);
            item.setCode(prefix + i);
            typeToxiciteRthService.create(item);

        }
    }

    private void createImmobilistion() {
        String prefix = "immobilistion ";
        for (int i = 1; i < 100; i++) {
            Immobilistion item = new Immobilistion();
            item.setOrdre(1L * i);
            item.setLibelle(prefix + i);
            item.setCode(prefix + i);
            immobilistionService.create(item);

        }
    }

    private void createPositionnement() {
        String prefix = "positionnement ";
        for (int i = 1; i < 100; i++) {
            Positionnement item = new Positionnement();
            item.setOrdre(1L * i);
            item.setLibelle(prefix + i);
            item.setCode(prefix + i);
            positionnementService.create(item);

        }
    }

    @Autowired
    private GradeToxiciteRthAdminService gradeToxiciteRthService;
    @Autowired
    private TypeToxiciteRthAdminService typeToxiciteRthService;
    @Autowired
    private ImmobilistionAdminService immobilistionService;
    @Autowired
    private PositionnementAdminService positionnementService;
    @Autowired
    private ModaliteRadiotherapieAdminService modaliteRadiotherapieService;
    @Autowired
    private PatientAdminService patientService;
    @Autowired
    private SiteAdminService siteService;
    @Autowired
    private TypeTraitementAdminService typeTraitementService;
    @Autowired
    private PersonnelAdminService personnelService;
    @Autowired
    private ViseeAdminService viseeService;
    @Autowired
    private ProtocoleInclusionAdminService protocoleInclusionService;

}


