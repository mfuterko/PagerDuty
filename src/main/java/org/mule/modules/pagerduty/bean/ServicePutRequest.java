package org.mule.modules.pagerduty.bean;

public class ServicePutRequest {
	String name;
	String description;
	String escalationPolicyId;
	int acknowledgmentTimeout;
	int autoResolveTimeout;
	String severityFilter;

}
