package org.hl7.fhir.convertors.conv10_40;

import org.hl7.fhir.convertors.VersionConvertor_10_40;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Dosage.DosageDoseAndRateComponent;

public class MedicationStatement10_40 {

    public static org.hl7.fhir.dstu2.model.MedicationStatement convertMedicationStatement(org.hl7.fhir.r4.model.MedicationStatement src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2.model.MedicationStatement tgt = new org.hl7.fhir.dstu2.model.MedicationStatement();
        VersionConvertor_10_40.copyDomainResource(src, tgt);
        for (org.hl7.fhir.r4.model.Identifier t : src.getIdentifier()) tgt.addIdentifier(VersionConvertor_10_40.convertIdentifier(t));
        if (src.hasStatus())
            tgt.setStatus(convertMedicationStatementStatus(src.getStatus()));
        if (src.hasMedication())
            tgt.setMedication(VersionConvertor_10_40.convertType(src.getMedication()));
        if (src.hasSubject())
            tgt.setPatient(VersionConvertor_10_40.convertReference(src.getSubject()));
        if (src.hasEffective())
            tgt.setEffective(VersionConvertor_10_40.convertType(src.getEffective()));
        if (src.hasInformationSource())
            tgt.setInformationSource(VersionConvertor_10_40.convertReference(src.getInformationSource()));
        for (org.hl7.fhir.r4.model.Reference t : src.getDerivedFrom()) tgt.addSupportingInformation(VersionConvertor_10_40.convertReference(t));
        if (src.hasDateAsserted())
            tgt.setDateAssertedElement(VersionConvertor_10_40.convertDateTime(src.getDateAssertedElement()));
        for (org.hl7.fhir.r4.model.Annotation t : src.getNote()) tgt.setNote(t.getText());
        for (org.hl7.fhir.r4.model.Dosage t : src.getDosage()) tgt.addDosage(convertMedicationStatementDosageComponent(t));
        return tgt;
    }

