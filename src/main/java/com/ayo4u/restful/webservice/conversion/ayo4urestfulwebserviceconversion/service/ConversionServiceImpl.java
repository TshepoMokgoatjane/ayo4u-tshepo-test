package com.ayo4u.restful.webservice.conversion.ayo4urestfulwebserviceconversion.service;

import org.springframework.stereotype.Service;

import com.ayo4u.restful.webservice.conversion.ayo4urestfulwebserviceconversion.model.ConversionModel;
import com.ayo4u.restful.webservice.conversion.ayo4urestfulwebserviceconversion.model.Unit;

@Service
public class ConversionServiceImpl implements ConversionService {

	private static final double METERS_TO_KILOMETERS = 0.001;
	private static final double KILOMETERS_TO_METERS = 1000;
	
	private static final double GRAMS_TO_KILOGRAMS = 0.001;
	private static final double KILOGRAMS_TO_GRAMS = 1000;
	
	private static final double MILLILITERS_TO_LITERS = 0.001;
	private static final double LITERS_TO_MILLILITERS = 1000;
	
	private static final double KILOMETERS_PER_HOUR_TO_MILES_PER_HOUR = 0.6213711922;
	private static final double MILES_PER_HOUR_TO_KILOMETERS_PER_HOUR = 1.609;
	
	private static final double CELSIUS_TO_FAHRENHEIT = 1.8;
	private static final double FAHRENHEIT_TO_CELSIUS = 1.8;
	private static final double TEMPERATURE = 32;

	@Override
	public Double doConversion(ConversionModel request) {
		
		if(Unit.valueOf(request.getFromUnit()).equals(Unit.KILOMETER) && Unit.valueOf(request.getToUnit()).equals(Unit.METER)) {
			return convertKilometersToMeters(request.getValue());
		} 		
		else if(Unit.valueOf(request.getFromUnit()).equals(Unit.METER) && Unit.valueOf(request.getToUnit()).equals(Unit.KILOMETER)) {
			return convertMetersToKilometers(request.getValue());
		} 
		
		else if(Unit.valueOf(request.getFromUnit()).equals(Unit.GRAMS) && Unit.valueOf(request.getToUnit()).equals(Unit.KILOGRAM)) {
			return convertGramsToKilograms(request.getValue());
		} 
		else if(Unit.valueOf(request.getFromUnit()).equals(Unit.KILOGRAM) && Unit.valueOf(request.getToUnit()).equals(Unit.GRAMS)) {
			return convertKilogramsToGrams(request.getValue());
		} 
		
		else if(Unit.valueOf(request.getFromUnit()).equals(Unit.MILLILITER) && Unit.valueOf(request.getToUnit()).equals(Unit.LITER)) {
			return convertMillilitersToLiters(request.getValue());
		} 
		else if(Unit.valueOf(request.getFromUnit()).equals(Unit.LITER) && Unit.valueOf(request.getToUnit()).equals(Unit.MILLILITER)) {
			return convertLitersToMilliliters(request.getValue());
		}  
		
		else if(Unit.valueOf(request.getFromUnit()).equals(Unit.CELSIUS) && Unit.valueOf(request.getToUnit()).equals(Unit.FAHRENHEIT)) {
			return convertCelsiusToFahrenheit(request.getValue());
		} 
		else if(Unit.valueOf(request.getFromUnit()).equals(Unit.FAHRENHEIT) && Unit.valueOf(request.getToUnit()).equals(Unit.CELSIUS)) {
			return convertFahrenheitToCelsius(request.getValue());
		}
		
		else if(Unit.valueOf(request.getFromUnit()).equals(Unit.KILOMETERS_PER_HOUR) && Unit.valueOf(request.getToUnit()).equals(Unit.MILES_PER_HOUR)) {
			return convertKilometersPerHourToMilesPerHour(request.getValue());
		} 
		else if(Unit.valueOf(request.getFromUnit()).equals(Unit.MILES_PER_HOUR) && Unit.valueOf(request.getToUnit()).equals(Unit.KILOMETERS_PER_HOUR)) {
			return convertMilesPerHourToKilometersPerHour(request.getValue());
		}
		
		else {
			throw new IllegalArgumentException("Invalid Conversion Request!");
		}		
	}
	
	private double convertMetersToKilometers(double input) {		
		return input * METERS_TO_KILOMETERS;
	}

	private double convertKilometersToMeters(double input) {		
		return input * KILOMETERS_TO_METERS;
	}
	
	private double convertGramsToKilograms(double input) {		
		return input * GRAMS_TO_KILOGRAMS;
	}

	private double convertKilogramsToGrams(double input) {		
		return input * KILOGRAMS_TO_GRAMS;
	}
	
	private double convertMillilitersToLiters(double input) {		
		return input * MILLILITERS_TO_LITERS;
	}

	private double convertLitersToMilliliters(double input) {		
		return input * LITERS_TO_MILLILITERS;
	}
	
	private double convertCelsiusToFahrenheit(double input) {		
		return (input * CELSIUS_TO_FAHRENHEIT) + TEMPERATURE;
	}

	private double convertFahrenheitToCelsius(double input) {		
		return (input - TEMPERATURE) / FAHRENHEIT_TO_CELSIUS;
	}
	
	private double convertKilometersPerHourToMilesPerHour(double input) {		
		return input * KILOMETERS_PER_HOUR_TO_MILES_PER_HOUR;
	}

	private double convertMilesPerHourToKilometersPerHour(double input) {		
		return input * MILES_PER_HOUR_TO_KILOMETERS_PER_HOUR;
	}
}