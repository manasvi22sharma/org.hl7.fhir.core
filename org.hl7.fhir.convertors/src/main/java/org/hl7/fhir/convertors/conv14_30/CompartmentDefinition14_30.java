package org.hl7.fhir.convertors.conv14_30;

import org.hl7.fhir.convertors.VersionConvertor_14_30;
import org.hl7.fhir.exceptions.FHIRException;

public class CompartmentDefinition14_30 {

    public static org.hl7.fhir.dstu3.model.CompartmentDefinition convertCompartmentDefinition(org.hl7.fhir.dstu2016may.model.CompartmentDefinition src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu3.model.CompartmentDefinition tgt = new org.hl7.fhir.dstu3.model.CompartmentDefinition();
        VersionConvertor_14_30.copyDomainResource(src, tgt);
        if (src.hasUrlElement())
            tgt.setUrlElement(VersionConvertor_14_30.convertUri(src.getUrlElement()));
        if (src.hasNameElement())
            tgt.setNameElement(VersionConvertor_14_30.convertString(src.getNameElement()));
        if (src.hasStatus())
            tgt.setStatus(VersionConvertor_14_30.convertConformanceResourceStatus(src.getStatus()));
        if (src.hasExperimental())
            tgt.setExperimentalElement(VersionConvertor_14_30.convertBoolean(src.getExperimentalElement()));
        if (src.hasPublisher())
            tgt.setPublisherElement(VersionConvertor_14_30.convertString(src.getPublisherElement()));
        for (org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentDefinitionContactComponent t : src.getContact()) tgt.addContact(convertCompartmentDefinitionContactComponent(t));
        if (src.hasDate())
            tgt.setDateElement(VersionConvertor_14_30.convertDateTime(src.getDateElement()));
        if (src.hasDescription())
            tgt.setDescription(src.getDescription());
        if (src.hasRequirements())
            tgt.setPurpose(src.getRequirements());
        if (src.hasCode())
            tgt.setCode(convertCompartmentType(src.getCode()));
        if (src.hasSearchElement())
            tgt.setSearchElement(VersionConvertor_14_30.convertBoolean(src.getSearchElement()));
        for (org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentDefinitionResourceComponent t : src.getResource()) tgt.addResource(convertCompartmentDefinitionResourceComponent(t));
        return tgt;
    }

    public static org.hl7.fhir.dstu2016may.model.CompartmentDefinition convertCompartmentDefinition(org.hl7.fhir.dstu3.model.CompartmentDefinition src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2016may.model.CompartmentDefinition tgt = new org.hl7.fhir.dstu2016may.model.CompartmentDefinition();
        VersionConvertor_14_30.copyDomainResource(src, tgt);
        if (src.hasUrlElement())
            tgt.setUrlElement(VersionConvertor_14_30.convertUri(src.getUrlElement()));
        if (src.hasNameElement())
            tgt.setNameElement(VersionConvertor_14_30.convertString(src.getNameElement()));
        if (src.hasStatus())
            tgt.setStatus(VersionConvertor_14_30.convertConformanceResourceStatus(src.getStatus()));
        if (src.hasExperimental())
            tgt.setExperimentalElement(VersionConvertor_14_30.convertBoolean(src.getExperimentalElement()));
        if (src.hasPublisher())
            tgt.setPublisherElement(VersionConvertor_14_30.convertString(src.getPublisherElement()));
        for (org.hl7.fhir.dstu3.model.ContactDetail t : src.getContact()) tgt.addContact(convertCompartmentDefinitionContactComponent(t));
        if (src.hasDate())
            tgt.setDateElement(VersionConvertor_14_30.convertDateTime(src.getDateElement()));
        if (src.hasDescription())
            tgt.setDescription(src.getDescription());
        if (src.hasPurpose())
            tgt.setRequirements(src.getPurpose());
        if (src.hasCode())
            tgt.setCode(convertCompartmentType(src.getCode()));
        if (src.hasSearchElement())
            tgt.setSearchElement(VersionConvertor_14_30.convertBoolean(src.getSearchElement()));
        for (org.hl7.fhir.dstu3.model.CompartmentDefinition.CompartmentDefinitionResourceComponent t : src.getResource()) tgt.addResource(convertCompartmentDefinitionResourceComponent(t));
        return tgt;
    }

