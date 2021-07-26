package com.example;

import java.util.concurrent.atomic.AtomicLong;

//import com.microsoft.applicationinsights.TelemetryClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class GreetingController {

	
	@Autowired

	//TelemetryClient telemetryClient;


	

	@GetMapping("/greetings")
	public String greetings() {

//		logger.trace("greetings trace");
//		logger.warn("greetings warning");
//		logger.info("greetings info"); //if you set info, [info, warn, error] will show
//		logger.debug("greetings debug");
//		logger.error("greetings error");
//
//		telemetryClient.trackEvent("URI /greeting is triggered");
		return "Hello World!";
	}

	

}
