package com.ayo4u.restful.webservice.conversion.ayo4urestfulwebserviceconversion.service;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
	void testDoConversionThrowsException() {
		// Setup fixtures and expectations
		double meters = 5000;
		
		// SUT-- Verify behavior
		assertThrows(IllegalArgumentException.class, ()->conversionService.doConversion(new ConversionModel("METER", "CELCIUS", meters)));
	}
	
	@Test
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
