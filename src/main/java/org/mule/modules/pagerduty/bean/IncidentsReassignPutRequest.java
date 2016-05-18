/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class IncidentsReassignPutRequest.
 */
public class IncidentsReassignPutRequest {
	
	/** The requester_id. */
	private String requester_id;
	
	/** The escalation_policy. */
	String escalation_policy;
	
	/** The escalation_level. */
	int escalation_level;
	
	/** The assigned_to_user. */
	String assigned_to_user;

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
	 * Gets the escalation_policy.
	 *
	 * @return the escalation_policy
	 */
	public String getEscalation_policy() {
		return escalation_policy;
	}

	/**
	 * Sets the escalation_policy.
	 *
	 * @param escalation_policy the new escalation_policy
	 */
	public void setEscalation_policy(String escalation_policy) {
		this.escalation_policy = escalation_policy;
	}

	/**
	 * Gets the escalation_level.
	 *
	 * @return the escalation_level
	 */
	public int getEscalation_level() {
		return escalation_level;
	}

	/**
	 * Sets the escalation_level.
	 *
	 * @param escalation_level the new escalation_level
	 */
	public void setEscalation_level(int escalation_level) {
		this.escalation_level = escalation_level;
	}

	/**
	 * Gets the assigned_to_user.
	 *
	 * @return the assigned_to_user
	 */
	public String getAssigned_to_user() {
		return assigned_to_user;
	}

	/**
	 * Sets the assigned_to_user.
	 *
	 * @param assigned_to_user the new assigned_to_user
	 */
	public void setAssigned_to_user(String assigned_to_user) {
		this.assigned_to_user = assigned_to_user;
	}
	
	

}
