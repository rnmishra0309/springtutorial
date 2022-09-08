package com.base.spring.componentscanning;

import org.springframework.stereotype.Component;

@Component
public class EngineTypeD implements Engine {

	@Override
	public String getEngineType() {
		return "The Engine is: D6";
	}
	
}
