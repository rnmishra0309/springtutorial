package com.base.spring.componentscanning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:cars.properties")
public class Bentley implements Car {
	
	@Value("${running.bentley}")
	private String runningStatus;
	
	@Autowired
	@Qualifier("engineTypeV")
	private Engine engine; // This is known as field injection and it is achieved using java Reflection.
	
	public Bentley() {
		
	}
	
//	@Autowired
//	public Bentley(@Qualifier("engineTypeV") Engine engine) {
//		this.engine = engine;
//	}

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
