package com.ayo4u.restful.webservice.conversion.ayo4urestfulwebserviceconversion.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeConverterController {

	@GetMapping("homeConverter")
	public String homeConvert() {
		return "home-converter";
	}
}
