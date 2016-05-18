/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class IncidentsSnoozePutRequest.
 */
public class IncidentsSnoozePutRequest {
	
	/** The requester_id. */
	String requester_id;
	
	/** The duration. */
	int duration;
	
	/**
	 * Gets the requester_id.
	 *
	 * @return the requester_id
	 */
	public String getRequester_id() {
		return requester_id;
	}
	
	/**
	 * Sets the requester_id.
	 *
	 * @param requester_id the new requester_id
	 */
	public void setRequester_id(String requester_id) {
		this.requester_id = requester_id;
	}
	
	/**
	 * Gets the duration.
	 *
	 * @return the duration
	 */
	public int getDuration() {
		return duration;
	}
	
	/**
	 * Sets the duration.
	 *
	 * @param duration the new duration
	 */
	public void setDuration(int duration) {
		this.duration = duration;
	}

}
