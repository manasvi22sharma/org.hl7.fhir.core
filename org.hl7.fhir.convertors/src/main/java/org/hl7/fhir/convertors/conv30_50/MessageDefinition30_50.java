package org.hl7.fhir.convertors.conv30_50;

import org.hl7.fhir.convertors.VersionConvertor_30_50;
import org.hl7.fhir.exceptions.FHIRException;

public class MessageDefinition30_50 {

    public static org.hl7.fhir.dstu3.model.MessageDefinition convertMessageDefinition(org.hl7.fhir.r5.model.MessageDefinition src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.dstu3.model.MessageDefinition tgt = new org.hl7.fhir.dstu3.model.MessageDefinition();
        VersionConvertor_30_50.copyDomainResource(src, tgt);
        if (src.hasUrl())
            tgt.setUrlElement(VersionConvertor_30_50.convertUri(src.getUrlElement()));
        if (src.hasIdentifier())
            tgt.setIdentifier(VersionConvertor_30_50.convertIdentifier(src.getIdentifierFirstRep()));
        if (src.hasVersion())
            tgt.setVersionElement(VersionConvertor_30_50.convertString(src.getVersionElement()));
        if (src.hasName())
            tgt.setNameElement(VersionConvertor_30_50.convertString(src.getNameElement()));
        if (src.hasTitle())
            tgt.setTitleElement(VersionConvertor_30_50.convertString(src.getTitleElement()));
        if (src.hasStatus())
            tgt.setStatus(VersionConvertor_30_50.convertPublicationStatus(src.getStatus()));
        if (src.hasExperimental())
            tgt.setExperimentalElement(VersionConvertor_30_50.convertBoolean(src.getExperimentalElement()));
        if (src.hasDate())
            tgt.setDateElement(VersionConvertor_30_50.convertDateTime(src.getDateElement()));
        if (src.hasPublisher())
            tgt.setPublisherElement(VersionConvertor_30_50.convertString(src.getPublisherElement()));
        for (org.hl7.fhir.r5.model.ContactDetail t : src.getContact()) tgt.addContact(VersionConvertor_30_50.convertContactDetail(t));
        if (src.hasDescription())
            tgt.setDescriptionElement(VersionConvertor_30_50.convertMarkdown(src.getDescriptionElement()));
        for (org.hl7.fhir.r5.model.UsageContext t : src.getUseContext()) tgt.addUseContext(VersionConvertor_30_50.convertUsageContext(t));
        for (org.hl7.fhir.r5.model.CodeableConcept t : src.getJurisdiction()) tgt.addJurisdiction(VersionConvertor_30_50.convertCodeableConcept(t));
        if (src.hasPurpose())
            tgt.setPurposeElement(VersionConvertor_30_50.convertMarkdown(src.getPurposeElement()));
        if (src.hasCopyright())
            tgt.setCopyrightElement(VersionConvertor_30_50.convertMarkdown(src.getCopyrightElement()));
        if (src.hasBase())
            tgt.setBase(VersionConvertor_30_50.convertCanonicalToReference(src.getBaseElement()));
        for (org.hl7.fhir.r5.model.CanonicalType t : src.getParent()) tgt.addParent(VersionConvertor_30_50.convertCanonicalToReference(t));
        for (org.hl7.fhir.r5.model.CanonicalType t : src.getReplaces()) tgt.addReplaces(VersionConvertor_30_50.convertCanonicalToReference(t));
        if (src.hasEventCoding())
            tgt.setEvent(VersionConvertor_30_50.convertCoding(src.getEventCoding()));
        if (src.hasCategory())
            tgt.setCategory(convertMessageSignificanceCategory(src.getCategory()));
        for (org.hl7.fhir.r5.model.MessageDefinition.MessageDefinitionFocusComponent t : src.getFocus()) tgt.addFocus(convertMessageDefinitionFocusComponent(t));
        if (src.hasResponseRequired())
            tgt.setResponseRequired(src.getResponseRequired() != org.hl7.fhir.r5.model.MessageDefinition.MessageheaderResponseRequest.NEVER);
        for (org.hl7.fhir.r5.model.MessageDefinition.MessageDefinitionAllowedResponseComponent t : src.getAllowedResponse()) tgt.addAllowedResponse(convertMessageDefinitionAllowedResponseComponent(t));
        return tgt;
    }

