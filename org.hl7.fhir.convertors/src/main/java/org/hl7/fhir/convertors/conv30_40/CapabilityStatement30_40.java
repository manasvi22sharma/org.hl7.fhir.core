package org.hl7.fhir.convertors.conv30_40;

import org.hl7.fhir.convertors.VersionConvertorConstants;
import org.hl7.fhir.convertors.VersionConvertor_30_40;
import org.hl7.fhir.exceptions.FHIRException;

public class CapabilityStatement30_40 {

    public static org.hl7.fhir.dstu3.model.CapabilityStatement convertCapabilityStatement(org.hl7.fhir.r4.model.CapabilityStatement src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.dstu3.model.CapabilityStatement tgt = new org.hl7.fhir.dstu3.model.CapabilityStatement();
        VersionConvertor_30_40.copyDomainResource(src, tgt, "http://hl7.org/fhir/3.0/StructureDefinition/extension-CapabilityStatement.acceptUnknown");
        if (src.hasUrl())
            tgt.setUrlElement(VersionConvertor_30_40.convertUri(src.getUrlElement()));
        if (src.hasVersion())
            tgt.setVersionElement(VersionConvertor_30_40.convertString(src.getVersionElement()));
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
        for (org.hl7.fhir.r4.model.UsageContext t : src.getUseContext()) tgt.addUseContext(VersionConvertor_30_40.convertUsageContext(t));
        for (org.hl7.fhir.r4.model.CodeableConcept t : src.getJurisdiction()) tgt.addJurisdiction(VersionConvertor_30_40.convertCodeableConcept(t));
        if (src.hasPurpose())
            tgt.setPurposeElement(VersionConvertor_30_40.convertMarkdown(src.getPurposeElement()));
        if (src.hasCopyright())
            tgt.setCopyrightElement(VersionConvertor_30_40.convertMarkdown(src.getCopyrightElement()));
        if (src.hasKind())
            tgt.setKind(convertCapabilityStatementKind(src.getKind()));
        for (org.hl7.fhir.r4.model.UriType t : src.getInstantiates()) tgt.addInstantiates(t.getValue());
        if (src.hasSoftware())
            tgt.setSoftware(convertCapabilityStatementSoftwareComponent(src.getSoftware()));
        if (src.hasImplementation())
            tgt.setImplementation(convertCapabilityStatementImplementationComponent(src.getImplementation()));
        if (src.hasFhirVersion())
            tgt.setFhirVersion(src.getFhirVersion().toCode());
        if (src.hasExtension("http://hl7.org/fhir/3.0/StructureDefinition/extension-CapabilityStatement.acceptUnknown"))
            tgt.setAcceptUnknown(org.hl7.fhir.dstu3.model.CapabilityStatement.UnknownContentCode.fromCode(src.getExtensionByUrl("http://hl7.org/fhir/3.0/StructureDefinition/extension-CapabilityStatement.acceptUnknown").getValue().primitiveValue()));
        for (org.hl7.fhir.r4.model.CodeType t : src.getFormat()) tgt.addFormat(t.getValue());
        for (org.hl7.fhir.r4.model.CodeType t : src.getPatchFormat()) tgt.addPatchFormat(t.getValue());
        for (org.hl7.fhir.r4.model.UriType t : src.getImplementationGuide()) tgt.addImplementationGuide(t.getValue());
        for (org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestComponent r : src.getRest()) for (org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestResourceComponent rr : r.getResource()) for (org.hl7.fhir.r4.model.CanonicalType t : rr.getSupportedProfile()) tgt.addProfile(VersionConvertor_30_40.convertCanonicalToReference(t));
        for (org.hl7.fhir.r4.model.Extension ext : src.getExtension()) {
            if ("http://hl7.org/fhir/3.0/StructureDefinition/extension-CapabilityStatement.profile".equals(ext.getUrl())) {
                tgt.addProfile(VersionConvertor_30_40.convertReference((org.hl7.fhir.r4.model.Reference) ext.getValue()));
            }
        }
        for (org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestComponent t : src.getRest()) tgt.addRest(convertCapabilityStatementRestComponent(t));
        for (org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementMessagingComponent t : src.getMessaging()) tgt.addMessaging(convertCapabilityStatementMessagingComponent(t));
        for (org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementDocumentComponent t : src.getDocument()) tgt.addDocument(convertCapabilityStatementDocumentComponent(t));
        return tgt;
    }

