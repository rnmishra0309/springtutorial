package com.base.spring.componentscanning;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	static final Logger logger = LogManager.getLogger(MainClass.class);

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Car bentley = context.getBean("myCar", Car.class);
		
		logger.info(bentley.getBrandName());
		logger.info(bentley.getRunningStatus());
		
		Car mercedes = context.getBean("mercedes", Car.class);
		logger.info(mercedes.getBrandName());
		logger.info(mercedes.getRunningStatus());
		
		context.close();
		
	}

}