    public static org.hl7.fhir.r5.model.MessageDefinition convertMessageDefinition(org.hl7.fhir.dstu3.model.MessageDefinition src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.r5.model.MessageDefinition tgt = new org.hl7.fhir.r5.model.MessageDefinition();
        VersionConvertor_30_50.copyDomainResource(src, tgt);
        if (src.hasUrl())
            tgt.setUrlElement(VersionConvertor_30_50.convertUri(src.getUrlElement()));
        if (src.hasIdentifier())
            tgt.addIdentifier(VersionConvertor_30_50.convertIdentifier(src.getIdentifier()));
        if (src.hasVersion())
            tgt.setVersionElement(VersionConvertor_30_50.convertString(src.getVersionElement()));
        if (src.hasName())
            tgt.setNameElement(VersionConvertor_30_50.convertString(src.getNameElement()));
        if (src.hasTitle())
            tgt.setTitleElement(VersionConvertor_30_50.convertString(src.getTitleElement()));
        if (src.hasStatus())
            tgt.setStatus(VersionConvertor_30_50.convertPublicationStatus(src.getStatus()));
        if (src.hasExperimental())
            tgt.setExperimentalElement(VersionConvertor_30_50.convertBoolean(src.getExperimentalElement()));
        if (src.hasDate())
            tgt.setDateElement(VersionConvertor_30_50.convertDateTime(src.getDateElement()));
        if (src.hasPublisher())
            tgt.setPublisherElement(VersionConvertor_30_50.convertString(src.getPublisherElement()));
        for (org.hl7.fhir.dstu3.model.ContactDetail t : src.getContact()) tgt.addContact(VersionConvertor_30_50.convertContactDetail(t));
        if (src.hasDescription())
            tgt.setDescriptionElement(VersionConvertor_30_50.convertMarkdown(src.getDescriptionElement()));
        for (org.hl7.fhir.dstu3.model.UsageContext t : src.getUseContext()) tgt.addUseContext(VersionConvertor_30_50.convertUsageContext(t));
        for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getJurisdiction()) tgt.addJurisdiction(VersionConvertor_30_50.convertCodeableConcept(t));
        if (src.hasPurpose())
            tgt.setPurposeElement(VersionConvertor_30_50.convertMarkdown(src.getPurposeElement()));
        if (src.hasCopyright())
            tgt.setCopyrightElement(VersionConvertor_30_50.convertMarkdown(src.getCopyrightElement()));
        if (src.hasBase())
            tgt.setBaseElement(VersionConvertor_30_50.convertReferenceToCanonical(src.getBase()));
        for (org.hl7.fhir.dstu3.model.Reference t : src.getParent()) tgt.getParent().add(VersionConvertor_30_50.convertReferenceToCanonical(t));
        for (org.hl7.fhir.dstu3.model.Reference t : src.getReplaces()) tgt.getReplaces().add(VersionConvertor_30_50.convertReferenceToCanonical(t));
        if (src.hasEvent())
            tgt.setEvent(VersionConvertor_30_50.convertCoding(src.getEvent()));
        if (src.hasCategory())
            tgt.setCategory(convertMessageSignificanceCategory(src.getCategory()));
        for (org.hl7.fhir.dstu3.model.MessageDefinition.MessageDefinitionFocusComponent t : src.getFocus()) tgt.addFocus(convertMessageDefinitionFocusComponent(t));
        if (src.hasResponseRequired())
            tgt.setResponseRequired(src.getResponseRequired() ? org.hl7.fhir.r5.model.MessageDefinition.MessageheaderResponseRequest.ALWAYS : org.hl7.fhir.r5.model.MessageDefinition.MessageheaderResponseRequest.NEVER);
        for (org.hl7.fhir.dstu3.model.MessageDefinition.MessageDefinitionAllowedResponseComponent t : src.getAllowedResponse()) tgt.addAllowedResponse(convertMessageDefinitionAllowedResponseComponent(t));
        return tgt;
    }

    public static org.hl7.fhir.dstu3.model.MessageDefinition.MessageDefinitionAllowedResponseComponent convertMessageDefinitionAllowedResponseComponent(org.hl7.fhir.r5.model.MessageDefinition.MessageDefinitionAllowedResponseComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.dstu3.model.MessageDefinition.MessageDefinitionAllowedResponseComponent tgt = new org.hl7.fhir.dstu3.model.MessageDefinition.MessageDefinitionAllowedResponseComponent();
        VersionConvertor_30_50.copyElement(src, tgt);
        if (src.hasMessage())
            tgt.setMessage(VersionConvertor_30_50.convertCanonicalToReference(src.getMessageElement()));
        if (src.hasSituation())
            tgt.setSituationElement(VersionConvertor_30_50.convertMarkdown(src.getSituationElement()));
        return tgt;
    }

    public static org.hl7.fhir.r5.model.MessageDefinition.MessageDefinitionAllowedResponseComponent convertMessageDefinitionAllowedResponseComponent(org.hl7.fhir.dstu3.model.MessageDefinition.MessageDefinitionAllowedResponseComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.r5.model.MessageDefinition.MessageDefinitionAllowedResponseComponent tgt = new org.hl7.fhir.r5.model.MessageDefinition.MessageDefinitionAllowedResponseComponent();
        VersionConvertor_30_50.copyElement(src, tgt);
        if (src.hasMessage())
            tgt.setMessageElement(VersionConvertor_30_50.convertReferenceToCanonical(src.getMessage()));
        if (src.hasSituation())
            tgt.setSituationElement(VersionConvertor_30_50.convertMarkdown(src.getSituationElement()));
        return tgt;
    }

    public static org.hl7.fhir.dstu3.model.MessageDefinition.MessageDefinitionFocusComponent convertMessageDefinitionFocusComponent(org.hl7.fhir.r5.model.MessageDefinition.MessageDefinitionFocusComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.dstu3.model.MessageDefinition.MessageDefinitionFocusComponent tgt = new org.hl7.fhir.dstu3.model.MessageDefinition.MessageDefinitionFocusComponent();
        VersionConvertor_30_50.copyElement(src, tgt);
        if (src.hasCode())
            tgt.setCodeElement(VersionConvertor_30_50.convertCode(src.getCodeElement()));
        if (src.hasProfile())
            tgt.setProfile(VersionConvertor_30_50.convertCanonicalToReference(src.getProfileElement()));
        if (src.hasMin())
            tgt.setMinElement(VersionConvertor_30_50.convertUnsignedInt(src.getMinElement()));
        if (src.hasMax())
            tgt.setMaxElement(VersionConvertor_30_50.convertString(src.getMaxElement()));
        return tgt;
    }

    public static org.hl7.fhir.r5.model.MessageDefinition.MessageDefinitionFocusComponent convertMessageDefinitionFocusComponent(org.hl7.fhir.dstu3.model.MessageDefinition.MessageDefinitionFocusComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.r5.model.MessageDefinition.MessageDefinitionFocusComponent tgt = new org.hl7.fhir.r5.model.MessageDefinition.MessageDefinitionFocusComponent();
        VersionConvertor_30_50.copyElement(src, tgt);
        if (src.hasCode())
            tgt.setCodeElement(VersionConvertor_30_50.convertCode(src.getCodeElement()));
        if (src.hasProfile())
            tgt.setProfileElement(VersionConvertor_30_50.convertReferenceToCanonical(src.getProfile()));
        if (src.hasMin())
            tgt.setMinElement(VersionConvertor_30_50.convertUnsignedInt(src.getMinElement()));
        if (src.hasMax())
            tgt.setMaxElement(VersionConvertor_30_50.convertString(src.getMaxElement()));
        return tgt;
    }

    static public org.hl7.fhir.dstu3.model.MessageDefinition.MessageSignificanceCategory convertMessageSignificanceCategory(org.hl7.fhir.r5.model.MessageDefinition.MessageSignificanceCategory src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case CONSEQUENCE:
                return org.hl7.fhir.dstu3.model.MessageDefinition.MessageSignificanceCategory.CONSEQUENCE;
            case CURRENCY:
                return org.hl7.fhir.dstu3.model.MessageDefinition.MessageSignificanceCategory.CURRENCY;
            case NOTIFICATION:
                return org.hl7.fhir.dstu3.model.MessageDefinition.MessageSignificanceCategory.NOTIFICATION;
            default:
                return org.hl7.fhir.dstu3.model.MessageDefinition.MessageSignificanceCategory.NULL;
        }
    }

    static public org.hl7.fhir.r5.model.MessageDefinition.MessageSignificanceCategory convertMessageSignificanceCategory(org.hl7.fhir.dstu3.model.MessageDefinition.MessageSignificanceCategory src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case CONSEQUENCE:
                return org.hl7.fhir.r5.model.MessageDefinition.MessageSignificanceCategory.CONSEQUENCE;
            case CURRENCY:
                return org.hl7.fhir.r5.model.MessageDefinition.MessageSignificanceCategory.CURRENCY;
            case NOTIFICATION:
                return org.hl7.fhir.r5.model.MessageDefinition.MessageSignificanceCategory.NOTIFICATION;
            default:
                return org.hl7.fhir.r5.model.MessageDefinition.MessageSignificanceCategory.NULL;
        }
    }
}