    public static org.hl7.fhir.r4.model.CapabilityStatement convertCapabilityStatement(org.hl7.fhir.dstu3.model.CapabilityStatement src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.r4.model.CapabilityStatement tgt = new org.hl7.fhir.r4.model.CapabilityStatement();
        VersionConvertor_30_40.copyDomainResource(src, tgt);
        if (src.hasUrl())
            tgt.setUrlElement(VersionConvertor_30_40.convertUri(src.getUrlElement()));
        if (src.hasVersion())
            tgt.setVersionElement(VersionConvertor_30_40.convertString(src.getVersionElement()));
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
        for (org.hl7.fhir.dstu3.model.UsageContext t : src.getUseContext()) tgt.addUseContext(VersionConvertor_30_40.convertUsageContext(t));
        for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getJurisdiction()) tgt.addJurisdiction(VersionConvertor_30_40.convertCodeableConcept(t));
        if (src.hasPurpose())
            tgt.setPurposeElement(VersionConvertor_30_40.convertMarkdown(src.getPurposeElement()));
        if (src.hasCopyright())
            tgt.setCopyrightElement(VersionConvertor_30_40.convertMarkdown(src.getCopyrightElement()));
        if (src.hasKind())
            tgt.setKind(convertCapabilityStatementKind(src.getKind()));
        for (org.hl7.fhir.dstu3.model.UriType t : src.getInstantiates()) tgt.addInstantiates(t.getValue());
        if (src.hasSoftware())
            tgt.setSoftware(convertCapabilityStatementSoftwareComponent(src.getSoftware()));
        if (src.hasImplementation())
            tgt.setImplementation(convertCapabilityStatementImplementationComponent(src.getImplementation()));
        if (src.hasFhirVersion())
            tgt.setFhirVersion(org.hl7.fhir.r4.model.Enumerations.FHIRVersion.fromCode(src.getFhirVersion()));
        if (src.hasAcceptUnknown())
            tgt.addExtension().setUrl("http://hl7.org/fhir/3.0/StructureDefinition/extension-CapabilityStatement.acceptUnknown").setValue(new org.hl7.fhir.r4.model.CodeType(src.getAcceptUnknownElement().asStringValue()));
        for (org.hl7.fhir.dstu3.model.CodeType t : src.getFormat()) tgt.addFormat(t.getValue());
        for (org.hl7.fhir.dstu3.model.CodeType t : src.getPatchFormat()) tgt.addPatchFormat(t.getValue());
        for (org.hl7.fhir.dstu3.model.UriType t : src.getImplementationGuide()) tgt.addImplementationGuide(t.getValue());
        for (org.hl7.fhir.dstu3.model.Reference t : src.getProfile()) tgt.addExtension("http://hl7.org/fhir/3.0/StructureDefinition/extension-CapabilityStatement.profile", VersionConvertor_30_40.convertReference(t));
        for (org.hl7.fhir.dstu3.model.CapabilityStatement.CapabilityStatementRestComponent t : src.getRest()) tgt.addRest(convertCapabilityStatementRestComponent(t));
        for (org.hl7.fhir.dstu3.model.CapabilityStatement.CapabilityStatementMessagingComponent t : src.getMessaging()) tgt.addMessaging(convertCapabilityStatementMessagingComponent(t));
        for (org.hl7.fhir.dstu3.model.CapabilityStatement.CapabilityStatementDocumentComponent t : src.getDocument()) tgt.addDocument(convertCapabilityStatementDocumentComponent(t));
        return tgt;
    }

    public static org.hl7.fhir.dstu3.model.CapabilityStatement.CapabilityStatementDocumentComponent convertCapabilityStatementDocumentComponent(org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementDocumentComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.dstu3.model.CapabilityStatement.CapabilityStatementDocumentComponent tgt = new org.hl7.fhir.dstu3.model.CapabilityStatement.CapabilityStatementDocumentComponent();
        VersionConvertor_30_40.copyElement(src, tgt);
        if (src.hasMode())
            tgt.setMode(convertDocumentMode(src.getMode()));
        if (src.hasDocumentation())
            tgt.setDocumentation(src.getDocumentation());
        if (src.hasProfile())
            tgt.setProfile(VersionConvertor_30_40.convertCanonicalToReference(src.getProfileElement()));
        return tgt;
    }

    public static org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementDocumentComponent convertCapabilityStatementDocumentComponent(org.hl7.fhir.dstu3.model.CapabilityStatement.CapabilityStatementDocumentComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementDocumentComponent tgt = new org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementDocumentComponent();
        VersionConvertor_30_40.copyElement(src, tgt);
        if (src.hasMode())
            tgt.setMode(convertDocumentMode(src.getMode()));
        if (src.hasDocumentation())
            tgt.setDocumentation(src.getDocumentation());
        if (src.hasProfile())
            tgt.setProfileElement(VersionConvertor_30_40.convertReferenceToCanonical(src.getProfile()));
        return tgt;
    }

    public static org.hl7.fhir.dstu3.model.CapabilityStatement.CapabilityStatementImplementationComponent convertCapabilityStatementImplementationComponent(org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementImplementationComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.dstu3.model.CapabilityStatement.CapabilityStatementImplementationComponent tgt = new org.hl7.fhir.dstu3.model.CapabilityStatement.CapabilityStatementImplementationComponent();
        VersionConvertor_30_40.copyElement(src, tgt);
        if (src.hasDescription())
            tgt.setDescriptionElement(VersionConvertor_30_40.convertString(src.getDescriptionElement()));
        if (src.hasUrl())
            tgt.setUrl(src.getUrl());
        return tgt;
    }

    public static org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementImplementationComponent convertCapabilityStatementImplementationComponent(org.hl7.fhir.dstu3.model.CapabilityStatement.CapabilityStatementImplementationComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementImplementationComponent tgt = new org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementImplementationComponent();
        VersionConvertor_30_40.copyElement(src, tgt);
        if (src.hasDescription())
            tgt.setDescriptionElement(VersionConvertor_30_40.convertString(src.getDescriptionElement()));
        if (src.hasUrl())
            tgt.setUrl(src.getUrl());
        return tgt;
    }

    static public org.hl7.fhir.dstu3.model.CapabilityStatement.CapabilityStatementKind convertCapabilityStatementKind(org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementKind src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case INSTANCE:
                return org.hl7.fhir.dstu3.model.CapabilityStatement.CapabilityStatementKind.INSTANCE;
            case CAPABILITY:
                return org.hl7.fhir.dstu3.model.CapabilityStatement.CapabilityStatementKind.CAPABILITY;
            case REQUIREMENTS:
                return org.hl7.fhir.dstu3.model.CapabilityStatement.CapabilityStatementKind.REQUIREMENTS;
            default:
                return org.hl7.fhir.dstu3.model.CapabilityStatement.CapabilityStatementKind.NULL;
        }
    }

    static public org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementKind convertCapabilityStatementKind(org.hl7.fhir.dstu3.model.CapabilityStatement.CapabilityStatementKind src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case INSTANCE:
                return org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementKind.INSTANCE;
            case CAPABILITY:
                return org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementKind.CAPABILITY;
            case REQUIREMENTS:
                return org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementKind.REQUIREMENTS;
            default:
                return org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementKind.NULL;
        }
    }

    public static org.hl7.fhir.dstu3.model.CapabilityStatement.CapabilityStatementMessagingComponent convertCapabilityStatementMessagingComponent(org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementMessagingComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.dstu3.model.CapabilityStatement.CapabilityStatementMessagingComponent tgt = new org.hl7.fhir.dstu3.model.CapabilityStatement.CapabilityStatementMessagingComponent();
        VersionConvertor_30_40.copyElement(src, tgt);
        for (org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementMessagingEndpointComponent t : src.getEndpoint()) tgt.addEndpoint(convertCapabilityStatementMessagingEndpointComponent(t));
        if (src.hasReliableCache())
            tgt.setReliableCacheElement(VersionConvertor_30_40.convertUnsignedInt(src.getReliableCacheElement()));
        if (src.hasDocumentation())
            tgt.setDocumentation(src.getDocumentation());
        for (org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementMessagingSupportedMessageComponent t : src.getSupportedMessage()) tgt.addSupportedMessage(convertCapabilityStatementMessagingSupportedMessageComponent(t));
        for (org.hl7.fhir.r4.model.Extension e : src.getExtensionsByUrl(VersionConvertorConstants.IG_CONFORMANCE_MESSAGE_EVENT)) {
            org.hl7.fhir.dstu3.model.CapabilityStatement.CapabilityStatementMessagingEventComponent event = new org.hl7.fhir.dstu3.model.CapabilityStatement.CapabilityStatementMessagingEventComponent();
            tgt.addEvent(event);
            event.setCode(VersionConvertor_30_40.convertCoding((org.hl7.fhir.r4.model.Coding) e.getExtensionByUrl("code").getValue()));
            if (e.hasExtension("category"))
                event.setCategory(org.hl7.fhir.dstu3.model.CapabilityStatement.MessageSignificanceCategory.fromCode(e.getExtensionByUrl("category").getValue().toString()));
            event.setMode(org.hl7.fhir.dstu3.model.CapabilityStatement.EventCapabilityMode.fromCode(e.getExtensionByUrl("mode").getValue().toString()));
            event.setCode(VersionConvertor_30_40.convertCoding((org.hl7.fhir.r4.model.Coding) e.getExtensionByUrl("code").getValue()));
            if (e.hasExtension("category"))
                event.setCategory(org.hl7.fhir.dstu3.model.CapabilityStatement.MessageSignificanceCategory.fromCode(e.getExtensionByUrl("category").getValue().toString()));
            event.setMode(org.hl7.fhir.dstu3.model.CapabilityStatement.EventCapabilityMode.fromCode(e.getExtensionByUrl("mode").getValue().toString()));
            org.hl7.fhir.r4.model.Extension focusE = e.getExtensionByUrl("focus");
            if (focusE.getValue().hasPrimitiveValue())
                event.setFocus(focusE.getValue().toString());
            else {
                event.setFocusElement(new org.hl7.fhir.dstu3.model.CodeType());
                VersionConvertor_30_40.copyElement(focusE.getValue(), event.getFocusElement());
            }
            event.setRequest(VersionConvertor_30_40.convertReference((org.hl7.fhir.r4.model.Reference) e.getExtensionByUrl("request").getValue()));
            event.setResponse(VersionConvertor_30_40.convertReference((org.hl7.fhir.r4.model.Reference) e.getExtensionByUrl("response").getValue()));
            if (e.hasExtension("documentation"))
                event.setDocumentation(e.getExtensionByUrl("documentation").getValue().toString());
        }
        return tgt;
    }

    public static org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementMessagingComponent convertCapabilityStatementMessagingComponent(org.hl7.fhir.dstu3.model.CapabilityStatement.CapabilityStatementMessagingComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementMessagingComponent tgt = new org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementMessagingComponent();
        VersionConvertor_30_40.copyElement(src, tgt);
        for (org.hl7.fhir.dstu3.model.CapabilityStatement.CapabilityStatementMessagingEndpointComponent t : src.getEndpoint()) tgt.addEndpoint(convertCapabilityStatementMessagingEndpointComponent(t));
        if (src.hasReliableCache())
            tgt.setReliableCacheElement(VersionConvertor_30_40.convertUnsignedInt(src.getReliableCacheElement()));
        if (src.hasDocumentation())
            tgt.setDocumentation(src.getDocumentation());
        for (org.hl7.fhir.dstu3.model.CapabilityStatement.CapabilityStatementMessagingSupportedMessageComponent t : src.getSupportedMessage()) tgt.addSupportedMessage(convertCapabilityStatementMessagingSupportedMessageComponent(t));
        for (org.hl7.fhir.dstu3.model.CapabilityStatement.CapabilityStatementMessagingEventComponent t : src.getEvent()) {
            org.hl7.fhir.r4.model.Extension e = new org.hl7.fhir.r4.model.Extension(VersionConvertorConstants.IG_CONFORMANCE_MESSAGE_EVENT);
            e.addExtension(new org.hl7.fhir.r4.model.Extension("code", VersionConvertor_30_40.convertCoding(t.getCode())));
            if (t.hasCategory())
                e.addExtension(new org.hl7.fhir.r4.model.Extension("category", new org.hl7.fhir.r4.model.CodeType(t.getCategory().toCode())));
            e.addExtension(new org.hl7.fhir.r4.model.Extension("mode", new org.hl7.fhir.r4.model.CodeType(t.getMode().toCode())));
            if (t.getFocusElement().hasValue())
                e.addExtension(new org.hl7.fhir.r4.model.Extension("focus", new org.hl7.fhir.r4.model.StringType(t.getFocus())));
            else {
                org.hl7.fhir.r4.model.CodeType focus = new org.hl7.fhir.r4.model.CodeType();
                org.hl7.fhir.r4.model.Extension focusE = new org.hl7.fhir.r4.model.Extension("focus", focus);
                VersionConvertor_30_40.copyElement(t.getFocusElement(), focus);
                e.addExtension(focusE);
            }
            e.addExtension(new org.hl7.fhir.r4.model.Extension("request", VersionConvertor_30_40.convertReference(t.getRequest())));
            e.addExtension(new org.hl7.fhir.r4.model.Extension("response", VersionConvertor_30_40.convertReference(t.getResponse())));
            if (t.hasDocumentation())
                e.addExtension(new org.hl7.fhir.r4.model.Extension("documentation", new org.hl7.fhir.r4.model.StringType(t.getDocumentation())));
            tgt.addExtension(e);
        }
        return tgt;
    }

    public static org.hl7.fhir.dstu3.model.CapabilityStatement.CapabilityStatementMessagingEndpointComponent convertCapabilityStatementMessagingEndpointComponent(org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementMessagingEndpointComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.dstu3.model.CapabilityStatement.CapabilityStatementMessagingEndpointComponent tgt = new org.hl7.fhir.dstu3.model.CapabilityStatement.CapabilityStatementMessagingEndpointComponent();
        VersionConvertor_30_40.copyElement(src, tgt);
        if (src.hasProtocol())
            tgt.setProtocol(VersionConvertor_30_40.convertCoding(src.getProtocol()));
        if (src.hasAddress())
            tgt.setAddress(src.getAddress());
        return tgt;
    }

    public static org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementMessagingEndpointComponent convertCapabilityStatementMessagingEndpointComponent(org.hl7.fhir.dstu3.model.CapabilityStatement.CapabilityStatementMessagingEndpointComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementMessagingEndpointComponent tgt = new org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementMessagingEndpointComponent();
        VersionConvertor_30_40.copyElement(src, tgt);
        if (src.hasProtocol())
            tgt.setProtocol(VersionConvertor_30_40.convertCoding(src.getProtocol()));
        if (src.hasAddress())
            tgt.setAddress(src.getAddress());
        return tgt;
    }

    public static org.hl7.fhir.dstu3.model.CapabilityStatement.CapabilityStatementMessagingSupportedMessageComponent convertCapabilityStatementMessagingSupportedMessageComponent(org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementMessagingSupportedMessageComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.dstu3.model.CapabilityStatement.CapabilityStatementMessagingSupportedMessageComponent tgt = new org.hl7.fhir.dstu3.model.CapabilityStatement.CapabilityStatementMessagingSupportedMessageComponent();
        VersionConvertor_30_40.copyElement(src, tgt);
        if (src.hasMode())
            tgt.setMode(convertEventCapabilityMode(src.getMode()));
        if (src.hasDefinition())
            tgt.setDefinition(VersionConvertor_30_40.convertCanonicalToReference(src.getDefinitionElement()));
        return tgt;
    }

    public static org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementMessagingSupportedMessageComponent convertCapabilityStatementMessagingSupportedMessageComponent(org.hl7.fhir.dstu3.model.CapabilityStatement.CapabilityStatementMessagingSupportedMessageComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementMessagingSupportedMessageComponent tgt = new org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementMessagingSupportedMessageComponent();
        VersionConvertor_30_40.copyElement(src, tgt);
        if (src.hasMode())
            tgt.setMode(convertEventCapabilityMode(src.getMode()));
        if (src.hasDefinition())
            tgt.setDefinitionElement(VersionConvertor_30_40.convertReferenceToCanonical(src.getDefinition()));
        return tgt;
    }

    public static org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestComponent convertCapabilityStatementRestComponent(org.hl7.fhir.dstu3.model.CapabilityStatement.CapabilityStatementRestComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestComponent tgt = new org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestComponent();
        VersionConvertor_30_40.copyElement(src, tgt);
        if (src.hasMode())
            tgt.setMode(convertRestfulCapabilityMode(src.getMode()));
        if (src.hasDocumentation())
            tgt.setDocumentation(src.getDocumentation());
        if (src.hasSecurity())
            tgt.setSecurity(convertCapabilityStatementRestSecurityComponent(src.getSecurity()));
        for (org.hl7.fhir.dstu3.model.CapabilityStatement.CapabilityStatementRestResourceComponent t : src.getResource()) tgt.addResource(convertCapabilityStatementRestResourceComponent(t));
        for (org.hl7.fhir.dstu3.model.CapabilityStatement.SystemInteractionComponent t : src.getInteraction()) tgt.addInteraction(convertSystemInteractionComponent(t));
        for (org.hl7.fhir.dstu3.model.CapabilityStatement.CapabilityStatementRestResourceSearchParamComponent t : src.getSearchParam()) tgt.addSearchParam(convertCapabilityStatementRestResourceSearchParamComponent(t));
        for (org.hl7.fhir.dstu3.model.CapabilityStatement.CapabilityStatementRestOperationComponent t : src.getOperation()) tgt.addOperation(convertCapabilityStatementRestOperationComponent(t));
        for (org.hl7.fhir.dstu3.model.UriType t : src.getCompartment()) tgt.addCompartment(t.getValue());
        return tgt;
    }

    public static org.hl7.fhir.dstu3.model.CapabilityStatement.CapabilityStatementRestComponent convertCapabilityStatementRestComponent(org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.dstu3.model.CapabilityStatement.CapabilityStatementRestComponent tgt = new org.hl7.fhir.dstu3.model.CapabilityStatement.CapabilityStatementRestComponent();
        VersionConvertor_30_40.copyElement(src, tgt);
        if (src.hasMode())
            tgt.setMode(convertRestfulCapabilityMode(src.getMode()));
        if (src.hasDocumentation())
            tgt.setDocumentation(src.getDocumentation());
        if (src.hasSecurity())
            tgt.setSecurity(convertCapabilityStatementRestSecurityComponent(src.getSecurity()));
        for (org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestResourceComponent t : src.getResource()) tgt.addResource(convertCapabilityStatementRestResourceComponent(t));
        for (org.hl7.fhir.r4.model.CapabilityStatement.SystemInteractionComponent t : src.getInteraction()) tgt.addInteraction(convertSystemInteractionComponent(t));
        for (org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestResourceSearchParamComponent t : src.getSearchParam()) tgt.addSearchParam(convertCapabilityStatementRestResourceSearchParamComponent(t));
        for (org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestResourceOperationComponent t : src.getOperation()) tgt.addOperation(convertCapabilityStatementRestOperationComponent(t));
        for (org.hl7.fhir.r4.model.UriType t : src.getCompartment()) tgt.addCompartment(t.getValue());
        return tgt;
    }

    public static org.hl7.fhir.dstu3.model.CapabilityStatement.CapabilityStatementRestOperationComponent convertCapabilityStatementRestOperationComponent(org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestResourceOperationComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.dstu3.model.CapabilityStatement.CapabilityStatementRestOperationComponent tgt = new org.hl7.fhir.dstu3.model.CapabilityStatement.CapabilityStatementRestOperationComponent();
        VersionConvertor_30_40.copyElement(src, tgt);
        if (src.hasName())
            tgt.setNameElement(VersionConvertor_30_40.convertString(src.getNameElement()));
        if (src.hasDefinition())
            tgt.setDefinition(VersionConvertor_30_40.convertCanonicalToReference(src.getDefinitionElement()));
        return tgt;
    }

    public static org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestResourceOperationComponent convertCapabilityStatementRestOperationComponent(org.hl7.fhir.dstu3.model.CapabilityStatement.CapabilityStatementRestOperationComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestResourceOperationComponent tgt = new org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestResourceOperationComponent();
        VersionConvertor_30_40.copyElement(src, tgt);
        if (src.hasName())
            tgt.setNameElement(VersionConvertor_30_40.convertString(src.getNameElement()));
        if (src.hasDefinition())
            tgt.setDefinitionElement(VersionConvertor_30_40.convertReferenceToCanonical(src.getDefinition()));
        return tgt;
    }

    public static org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestResourceComponent convertCapabilityStatementRestResourceComponent(org.hl7.fhir.dstu3.model.CapabilityStatement.CapabilityStatementRestResourceComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestResourceComponent tgt = new org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestResourceComponent();
        VersionConvertor_30_40.copyElement(src, tgt);
        if (src.hasType())
            tgt.setTypeElement(VersionConvertor_30_40.convertCode(src.getTypeElement()));
        if (src.hasProfile())
            tgt.setProfileElement(VersionConvertor_30_40.convertReferenceToCanonical(src.getProfile()));
        if (src.hasDocumentation())
            tgt.setDocumentationElement(VersionConvertor_30_40.convertMarkdown(src.getDocumentationElement()));
        for (org.hl7.fhir.dstu3.model.CapabilityStatement.ResourceInteractionComponent t : src.getInteraction()) tgt.addInteraction(convertResourceInteractionComponent(t));
        if (src.hasVersioning())
            tgt.setVersioning(convertResourceVersionPolicy(src.getVersioning()));
        if (src.hasReadHistory())
            tgt.setReadHistoryElement(VersionConvertor_30_40.convertBoolean(src.getReadHistoryElement()));
        if (src.hasUpdateCreate())
            tgt.setUpdateCreateElement(VersionConvertor_30_40.convertBoolean(src.getUpdateCreateElement()));
        if (src.hasConditionalCreate())
            tgt.setConditionalCreateElement(VersionConvertor_30_40.convertBoolean(src.getConditionalCreateElement()));
        if (src.hasConditionalRead())
            tgt.setConditionalRead(convertConditionalReadStatus(src.getConditionalRead()));
        if (src.hasConditionalUpdate())
            tgt.setConditionalUpdateElement(VersionConvertor_30_40.convertBoolean(src.getConditionalUpdateElement()));
        if (src.hasConditionalDelete())
            tgt.setConditionalDelete(convertConditionalDeleteStatus(src.getConditionalDelete()));
        for (org.hl7.fhir.dstu3.model.Enumeration<org.hl7.fhir.dstu3.model.CapabilityStatement.ReferenceHandlingPolicy> t : src.getReferencePolicy()) VersionConvertor_30_40.copyElement(t, tgt.addReferencePolicyElement().setValue(convertReferenceHandlingPolicy(t.getValue())));
        for (org.hl7.fhir.dstu3.model.StringType t : src.getSearchInclude()) tgt.addSearchInclude(t.getValue());
        for (org.hl7.fhir.dstu3.model.StringType t : src.getSearchRevInclude()) tgt.addSearchRevInclude(t.getValue());
        for (org.hl7.fhir.dstu3.model.CapabilityStatement.CapabilityStatementRestResourceSearchParamComponent t : src.getSearchParam()) tgt.addSearchParam(convertCapabilityStatementRestResourceSearchParamComponent(t));
        return tgt;
    }

    public static org.hl7.fhir.dstu3.model.CapabilityStatement.CapabilityStatementRestResourceComponent convertCapabilityStatementRestResourceComponent(org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestResourceComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.dstu3.model.CapabilityStatement.CapabilityStatementRestResourceComponent tgt = new org.hl7.fhir.dstu3.model.CapabilityStatement.CapabilityStatementRestResourceComponent();
        VersionConvertor_30_40.copyElement(src, tgt);
        if (src.hasType())
            tgt.setTypeElement(VersionConvertor_30_40.convertCode(src.getTypeElement()));
        if (src.hasProfile())
            tgt.setProfile(VersionConvertor_30_40.convertCanonicalToReference(src.getProfileElement()));
        if (src.hasDocumentation())
            tgt.setDocumentationElement(VersionConvertor_30_40.convertMarkdown(src.getDocumentationElement()));
        for (org.hl7.fhir.r4.model.CapabilityStatement.ResourceInteractionComponent t : src.getInteraction()) tgt.addInteraction(convertResourceInteractionComponent(t));
        if (src.hasVersioning())
            tgt.setVersioning(convertResourceVersionPolicy(src.getVersioning()));
        if (src.hasReadHistory())
            tgt.setReadHistoryElement(VersionConvertor_30_40.convertBoolean(src.getReadHistoryElement()));
        if (src.hasUpdateCreate())
            tgt.setUpdateCreateElement(VersionConvertor_30_40.convertBoolean(src.getUpdateCreateElement()));
        if (src.hasConditionalCreate())
            tgt.setConditionalCreateElement(VersionConvertor_30_40.convertBoolean(src.getConditionalCreateElement()));
        if (src.hasConditionalRead())
            tgt.setConditionalRead(convertConditionalReadStatus(src.getConditionalRead()));
        if (src.hasConditionalUpdate())
            tgt.setConditionalUpdateElement(VersionConvertor_30_40.convertBoolean(src.getConditionalUpdateElement()));
        if (src.hasConditionalDelete())
            tgt.setConditionalDelete(convertConditionalDeleteStatus(src.getConditionalDelete()));
        for (org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.CapabilityStatement.ReferenceHandlingPolicy> t : src.getReferencePolicy()) VersionConvertor_30_40.copyElement(t, tgt.addReferencePolicyElement().setValue(convertReferenceHandlingPolicy(t.getValue())));
        for (org.hl7.fhir.r4.model.StringType t : src.getSearchInclude()) tgt.addSearchInclude(t.getValue());
        for (org.hl7.fhir.r4.model.StringType t : src.getSearchRevInclude()) tgt.addSearchRevInclude(t.getValue());
        for (org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestResourceSearchParamComponent t : src.getSearchParam()) tgt.addSearchParam(convertCapabilityStatementRestResourceSearchParamComponent(t));
        return tgt;
    }

    public static org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestResourceSearchParamComponent convertCapabilityStatementRestResourceSearchParamComponent(org.hl7.fhir.dstu3.model.CapabilityStatement.CapabilityStatementRestResourceSearchParamComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestResourceSearchParamComponent tgt = new org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestResourceSearchParamComponent();
        VersionConvertor_30_40.copyElement(src, tgt);
        if (src.hasName())
            tgt.setNameElement(VersionConvertor_30_40.convertString(src.getNameElement()));
        if (src.hasDefinition())
            tgt.setDefinition(src.getDefinition());
        if (src.hasType())
            tgt.setType(VersionConvertor_30_40.convertSearchParamType(src.getType()));
        if (src.hasDocumentation())
            tgt.setDocumentation(src.getDocumentation());
        return tgt;
    }

    public static org.hl7.fhir.dstu3.model.CapabilityStatement.CapabilityStatementRestResourceSearchParamComponent convertCapabilityStatementRestResourceSearchParamComponent(org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestResourceSearchParamComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.dstu3.model.CapabilityStatement.CapabilityStatementRestResourceSearchParamComponent tgt = new org.hl7.fhir.dstu3.model.CapabilityStatement.CapabilityStatementRestResourceSearchParamComponent();
        VersionConvertor_30_40.copyElement(src, tgt);
        if (src.hasName())
            tgt.setNameElement(VersionConvertor_30_40.convertString(src.getNameElement()));
        if (src.hasDefinition())
            tgt.setDefinition(src.getDefinition());
        if (src.hasType())
            tgt.setType(VersionConvertor_30_40.convertSearchParamType(src.getType()));
        if (src.hasDocumentation())
            tgt.setDocumentation(src.getDocumentation());
        return tgt;
    }

    public static org.hl7.fhir.dstu3.model.CapabilityStatement.CapabilityStatementRestSecurityComponent convertCapabilityStatementRestSecurityComponent(org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestSecurityComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.dstu3.model.CapabilityStatement.CapabilityStatementRestSecurityComponent tgt = new org.hl7.fhir.dstu3.model.CapabilityStatement.CapabilityStatementRestSecurityComponent();
        VersionConvertor_30_40.copyElement(src, tgt);
        if (src.hasCors())
            tgt.setCorsElement(VersionConvertor_30_40.convertBoolean(src.getCorsElement()));
        for (org.hl7.fhir.r4.model.CodeableConcept t : src.getService()) tgt.addService(VersionConvertor_30_40.convertCodeableConcept(t));
        if (src.hasDescription())
            tgt.setDescription(src.getDescription());
        return tgt;
    }

    public static org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestSecurityComponent convertCapabilityStatementRestSecurityComponent(org.hl7.fhir.dstu3.model.CapabilityStatement.CapabilityStatementRestSecurityComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestSecurityComponent tgt = new org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementRestSecurityComponent();
        VersionConvertor_30_40.copyElement(src, tgt);
        if (src.hasCors())
            tgt.setCorsElement(VersionConvertor_30_40.convertBoolean(src.getCorsElement()));
        for (org.hl7.fhir.dstu3.model.CodeableConcept t : src.getService()) tgt.addService(VersionConvertor_30_40.convertCodeableConcept(t));
        if (src.hasDescription())
            tgt.setDescription(src.getDescription());
        return tgt;
    }

    public static org.hl7.fhir.dstu3.model.CapabilityStatement.CapabilityStatementSoftwareComponent convertCapabilityStatementSoftwareComponent(org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementSoftwareComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.dstu3.model.CapabilityStatement.CapabilityStatementSoftwareComponent tgt = new org.hl7.fhir.dstu3.model.CapabilityStatement.CapabilityStatementSoftwareComponent();
        VersionConvertor_30_40.copyElement(src, tgt);
        if (src.hasName())
            tgt.setNameElement(VersionConvertor_30_40.convertString(src.getNameElement()));
        if (src.hasVersion())
            tgt.setVersionElement(VersionConvertor_30_40.convertString(src.getVersionElement()));
        if (src.hasReleaseDate())
            tgt.setReleaseDateElement(VersionConvertor_30_40.convertDateTime(src.getReleaseDateElement()));
        return tgt;
    }

    public static org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementSoftwareComponent convertCapabilityStatementSoftwareComponent(org.hl7.fhir.dstu3.model.CapabilityStatement.CapabilityStatementSoftwareComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementSoftwareComponent tgt = new org.hl7.fhir.r4.model.CapabilityStatement.CapabilityStatementSoftwareComponent();
        VersionConvertor_30_40.copyElement(src, tgt);
        if (src.hasName())
            tgt.setNameElement(VersionConvertor_30_40.convertString(src.getNameElement()));
        if (src.hasVersion())
            tgt.setVersionElement(VersionConvertor_30_40.convertString(src.getVersionElement()));
        if (src.hasReleaseDate())
            tgt.setReleaseDateElement(VersionConvertor_30_40.convertDateTime(src.getReleaseDateElement()));
        return tgt;
    }

    static public org.hl7.fhir.dstu3.model.CapabilityStatement.ConditionalDeleteStatus convertConditionalDeleteStatus(org.hl7.fhir.r4.model.CapabilityStatement.ConditionalDeleteStatus src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case NOTSUPPORTED:
                return org.hl7.fhir.dstu3.model.CapabilityStatement.ConditionalDeleteStatus.NOTSUPPORTED;
            case SINGLE:
                return org.hl7.fhir.dstu3.model.CapabilityStatement.ConditionalDeleteStatus.SINGLE;
            case MULTIPLE:
                return org.hl7.fhir.dstu3.model.CapabilityStatement.ConditionalDeleteStatus.MULTIPLE;
            default:
                return org.hl7.fhir.dstu3.model.CapabilityStatement.ConditionalDeleteStatus.NULL;
        }
    }

    static public org.hl7.fhir.r4.model.CapabilityStatement.ConditionalDeleteStatus convertConditionalDeleteStatus(org.hl7.fhir.dstu3.model.CapabilityStatement.ConditionalDeleteStatus src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case NOTSUPPORTED:
                return org.hl7.fhir.r4.model.CapabilityStatement.ConditionalDeleteStatus.NOTSUPPORTED;
            case SINGLE:
                return org.hl7.fhir.r4.model.CapabilityStatement.ConditionalDeleteStatus.SINGLE;
            case MULTIPLE:
                return org.hl7.fhir.r4.model.CapabilityStatement.ConditionalDeleteStatus.MULTIPLE;
            default:
                return org.hl7.fhir.r4.model.CapabilityStatement.ConditionalDeleteStatus.NULL;
        }
    }

    static public org.hl7.fhir.dstu3.model.CapabilityStatement.ConditionalReadStatus convertConditionalReadStatus(org.hl7.fhir.r4.model.CapabilityStatement.ConditionalReadStatus src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case NOTSUPPORTED:
                return org.hl7.fhir.dstu3.model.CapabilityStatement.ConditionalReadStatus.NOTSUPPORTED;
            case MODIFIEDSINCE:
                return org.hl7.fhir.dstu3.model.CapabilityStatement.ConditionalReadStatus.MODIFIEDSINCE;
            case NOTMATCH:
                return org.hl7.fhir.dstu3.model.CapabilityStatement.ConditionalReadStatus.NOTMATCH;
            case FULLSUPPORT:
                return org.hl7.fhir.dstu3.model.CapabilityStatement.ConditionalReadStatus.FULLSUPPORT;
            default:
                return org.hl7.fhir.dstu3.model.CapabilityStatement.ConditionalReadStatus.NULL;
        }
    }

    static public org.hl7.fhir.r4.model.CapabilityStatement.ConditionalReadStatus convertConditionalReadStatus(org.hl7.fhir.dstu3.model.CapabilityStatement.ConditionalReadStatus src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case NOTSUPPORTED:
                return org.hl7.fhir.r4.model.CapabilityStatement.ConditionalReadStatus.NOTSUPPORTED;
            case MODIFIEDSINCE:
                return org.hl7.fhir.r4.model.CapabilityStatement.ConditionalReadStatus.MODIFIEDSINCE;
            case NOTMATCH:
                return org.hl7.fhir.r4.model.CapabilityStatement.ConditionalReadStatus.NOTMATCH;
            case FULLSUPPORT:
                return org.hl7.fhir.r4.model.CapabilityStatement.ConditionalReadStatus.FULLSUPPORT;
            default:
                return org.hl7.fhir.r4.model.CapabilityStatement.ConditionalReadStatus.NULL;
        }
    }

    static public org.hl7.fhir.r4.model.CapabilityStatement.DocumentMode convertDocumentMode(org.hl7.fhir.dstu3.model.CapabilityStatement.DocumentMode src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case PRODUCER:
                return org.hl7.fhir.r4.model.CapabilityStatement.DocumentMode.PRODUCER;
            case CONSUMER:
                return org.hl7.fhir.r4.model.CapabilityStatement.DocumentMode.CONSUMER;
            default:
                return org.hl7.fhir.r4.model.CapabilityStatement.DocumentMode.NULL;
        }
    }

    static public org.hl7.fhir.dstu3.model.CapabilityStatement.DocumentMode convertDocumentMode(org.hl7.fhir.r4.model.CapabilityStatement.DocumentMode src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case PRODUCER:
                return org.hl7.fhir.dstu3.model.CapabilityStatement.DocumentMode.PRODUCER;
            case CONSUMER:
                return org.hl7.fhir.dstu3.model.CapabilityStatement.DocumentMode.CONSUMER;
            default:
                return org.hl7.fhir.dstu3.model.CapabilityStatement.DocumentMode.NULL;
        }
    }

    static public org.hl7.fhir.dstu3.model.CapabilityStatement.EventCapabilityMode convertEventCapabilityMode(org.hl7.fhir.r4.model.CapabilityStatement.EventCapabilityMode src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case SENDER:
                return org.hl7.fhir.dstu3.model.CapabilityStatement.EventCapabilityMode.SENDER;
            case RECEIVER:
                return org.hl7.fhir.dstu3.model.CapabilityStatement.EventCapabilityMode.RECEIVER;
            default:
                return org.hl7.fhir.dstu3.model.CapabilityStatement.EventCapabilityMode.NULL;
        }
    }

    static public org.hl7.fhir.r4.model.CapabilityStatement.EventCapabilityMode convertEventCapabilityMode(org.hl7.fhir.dstu3.model.CapabilityStatement.EventCapabilityMode src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case SENDER:
                return org.hl7.fhir.r4.model.CapabilityStatement.EventCapabilityMode.SENDER;
            case RECEIVER:
                return org.hl7.fhir.r4.model.CapabilityStatement.EventCapabilityMode.RECEIVER;
            default:
                return org.hl7.fhir.r4.model.CapabilityStatement.EventCapabilityMode.NULL;
        }
    }

    static public org.hl7.fhir.r4.model.CapabilityStatement.ReferenceHandlingPolicy convertReferenceHandlingPolicy(org.hl7.fhir.dstu3.model.CapabilityStatement.ReferenceHandlingPolicy src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case LITERAL:
                return org.hl7.fhir.r4.model.CapabilityStatement.ReferenceHandlingPolicy.LITERAL;
            case LOGICAL:
                return org.hl7.fhir.r4.model.CapabilityStatement.ReferenceHandlingPolicy.LOGICAL;
            case RESOLVES:
                return org.hl7.fhir.r4.model.CapabilityStatement.ReferenceHandlingPolicy.RESOLVES;
            case ENFORCED:
                return org.hl7.fhir.r4.model.CapabilityStatement.ReferenceHandlingPolicy.ENFORCED;
            case LOCAL:
                return org.hl7.fhir.r4.model.CapabilityStatement.ReferenceHandlingPolicy.LOCAL;
            default:
                return org.hl7.fhir.r4.model.CapabilityStatement.ReferenceHandlingPolicy.NULL;
        }
    }

    static public org.hl7.fhir.dstu3.model.CapabilityStatement.ReferenceHandlingPolicy convertReferenceHandlingPolicy(org.hl7.fhir.r4.model.CapabilityStatement.ReferenceHandlingPolicy src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case LITERAL:
                return org.hl7.fhir.dstu3.model.CapabilityStatement.ReferenceHandlingPolicy.LITERAL;
            case LOGICAL:
                return org.hl7.fhir.dstu3.model.CapabilityStatement.ReferenceHandlingPolicy.LOGICAL;
            case RESOLVES:
                return org.hl7.fhir.dstu3.model.CapabilityStatement.ReferenceHandlingPolicy.RESOLVES;
            case ENFORCED:
                return org.hl7.fhir.dstu3.model.CapabilityStatement.ReferenceHandlingPolicy.ENFORCED;
            case LOCAL:
                return org.hl7.fhir.dstu3.model.CapabilityStatement.ReferenceHandlingPolicy.LOCAL;
            default:
                return org.hl7.fhir.dstu3.model.CapabilityStatement.ReferenceHandlingPolicy.NULL;
        }
    }

    public static org.hl7.fhir.dstu3.model.CapabilityStatement.ResourceInteractionComponent convertResourceInteractionComponent(org.hl7.fhir.r4.model.CapabilityStatement.ResourceInteractionComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.dstu3.model.CapabilityStatement.ResourceInteractionComponent tgt = new org.hl7.fhir.dstu3.model.CapabilityStatement.ResourceInteractionComponent();
        VersionConvertor_30_40.copyElement(src, tgt);
        if (src.hasCode())
            tgt.setCode(convertTypeRestfulInteraction(src.getCode()));
        if (src.hasDocumentation())
            tgt.setDocumentation(src.getDocumentation());
        return tgt;
    }

    public static org.hl7.fhir.r4.model.CapabilityStatement.ResourceInteractionComponent convertResourceInteractionComponent(org.hl7.fhir.dstu3.model.CapabilityStatement.ResourceInteractionComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.r4.model.CapabilityStatement.ResourceInteractionComponent tgt = new org.hl7.fhir.r4.model.CapabilityStatement.ResourceInteractionComponent();
        VersionConvertor_30_40.copyElement(src, tgt);
        if (src.hasCode())
            tgt.setCode(convertTypeRestfulInteraction(src.getCode()));
        if (src.hasDocumentation())
            tgt.setDocumentation(src.getDocumentation());
        return tgt;
    }

    static public org.hl7.fhir.r4.model.CapabilityStatement.ResourceVersionPolicy convertResourceVersionPolicy(org.hl7.fhir.dstu3.model.CapabilityStatement.ResourceVersionPolicy src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case NOVERSION:
                return org.hl7.fhir.r4.model.CapabilityStatement.ResourceVersionPolicy.NOVERSION;
            case VERSIONED:
                return org.hl7.fhir.r4.model.CapabilityStatement.ResourceVersionPolicy.VERSIONED;
            case VERSIONEDUPDATE:
                return org.hl7.fhir.r4.model.CapabilityStatement.ResourceVersionPolicy.VERSIONEDUPDATE;
            default:
                return org.hl7.fhir.r4.model.CapabilityStatement.ResourceVersionPolicy.NULL;
        }
    }

    static public org.hl7.fhir.dstu3.model.CapabilityStatement.ResourceVersionPolicy convertResourceVersionPolicy(org.hl7.fhir.r4.model.CapabilityStatement.ResourceVersionPolicy src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case NOVERSION:
                return org.hl7.fhir.dstu3.model.CapabilityStatement.ResourceVersionPolicy.NOVERSION;
            case VERSIONED:
                return org.hl7.fhir.dstu3.model.CapabilityStatement.ResourceVersionPolicy.VERSIONED;
            case VERSIONEDUPDATE:
                return org.hl7.fhir.dstu3.model.CapabilityStatement.ResourceVersionPolicy.VERSIONEDUPDATE;
            default:
                return org.hl7.fhir.dstu3.model.CapabilityStatement.ResourceVersionPolicy.NULL;
        }
    }

    static public org.hl7.fhir.dstu3.model.CapabilityStatement.RestfulCapabilityMode convertRestfulCapabilityMode(org.hl7.fhir.r4.model.CapabilityStatement.RestfulCapabilityMode src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case CLIENT:
                return org.hl7.fhir.dstu3.model.CapabilityStatement.RestfulCapabilityMode.CLIENT;
            case SERVER:
                return org.hl7.fhir.dstu3.model.CapabilityStatement.RestfulCapabilityMode.SERVER;
            default:
                return org.hl7.fhir.dstu3.model.CapabilityStatement.RestfulCapabilityMode.NULL;
        }
    }

    static public org.hl7.fhir.r4.model.CapabilityStatement.RestfulCapabilityMode convertRestfulCapabilityMode(org.hl7.fhir.dstu3.model.CapabilityStatement.RestfulCapabilityMode src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case CLIENT:
                return org.hl7.fhir.r4.model.CapabilityStatement.RestfulCapabilityMode.CLIENT;
            case SERVER:
                return org.hl7.fhir.r4.model.CapabilityStatement.RestfulCapabilityMode.SERVER;
            default:
                return org.hl7.fhir.r4.model.CapabilityStatement.RestfulCapabilityMode.NULL;
        }
    }

    public static org.hl7.fhir.dstu3.model.CapabilityStatement.SystemInteractionComponent convertSystemInteractionComponent(org.hl7.fhir.r4.model.CapabilityStatement.SystemInteractionComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.dstu3.model.CapabilityStatement.SystemInteractionComponent tgt = new org.hl7.fhir.dstu3.model.CapabilityStatement.SystemInteractionComponent();
        VersionConvertor_30_40.copyElement(src, tgt);
        if (src.hasCode())
            tgt.setCode(convertSystemRestfulInteraction(src.getCode()));
        if (src.hasDocumentation())
            tgt.setDocumentation(src.getDocumentation());
        return tgt;
    }

    public static org.hl7.fhir.r4.model.CapabilityStatement.SystemInteractionComponent convertSystemInteractionComponent(org.hl7.fhir.dstu3.model.CapabilityStatement.SystemInteractionComponent src) throws FHIRException {
        if (src == null)
            return null;
        org.hl7.fhir.r4.model.CapabilityStatement.SystemInteractionComponent tgt = new org.hl7.fhir.r4.model.CapabilityStatement.SystemInteractionComponent();
        VersionConvertor_30_40.copyElement(src, tgt);
        if (src.hasCode())
            tgt.setCode(convertSystemRestfulInteraction(src.getCode()));
        if (src.hasDocumentation())
            tgt.setDocumentation(src.getDocumentation());
        return tgt;
    }

    static public org.hl7.fhir.dstu3.model.CapabilityStatement.SystemRestfulInteraction convertSystemRestfulInteraction(org.hl7.fhir.r4.model.CapabilityStatement.SystemRestfulInteraction src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case TRANSACTION:
                return org.hl7.fhir.dstu3.model.CapabilityStatement.SystemRestfulInteraction.TRANSACTION;
            case BATCH:
                return org.hl7.fhir.dstu3.model.CapabilityStatement.SystemRestfulInteraction.BATCH;
            case SEARCHSYSTEM:
                return org.hl7.fhir.dstu3.model.CapabilityStatement.SystemRestfulInteraction.SEARCHSYSTEM;
            case HISTORYSYSTEM:
                return org.hl7.fhir.dstu3.model.CapabilityStatement.SystemRestfulInteraction.HISTORYSYSTEM;
            default:
                return org.hl7.fhir.dstu3.model.CapabilityStatement.SystemRestfulInteraction.NULL;
        }
    }

    static public org.hl7.fhir.r4.model.CapabilityStatement.SystemRestfulInteraction convertSystemRestfulInteraction(org.hl7.fhir.dstu3.model.CapabilityStatement.SystemRestfulInteraction src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case TRANSACTION:
                return org.hl7.fhir.r4.model.CapabilityStatement.SystemRestfulInteraction.TRANSACTION;
            case BATCH:
                return org.hl7.fhir.r4.model.CapabilityStatement.SystemRestfulInteraction.BATCH;
            case SEARCHSYSTEM:
                return org.hl7.fhir.r4.model.CapabilityStatement.SystemRestfulInteraction.SEARCHSYSTEM;
            case HISTORYSYSTEM:
                return org.hl7.fhir.r4.model.CapabilityStatement.SystemRestfulInteraction.HISTORYSYSTEM;
            default:
                return org.hl7.fhir.r4.model.CapabilityStatement.SystemRestfulInteraction.NULL;
        }
    }

    static public org.hl7.fhir.dstu3.model.CapabilityStatement.TypeRestfulInteraction convertTypeRestfulInteraction(org.hl7.fhir.r4.model.CapabilityStatement.TypeRestfulInteraction src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case READ:
                return org.hl7.fhir.dstu3.model.CapabilityStatement.TypeRestfulInteraction.READ;
            case VREAD:
                return org.hl7.fhir.dstu3.model.CapabilityStatement.TypeRestfulInteraction.VREAD;
            case UPDATE:
                return org.hl7.fhir.dstu3.model.CapabilityStatement.TypeRestfulInteraction.UPDATE;
            case PATCH:
                return org.hl7.fhir.dstu3.model.CapabilityStatement.TypeRestfulInteraction.PATCH;
            case DELETE:
                return org.hl7.fhir.dstu3.model.CapabilityStatement.TypeRestfulInteraction.DELETE;
            case HISTORYINSTANCE:
                return org.hl7.fhir.dstu3.model.CapabilityStatement.TypeRestfulInteraction.HISTORYINSTANCE;
            case HISTORYTYPE:
                return org.hl7.fhir.dstu3.model.CapabilityStatement.TypeRestfulInteraction.HISTORYTYPE;
            case CREATE:
                return org.hl7.fhir.dstu3.model.CapabilityStatement.TypeRestfulInteraction.CREATE;
            case SEARCHTYPE:
                return org.hl7.fhir.dstu3.model.CapabilityStatement.TypeRestfulInteraction.SEARCHTYPE;
            default:
                return org.hl7.fhir.dstu3.model.CapabilityStatement.TypeRestfulInteraction.NULL;
        }
    }

    static public org.hl7.fhir.r4.model.CapabilityStatement.TypeRestfulInteraction convertTypeRestfulInteraction(org.hl7.fhir.dstu3.model.CapabilityStatement.TypeRestfulInteraction src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case READ:
                return org.hl7.fhir.r4.model.CapabilityStatement.TypeRestfulInteraction.READ;
            case VREAD:
                return org.hl7.fhir.r4.model.CapabilityStatement.TypeRestfulInteraction.VREAD;
            case UPDATE:
                return org.hl7.fhir.r4.model.CapabilityStatement.TypeRestfulInteraction.UPDATE;
            case PATCH:
                return org.hl7.fhir.r4.model.CapabilityStatement.TypeRestfulInteraction.PATCH;
            case DELETE:
                return org.hl7.fhir.r4.model.CapabilityStatement.TypeRestfulInteraction.DELETE;
            case HISTORYINSTANCE:
                return org.hl7.fhir.r4.model.CapabilityStatement.TypeRestfulInteraction.HISTORYINSTANCE;
            case HISTORYTYPE:
                return org.hl7.fhir.r4.model.CapabilityStatement.TypeRestfulInteraction.HISTORYTYPE;
            case CREATE:
                return org.hl7.fhir.r4.model.CapabilityStatement.TypeRestfulInteraction.CREATE;
            case SEARCHTYPE:
                return org.hl7.fhir.r4.model.CapabilityStatement.TypeRestfulInteraction.SEARCHTYPE;
            default:
                return org.hl7.fhir.r4.model.CapabilityStatement.TypeRestfulInteraction.NULL;
        }
    }
}
