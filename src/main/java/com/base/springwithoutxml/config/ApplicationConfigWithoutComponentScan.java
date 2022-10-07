package com.base.springwithoutxml.config;

import com.base.springwithoutxml.model.FortuneService;
import com.base.springwithoutxml.service.HappyFortuneService;
import com.base.springwithoutxml.service.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:coach.properties")
public class ApplicationConfigWithoutComponentScan {

    @Bean
    public HappyFortuneService happyFortuneService() {
        return new HappyFortuneService();
    }

    @Bean
    public SwimCoach swimCoach(FortuneService happyFortuneService) {
        return new SwimCoach(happyFortuneService());
    }

}
