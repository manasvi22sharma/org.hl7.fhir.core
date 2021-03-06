package org.hl7.fhir.convertors.conv10_50;

import org.hl7.fhir.convertors.VersionConvertor_10_50;
import org.hl7.fhir.exceptions.FHIRException;

public class NamingSystem10_50 {

    public static org.hl7.fhir.dstu2.model.NamingSystem convertNamingSystem(org.hl7.fhir.r5.model.NamingSystem src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2.model.NamingSystem tgt = new org.hl7.fhir.dstu2.model.NamingSystem();
        VersionConvertor_10_50.copyDomainResource(src, tgt);
        if (src.hasNameElement())
            tgt.setNameElement(VersionConvertor_10_50.convertString(src.getNameElement()));
        if (src.hasStatus())
            tgt.setStatus(VersionConvertor_10_50.convertConformanceResourceStatus(src.getStatus()));
        if (src.hasKind())
            tgt.setKind(convertNamingSystemType(src.getKind()));
        if (src.hasDate())
            tgt.setDateElement(VersionConvertor_10_50.convertDateTime(src.getDateElement()));
        if (src.hasPublisherElement())
            tgt.setPublisherElement(VersionConvertor_10_50.convertString(src.getPublisherElement()));
        for (org.hl7.fhir.r5.model.ContactDetail t : src.getContact()) tgt.addContact(convertNamingSystemContactComponent(t));
        if (src.hasResponsibleElement())
            tgt.setResponsibleElement(VersionConvertor_10_50.convertString(src.getResponsibleElement()));
        if (src.hasType())
            tgt.setType(VersionConvertor_10_50.convertCodeableConcept(src.getType()));
        if (src.hasDescription())
            tgt.setDescription(src.getDescription());
        for (org.hl7.fhir.r5.model.UsageContext t : src.getUseContext()) if (t.hasValueCodeableConcept())
            tgt.addUseContext(VersionConvertor_10_50.convertCodeableConcept(t.getValueCodeableConcept()));
        for (org.hl7.fhir.r5.model.CodeableConcept t : src.getJurisdiction()) tgt.addUseContext(VersionConvertor_10_50.convertCodeableConcept(t));
        if (src.hasUsageElement())
            tgt.setUsageElement(VersionConvertor_10_50.convertString(src.getUsageElement()));
        for (org.hl7.fhir.r5.model.NamingSystem.NamingSystemUniqueIdComponent t : src.getUniqueId()) tgt.addUniqueId(convertNamingSystemUniqueIdComponent(t));
        return tgt;
    }

