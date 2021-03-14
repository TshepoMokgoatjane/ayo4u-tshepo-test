package com.ayo4u.restful.webservice.conversion.ayo4urestfulwebserviceconversion.model;

public enum Unit {

	METER("METER"), KILOMETER("KILOMETER"),
	GRAMS("GRAMS"), KILOGRAM("KILOGRAM"),
	LITER("LITER"), MILLILITER("MILLILITER"),
	CELSIUS("CELSIUS"), FAHRENHEIT("FAHRENHEIT"),
	KILOMETERS_PER_HOUR("KILOMETERS_PER_HOUR"), MILES_PER_HOUR("MILES_PER_HOUR");
	
	private final String conversionMetrics;
	
	private Unit(String conversionMetrics) {
		this.conversionMetrics = conversionMetrics;
	}

	public String getConversionMetrics() {
		return conversionMetrics;
	}
	
}
