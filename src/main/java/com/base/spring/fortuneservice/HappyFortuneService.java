package com.base.spring.fortuneservice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HappyFortuneService implements FortuneService {
	
	static final Logger logger = LogManager.getLogger(HappyFortuneService.class);

	public void getFortuneService() {
		logger.info("You will have a nice day.");
	}

}
