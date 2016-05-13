package org.mule.modules.pagerduty.bean;

public class IncidentsPutRequest {
	
	private Incidents[] incidents;
	
	private String requester_id;

	public Incidents[] getIncidents() {
		return incidents;
	}

	public void setIncidents(Incidents[] incidents) {
		this.incidents = incidents;
	}

	public String getRequester_id() {
		return requester_id;
	}

	public void setRequester_id(String requester_id) {
		this.requester_id = requester_id;
	}

}
