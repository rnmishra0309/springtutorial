package com.base.spring.componentscanning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:cars.properties")
public class Mercedes implements Car {
	
	@Value("${running.mercedes}")
	private String runningStatus;
	private Engine engine;
	
	public Mercedes() {
		
	}
	
	@Autowired
	@Qualifier("engineTypeD")
	public void setEngine(Engine engine) { // we can also change this method name to anything else. still it will work fine
		// this is known as Method Injection
		this.engine = engine;
	}

	public void setRunningStatus(String runningStatus) {
		this.runningStatus = runningStatus;
	}

	public String getBrandName() {
		String brandName = this.getClass().getName();
		return brandName;
	}

	public String getRunningStatus() {
		return this.runningStatus;
	}
	
	public String getEngine() {
		return engine.getEngineType();
	}
	
}
