package org.mule.modules.pagerduty.bean;

public class Incident_urgency_rule {
	private String type;

    private String urgency;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUrgency() {
		return urgency;
	}

	public void setUrgency(String urgency) {
		this.urgency = urgency;
	}

}
