package com.base.springwithoutxml.service;

import com.base.springwithoutxml.model.FortuneService;

public class HappyFortuneService implements FortuneService {

    public String getFortuneQuote() {
        return "Your day is great!!";
    }
}
