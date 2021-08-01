package eu.chargetime.ocpp.model.basic.types;

public class UnitOfMeasureType {
    private String unit;
    private Integer multiplier;

    public UnitOfMeasureType() {
    }

    public String getUnit() {
        return this.unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getMultiplier() {
        return this.multiplier;
    }

    public void setMultiplier(Integer multiplier) {
        this.multiplier = multiplier;
    }
}
