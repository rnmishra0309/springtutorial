package com.base.springwithoutxml.service;

import com.base.springwithoutxml.model.Coach;
import com.base.springwithoutxml.model.FortuneService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

    static final Logger logger = LogManager.getLogger(SwimCoach.class);

    @Value("${coach.swim.name}")
    String coachName;
    FortuneService fortuneService;
    public SwimCoach(FortuneService happyFortuneService) {
        fortuneService = happyFortuneService;
    }

    public void getCoachName() {
        logger.info("Coach name is " + coachName);
    }

    public void getFortuneFromCoach() {
        logger.info(fortuneService.getFortuneQuote());
    }
}
