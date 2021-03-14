package com.ayo4u.restful.webservice.conversion.ayo4urestfulwebserviceconversion.model;
public class ConversionModel {
	
	private String fromUnit;
	private String toUnit;
	private double value;
	
	public ConversionModel() {
		super();
	}

	public ConversionModel(String fromUnit, String toUnit, double value) {
		super();
		this.fromUnit = fromUnit;
		this.toUnit = toUnit;
		this.value = value;
	}

	public String getFromUnit() {
		return fromUnit;
	}

	public void setFromUnit(String fromUnit) {
		this.fromUnit = fromUnit;
	}

	public String getToUnit() {
		return toUnit;
	}

	public void setToUnit(String toUnit) {
		this.toUnit = toUnit;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "ConversionModel [fromUnit=" + fromUnit + ", toUnit=" + toUnit + ", value=" + value + "]";
	}	
}