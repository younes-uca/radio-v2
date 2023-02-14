package  ma.enova.radio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import java.util.*;
import java.util.stream.Stream;


import ma.enova.radio.zynerator.security.common.AuthoritiesConstants;
import ma.enova.radio.zynerator.security.bean.User;
import ma.enova.radio.zynerator.security.bean.Permission;
import ma.enova.radio.zynerator.security.bean.Role;
import ma.enova.radio.zynerator.security.service.facade.UserService;
import ma.enova.radio.zynerator.security.service.facade.RoleService;
/*
import ma.enova.radio.service.admin.facade.TypeTraitementAdminService;
import ma.enova.radio.bean.TypeTraitement;
import ma.enova.radio.service.admin.facade.StatutRadiotherapieAdminService;
import ma.enova.radio.bean.StatutRadiotherapie;*/

import org.springframework.web.client.RestTemplate;

@SpringBootApplication
//@EnableFeignClients("ma.enova.radio.required.facade")
public class RadioApplication {
    public static ConfigurableApplicationContext ctx;

    public static void main(String[] args) {
        ctx=SpringApplication.run(RadioApplication.class, args);
    }


    @Bean
    RestTemplate restTemplate(){
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
        if(true){
            Map<String,String> etats=new HashMap<>();
            etats.put("Initialisé","initialise");
            etats.put("En cours","encours");
            etats.put("Terminé","termine");
          /*  etats.entrySet().stream().forEach(e->typeTraitementAdminService.save(new TypeTraitement(e.getKey(),e.getValue())));
            etats.entrySet().stream().forEach(e->statutRadiotherapieAdminService.save(new StatutRadiotherapie(e.getKey(),e.getValue())));
*/

    // Role admin

        User userForAdmin = new User("admin");

        Role roleForAdmin = new Role();
        roleForAdmin.setAuthority(AuthoritiesConstants.ADMIN);
        List<Permission> permissionsForAdmin = new ArrayList<>();
        addPermissionForAdmin(permissionsForAdmin);
        roleForAdmin.setPermissions(permissionsForAdmin);
        if(userForAdmin.getRoles()==null)
            userForAdmin.setRoles(new ArrayList<>());

        userForAdmin.getRoles().add(roleForAdmin);
        userService.save(userForAdmin);
            }
        };
    }

    private static void addPermissionForAdmin(List<Permission> permissions){
        permissions.add(new Permission("GradeToxiciteRth.edit"));
        permissions.add(new Permission("GradeToxiciteRth.list"));
        permissions.add(new Permission("GradeToxiciteRth.view"));
        permissions.add(new Permission("GradeToxiciteRth.add"));
        permissions.add(new Permission("GradeToxiciteRth.delete"));
        permissions.add(new Permission("Specialite.edit"));
        permissions.add(new Permission("Specialite.list"));
        permissions.add(new Permission("Specialite.view"));
        permissions.add(new Permission("Specialite.add"));
        permissions.add(new Permission("Specialite.delete"));
        permissions.add(new Permission("DecisionTraitement.edit"));
        permissions.add(new Permission("DecisionTraitement.list"));
        permissions.add(new Permission("DecisionTraitement.view"));
        permissions.add(new Permission("DecisionTraitement.add"));
        permissions.add(new Permission("DecisionTraitement.delete"));
        permissions.add(new Permission("ProtocoleInclusion.edit"));
        permissions.add(new Permission("ProtocoleInclusion.list"));
        permissions.add(new Permission("ProtocoleInclusion.view"));
        permissions.add(new Permission("ProtocoleInclusion.add"));
        permissions.add(new Permission("ProtocoleInclusion.delete"));
        permissions.add(new Permission("CategoriePersonnel.edit"));
        permissions.add(new Permission("CategoriePersonnel.list"));
        permissions.add(new Permission("CategoriePersonnel.view"));
        permissions.add(new Permission("CategoriePersonnel.add"));
        permissions.add(new Permission("CategoriePersonnel.delete"));
        permissions.add(new Permission("HistortiquePrescriptionRadiotherapie.edit"));
        permissions.add(new Permission("HistortiquePrescriptionRadiotherapie.list"));
        permissions.add(new Permission("HistortiquePrescriptionRadiotherapie.view"));
        permissions.add(new Permission("HistortiquePrescriptionRadiotherapie.add"));
        permissions.add(new Permission("HistortiquePrescriptionRadiotherapie.delete"));
        permissions.add(new Permission("SeanceRadiotherapie.edit"));
        permissions.add(new Permission("SeanceRadiotherapie.list"));
        permissions.add(new Permission("SeanceRadiotherapie.view"));
        permissions.add(new Permission("SeanceRadiotherapie.add"));
        permissions.add(new Permission("SeanceRadiotherapie.delete"));
        permissions.add(new Permission("Positionnement.edit"));
        permissions.add(new Permission("Positionnement.list"));
        permissions.add(new Permission("Positionnement.view"));
        permissions.add(new Permission("Positionnement.add"));
        permissions.add(new Permission("Positionnement.delete"));
        permissions.add(new Permission("PrescriptionRadiotherapie.edit"));
        permissions.add(new Permission("PrescriptionRadiotherapie.list"));
        permissions.add(new Permission("PrescriptionRadiotherapie.view"));
        permissions.add(new Permission("PrescriptionRadiotherapie.add"));
        permissions.add(new Permission("PrescriptionRadiotherapie.delete"));
        permissions.add(new Permission("ConsultationRadiotherapie.edit"));
        permissions.add(new Permission("ConsultationRadiotherapie.list"));
        permissions.add(new Permission("ConsultationRadiotherapie.view"));
        permissions.add(new Permission("ConsultationRadiotherapie.add"));
        permissions.add(new Permission("ConsultationRadiotherapie.delete"));
        permissions.add(new Permission("TypeTraitement.edit"));
        permissions.add(new Permission("TypeTraitement.list"));
        permissions.add(new Permission("TypeTraitement.view"));
        permissions.add(new Permission("TypeTraitement.add"));
        permissions.add(new Permission("TypeTraitement.delete"));
        permissions.add(new Permission("StatutRadiotherapie.edit"));
        permissions.add(new Permission("StatutRadiotherapie.list"));
        permissions.add(new Permission("StatutRadiotherapie.view"));
        permissions.add(new Permission("StatutRadiotherapie.add"));
        permissions.add(new Permission("StatutRadiotherapie.delete"));
        permissions.add(new Permission("Site.edit"));
        permissions.add(new Permission("Site.list"));
        permissions.add(new Permission("Site.view"));
        permissions.add(new Permission("Site.add"));
        permissions.add(new Permission("Site.delete"));
        permissions.add(new Permission("ModaliteRadiotherapie.edit"));
        permissions.add(new Permission("ModaliteRadiotherapie.list"));
        permissions.add(new Permission("ModaliteRadiotherapie.view"));
        permissions.add(new Permission("ModaliteRadiotherapie.add"));
        permissions.add(new Permission("ModaliteRadiotherapie.delete"));
        permissions.add(new Permission("Services.edit"));
        permissions.add(new Permission("Services.list"));
        permissions.add(new Permission("Services.view"));
        permissions.add(new Permission("Services.add"));
        permissions.add(new Permission("Services.delete"));
        permissions.add(new Permission("FrequenceRadiotherapie.edit"));
        permissions.add(new Permission("FrequenceRadiotherapie.list"));
        permissions.add(new Permission("FrequenceRadiotherapie.view"));
        permissions.add(new Permission("FrequenceRadiotherapie.add"));
        permissions.add(new Permission("FrequenceRadiotherapie.delete"));
        permissions.add(new Permission("Visee.edit"));
        permissions.add(new Permission("Visee.list"));
        permissions.add(new Permission("Visee.view"));
        permissions.add(new Permission("Visee.add"));
        permissions.add(new Permission("Visee.delete"));
        permissions.add(new Permission("Patient.edit"));
        permissions.add(new Permission("Patient.list"));
        permissions.add(new Permission("Patient.view"));
        permissions.add(new Permission("Patient.add"));
        permissions.add(new Permission("Patient.delete"));
        permissions.add(new Permission("Personnel.edit"));
        permissions.add(new Permission("Personnel.list"));
        permissions.add(new Permission("Personnel.view"));
        permissions.add(new Permission("Personnel.add"));
        permissions.add(new Permission("Personnel.delete"));
        permissions.add(new Permission("TypeConsultationRadiotherapie.edit"));
        permissions.add(new Permission("TypeConsultationRadiotherapie.list"));
        permissions.add(new Permission("TypeConsultationRadiotherapie.view"));
        permissions.add(new Permission("TypeConsultationRadiotherapie.add"));
        permissions.add(new Permission("TypeConsultationRadiotherapie.delete"));
        permissions.add(new Permission("Immobilistion.edit"));
        permissions.add(new Permission("Immobilistion.list"));
        permissions.add(new Permission("Immobilistion.view"));
        permissions.add(new Permission("Immobilistion.add"));
        permissions.add(new Permission("Immobilistion.delete"));
        permissions.add(new Permission("TypeToxiciteRth.edit"));
        permissions.add(new Permission("TypeToxiciteRth.list"));
        permissions.add(new Permission("TypeToxiciteRth.view"));
        permissions.add(new Permission("TypeToxiciteRth.add"));
        permissions.add(new Permission("TypeToxiciteRth.delete"));
    }
}


