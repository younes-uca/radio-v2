package  ma.enova.radio.dao.criteria.core;



import ma.enova.radio.zynerator.criteria.BaseCriteria;

import java.time.LocalDateTime;
import java.util.List;



public class StatutRadiotherapieCriteria extends BaseCriteria {

    private String code;
    private String codeLike;
    private String libelle;
    private String libelleLike;
    private String style;
    private String styleLike;



    public StatutRadiotherapieCriteria(){}

    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }
    public String getCodeLike(){
        return this.codeLike;
    }
    public void setCodeLike(String codeLike){
        this.codeLike = codeLike;
    }

    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }
    public String getLibelleLike(){
        return this.libelleLike;
    }
    public void setLibelleLike(String libelleLike){
        this.libelleLike = libelleLike;
    }

    public String getStyle(){
        return this.style;
    }
    public void setStyle(String style){
        this.style = style;
    }
    public String getStyleLike(){
        return this.styleLike;
    }
    public void setStyleLike(String styleLike){
        this.styleLike = styleLike;
    }


    public static class ConsultationRadiotherapieCriteria extends BaseCriteria {

        private LocalDateTime dateConsultation;
        private LocalDateTime dateConsultationFrom;
        private LocalDateTime dateConsultationTo;

        private PersonnelCriteria medecin ;
        private List<PersonnelCriteria> medecins ;
        private SpecialiteCriteria specialite ;
        private List<SpecialiteCriteria> specialites ;
        private TypeConsultationRadiotherapieCriteria typeConsultationRadiotherapie ;
        private List<TypeConsultationRadiotherapieCriteria> typeConsultationRadiotherapies ;
        private TypeToxiciteRthCriteria typeToxiciteRth ;
        private List<TypeToxiciteRthCriteria> typeToxiciteRths ;
        private GradeToxiciteRthCriteria gradeToxiciteRth ;
        private List<GradeToxiciteRthCriteria> gradeToxiciteRths ;
        private ClassificationOmsCriteria classificationOms ;
        private List<ClassificationOmsCriteria> classificationOmss ;
        private StatutMedicaleConsultationRadiotherapieCriteria statutMedicaleConsultationRadiotherapie ;
        private List<StatutMedicaleConsultationRadiotherapieCriteria> statutMedicaleConsultationRadiotherapies ;
        private PrescriptionRadiotherapieCriteria prescriptionRadiotherapie ;
        private List<PrescriptionRadiotherapieCriteria> prescriptionRadiotherapies ;


        public ConsultationRadiotherapieCriteria(){}

        public LocalDateTime getDateConsultation(){
            return this.dateConsultation;
        }
        public void setDateConsultation(LocalDateTime dateConsultation){
            this.dateConsultation = dateConsultation;
        }
        public LocalDateTime getDateConsultationFrom(){
            return this.dateConsultationFrom;
        }
        public void setDateConsultationFrom(LocalDateTime dateConsultationFrom){
            this.dateConsultationFrom = dateConsultationFrom;
        }
        public LocalDateTime getDateConsultationTo(){
            return this.dateConsultationTo;
        }
        public void setDateConsultationTo(LocalDateTime dateConsultationTo){
            this.dateConsultationTo = dateConsultationTo;
        }

        public PersonnelCriteria getMedecin(){
            return this.medecin;
        }

        public void setMedecin(PersonnelCriteria medecin){
            this.medecin = medecin;
        }
        public List<PersonnelCriteria> getMedecins(){
            return this.medecins;
        }

        public void setMedecins(List<PersonnelCriteria> medecins){
            this.medecins = medecins;
        }
        public SpecialiteCriteria getSpecialite(){
            return this.specialite;
        }

        public void setSpecialite(SpecialiteCriteria specialite){
            this.specialite = specialite;
        }
        public List<SpecialiteCriteria> getSpecialites(){
            return this.specialites;
        }

        public void setSpecialites(List<SpecialiteCriteria> specialites){
            this.specialites = specialites;
        }
        public TypeConsultationRadiotherapieCriteria getTypeConsultationRadiotherapie(){
            return this.typeConsultationRadiotherapie;
        }

        public void setTypeConsultationRadiotherapie(TypeConsultationRadiotherapieCriteria typeConsultationRadiotherapie){
            this.typeConsultationRadiotherapie = typeConsultationRadiotherapie;
        }
        public List<TypeConsultationRadiotherapieCriteria> getTypeConsultationRadiotherapies(){
            return this.typeConsultationRadiotherapies;
        }

        public void setTypeConsultationRadiotherapies(List<TypeConsultationRadiotherapieCriteria> typeConsultationRadiotherapies){
            this.typeConsultationRadiotherapies = typeConsultationRadiotherapies;
        }
        public TypeToxiciteRthCriteria getTypeToxiciteRth(){
            return this.typeToxiciteRth;
        }

        public void setTypeToxiciteRth(TypeToxiciteRthCriteria typeToxiciteRth){
            this.typeToxiciteRth = typeToxiciteRth;
        }
        public List<TypeToxiciteRthCriteria> getTypeToxiciteRths(){
            return this.typeToxiciteRths;
        }

        public void setTypeToxiciteRths(List<TypeToxiciteRthCriteria> typeToxiciteRths){
            this.typeToxiciteRths = typeToxiciteRths;
        }
        public GradeToxiciteRthCriteria getGradeToxiciteRth(){
            return this.gradeToxiciteRth;
        }

        public void setGradeToxiciteRth(GradeToxiciteRthCriteria gradeToxiciteRth){
            this.gradeToxiciteRth = gradeToxiciteRth;
        }
        public List<GradeToxiciteRthCriteria> getGradeToxiciteRths(){
            return this.gradeToxiciteRths;
        }

        public void setGradeToxiciteRths(List<GradeToxiciteRthCriteria> gradeToxiciteRths){
            this.gradeToxiciteRths = gradeToxiciteRths;
        }
        public ClassificationOmsCriteria getClassificationOms(){
            return this.classificationOms;
        }

        public void setClassificationOms(ClassificationOmsCriteria classificationOms){
            this.classificationOms = classificationOms;
        }
        public List<ClassificationOmsCriteria> getClassificationOmss(){
            return this.classificationOmss;
        }

        public void setClassificationOmss(List<ClassificationOmsCriteria> classificationOmss){
            this.classificationOmss = classificationOmss;
        }
        public StatutMedicaleConsultationRadiotherapieCriteria getStatutMedicaleConsultationRadiotherapie(){
            return this.statutMedicaleConsultationRadiotherapie;
        }

        public void setStatutMedicaleConsultationRadiotherapie(StatutMedicaleConsultationRadiotherapieCriteria statutMedicaleConsultationRadiotherapie){
            this.statutMedicaleConsultationRadiotherapie = statutMedicaleConsultationRadiotherapie;
        }
        public List<StatutMedicaleConsultationRadiotherapieCriteria> getStatutMedicaleConsultationRadiotherapies(){
            return this.statutMedicaleConsultationRadiotherapies;
        }

        public void setStatutMedicaleConsultationRadiotherapies(List<StatutMedicaleConsultationRadiotherapieCriteria> statutMedicaleConsultationRadiotherapies){
            this.statutMedicaleConsultationRadiotherapies = statutMedicaleConsultationRadiotherapies;
        }
        public PrescriptionRadiotherapieCriteria getPrescriptionRadiotherapie(){
            return this.prescriptionRadiotherapie;
        }

        public void setPrescriptionRadiotherapie(PrescriptionRadiotherapieCriteria prescriptionRadiotherapie){
            this.prescriptionRadiotherapie = prescriptionRadiotherapie;
        }
        public List<PrescriptionRadiotherapieCriteria> getPrescriptionRadiotherapies(){
            return this.prescriptionRadiotherapies;
        }

        public void setPrescriptionRadiotherapies(List<PrescriptionRadiotherapieCriteria> prescriptionRadiotherapies){
            this.prescriptionRadiotherapies = prescriptionRadiotherapies;
        }
    }

    public static class SpecialiteCriteria extends BaseCriteria {

        private String code;
        private String codeLike;
        private String libelle;
        private String libelleLike;

        private ServicesCriteria services ;
        private List<ServicesCriteria> servicess ;


        public SpecialiteCriteria(){}

        public String getCode(){
            return this.code;
        }
        public void setCode(String code){
            this.code = code;
        }
        public String getCodeLike(){
            return this.codeLike;
        }
        public void setCodeLike(String codeLike){
            this.codeLike = codeLike;
        }

        public String getLibelle(){
            return this.libelle;
        }
        public void setLibelle(String libelle){
            this.libelle = libelle;
        }
        public String getLibelleLike(){
            return this.libelleLike;
        }
        public void setLibelleLike(String libelleLike){
            this.libelleLike = libelleLike;
        }


        public ServicesCriteria getServices(){
            return this.services;
        }

        public void setServices(ServicesCriteria services){
            this.services = services;
        }
        public List<ServicesCriteria> getServicess(){
            return this.servicess;
        }

        public void setServicess(List<ServicesCriteria> servicess){
            this.servicess = servicess;
        }
    }
}
