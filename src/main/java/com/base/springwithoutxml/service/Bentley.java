package com.base.springwithoutxml.service;

import com.base.springwithoutxml.model.Car;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class Bentley implements Car {

    static final Logger logger = LogManager.getLogger(Bentley.class);

    public void getCarName() {
        logger.info("Car you have is Bentley.");
    }
}
