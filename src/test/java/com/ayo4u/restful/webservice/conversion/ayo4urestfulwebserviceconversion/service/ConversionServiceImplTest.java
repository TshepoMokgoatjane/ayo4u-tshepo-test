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
	
}
