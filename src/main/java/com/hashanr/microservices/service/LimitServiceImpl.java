package com.hashanr.microservices.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hashanr.microservices.model.Configuration;
import com.hashanr.microservices.model.LimitConfiguration;

@Service
public class LimitServiceImpl implements LimitService {

	@Autowired
	private Configuration configuration;
	
	@Override
	public LimitConfiguration retriveLimitsFromConfiguration() {
		
		return new LimitConfiguration(configuration.getMaximum(),configuration.getMinimum());
		
	}

}
