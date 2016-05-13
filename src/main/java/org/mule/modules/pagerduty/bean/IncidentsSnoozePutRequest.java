package org.mule.modules.pagerduty.bean;

public class IncidentsSnoozePutRequest {
	
	String requester_id;
	int duration;
	
	public String getRequester_id() {
		return requester_id;
	}
	public void setRequester_id(String requester_id) {
		this.requester_id = requester_id;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}

}
