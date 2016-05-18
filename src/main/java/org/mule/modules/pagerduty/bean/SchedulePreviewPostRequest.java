/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

import java.util.Date;

// TODO: Auto-generated Javadoc
/**
 * The Class SchedulePreviewPostRequest.
 */
public class SchedulePreviewPostRequest {
	
	/** The since. */
	String since;
	
	/** The until. */
	String until;
	
	/** The overview. */
	boolean overview;
	
	/** The schedule. */
	Schedule schedule;
	
	
	/**
	 * Gets the since.
	 *
	 * @return the since
	 */
	public String getSince() {
		return since;
	}
	
	/**
	 * Sets the since.
	 *
	 * @param since the new since
	 */
	public void setSince(String since) {
		this.since = since;
	}
	
	/**
	 * Gets the until.
	 *
	 * @return the until
	 */
	public String getUntil() {
		return until;
	}
	
	/**
	 * Sets the until.
	 *
	 * @param until the new until
	 */
	public void setUntil(String until) {
		this.until = until;
	}
	
	/**
	 * Checks if is overview.
	 *
	 * @return true, if is overview
	 */
	public boolean isOverview() {
		return overview;
	}
	
	/**
	 * Sets the overview.
	 *
	 * @param overview the new overview
	 */
	public void setOverview(boolean overview) {
		this.overview = overview;
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
