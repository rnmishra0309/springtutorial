package com.base.springwithoutxml;

import com.base.springwithoutxml.config.ApplicationConfig;
import com.base.springwithoutxml.config.ApplicationConfigWithoutComponentScan;
import com.base.springwithoutxml.model.Car;
import com.base.springwithoutxml.model.Coach;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    static final Logger logger = LogManager.getLogger(Application.class);

    public static void main(String[] args) {
        logger.info("Application starts.");
        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(ApplicationConfigWithoutComponentScan.class);

//        Car bentley = context.getBean("bentley", Car.class);
//        bentley.getCarName();

        Coach swimCoach = context.getBean("swimCoach", Coach.class);
        swimCoach.getCoachName();
        swimCoach.getFortuneFromCoach();

        context.close();
    }

}