    public static org.hl7.fhir.r4.model.MedicationStatement convertMedicationStatement(org.hl7.fhir.dstu2.model.MedicationStatement src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.r4.model.MedicationStatement tgt = new org.hl7.fhir.r4.model.MedicationStatement();
        VersionConvertor_10_40.copyDomainResource(src, tgt);
        for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier()) tgt.addIdentifier(VersionConvertor_10_40.convertIdentifier(t));
        if (src.hasStatus())
            tgt.setStatus(convertMedicationStatementStatus(src.getStatus()));
        if (src.hasMedication())
            tgt.setMedication(VersionConvertor_10_40.convertType(src.getMedication()));
        if (src.hasPatient())
            tgt.setSubject(VersionConvertor_10_40.convertReference(src.getPatient()));
        if (src.hasEffective())
            tgt.setEffective(VersionConvertor_10_40.convertType(src.getEffective()));
        if (src.hasInformationSource())
            tgt.setInformationSource(VersionConvertor_10_40.convertReference(src.getInformationSource()));
        for (org.hl7.fhir.dstu2.model.Reference t : src.getSupportingInformation()) tgt.addDerivedFrom(VersionConvertor_10_40.convertReference(t));
        if (src.hasDateAsserted())
            tgt.setDateAssertedElement(VersionConvertor_10_40.convertDateTime(src.getDateAssertedElement()));
        if (src.hasNote())
            tgt.addNote().setText(src.getNote());
        for (org.hl7.fhir.dstu2.model.MedicationStatement.MedicationStatementDosageComponent t : src.getDosage()) tgt.addDosage(convertMedicationStatementDosageComponent(t));
        return tgt;
    }

    public static org.hl7.fhir.r4.model.Dosage convertMedicationStatementDosageComponent(org.hl7.fhir.dstu2.model.MedicationStatement.MedicationStatementDosageComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.r4.model.Dosage tgt = new org.hl7.fhir.r4.model.Dosage();
        VersionConvertor_10_40.copyElement(src, tgt);
        if (src.hasTextElement())
            tgt.setTextElement(VersionConvertor_10_40.convertString(src.getTextElement()));
        if (src.hasTiming())
            tgt.setTiming(VersionConvertor_10_40.convertTiming(src.getTiming()));
        if (src.hasAsNeeded())
            tgt.setAsNeeded(VersionConvertor_10_40.convertType(src.getAsNeeded()));
        if (src.hasSiteCodeableConcept())
            tgt.setSite(VersionConvertor_10_40.convertCodeableConcept(src.getSiteCodeableConcept()));
        if (src.hasRoute())
            tgt.setRoute(VersionConvertor_10_40.convertCodeableConcept(src.getRoute()));
        if (src.hasMethod())
            tgt.setMethod(VersionConvertor_10_40.convertCodeableConcept(src.getMethod()));
        if (src.hasRate()) {
            DosageDoseAndRateComponent dr = tgt.addDoseAndRate();
            if (src.hasRate())
                dr.setRate(VersionConvertor_10_40.convertType(src.getRate()));
        }
        if (src.hasMaxDosePerPeriod())
            tgt.setMaxDosePerPeriod(VersionConvertor_10_40.convertRatio(src.getMaxDosePerPeriod()));
        return tgt;
    }

    public static org.hl7.fhir.dstu2.model.MedicationStatement.MedicationStatementDosageComponent convertMedicationStatementDosageComponent(org.hl7.fhir.r4.model.Dosage src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2.model.MedicationStatement.MedicationStatementDosageComponent tgt = new org.hl7.fhir.dstu2.model.MedicationStatement.MedicationStatementDosageComponent();
        VersionConvertor_10_40.copyElement(src, tgt);
        if (src.hasTextElement())
            tgt.setTextElement(VersionConvertor_10_40.convertString(src.getTextElement()));
        if (src.hasTiming())
            tgt.setTiming(VersionConvertor_10_40.convertTiming(src.getTiming()));
        if (src.hasAsNeeded())
            tgt.setAsNeeded(VersionConvertor_10_40.convertType(src.getAsNeeded()));
        if (src.hasSite())
            tgt.setSite(VersionConvertor_10_40.convertType(src.getSite()));
        if (src.hasRoute())
            tgt.setRoute(VersionConvertor_10_40.convertCodeableConcept(src.getRoute()));
        if (src.hasMethod())
            tgt.setMethod(VersionConvertor_10_40.convertCodeableConcept(src.getMethod()));
        if (src.hasDoseAndRate() && src.getDoseAndRate().get(0).hasRate())
            tgt.setRate(VersionConvertor_10_40.convertType(src.getDoseAndRate().get(0).getRate()));
        if (src.hasMaxDosePerPeriod())
            tgt.setMaxDosePerPeriod(VersionConvertor_10_40.convertRatio(src.getMaxDosePerPeriod()));
        return tgt;
    }

    public static org.hl7.fhir.r4.model.MedicationStatement.MedicationStatementStatus convertMedicationStatementStatus(org.hl7.fhir.dstu2.model.MedicationStatement.MedicationStatementStatus src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case ACTIVE:
                return org.hl7.fhir.r4.model.MedicationStatement.MedicationStatementStatus.ACTIVE;
            case COMPLETED:
                return org.hl7.fhir.r4.model.MedicationStatement.MedicationStatementStatus.COMPLETED;
            case ENTEREDINERROR:
                return org.hl7.fhir.r4.model.MedicationStatement.MedicationStatementStatus.ENTEREDINERROR;
            case INTENDED:
                return org.hl7.fhir.r4.model.MedicationStatement.MedicationStatementStatus.INTENDED;
            default:
                return org.hl7.fhir.r4.model.MedicationStatement.MedicationStatementStatus.NULL;
        }
    }

    public static org.hl7.fhir.dstu2.model.MedicationStatement.MedicationStatementStatus convertMedicationStatementStatus(org.hl7.fhir.r4.model.MedicationStatement.MedicationStatementStatus src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case ACTIVE:
                return org.hl7.fhir.dstu2.model.MedicationStatement.MedicationStatementStatus.ACTIVE;
            case COMPLETED:
                return org.hl7.fhir.dstu2.model.MedicationStatement.MedicationStatementStatus.COMPLETED;
            case ENTEREDINERROR:
                return org.hl7.fhir.dstu2.model.MedicationStatement.MedicationStatementStatus.ENTEREDINERROR;
            case INTENDED:
                return org.hl7.fhir.dstu2.model.MedicationStatement.MedicationStatementStatus.INTENDED;
            default:
                return org.hl7.fhir.dstu2.model.MedicationStatement.MedicationStatementStatus.NULL;
        }
    }
}
