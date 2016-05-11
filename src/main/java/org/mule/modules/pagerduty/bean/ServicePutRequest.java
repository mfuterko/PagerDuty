package org.mule.modules.pagerduty.bean;

public class ServicePutRequest {
	String name;
	String description;
	String escalationPolicyId;
	int acknowledgmentTimeout;
	int autoResolveTimeout;
	String severityFilter;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getEscalationPolicyId() {
		return escalationPolicyId;
	}
	public void setEscalationPolicyId(String escalationPolicyId) {
		this.escalationPolicyId = escalationPolicyId;
	}
	public int getAcknowledgmentTimeout() {
		return acknowledgmentTimeout;
	}
	public void setAcknowledgmentTimeout(int acknowledgmentTimeout) {
		this.acknowledgmentTimeout = acknowledgmentTimeout;
	}
	public int getAutoResolveTimeout() {
		return autoResolveTimeout;
	}
	public void setAutoResolveTimeout(int autoResolveTimeout) {
		this.autoResolveTimeout = autoResolveTimeout;
	}
	public String getSeverityFilter() {
		return severityFilter;
	}
	public void setSeverityFilter(String severityFilter) {
		this.severityFilter = severityFilter;
	}
	
	

}
