package org.hl7.fhir.convertors.conv30_40;

import org.hl7.fhir.convertors.VersionConvertor_30_40;
import org.hl7.fhir.exceptions.FHIRException;

public class CompartmentDefinition30_40 {

    public static org.hl7.fhir.dstu3.model.CompartmentDefinition convertCompartmentDefinition(org.hl7.fhir.r4.model.CompartmentDefinition src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.dstu3.model.CompartmentDefinition tgt = new org.hl7.fhir.dstu3.model.CompartmentDefinition();
        VersionConvertor_30_40.copyDomainResource(src, tgt);
        if (src.hasUrl())
            tgt.setUrlElement(VersionConvertor_30_40.convertUri(src.getUrlElement()));
        if (src.hasName())
            tgt.setNameElement(VersionConvertor_30_40.convertString(src.getNameElement()));
        if (src.hasTitle())
            tgt.setTitleElement(VersionConvertor_30_40.convertString(src.getTitleElement()));
        if (src.hasStatus())
            tgt.setStatus(VersionConvertor_30_40.convertPublicationStatus(src.getStatus()));
        if (src.hasExperimental())
            tgt.setExperimentalElement(VersionConvertor_30_40.convertBoolean(src.getExperimentalElement()));
        if (src.hasDateElement())
            tgt.setDateElement(VersionConvertor_30_40.convertDateTime(src.getDateElement()));
        if (src.hasPublisher())
            tgt.setPublisherElement(VersionConvertor_30_40.convertString(src.getPublisherElement()));
        for (org.hl7.fhir.r4.model.ContactDetail t : src.getContact()) tgt.addContact(VersionConvertor_30_40.convertContactDetail(t));
        if (src.hasDescription())
            tgt.setDescriptionElement(VersionConvertor_30_40.convertMarkdown(src.getDescriptionElement()));
        if (src.hasPurpose())
            tgt.setPurposeElement(VersionConvertor_30_40.convertMarkdown(src.getPurposeElement()));
        for (org.hl7.fhir.r4.model.UsageContext t : src.getUseContext()) tgt.addUseContext(VersionConvertor_30_40.convertUsageContext(t));
        for (org.hl7.fhir.r4.model.CodeableConcept t : src.getJurisdiction()) tgt.addJurisdiction(VersionConvertor_30_40.convertCodeableConcept(t));
        if (src.hasCode())
            tgt.setCode(convertCompartmentType(src.getCode()));
        if (src.hasSearch())
            tgt.setSearchElement(VersionConvertor_30_40.convertBoolean(src.getSearchElement()));
        for (org.hl7.fhir.r4.model.CompartmentDefinition.CompartmentDefinitionResourceComponent t : src.getResource()) tgt.addResource(convertCompartmentDefinitionResourceComponent(t));
        return tgt;
    }

