package com.ayo4u.restful.webservice.conversion.ayo4urestfulwebserviceconversion.service;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import com.ayo4u.restful.webservice.conversion.ayo4urestfulwebserviceconversion.model.ConversionModel;

@ExtendWith(MockitoExtension.class)
public class ConversionServiceImplTest {

	@InjectMocks
	private ConversionServiceImpl conversionService;
	
		
	@Test
	@DisplayName("Test should pass when we convert from 500 Meters to Kilometers with expected results being 5")
	void testConvertMetersToKilometers() {
		// Setup fixtures and expectations
		double meters = 5000;		
		double expectedKilometers = 5;
		
		// SUT--
		double returnValue = conversionService.doConversion(new ConversionModel("METER", "KILOMETER", meters));
		
		// Verify behavior
		assertTrue(expectedKilometers==returnValue);
	}
	
	@Test
	@DisplayName("Test should fail in the event that the conversion metrics don't match up or align")
	void testDoConversionThrowsException() {
		// Setup fixtures and expectations
		double meters = 5000;
		
		// SUT-- Verify behavior
		assertThrows(IllegalArgumentException.class, ()->conversionService.doConversion(new ConversionModel("METER", "CELCIUS", meters)));
	}
	
	@Test
	@DisplayName("Test should pass when the converted 5000 kilometers to meters is 5mil")
	void testConvertKilometersToMeters() {
		// Setup fixtures and expectations
		double kilometers = 5000;		
		double expectedMeters = 5000000;
		
		// SUT--
		double returnValue = conversionService.doConversion(new ConversionModel("KILOMETER", "METER", kilometers));
		
		// Verify behavior
		assertTrue(expectedMeters==returnValue);
	}
	
	@Test
	@DisplayName("Test should pass when the 500 grams to kilograms returns 5")
	void testConvertGramsToKilograms() {
		// Setup fixtures and expectations
		double grams = 5000;		
		double expectedKilograms = 5;
		
		// SUT--
		double returnValue = conversionService.doConversion(new ConversionModel("GRAMS", "KILOGRAM", grams));
		
		// Verify behavior
		assertTrue(expectedKilograms==returnValue);
	}
	
	@Test
	@DisplayName("Test should pass when the converted from 5000 kilogram to grams returns 5mil")
	void testConvertKilogramsToGrams() {
		// Setup fixtures and expectations
		double kilograms = 5000;		
		double expectedGrams = 5000000;
		
		// SUT--
		double returnValue = conversionService.doConversion(new ConversionModel("KILOGRAM", "GRAMS", kilograms));
		
		// Verify behavior
		assertTrue(expectedGrams==returnValue);
	}
	
	@Test
	@DisplayName("The Test should pass in the event that the converted 5000 milliliters to liters is 5")
	void testConvertMillilitersToLiters() {
		// Setup fixtures and expectations
		double milliliters = 5000;		
		double expectedLiters = 5;
		
		// SUT--
		double returnValue = conversionService.doConversion(new ConversionModel("MILLILITER", "LITER", milliliters));
		
		// Verify behavior
		assertTrue(expectedLiters==returnValue);
	}
	
	@Test
	@DisplayName("The Test should pass when the liters converted to milliliters is equal to 5mil")
	void testConvertLitersToMilliliter() {
		// Setup fixtures and expectations
		double liters = 5000;		
		double expectedMilliliters = 5000000;
		
		// SUT--
		double returnValue = conversionService.doConversion(new ConversionModel("LITER", "MILLILITER", liters));
		
		// Verify behavior
		assertTrue(expectedMilliliters==returnValue);
	}
	
	@Test
	@DisplayName("Test should pass when the Celsius converted to Fahrenheit is equal to 209.48")
	void testConvertCelsiusToFahrenheit() {
		// Setup fixtures and expectations
		double celsius = 98.6;		
		double expectedFahrenheit = 209.48;
		
		// SUT--
		double returnValue = conversionService.doConversion(new ConversionModel("CELSIUS", "FAHRENHEIT", celsius));
		
		// Verify behavior
		assertTrue(expectedFahrenheit==returnValue);
	}
	
	@Test
	@DisplayName("Test should pass when the converted Fahrenheit to Celsius is as per expected result: 37 rounded off")
	void testConvertFahrenheitToCelsius() {
		// Setup fixtures and expectations
		double fahrenheit = 98.6;		
		double expectedCelsius = 36.99999999999999;
		
		// SUT--
		double returnValue = conversionService.doConversion(new ConversionModel("FAHRENHEIT", "CELSIUS", fahrenheit));
		
		// Verify behavior
		assertTrue(expectedCelsius==returnValue);
	}
	
	@Test
	@DisplayName("Test should pass when the converted kilometers per hour to miles per hour is as per the expected results: 93.2")
	void testConvertKilometersPerHourToMilesPerHour() {
		// Setup fixtures and expectations
		double kilometersPerHour = 150;		
		double expectedMilesPerHour = 93.20567883000001;
		
		// SUT--
		double returnValue = conversionService.doConversion(new ConversionModel("KILOMETERS_PER_HOUR", "MILES_PER_HOUR", kilometersPerHour));
		
		// Verify behavior
		assertTrue(expectedMilesPerHour==returnValue);
	}
	
	@Test
	@DisplayName("Test should pass when the converted miles per hour to kilometers per hour is equal to 241.35")
	void testConvertMilesPerHourToKilometersPerHour() {
		// Setup fixtures and expectations
		double milesPerHour = 150;		
		double expectedKilometersPerHour = 241.35;
		
		// SUT--
		double returnValue = conversionService.doConversion(new ConversionModel("MILES_PER_HOUR", "KILOMETERS_PER_HOUR", milesPerHour));
		
		// Verify behavior
		assertTrue(expectedKilometersPerHour==returnValue);
	}
}
