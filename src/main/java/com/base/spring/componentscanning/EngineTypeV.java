package com.base.spring.componentscanning;

import org.springframework.stereotype.Component;

@Component
public class EngineTypeV implements Engine {

	@Override
	public String getEngineType() {
		return "Engine type: V8";
	}
	
}
