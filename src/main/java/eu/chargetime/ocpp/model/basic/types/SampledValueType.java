//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package eu.chargetime.ocpp.model.basic.types;

public class SampledValueType {
    private String measurand;
    private double value;
    private String context;
    private String phase;
    private LocationEnumType location;
    private SignedMeterValueType signedMeterValue;
    private UnitOfMeasureType unitOfMeasure;

    public SampledValueType() {
    }

    public String getMeasurand() {
        return this.measurand;
    }

    public void setMeasurand(String measurand) {
        this.measurand = measurand;
    }

    public double getValue() {
        return this.value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getContext() {
        return this.context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getPhase() {
        return this.phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public LocationEnumType getLocation() {
        return this.location;
    }

    public void setLocation(LocationEnumType location) {
        this.location = location;
    }

    public SignedMeterValueType getSignedMeterValue() {
        return this.signedMeterValue;
    }

    public void setSignedMeterValue(SignedMeterValueType signedMeterValue) {
        this.signedMeterValue = signedMeterValue;
    }

    public UnitOfMeasureType getUnitOfMeasure() {
        return this.unitOfMeasure;
    }

    public void setUnitOfMeasure(UnitOfMeasureType unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }
}
