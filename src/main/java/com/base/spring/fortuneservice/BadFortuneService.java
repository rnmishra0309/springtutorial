package com.base.spring.fortuneservice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BadFortuneService implements FortuneService {
	
	static final Logger logger = LogManager.getLogger(BadFortuneService.class);

	public void getFortuneService() {
		logger.info("You should look out for bad omens!!");
	}

}
