/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class SchedulesPutRequest.
 */
public class SchedulesPutRequest {
	
	/** The overflow. */
	boolean overflow;
	
	/** The schedule. */
	Schedule schedule;
	
	
	/**
	 * Checks if is overflow.
	 *
	 * @return true, if is overflow
	 */
	public boolean isOverflow() {
		return overflow;
	}
	
	/**
	 * Sets the overflow.
	 *
	 * @param overflow the new overflow
	 */
	public void setOverflow(boolean overflow) {
		this.overflow = overflow;
	}
	
	/**
	 * Gets the schedule.
	 *
	 * @return the schedule
	 */
	public Schedule getSchedule() {
		return schedule;
	}
	
	/**
	 * Sets the schedule.
	 *
	 * @param schedule the new schedule
	 */
	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}
	

}
