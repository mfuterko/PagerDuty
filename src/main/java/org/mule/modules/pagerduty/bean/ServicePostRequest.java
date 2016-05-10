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
	

}
