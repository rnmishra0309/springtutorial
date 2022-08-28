package com.base.spring.coach;

import org.apache.logging.log4j.Logger;

import com.base.spring.fortuneservice.FortuneService;

import org.apache.logging.log4j.LogManager;

public class BaseBallCoach implements Coach {
	
	static final Logger logger = LogManager.getLogger(BaseBallCoach.class);
	
	private FortuneService fortuneService;
	private FortuneService alternateFortune;
	private String emailAddress;
	private String name;

	public BaseBallCoach() {
		
	}
	
	public BaseBallCoach(FortuneService fortuneService) {
		setFortuneService(fortuneService);
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public FortuneService getAlternateFortune() {
		return alternateFortune;
	}

	public void setAlternateFortune(FortuneService alternateFortune) {
		this.alternateFortune = alternateFortune;
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void startupBeanCode() {
		logger.info("Inside baseball startup code");
	}
	
	public void doShutDownBeanCode() {
		logger.info("Inside baseball shutdown code");
	}

	public void getDailyActivity() {
		logger.info("Get some batting practice for 2 hours.");
		logger.info("Today's fortune is: ");
		this.fortuneService.getFortuneService();
		logger.info("Your alternate fortune is: ");
		this.alternateFortune.getFortuneService();
		logger.info("Thanks and regards: " + this.name + " " + this.emailAddress);
	}

}
