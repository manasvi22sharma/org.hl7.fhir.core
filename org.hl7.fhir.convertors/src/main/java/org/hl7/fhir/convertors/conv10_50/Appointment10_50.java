package org.hl7.fhir.convertors.conv10_50;

import org.hl7.fhir.convertors.VersionConvertor_10_50;
import org.hl7.fhir.exceptions.FHIRException;

public class Appointment10_50 {

    public static org.hl7.fhir.dstu2.model.Appointment convertAppointment(org.hl7.fhir.r5.model.Appointment src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2.model.Appointment tgt = new org.hl7.fhir.dstu2.model.Appointment();
        VersionConvertor_10_50.copyDomainResource(src, tgt);
        for (org.hl7.fhir.r5.model.Identifier t : src.getIdentifier()) tgt.addIdentifier(VersionConvertor_10_50.convertIdentifier(t));
        if (src.hasStatus())
            tgt.setStatus(convertAppointmentStatus(src.getStatus()));
        for (org.hl7.fhir.r5.model.CodeableConcept t : src.getServiceType()) tgt.setType(VersionConvertor_10_50.convertCodeableConcept(t));
        if (src.hasPriorityElement())
            tgt.setPriorityElement(VersionConvertor_10_50.convertUnsignedInt(src.getPriorityElement()));
        if (src.hasDescriptionElement())
            tgt.setDescriptionElement(VersionConvertor_10_50.convertString(src.getDescriptionElement()));
        if (src.hasStartElement())
            tgt.setStartElement(VersionConvertor_10_50.convertInstant(src.getStartElement()));
        if (src.hasEndElement())
            tgt.setEndElement(VersionConvertor_10_50.convertInstant(src.getEndElement()));
        if (src.hasMinutesDurationElement())
            tgt.setMinutesDurationElement(VersionConvertor_10_50.convertPositiveInt(src.getMinutesDurationElement()));
        for (org.hl7.fhir.r5.model.Reference t : src.getSlot()) tgt.addSlot(VersionConvertor_10_50.convertReference(t));
        if (src.hasCommentElement())
            tgt.setCommentElement(VersionConvertor_10_50.convertString(src.getCommentElement()));
        for (org.hl7.fhir.r5.model.Appointment.AppointmentParticipantComponent t : src.getParticipant()) tgt.addParticipant(convertAppointmentParticipantComponent(t));
        return tgt;
    }

