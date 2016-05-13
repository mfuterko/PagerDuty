/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

import java.util.Date;

public class SchedulePreviewPostRequest {
	
	String since;
	String until;
	boolean overview;
	Schedule schedule;
	
	
	public String getSince() {
		return since;
	}
	public void setSince(String since) {
		this.since = since;
	}
	public String getUntil() {
		return until;
	}
	public void setUntil(String until) {
		this.until = until;
	}
	public boolean isOverview() {
		return overview;
	}
	public void setOverview(boolean overview) {
		this.overview = overview;
	}
	public Schedule getSchedule() {
		return schedule;
	}
	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}
	
	

}
