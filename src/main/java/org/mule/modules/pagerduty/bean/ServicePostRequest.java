/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

public class ServicePostRequest {
	
	String name;
	String escalationPolicyId;
	String type;
	String vendorId;
	String description;
	int acknowledgmentTimeout;
	int autoResolveTimeout;
	String severityFilter;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEscalationPolicyId() {
		return escalationPolicyId;
	}
	public void setEscalationPolicyId(String escalationPolicyId) {
		this.escalationPolicyId = escalationPolicyId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getVendorId() {
		return vendorId;
	}
	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
