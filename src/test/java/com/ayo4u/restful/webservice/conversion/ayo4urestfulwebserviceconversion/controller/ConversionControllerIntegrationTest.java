package com.ayo4u.restful.webservice.conversion.ayo4urestfulwebserviceconversion.controller;

import static org.mockito.ArgumentMatchers.any;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.ayo4u.restful.webservice.conversion.ayo4urestfulwebserviceconversion.model.ConversionModel;
import com.ayo4u.restful.webservice.conversion.ayo4urestfulwebserviceconversion.service.ConversionService;
import com.fasterxml.jackson.databind.ObjectMapper;

@ExtendWith(MockitoExtension.class)
public class ConversionControllerIntegrationTest {

	@Mock
	private ConversionService conversionService;
	
	@InjectMocks
	private ConversionController conversionController;
	
	private MockMvc mockMvc;
	
	@BeforeEach
	void setUp() {
		mockMvc = MockMvcBuilders.standaloneSetup(conversionController).build();
	}
	
	@Test
	void testConvertMetrics() throws Exception {
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		Mockito.when(conversionService.doConversion(any(ConversionModel.class)))
				.thenReturn(550.25);
		
		mockMvc.perform(post("/api/v1/convert-metric")
				.contentType(MediaType.APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(getRequest())))
	            .andExpect(status().isOk())
	            .andReturn();
	}
	            
	private ConversionModel getRequest() {
		return new ConversionModel("METER", "KILOMETER",500); 
	}
}