    public static org.hl7.fhir.r4.model.CompartmentDefinition convertCompartmentDefinition(org.hl7.fhir.dstu3.model.CompartmentDefinition src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.r4.model.CompartmentDefinition tgt = new org.hl7.fhir.r4.model.CompartmentDefinition();
        VersionConvertor_30_40.copyDomainResource(src, tgt);
        if (src.hasUrl())
            tgt.setUrlElement(VersionConvertor_30_40.convertUri(src.getUrlElement()));
        if (src.hasName())
            tgt.setNameElement(VersionConvertor_30_40.convertString(src.getNameElement()));
        if (src.hasTitle())
            tgt.setTitleElement(VersionConvertor_30_40.convertString(src.getTitleElement()));
        if (src.hasStatus())
            tgt.setStatus(VersionConvertor_30_40.convertPublicationStatus(src.getStatus()));
        if (src.hasExperimental())
            tgt.setExperimentalElement(VersionConvertor_30_40.convertBoolean(src.getExperimentalElement()));
        if (src.hasDateElement())
            tgt.setDateElement(VersionConvertor_30_40.convertDateTime(src.getDateElement()));
        if (src.hasPublisher())
            tgt.setPublisherElement(VersionConvertor_30_40.convertString(src.getPublisherElement()));
        for (org.hl7.fhir.dstu3.model.ContactDetail t : src.getContact()) tgt.addContact(VersionConvertor_30_40.convertContactDetail(t));
        if (src.hasDescription())
            tgt.setDescriptionElement(VersionConvertor_30_40.convertMarkdown(src.getDescriptionElement()));
        if (src.hasPurpose())
            tgt.setPurposeElement(VersionConvertor_30_40.convertMarkdown(src.getPurposeElement()));
        for (org.hl7.fhir.dstu3.model.UsageContext t : src.getUseContext()) tgt.addUseContext(VersionConvertor_30_40.convertUsageContext(t));
        for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getJurisdiction()) tgt.addJurisdiction(VersionConvertor_30_40.convertCodeableConcept(t));
        if (src.hasCode())
            tgt.setCode(convertCompartmentType(src.getCode()));
        if (src.hasSearch())
            tgt.setSearchElement(VersionConvertor_30_40.convertBoolean(src.getSearchElement()));
        for (org.hl7.fhir.dstu3.model.CompartmentDefinition.CompartmentDefinitionResourceComponent t : src.getResource()) tgt.addResource(convertCompartmentDefinitionResourceComponent(t));
        return tgt;
    }

    public static org.hl7.fhir.r4.model.CompartmentDefinition.CompartmentDefinitionResourceComponent convertCompartmentDefinitionResourceComponent(org.hl7.fhir.dstu3.model.CompartmentDefinition.CompartmentDefinitionResourceComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.r4.model.CompartmentDefinition.CompartmentDefinitionResourceComponent tgt = new org.hl7.fhir.r4.model.CompartmentDefinition.CompartmentDefinitionResourceComponent();
        VersionConvertor_30_40.copyElement(src, tgt);
        if (src.hasCode())
            tgt.setCodeElement(VersionConvertor_30_40.convertCode(src.getCodeElement()));
        for (org.hl7.fhir.dstu3.model.StringType t : src.getParam()) tgt.addParam(t.getValue());
        if (src.hasDocumentation())
            tgt.setDocumentationElement(VersionConvertor_30_40.convertString(src.getDocumentationElement()));
        return tgt;
    }

    public static org.hl7.fhir.dstu3.model.CompartmentDefinition.CompartmentDefinitionResourceComponent convertCompartmentDefinitionResourceComponent(org.hl7.fhir.r4.model.CompartmentDefinition.CompartmentDefinitionResourceComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.dstu3.model.CompartmentDefinition.CompartmentDefinitionResourceComponent tgt = new org.hl7.fhir.dstu3.model.CompartmentDefinition.CompartmentDefinitionResourceComponent();
        VersionConvertor_30_40.copyElement(src, tgt);
        if (src.hasCode())
            tgt.setCodeElement(VersionConvertor_30_40.convertCode(src.getCodeElement()));
        for (org.hl7.fhir.r4.model.StringType t : src.getParam()) tgt.addParam(t.getValue());
        if (src.hasDocumentation())
            tgt.setDocumentationElement(VersionConvertor_30_40.convertString(src.getDocumentationElement()));
        return tgt;
    }

    static public org.hl7.fhir.r4.model.CompartmentDefinition.CompartmentType convertCompartmentType(org.hl7.fhir.dstu3.model.CompartmentDefinition.CompartmentType src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case PATIENT:
                return org.hl7.fhir.r4.model.CompartmentDefinition.CompartmentType.PATIENT;
            case ENCOUNTER:
                return org.hl7.fhir.r4.model.CompartmentDefinition.CompartmentType.ENCOUNTER;
            case RELATEDPERSON:
                return org.hl7.fhir.r4.model.CompartmentDefinition.CompartmentType.RELATEDPERSON;
            case PRACTITIONER:
                return org.hl7.fhir.r4.model.CompartmentDefinition.CompartmentType.PRACTITIONER;
            case DEVICE:
                return org.hl7.fhir.r4.model.CompartmentDefinition.CompartmentType.DEVICE;
            default:
                return org.hl7.fhir.r4.model.CompartmentDefinition.CompartmentType.NULL;
        }
    }

    static public org.hl7.fhir.dstu3.model.CompartmentDefinition.CompartmentType convertCompartmentType(org.hl7.fhir.r4.model.CompartmentDefinition.CompartmentType src) throws FHIRException {
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
}
