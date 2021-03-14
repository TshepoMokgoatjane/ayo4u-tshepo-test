package com.ayo4u.restful.webservice.conversion.ayo4urestfulwebserviceconversion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ayo4u.restful.webservice.conversion.ayo4urestfulwebserviceconversion.model.ConversionModel;
import com.ayo4u.restful.webservice.conversion.ayo4urestfulwebserviceconversion.service.ConversionService;

@RestController
@RequestMapping(path="api/v1")
public class ConversionController {
	
	@Autowired
	private ConversionService service;

	@RequestMapping(path = "/convert-metric",
    method = RequestMethod.POST,
    consumes = {"application/json"}, produces = {"application/json"})
	public ResponseEntity<Double> convertMetrics(@RequestBody ConversionModel request) {
		return ResponseEntity.ok().body(service.doConversion(request));
	}
}
