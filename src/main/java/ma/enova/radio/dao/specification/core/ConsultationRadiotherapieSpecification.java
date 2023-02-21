package ma.enova.radio.dao.specification.core;


import ma.enova.radio.bean.core.ConsultationRadiotherapie;
import ma.enova.radio.dao.criteria.core.ConsultationRadiotherapieCriteria;
import ma.enova.radio.zynerator.specification.AbstractSpecification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class ConsultationRadiotherapieSpecification extends AbstractSpecification<ConsultationRadiotherapieCriteria, ConsultationRadiotherapie> {

    @Override
    public Predicate toPredicate(Root<ConsultationRadiotherapie> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
        List<Predicate> predicates = new ArrayList<>();
            attachSearchElement(root, query, builder, predicates);
            if (criteria != null) {
                addPredicateId("id", criteria);
                addPredicate("dateConsultation", criteria.getDateConsultation(), criteria.getDateConsultationFrom(), criteria.getDateConsultationTo());
                addPredicate("medecin.id", criteria.getMedecin());
                addPredicate("medecin.id", criteria.getMedecins());
                addPredicate("medecin.ipp", criteria.getMedecin());
                addPredicate("medecin.ipp", criteria.getMedecins());
                addPredicate("specialite.id", criteria.getSpecialite());
                addPredicate("specialite.id", criteria.getSpecialites());
                addPredicate("specialite.code", criteria.getSpecialite());
                addPredicate("specialite.code", criteria.getSpecialites());
                addPredicate("typeConsultationRadiotherapie.id", criteria.getTypeConsultationRadiotherapie());
                addPredicate("typeConsultationRadiotherapie.id", criteria.getTypeConsultationRadiotherapies());
                addPredicate("typeConsultationRadiotherapie.code", criteria.getTypeConsultationRadiotherapie());
                addPredicate("typeConsultationRadiotherapie.code", criteria.getTypeConsultationRadiotherapies());
                addPredicate("typeToxiciteRth.id", criteria.getTypeToxiciteRth());
                addPredicate("typeToxiciteRth.id", criteria.getTypeToxiciteRths());
                addPredicate("typeToxiciteRth.code", criteria.getTypeToxiciteRth());
                addPredicate("typeToxiciteRth.code", criteria.getTypeToxiciteRths());
                addPredicate("gradeToxiciteRth.id", criteria.getGradeToxiciteRth());
                addPredicate("gradeToxiciteRth.id", criteria.getGradeToxiciteRths());
                addPredicate("gradeToxiciteRth.code", criteria.getGradeToxiciteRth());
                addPredicate("gradeToxiciteRth.code", criteria.getGradeToxiciteRths());
                addPredicate("classificationOms.id", criteria.getClassificationOms());
                addPredicate("classificationOms.id", criteria.getClassificationOmss());
                addPredicate("classificationOms.code", criteria.getClassificationOms());
                addPredicate("classificationOms.code", criteria.getClassificationOmss());
                addPredicate("statutMedicaleConsultationRadiotherapie.id", criteria.getStatutMedicaleConsultationRadiotherapie());
                addPredicate("statutMedicaleConsultationRadiotherapie.id", criteria.getStatutMedicaleConsultationRadiotherapies());
                addPredicate("statutMedicaleConsultationRadiotherapie.code", criteria.getStatutMedicaleConsultationRadiotherapie());
                addPredicate("statutMedicaleConsultationRadiotherapie.code", criteria.getStatutMedicaleConsultationRadiotherapies());
                addPredicate("prescriptionRadiotherapie.id", criteria.getPrescriptionRadiotherapie());
                addPredicate("prescriptionRadiotherapie.id", criteria.getPrescriptionRadiotherapies());
                addOrderAndFilter();
          }
        return getResult();
    }


    public ConsultationRadiotherapieSpecification(ConsultationRadiotherapieCriteria criteria) {
        super(criteria);
    }

    public ConsultationRadiotherapieSpecification(ConsultationRadiotherapieCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }



    }
