package com.ayo4u.restful.webservice.conversion.ayo4urestfulwebserviceconversion.model;

public enum Unit {

	METER("METER"), KILOMETER("KILOMETER"),
	GRAMS("GRAMS"), KILOGRAM("KILOGRAM"),
	LITER("LITER"), MILLILITER("MILLILITER"),
	CELSIUS("CELSIUS"), FAHRENHEIT("FAHRENHEIT");
	
	private final String conversionMetrics;
	
	private Unit(String conversionMetrics) {
		this.conversionMetrics = conversionMetrics;
	}

	public String getConversionMetrics() {
		return conversionMetrics;
	}
	
}
