/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class IncidentsPutRequest.
 */
public class IncidentsPutRequest {
	
	/** The incidents. */
	private Incidents[] incidents;
	
	/** The requester_id. */
	private String requester_id;

	/**
	 * Gets the incidents.
	 *
	 * @return the incidents
	 */
	public Incidents[] getIncidents() {
		return incidents;
	}

	/**
	 * Sets the incidents.
	 *
	 * @param incidents the new incidents
	 */
	public void setIncidents(Incidents[] incidents) {
		this.incidents = incidents;
	}

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

}
