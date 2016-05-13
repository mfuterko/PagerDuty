/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

public class SchedulesPutRequest {
	boolean overflow;
	Schedule schedule;
	
	
	public boolean isOverflow() {
		return overflow;
	}
	public void setOverflow(boolean overflow) {
		this.overflow = overflow;
	}
	public Schedule getSchedule() {
		return schedule;
	}
	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}
	

}
