package com.rms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {
	
	@GetMapping("/rmsServiceFallBack")
	public String rmsServiceFallBackMethod() {
		return "RMS Service is taking longer than Expected. Please try again later";
	}

}
