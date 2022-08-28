package com.base.spring.componentscanning;

import org.springframework.stereotype.Component;

@Component
public class Mercedes implements Car {
	
	private String runningStatus = "Racing";

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
