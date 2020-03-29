package com.hashanr.microservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hashanr.microservices.model.Configuration;
import com.hashanr.microservices.model.LimitConfiguration;
import com.hashanr.microservices.service.LimitService;

@RestController
//@RequestMapping("/limits")
public class LimitController {
	
	@Autowired
	private LimitService limitService;
	
	@GetMapping("/limits")
	public LimitConfiguration retriveLimitsFromConfiguration() {
		return limitService.retriveLimitsFromConfiguration();
	}
	
	//@GetMapping("/tests")
	public String test()
	{
		return "Hello World!";
	}

}
