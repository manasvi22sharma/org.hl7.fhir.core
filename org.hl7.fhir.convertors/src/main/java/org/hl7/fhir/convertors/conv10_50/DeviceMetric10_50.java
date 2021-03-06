package org.hl7.fhir.convertors.conv10_50;

import org.hl7.fhir.convertors.VersionConvertor_10_50;
import org.hl7.fhir.exceptions.FHIRException;

public class DeviceMetric10_50 {

    public static org.hl7.fhir.dstu2.model.DeviceMetric convertDeviceMetric(org.hl7.fhir.r5.model.DeviceMetric src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2.model.DeviceMetric tgt = new org.hl7.fhir.dstu2.model.DeviceMetric();
        VersionConvertor_10_50.copyDomainResource(src, tgt);
        if (src.hasType())
            tgt.setType(VersionConvertor_10_50.convertCodeableConcept(src.getType()));
        if (src.hasIdentifier())
            tgt.setIdentifier(VersionConvertor_10_50.convertIdentifier(src.getIdentifierFirstRep()));
        if (src.hasUnit())
            tgt.setUnit(VersionConvertor_10_50.convertCodeableConcept(src.getUnit()));
        if (src.hasSource())
            tgt.setSource(VersionConvertor_10_50.convertReference(src.getSource()));
        if (src.hasParent())
            tgt.setParent(VersionConvertor_10_50.convertReference(src.getParent()));
        if (src.hasOperationalStatus())
            tgt.setOperationalStatus(convertDeviceMetricOperationalStatus(src.getOperationalStatus()));
        if (src.hasColor())
            tgt.setColor(convertDeviceMetricColor(src.getColor()));
        if (src.hasCategory())
            tgt.setCategory(convertDeviceMetricCategory(src.getCategory()));
        if (src.hasMeasurementPeriod())
            tgt.setMeasurementPeriod(VersionConvertor_10_50.convertTiming(src.getMeasurementPeriod()));
        for (org.hl7.fhir.r5.model.DeviceMetric.DeviceMetricCalibrationComponent t : src.getCalibration()) tgt.addCalibration(convertDeviceMetricCalibrationComponent(t));
        return tgt;
    }

    public static org.hl7.fhir.r5.model.DeviceMetric convertDeviceMetric(org.hl7.fhir.dstu2.model.DeviceMetric src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.r5.model.DeviceMetric tgt = new org.hl7.fhir.r5.model.DeviceMetric();
        VersionConvertor_10_50.copyDomainResource(src, tgt);
        if (src.hasType())
            tgt.setType(VersionConvertor_10_50.convertCodeableConcept(src.getType()));
        if (src.hasIdentifier())
            tgt.addIdentifier(VersionConvertor_10_50.convertIdentifier(src.getIdentifier()));
        if (src.hasUnit())
            tgt.setUnit(VersionConvertor_10_50.convertCodeableConcept(src.getUnit()));
        if (src.hasSource())
            tgt.setSource(VersionConvertor_10_50.convertReference(src.getSource()));
        if (src.hasParent())
            tgt.setParent(VersionConvertor_10_50.convertReference(src.getParent()));
        if (src.hasOperationalStatus())
            tgt.setOperationalStatus(convertDeviceMetricOperationalStatus(src.getOperationalStatus()));
        if (src.hasColor())
            tgt.setColor(convertDeviceMetricColor(src.getColor()));
        if (src.hasCategory())
            tgt.setCategory(convertDeviceMetricCategory(src.getCategory()));
        if (src.hasMeasurementPeriod())
            tgt.setMeasurementPeriod(VersionConvertor_10_50.convertTiming(src.getMeasurementPeriod()));
        for (org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricCalibrationComponent t : src.getCalibration()) tgt.addCalibration(convertDeviceMetricCalibrationComponent(t));
        return tgt;
    }

    public static org.hl7.fhir.r5.model.DeviceMetric.DeviceMetricCalibrationComponent convertDeviceMetricCalibrationComponent(org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricCalibrationComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.r5.model.DeviceMetric.DeviceMetricCalibrationComponent tgt = new org.hl7.fhir.r5.model.DeviceMetric.DeviceMetricCalibrationComponent();
        VersionConvertor_10_50.copyElement(src, tgt);
        if (src.hasType())
            tgt.setType(convertDeviceMetricCalibrationType(src.getType()));
        if (src.hasState())
            tgt.setState(convertDeviceMetricCalibrationState(src.getState()));
        if (src.hasTimeElement())
            tgt.setTimeElement(VersionConvertor_10_50.convertInstant(src.getTimeElement()));
        return tgt;
    }

