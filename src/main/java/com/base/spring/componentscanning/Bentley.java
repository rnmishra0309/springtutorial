package com.base.spring.componentscanning;

import org.springframework.stereotype.Component;

@Component("myCar")
public class Bentley implements Car {
	
	private String runningStatus = "Speeding";

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
	
}
