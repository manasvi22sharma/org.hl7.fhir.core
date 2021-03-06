package org.hl7.fhir.convertors.conv10_50;

import org.hl7.fhir.convertors.VersionConvertor_10_50;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r5.model.CodeableReference;

public class CommunicationRequest10_50 {

    public static org.hl7.fhir.dstu2.model.CommunicationRequest convertCommunicationRequest(org.hl7.fhir.r5.model.CommunicationRequest src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2.model.CommunicationRequest tgt = new org.hl7.fhir.dstu2.model.CommunicationRequest();
        VersionConvertor_10_50.copyDomainResource(src, tgt);
        for (org.hl7.fhir.r5.model.Identifier t : src.getIdentifier()) tgt.addIdentifier(VersionConvertor_10_50.convertIdentifier(t));
        if (src.hasCategory())
            tgt.setCategory(VersionConvertor_10_50.convertCodeableConcept(src.getCategoryFirstRep()));
        if (src.hasInformationProvider())
            tgt.setSender(VersionConvertor_10_50.convertReference(src.getInformationProviderFirstRep()));
        for (org.hl7.fhir.r5.model.Reference t : src.getRecipient()) tgt.addRecipient(VersionConvertor_10_50.convertReference(t));
        for (org.hl7.fhir.r5.model.CommunicationRequest.CommunicationRequestPayloadComponent t : src.getPayload()) tgt.addPayload(convertCommunicationRequestPayloadComponent(t));
        for (org.hl7.fhir.r5.model.CodeableConcept t : src.getMedium()) tgt.addMedium(VersionConvertor_10_50.convertCodeableConcept(t));
        if (src.hasRequester())
            tgt.setRequester(VersionConvertor_10_50.convertReference(src.getRequester()));
        if (src.hasStatus())
            tgt.setStatus(convertCommunicationRequestStatus(src.getStatus()));
        if (src.hasEncounter())
            tgt.setEncounter(VersionConvertor_10_50.convertReference(src.getEncounter()));
        if (src.hasOccurrence())
            tgt.setScheduled(VersionConvertor_10_50.convertType(src.getOccurrence()));
        for (CodeableReference t : src.getReason()) if (t.hasConcept())
            tgt.addReason(VersionConvertor_10_50.convertCodeableConcept(t.getConcept()));
        if (src.hasAuthoredOnElement())
            tgt.setRequestedOnElement(VersionConvertor_10_50.convertDateTime(src.getAuthoredOnElement()));
        if (src.hasSubject())
            tgt.setSubject(VersionConvertor_10_50.convertReference(src.getSubject()));
        if (src.hasPriority())
            tgt.setPriority(convertPriorityCode(src.getPriority()));
        return tgt;
    }