    public static org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricCalibrationComponent convertDeviceMetricCalibrationComponent(org.hl7.fhir.r5.model.DeviceMetric.DeviceMetricCalibrationComponent src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricCalibrationComponent tgt = new org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricCalibrationComponent();
        VersionConvertor_10_50.copyElement(src, tgt);
        if (src.hasType())
            tgt.setType(convertDeviceMetricCalibrationType(src.getType()));
        if (src.hasState())
            tgt.setState(convertDeviceMetricCalibrationState(src.getState()));
        if (src.hasTimeElement())
            tgt.setTimeElement(VersionConvertor_10_50.convertInstant(src.getTimeElement()));
        return tgt;
    }

    public static org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricCalibrationState convertDeviceMetricCalibrationState(org.hl7.fhir.r5.model.DeviceMetric.DeviceMetricCalibrationState src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case NOTCALIBRATED:
                return org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricCalibrationState.NOTCALIBRATED;
            case CALIBRATIONREQUIRED:
                return org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricCalibrationState.CALIBRATIONREQUIRED;
            case CALIBRATED:
                return org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricCalibrationState.CALIBRATED;
            case UNSPECIFIED:
                return org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricCalibrationState.UNSPECIFIED;
            default:
                return org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricCalibrationState.NULL;
        }
    }

    public static org.hl7.fhir.r5.model.DeviceMetric.DeviceMetricCalibrationState convertDeviceMetricCalibrationState(org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricCalibrationState src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case NOTCALIBRATED:
                return org.hl7.fhir.r5.model.DeviceMetric.DeviceMetricCalibrationState.NOTCALIBRATED;
            case CALIBRATIONREQUIRED:
                return org.hl7.fhir.r5.model.DeviceMetric.DeviceMetricCalibrationState.CALIBRATIONREQUIRED;
            case CALIBRATED:
                return org.hl7.fhir.r5.model.DeviceMetric.DeviceMetricCalibrationState.CALIBRATED;
            case UNSPECIFIED:
                return org.hl7.fhir.r5.model.DeviceMetric.DeviceMetricCalibrationState.UNSPECIFIED;
            default:
                return org.hl7.fhir.r5.model.DeviceMetric.DeviceMetricCalibrationState.NULL;
        }
    }

    public static org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricCalibrationType convertDeviceMetricCalibrationType(org.hl7.fhir.r5.model.DeviceMetric.DeviceMetricCalibrationType src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case UNSPECIFIED:
                return org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricCalibrationType.UNSPECIFIED;
            case OFFSET:
                return org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricCalibrationType.OFFSET;
            case GAIN:
                return org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricCalibrationType.GAIN;
            case TWOPOINT:
                return org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricCalibrationType.TWOPOINT;
            default:
                return org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricCalibrationType.NULL;
        }
    }

    public static org.hl7.fhir.r5.model.DeviceMetric.DeviceMetricCalibrationType convertDeviceMetricCalibrationType(org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricCalibrationType src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case UNSPECIFIED:
                return org.hl7.fhir.r5.model.DeviceMetric.DeviceMetricCalibrationType.UNSPECIFIED;
            case OFFSET:
                return org.hl7.fhir.r5.model.DeviceMetric.DeviceMetricCalibrationType.OFFSET;
            case GAIN:
                return org.hl7.fhir.r5.model.DeviceMetric.DeviceMetricCalibrationType.GAIN;
            case TWOPOINT:
                return org.hl7.fhir.r5.model.DeviceMetric.DeviceMetricCalibrationType.TWOPOINT;
            default:
                return org.hl7.fhir.r5.model.DeviceMetric.DeviceMetricCalibrationType.NULL;
        }
    }

    public static org.hl7.fhir.r5.model.DeviceMetric.DeviceMetricCategory convertDeviceMetricCategory(org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricCategory src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case MEASUREMENT:
                return org.hl7.fhir.r5.model.DeviceMetric.DeviceMetricCategory.MEASUREMENT;
            case SETTING:
                return org.hl7.fhir.r5.model.DeviceMetric.DeviceMetricCategory.SETTING;
            case CALCULATION:
                return org.hl7.fhir.r5.model.DeviceMetric.DeviceMetricCategory.CALCULATION;
            case UNSPECIFIED:
                return org.hl7.fhir.r5.model.DeviceMetric.DeviceMetricCategory.UNSPECIFIED;
            default:
                return org.hl7.fhir.r5.model.DeviceMetric.DeviceMetricCategory.NULL;
        }
    }

    public static org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricCategory convertDeviceMetricCategory(org.hl7.fhir.r5.model.DeviceMetric.DeviceMetricCategory src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case MEASUREMENT:
                return org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricCategory.MEASUREMENT;
            case SETTING:
                return org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricCategory.SETTING;
            case CALCULATION:
                return org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricCategory.CALCULATION;
            case UNSPECIFIED:
                return org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricCategory.UNSPECIFIED;
            default:
                return org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricCategory.NULL;
        }
    }

    public static org.hl7.fhir.r5.model.DeviceMetric.DeviceMetricColor convertDeviceMetricColor(org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricColor src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case BLACK:
                return org.hl7.fhir.r5.model.DeviceMetric.DeviceMetricColor.BLACK;
            case RED:
                return org.hl7.fhir.r5.model.DeviceMetric.DeviceMetricColor.RED;
            case GREEN:
                return org.hl7.fhir.r5.model.DeviceMetric.DeviceMetricColor.GREEN;
            case YELLOW:
                return org.hl7.fhir.r5.model.DeviceMetric.DeviceMetricColor.YELLOW;
            case BLUE:
                return org.hl7.fhir.r5.model.DeviceMetric.DeviceMetricColor.BLUE;
            case MAGENTA:
                return org.hl7.fhir.r5.model.DeviceMetric.DeviceMetricColor.MAGENTA;
            case CYAN:
                return org.hl7.fhir.r5.model.DeviceMetric.DeviceMetricColor.CYAN;
            case WHITE:
                return org.hl7.fhir.r5.model.DeviceMetric.DeviceMetricColor.WHITE;
            default:
                return org.hl7.fhir.r5.model.DeviceMetric.DeviceMetricColor.NULL;
        }
    }

    public static org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricColor convertDeviceMetricColor(org.hl7.fhir.r5.model.DeviceMetric.DeviceMetricColor src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case BLACK:
                return org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricColor.BLACK;
            case RED:
                return org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricColor.RED;
            case GREEN:
                return org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricColor.GREEN;
            case YELLOW:
                return org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricColor.YELLOW;
            case BLUE:
                return org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricColor.BLUE;
            case MAGENTA:
                return org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricColor.MAGENTA;
            case CYAN:
                return org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricColor.CYAN;
            case WHITE:
                return org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricColor.WHITE;
            default:
                return org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricColor.NULL;
        }
    }

    public static org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricOperationalStatus convertDeviceMetricOperationalStatus(org.hl7.fhir.r5.model.DeviceMetric.DeviceMetricOperationalStatus src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case ON:
                return org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricOperationalStatus.ON;
            case OFF:
                return org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricOperationalStatus.OFF;
            case STANDBY:
                return org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricOperationalStatus.STANDBY;
            default:
                return org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricOperationalStatus.NULL;
        }
    }

    public static org.hl7.fhir.r5.model.DeviceMetric.DeviceMetricOperationalStatus convertDeviceMetricOperationalStatus(org.hl7.fhir.dstu2.model.DeviceMetric.DeviceMetricOperationalStatus src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case ON:
                return org.hl7.fhir.r5.model.DeviceMetric.DeviceMetricOperationalStatus.ON;
            case OFF:
                return org.hl7.fhir.r5.model.DeviceMetric.DeviceMetricOperationalStatus.OFF;
            case STANDBY:
                return org.hl7.fhir.r5.model.DeviceMetric.DeviceMetricOperationalStatus.STANDBY;
            default:
                return org.hl7.fhir.r5.model.DeviceMetric.DeviceMetricOperationalStatus.NULL;
        }
    }
}
