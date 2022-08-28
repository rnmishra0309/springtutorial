package com.base.spring.coach;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyCoach {
	
	static final Logger logger = LogManager.getLogger(MyCoach.class);
	
	public static void main(String[] args) {
		// This is if spring doesnt exists.
		// Coach coach = new BaseBallCoach();
		// coach.getDailyActivity();
		
		// Using Spring
		// get the ApplicationContext file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		// Load the spring beans
		Coach myCoach = context.getBean("myCoach", Coach.class);
		// Use the beans
		myCoach.getDailyActivity();
		// close the context
		context.close();
	}
	
}
