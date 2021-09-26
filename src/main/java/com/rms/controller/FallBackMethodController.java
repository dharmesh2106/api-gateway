package com.rms.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rms.utils.CommonValues;

@RestController
public class FallBackMethodController {
	
	private static final Logger logger = LoggerFactory.getLogger(FallBackMethodController.class);

//	@RequestMapping(value = "/")
//	@HystrixCommand(commandProperties = {
//			@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "10000") })
//	public String hello() throws InterruptedException {
//		Thread.sleep(3000);
//		return "Welcome Hystrix";
//	}

	@GetMapping("/rmsServiceFallBack")
//	@HystrixCommand(commandProperties = {
//			@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "10000") })
	public String rmsServiceFallBackMethod() {
		logger.info("RMS Service FallBack, {}", CommonValues.RMS_SERVICE_FAILD);
		return CommonValues.RMS_SERVICE_FAILD;
	}

}
