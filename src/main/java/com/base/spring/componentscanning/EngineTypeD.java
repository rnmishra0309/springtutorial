package com.base.spring.componentscanning;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class EngineTypeD implements Engine {

	static final Logger logger = LogManager.getLogger(EngineTypeD.class);
	public EngineTypeD() {
		logger.info("Inside Constructor");
	}
	@PostConstruct
	public void init() {
		logger.info("Inside post construct");
	}

	public String getEngineType() {
		return "The Engine is: D6";
	}

	@PreDestroy
	public void destroy() {
		logger.info("Inside Predestroy.");
	}
	
}
