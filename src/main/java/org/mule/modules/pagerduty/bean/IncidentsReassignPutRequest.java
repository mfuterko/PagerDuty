/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

public class IncidentsReassignPutRequest {
	
	private String requester_id;
	
	String escalation_policy;
	
	int escalation_level;
	
	String assigned_to_user;

	public String getRequester_id() {
		return requester_id;
	}

	public void setRequester_id(String requester_id) {
		this.requester_id = requester_id;
	}

	public String getEscalation_policy() {
		return escalation_policy;
	}

	public void setEscalation_policy(String escalation_policy) {
		this.escalation_policy = escalation_policy;
	}

	public int getEscalation_level() {
		return escalation_level;
	}

	public void setEscalation_level(int escalation_level) {
		this.escalation_level = escalation_level;
	}

	public String getAssigned_to_user() {
		return assigned_to_user;
	}

	public void setAssigned_to_user(String assigned_to_user) {
		this.assigned_to_user = assigned_to_user;
	}
	
	

}