    public static org.hl7.fhir.r5.model.CommunicationRequest convertCommunicationRequest(org.hl7.fhir.dstu2.model.CommunicationRequest src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.r5.model.CommunicationRequest tgt = new org.hl7.fhir.r5.model.CommunicationRequest();
        VersionConvertor_10_50.copyDomainResource(src, tgt);
        for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier()) tgt.addIdentifier(VersionConvertor_10_50.convertIdentifier(t));
        if (src.hasCategory())
            tgt.addCategory(VersionConvertor_10_50.convertCodeableConcept(src.getCategory()));
        if (src.hasSender())
            tgt.addInformationProvider(VersionConvertor_10_50.convertReference(src.getSender()));
        for (org.hl7.fhir.dstu2.model.Reference t : src.getRecipient()) tgt.addRecipient(VersionConvertor_10_50.convertReference(t));
        for (org.hl7.fhir.dstu2.model.CommunicationRequest.CommunicationRequestPayloadComponent t : src.getPayload()) tgt.addPayload(convertCommunicationRequestPayloadComponent(t));
        for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getMedium()) tgt.addMedium(VersionConvertor_10_50.convertCodeableConcept(t));
        if (src.hasRequester())
            tgt.setRequester(VersionConvertor_10_50.convertReference(src.getRequester()));
        if (src.hasStatus())
            tgt.setStatus(convertCommunicationRequestStatus(src.getStatus()));
        if (src.hasEncounter())
            tgt.setEncounter(VersionConvertor_10_50.convertReference(src.getEncounter()));
        if (src.hasScheduled())
            tgt.setOccurrence(VersionConvertor_10_50.convertType(src.getScheduled()));
        for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getReason()) tgt.addReason(VersionConvertor_10_50.convertCodeableConceptToCodableReference(t));
        if (src.hasRequestedOnElement())
            tgt.setAuthoredOnElement(VersionConvertor_10_50.convertDateTime(src.getRequestedOnElement()));
        if (src.hasSubject())
            tgt.setSubject(VersionConvertor_10_50.convertReference(src.getSubject()));
        if (src.hasPriority())
            tgt.setPriority(convertPriorityCode(src.getPriority()));
        return tgt;
    }

    public static org.hl7.fhir.r5.model.CommunicationRequest.CommunicationRequestPayloadComponent convertCommunicationRequestPayloadComponent(org.hl7.fhir.dstu2.model.CommunicationRequest.CommunicationRequestPayloadComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.r5.model.CommunicationRequest.CommunicationRequestPayloadComponent tgt = new org.hl7.fhir.r5.model.CommunicationRequest.CommunicationRequestPayloadComponent();
        VersionConvertor_10_50.copyElement(src, tgt);
        if (src.hasContent())
            tgt.setContent(VersionConvertor_10_50.convertType(src.getContent()));
        return tgt;
    }

    public static org.hl7.fhir.dstu2.model.CommunicationRequest.CommunicationRequestPayloadComponent convertCommunicationRequestPayloadComponent(org.hl7.fhir.r5.model.CommunicationRequest.CommunicationRequestPayloadComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2.model.CommunicationRequest.CommunicationRequestPayloadComponent tgt = new org.hl7.fhir.dstu2.model.CommunicationRequest.CommunicationRequestPayloadComponent();
        VersionConvertor_10_50.copyElement(src, tgt);
        if (src.hasContent())
            tgt.setContent(VersionConvertor_10_50.convertType(src.getContent()));
        return tgt;
    }

    public static org.hl7.fhir.dstu2.model.CommunicationRequest.CommunicationRequestStatus convertCommunicationRequestStatus(org.hl7.fhir.r5.model.Enumerations.RequestStatus src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case DRAFT:
                return org.hl7.fhir.dstu2.model.CommunicationRequest.CommunicationRequestStatus.PROPOSED;
            case ACTIVE:
                return org.hl7.fhir.dstu2.model.CommunicationRequest.CommunicationRequestStatus.INPROGRESS;
            case COMPLETED:
                return org.hl7.fhir.dstu2.model.CommunicationRequest.CommunicationRequestStatus.COMPLETED;
            case ONHOLD:
                return org.hl7.fhir.dstu2.model.CommunicationRequest.CommunicationRequestStatus.SUSPENDED;
            case ENTEREDINERROR:
                return org.hl7.fhir.dstu2.model.CommunicationRequest.CommunicationRequestStatus.REJECTED;
            default:
                return org.hl7.fhir.dstu2.model.CommunicationRequest.CommunicationRequestStatus.NULL;
        }
    }

    public static org.hl7.fhir.r5.model.Enumerations.RequestStatus convertCommunicationRequestStatus(org.hl7.fhir.dstu2.model.CommunicationRequest.CommunicationRequestStatus src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case PROPOSED:
                return org.hl7.fhir.r5.model.Enumerations.RequestStatus.DRAFT;
            case PLANNED:
                return org.hl7.fhir.r5.model.Enumerations.RequestStatus.ACTIVE;
            case REQUESTED:
                return org.hl7.fhir.r5.model.Enumerations.RequestStatus.ACTIVE;
            case RECEIVED:
                return org.hl7.fhir.r5.model.Enumerations.RequestStatus.ACTIVE;
            case ACCEPTED:
                return org.hl7.fhir.r5.model.Enumerations.RequestStatus.ACTIVE;
            case INPROGRESS:
                return org.hl7.fhir.r5.model.Enumerations.RequestStatus.ACTIVE;
            case COMPLETED:
                return org.hl7.fhir.r5.model.Enumerations.RequestStatus.COMPLETED;
            case SUSPENDED:
                return org.hl7.fhir.r5.model.Enumerations.RequestStatus.ONHOLD;
            case REJECTED:
                return org.hl7.fhir.r5.model.Enumerations.RequestStatus.ENTEREDINERROR;
            default:
                return org.hl7.fhir.r5.model.Enumerations.RequestStatus.NULL;
        }
    }

    static public org.hl7.fhir.r5.model.Enumerations.RequestPriority convertPriorityCode(org.hl7.fhir.dstu2.model.CodeableConcept priority) {
        for (org.hl7.fhir.dstu2.model.Coding c : priority.getCoding()) {
            if ("http://hl7.org/fhir/diagnostic-order-priority".equals(c.getSystem()) && "routine".equals(c.getCode()))
                return org.hl7.fhir.r5.model.Enumerations.RequestPriority.ROUTINE;
            if ("http://hl7.org/fhir/diagnostic-order-priority".equals(c.getSystem()) && "urgent".equals(c.getCode()))
                return org.hl7.fhir.r5.model.Enumerations.RequestPriority.URGENT;
            if ("http://hl7.org/fhir/diagnostic-order-priority".equals(c.getSystem()) && "stat".equals(c.getCode()))
                return org.hl7.fhir.r5.model.Enumerations.RequestPriority.STAT;
            if ("http://hl7.org/fhir/diagnostic-order-priority".equals(c.getSystem()) && "asap".equals(c.getCode()))
                return org.hl7.fhir.r5.model.Enumerations.RequestPriority.ASAP;
        }
        return null;
    }

    static public org.hl7.fhir.dstu2.model.CodeableConcept convertPriorityCode(org.hl7.fhir.r5.model.Enumerations.RequestPriority priority) {
        org.hl7.fhir.dstu2.model.CodeableConcept cc = new org.hl7.fhir.dstu2.model.CodeableConcept();
        switch(priority) {
            case ROUTINE:
                cc.addCoding().setSystem("http://hl7.org/fhir/diagnostic-order-priority").setCode("routine");
                break;
            case URGENT:
                cc.addCoding().setSystem("http://hl7.org/fhir/diagnostic-order-priority").setCode("urgent");
                break;
            case STAT:
                cc.addCoding().setSystem("http://hl7.org/fhir/diagnostic-order-priority").setCode("stat");
                break;
            case ASAP:
                cc.addCoding().setSystem("http://hl7.org/fhir/diagnostic-order-priority").setCode("asap");
                break;
            default:
                return null;
        }
        return cc;
    }
}