    public static org.hl7.fhir.r5.model.Appointment convertAppointment(org.hl7.fhir.dstu2.model.Appointment src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.r5.model.Appointment tgt = new org.hl7.fhir.r5.model.Appointment();
        VersionConvertor_10_50.copyDomainResource(src, tgt);
        for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier()) tgt.addIdentifier(VersionConvertor_10_50.convertIdentifier(t));
        if (src.hasStatus())
            tgt.setStatus(convertAppointmentStatus(src.getStatus()));
        if (src.hasType())
            tgt.addServiceType(VersionConvertor_10_50.convertCodeableConcept(src.getType()));
        if (src.hasPriorityElement())
            tgt.setPriorityElement(VersionConvertor_10_50.convertUnsignedInt(src.getPriorityElement()));
        if (src.hasDescriptionElement())
            tgt.setDescriptionElement(VersionConvertor_10_50.convertString(src.getDescriptionElement()));
        if (src.hasStartElement())
            tgt.setStartElement(VersionConvertor_10_50.convertInstant(src.getStartElement()));
        if (src.hasEndElement())
            tgt.setEndElement(VersionConvertor_10_50.convertInstant(src.getEndElement()));
        if (src.hasMinutesDurationElement())
            tgt.setMinutesDurationElement(VersionConvertor_10_50.convertPositiveInt(src.getMinutesDurationElement()));
        for (org.hl7.fhir.dstu2.model.Reference t : src.getSlot()) tgt.addSlot(VersionConvertor_10_50.convertReference(t));
        if (src.hasCommentElement())
            tgt.setCommentElement(VersionConvertor_10_50.convertString(src.getCommentElement()));
        for (org.hl7.fhir.dstu2.model.Appointment.AppointmentParticipantComponent t : src.getParticipant()) tgt.addParticipant(convertAppointmentParticipantComponent(t));
        return tgt;
    }

    public static org.hl7.fhir.dstu2.model.Appointment.AppointmentParticipantComponent convertAppointmentParticipantComponent(org.hl7.fhir.r5.model.Appointment.AppointmentParticipantComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2.model.Appointment.AppointmentParticipantComponent tgt = new org.hl7.fhir.dstu2.model.Appointment.AppointmentParticipantComponent();
        VersionConvertor_10_50.copyElement(src, tgt);
        for (org.hl7.fhir.r5.model.CodeableConcept t : src.getType()) tgt.addType(VersionConvertor_10_50.convertCodeableConcept(t));
        if (src.hasActor())
            tgt.setActor(VersionConvertor_10_50.convertReference(src.getActor()));
        if (src.hasRequired())
            tgt.setRequired(convertParticipantRequired(src.getRequired()));
        if (src.hasStatus())
            tgt.setStatus(convertParticipationStatus(src.getStatus()));
        return tgt;
    }

    public static org.hl7.fhir.r5.model.Appointment.AppointmentParticipantComponent convertAppointmentParticipantComponent(org.hl7.fhir.dstu2.model.Appointment.AppointmentParticipantComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.r5.model.Appointment.AppointmentParticipantComponent tgt = new org.hl7.fhir.r5.model.Appointment.AppointmentParticipantComponent();
        VersionConvertor_10_50.copyElement(src, tgt);
        for (org.hl7.fhir.dstu2.model.CodeableConcept t : src.getType()) tgt.addType(VersionConvertor_10_50.convertCodeableConcept(t));
        if (src.hasActor())
            tgt.setActor(VersionConvertor_10_50.convertReference(src.getActor()));
        if (src.hasRequired())
            tgt.setRequired(convertParticipantRequired(src.getRequired()));
        if (src.hasStatus())
            tgt.setStatus(convertParticipationStatus(src.getStatus()));
        return tgt;
    }

    public static org.hl7.fhir.r5.model.Appointment.AppointmentStatus convertAppointmentStatus(org.hl7.fhir.dstu2.model.Appointment.AppointmentStatus src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case PROPOSED:
                return org.hl7.fhir.r5.model.Appointment.AppointmentStatus.PROPOSED;
            case PENDING:
                return org.hl7.fhir.r5.model.Appointment.AppointmentStatus.PENDING;
            case BOOKED:
                return org.hl7.fhir.r5.model.Appointment.AppointmentStatus.BOOKED;
            case ARRIVED:
                return org.hl7.fhir.r5.model.Appointment.AppointmentStatus.ARRIVED;
            case FULFILLED:
                return org.hl7.fhir.r5.model.Appointment.AppointmentStatus.FULFILLED;
            case CANCELLED:
                return org.hl7.fhir.r5.model.Appointment.AppointmentStatus.CANCELLED;
            case NOSHOW:
                return org.hl7.fhir.r5.model.Appointment.AppointmentStatus.NOSHOW;
            default:
                return org.hl7.fhir.r5.model.Appointment.AppointmentStatus.NULL;
        }
    }

    public static org.hl7.fhir.dstu2.model.Appointment.AppointmentStatus convertAppointmentStatus(org.hl7.fhir.r5.model.Appointment.AppointmentStatus src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case PROPOSED:
                return org.hl7.fhir.dstu2.model.Appointment.AppointmentStatus.PROPOSED;
            case PENDING:
                return org.hl7.fhir.dstu2.model.Appointment.AppointmentStatus.PENDING;
            case BOOKED:
                return org.hl7.fhir.dstu2.model.Appointment.AppointmentStatus.BOOKED;
            case ARRIVED:
                return org.hl7.fhir.dstu2.model.Appointment.AppointmentStatus.ARRIVED;
            case FULFILLED:
                return org.hl7.fhir.dstu2.model.Appointment.AppointmentStatus.FULFILLED;
            case CANCELLED:
                return org.hl7.fhir.dstu2.model.Appointment.AppointmentStatus.CANCELLED;
            case NOSHOW:
                return org.hl7.fhir.dstu2.model.Appointment.AppointmentStatus.NOSHOW;
            default:
                return org.hl7.fhir.dstu2.model.Appointment.AppointmentStatus.NULL;
        }
    }

    public static org.hl7.fhir.dstu2.model.Appointment.ParticipantRequired convertParticipantRequired(org.hl7.fhir.r5.model.Appointment.ParticipantRequired src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case REQUIRED:
                return org.hl7.fhir.dstu2.model.Appointment.ParticipantRequired.REQUIRED;
            case OPTIONAL:
                return org.hl7.fhir.dstu2.model.Appointment.ParticipantRequired.OPTIONAL;
            case INFORMATIONONLY:
                return org.hl7.fhir.dstu2.model.Appointment.ParticipantRequired.INFORMATIONONLY;
            default:
                return org.hl7.fhir.dstu2.model.Appointment.ParticipantRequired.NULL;
        }
    }

    public static org.hl7.fhir.r5.model.Appointment.ParticipantRequired convertParticipantRequired(org.hl7.fhir.dstu2.model.Appointment.ParticipantRequired src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case REQUIRED:
                return org.hl7.fhir.r5.model.Appointment.ParticipantRequired.REQUIRED;
            case OPTIONAL:
                return org.hl7.fhir.r5.model.Appointment.ParticipantRequired.OPTIONAL;
            case INFORMATIONONLY:
                return org.hl7.fhir.r5.model.Appointment.ParticipantRequired.INFORMATIONONLY;
            default:
                return org.hl7.fhir.r5.model.Appointment.ParticipantRequired.NULL;
        }
    }

    public static org.hl7.fhir.r5.model.Enumerations.ParticipationStatus convertParticipationStatus(org.hl7.fhir.dstu2.model.Appointment.ParticipationStatus src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case ACCEPTED:
                return org.hl7.fhir.r5.model.Enumerations.ParticipationStatus.ACCEPTED;
            case DECLINED:
                return org.hl7.fhir.r5.model.Enumerations.ParticipationStatus.DECLINED;
            case TENTATIVE:
                return org.hl7.fhir.r5.model.Enumerations.ParticipationStatus.TENTATIVE;
            case NEEDSACTION:
                return org.hl7.fhir.r5.model.Enumerations.ParticipationStatus.NEEDSACTION;
            default:
                return org.hl7.fhir.r5.model.Enumerations.ParticipationStatus.NULL;
        }
    }

    public static org.hl7.fhir.dstu2.model.Appointment.ParticipationStatus convertParticipationStatus(org.hl7.fhir.r5.model.Enumerations.ParticipationStatus src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case ACCEPTED:
                return org.hl7.fhir.dstu2.model.Appointment.ParticipationStatus.ACCEPTED;
            case DECLINED:
                return org.hl7.fhir.dstu2.model.Appointment.ParticipationStatus.DECLINED;
            case TENTATIVE:
                return org.hl7.fhir.dstu2.model.Appointment.ParticipationStatus.TENTATIVE;
            case NEEDSACTION:
                return org.hl7.fhir.dstu2.model.Appointment.ParticipationStatus.NEEDSACTION;
            default:
                return org.hl7.fhir.dstu2.model.Appointment.ParticipationStatus.NULL;
        }
    }
}