    public static org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentDefinitionContactComponent convertCompartmentDefinitionContactComponent(org.hl7.fhir.dstu3.model.ContactDetail src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentDefinitionContactComponent tgt = new org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentDefinitionContactComponent();
        VersionConvertor_14_30.copyElement(src, tgt);
        if (src.hasName())
            tgt.setNameElement(VersionConvertor_14_30.convertString(src.getNameElement()));
        for (org.hl7.fhir.dstu3.model.ContactPoint t : src.getTelecom()) tgt.addTelecom(VersionConvertor_14_30.convertContactPoint(t));
        return tgt;
    }

    public static org.hl7.fhir.dstu3.model.ContactDetail convertCompartmentDefinitionContactComponent(org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentDefinitionContactComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu3.model.ContactDetail tgt = new org.hl7.fhir.dstu3.model.ContactDetail();
        VersionConvertor_14_30.copyElement(src, tgt);
        if (src.hasName())
            tgt.setNameElement(VersionConvertor_14_30.convertString(src.getNameElement()));
        for (org.hl7.fhir.dstu2016may.model.ContactPoint t : src.getTelecom()) tgt.addTelecom(VersionConvertor_14_30.convertContactPoint(t));
        return tgt;
    }

    public static org.hl7.fhir.dstu3.model.CompartmentDefinition.CompartmentDefinitionResourceComponent convertCompartmentDefinitionResourceComponent(org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentDefinitionResourceComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu3.model.CompartmentDefinition.CompartmentDefinitionResourceComponent tgt = new org.hl7.fhir.dstu3.model.CompartmentDefinition.CompartmentDefinitionResourceComponent();
        VersionConvertor_14_30.copyElement(src, tgt);
        if (src.hasCodeElement())
            tgt.setCodeElement(VersionConvertor_14_30.convertCode(src.getCodeElement()));
        for (org.hl7.fhir.dstu2016may.model.StringType t : src.getParam()) tgt.addParam(t.getValue());
        if (src.hasDocumentation())
            tgt.setDocumentationElement(VersionConvertor_14_30.convertString(src.getDocumentationElement()));
        return tgt;
    }

    public static org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentDefinitionResourceComponent convertCompartmentDefinitionResourceComponent(org.hl7.fhir.dstu3.model.CompartmentDefinition.CompartmentDefinitionResourceComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentDefinitionResourceComponent tgt = new org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentDefinitionResourceComponent();
        VersionConvertor_14_30.copyElement(src, tgt);
        if (src.hasCodeElement())
            tgt.setCodeElement(VersionConvertor_14_30.convertCode(src.getCodeElement()));
        for (org.hl7.fhir.dstu3.model.StringType t : src.getParam()) tgt.addParam(t.getValue());
        if (src.hasDocumentation())
            tgt.setDocumentationElement(VersionConvertor_14_30.convertString(src.getDocumentationElement()));
        return tgt;
    }

    static public org.hl7.fhir.dstu3.model.CompartmentDefinition.CompartmentType convertCompartmentType(org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentType src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case PATIENT:
                return org.hl7.fhir.dstu3.model.CompartmentDefinition.CompartmentType.PATIENT;
            case ENCOUNTER:
                return org.hl7.fhir.dstu3.model.CompartmentDefinition.CompartmentType.ENCOUNTER;
            case RELATEDPERSON:
                return org.hl7.fhir.dstu3.model.CompartmentDefinition.CompartmentType.RELATEDPERSON;
            case PRACTITIONER:
                return org.hl7.fhir.dstu3.model.CompartmentDefinition.CompartmentType.PRACTITIONER;
            case DEVICE:
                return org.hl7.fhir.dstu3.model.CompartmentDefinition.CompartmentType.DEVICE;
            default:
                return org.hl7.fhir.dstu3.model.CompartmentDefinition.CompartmentType.NULL;
        }
    }

    static public org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentType convertCompartmentType(org.hl7.fhir.dstu3.model.CompartmentDefinition.CompartmentType src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case PATIENT:
                return org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentType.PATIENT;
            case ENCOUNTER:
                return org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentType.ENCOUNTER;
            case RELATEDPERSON:
                return org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentType.RELATEDPERSON;
            case PRACTITIONER:
                return org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentType.PRACTITIONER;
            case DEVICE:
                return org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentType.DEVICE;
            default:
                return org.hl7.fhir.dstu2016may.model.CompartmentDefinition.CompartmentType.NULL;
        }
    }
}
