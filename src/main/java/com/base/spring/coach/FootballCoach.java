package com.base.spring.coach;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.base.spring.fortuneservice.FortuneService;

public class FootballCoach implements Coach {
	
	static final Logger logger = LogManager.getLogger(FootballCoach.class);
	
	private FortuneService fortuneService;
	private FortuneService alternateFortune;
	private String emailAddress;
	private String name;
	
	public FootballCoach() {
		
	}
	
	public FootballCoach(FortuneService fortuneService) {
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

	public void getDailyActivity() {
		logger.info("Get some dribbling practice for 3 hours.");
		logger.info("Today's fortune is: ");
		this.fortuneService.getFortuneService();
		logger.info("Your alternate fortune is: ");
		this.alternateFortune.getFortuneService();
		logger.info("Thanks and regards: " + this.name + " " + this.emailAddress);
	}
	
	public void startupBeanCode() {
		logger.info("Inside football startup code");
	}
	
	public void doShutDownBeanCode() {
		logger.info("Inside football shutdown code");
	}
	
}