    public static org.hl7.fhir.r5.model.NamingSystem convertNamingSystem(org.hl7.fhir.dstu2.model.NamingSystem src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.r5.model.NamingSystem tgt = new org.hl7.fhir.r5.model.NamingSystem();
        VersionConvertor_10_50.copyDomainResource(src, tgt);
        if (src.hasNameElement())
            tgt.setNameElement(VersionConvertor_10_50.convertString(src.getNameElement()));
        if (src.hasStatus())
            tgt.setStatus(VersionConvertor_10_50.convertConformanceResourceStatus(src.getStatus()));
        if (src.hasKind())
            tgt.setKind(convertNamingSystemType(src.getKind()));
        if (src.hasDate())
            tgt.setDateElement(VersionConvertor_10_50.convertDateTime(src.getDateElement()));
        if (src.hasPublisherElement())
            tgt.setPublisherElement(VersionConvertor_10_50.convertString(src.getPublisherElement()));
        for (org.hl7.fhir.dstu2.model.NamingSystem.NamingSystemContactComponent t : src.getContact()) tgt.addContact(convertNamingSystemContactComponent(t));
        if (src.hasResponsibleElement())
            tgt.setResponsibleElement(VersionConvertor_10_50.convertString(src.getResponsibleElement()));
        if (src.hasType())
            tgt.setType(VersionConvertor_10_50.convertCodeableConcept(src.getType()));
        if (src.hasDescription())
            tgt.setDescription(src.getDescription());
        for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getUseContext()) if (VersionConvertor_10_50.isJurisdiction(t))
            tgt.addJurisdiction(VersionConvertor_10_50.convertCodeableConcept(t));
        else
            tgt.addUseContext(VersionConvertor_10_50.convertCodeableConceptToUsageContext(t));
        if (src.hasUsageElement())
            tgt.setUsageElement(VersionConvertor_10_50.convertString(src.getUsageElement()));
        for (org.hl7.fhir.dstu2.model.NamingSystem.NamingSystemUniqueIdComponent t : src.getUniqueId()) tgt.addUniqueId(convertNamingSystemUniqueIdComponent(t));
        return tgt;
    }

    public static org.hl7.fhir.r5.model.ContactDetail convertNamingSystemContactComponent(org.hl7.fhir.dstu2.model.NamingSystem.NamingSystemContactComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.r5.model.ContactDetail tgt = new org.hl7.fhir.r5.model.ContactDetail();
        VersionConvertor_10_50.copyElement(src, tgt);
        if (src.hasNameElement())
            tgt.setNameElement(VersionConvertor_10_50.convertString(src.getNameElement()));
        for (org.hl7.fhir.dstu2.model.ContactPoint t : src.getTelecom()) tgt.addTelecom(VersionConvertor_10_50.convertContactPoint(t));
        return tgt;
    }

    public static org.hl7.fhir.dstu2.model.NamingSystem.NamingSystemContactComponent convertNamingSystemContactComponent(org.hl7.fhir.r5.model.ContactDetail src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2.model.NamingSystem.NamingSystemContactComponent tgt = new org.hl7.fhir.dstu2.model.NamingSystem.NamingSystemContactComponent();
        VersionConvertor_10_50.copyElement(src, tgt);
        if (src.hasNameElement())
            tgt.setNameElement(VersionConvertor_10_50.convertString(src.getNameElement()));
        for (org.hl7.fhir.r5.model.ContactPoint t : src.getTelecom()) tgt.addTelecom(VersionConvertor_10_50.convertContactPoint(t));
        return tgt;
    }

    public static org.hl7.fhir.r5.model.NamingSystem.NamingSystemIdentifierType convertNamingSystemIdentifierType(org.hl7.fhir.dstu2.model.NamingSystem.NamingSystemIdentifierType src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case OID:
                return org.hl7.fhir.r5.model.NamingSystem.NamingSystemIdentifierType.OID;
            case UUID:
                return org.hl7.fhir.r5.model.NamingSystem.NamingSystemIdentifierType.UUID;
            case URI:
                return org.hl7.fhir.r5.model.NamingSystem.NamingSystemIdentifierType.URI;
            case OTHER:
                return org.hl7.fhir.r5.model.NamingSystem.NamingSystemIdentifierType.OTHER;
            default:
                return org.hl7.fhir.r5.model.NamingSystem.NamingSystemIdentifierType.NULL;
        }
    }

    public static org.hl7.fhir.dstu2.model.NamingSystem.NamingSystemIdentifierType convertNamingSystemIdentifierType(org.hl7.fhir.r5.model.NamingSystem.NamingSystemIdentifierType src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case OID:
                return org.hl7.fhir.dstu2.model.NamingSystem.NamingSystemIdentifierType.OID;
            case UUID:
                return org.hl7.fhir.dstu2.model.NamingSystem.NamingSystemIdentifierType.UUID;
            case URI:
                return org.hl7.fhir.dstu2.model.NamingSystem.NamingSystemIdentifierType.URI;
            case OTHER:
                return org.hl7.fhir.dstu2.model.NamingSystem.NamingSystemIdentifierType.OTHER;
            default:
                return org.hl7.fhir.dstu2.model.NamingSystem.NamingSystemIdentifierType.NULL;
        }
    }

    public static org.hl7.fhir.dstu2.model.NamingSystem.NamingSystemType convertNamingSystemType(org.hl7.fhir.r5.model.NamingSystem.NamingSystemType src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case CODESYSTEM:
                return org.hl7.fhir.dstu2.model.NamingSystem.NamingSystemType.CODESYSTEM;
            case IDENTIFIER:
                return org.hl7.fhir.dstu2.model.NamingSystem.NamingSystemType.IDENTIFIER;
            case ROOT:
                return org.hl7.fhir.dstu2.model.NamingSystem.NamingSystemType.ROOT;
            default:
                return org.hl7.fhir.dstu2.model.NamingSystem.NamingSystemType.NULL;
        }
    }

    public static org.hl7.fhir.r5.model.NamingSystem.NamingSystemType convertNamingSystemType(org.hl7.fhir.dstu2.model.NamingSystem.NamingSystemType src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case CODESYSTEM:
                return org.hl7.fhir.r5.model.NamingSystem.NamingSystemType.CODESYSTEM;
            case IDENTIFIER:
                return org.hl7.fhir.r5.model.NamingSystem.NamingSystemType.IDENTIFIER;
            case ROOT:
                return org.hl7.fhir.r5.model.NamingSystem.NamingSystemType.ROOT;
            default:
                return org.hl7.fhir.r5.model.NamingSystem.NamingSystemType.NULL;
        }
    }

    public static org.hl7.fhir.r5.model.NamingSystem.NamingSystemUniqueIdComponent convertNamingSystemUniqueIdComponent(org.hl7.fhir.dstu2.model.NamingSystem.NamingSystemUniqueIdComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.r5.model.NamingSystem.NamingSystemUniqueIdComponent tgt = new org.hl7.fhir.r5.model.NamingSystem.NamingSystemUniqueIdComponent();
        VersionConvertor_10_50.copyElement(src, tgt);
        if (src.hasType())
            tgt.setType(convertNamingSystemIdentifierType(src.getType()));
        if (src.hasValueElement())
            tgt.setValueElement(VersionConvertor_10_50.convertString(src.getValueElement()));
        if (src.hasPreferredElement())
            tgt.setPreferredElement(VersionConvertor_10_50.convertBoolean(src.getPreferredElement()));
        if (src.hasPeriod())
            tgt.setPeriod(VersionConvertor_10_50.convertPeriod(src.getPeriod()));
        return tgt;
    }

    public static org.hl7.fhir.dstu2.model.NamingSystem.NamingSystemUniqueIdComponent convertNamingSystemUniqueIdComponent(org.hl7.fhir.r5.model.NamingSystem.NamingSystemUniqueIdComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2.model.NamingSystem.NamingSystemUniqueIdComponent tgt = new org.hl7.fhir.dstu2.model.NamingSystem.NamingSystemUniqueIdComponent();
        VersionConvertor_10_50.copyElement(src, tgt);
        if (src.hasType())
            tgt.setType(convertNamingSystemIdentifierType(src.getType()));
        if (src.hasValueElement())
            tgt.setValueElement(VersionConvertor_10_50.convertString(src.getValueElement()));
        if (src.hasPreferredElement())
            tgt.setPreferredElement(VersionConvertor_10_50.convertBoolean(src.getPreferredElement()));
        if (src.hasPeriod())
            tgt.setPeriod(VersionConvertor_10_50.convertPeriod(src.getPeriod()));
        return tgt;
    }
}
