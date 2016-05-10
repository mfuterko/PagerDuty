package org.mule.modules.pagerduty.bean;

import java.util.Date;

public class ServicesListGetResponse extends StatusResponse {
	String id;
	String name;
	String description;
	String serviceUrl;
	String serviceKey;
	int autoResolveTimeOut;
	int acknowledgementTimeOut;
	Date createdAt;
	String status;
	Date lastIncidentTimestamp;
	String emailIncidentCreation;
	Object incidentCounts;
	String emailFilterMode;
	String type;
	Object escalationPolicy;
	Object emailFilters;
	String severityFilters;
	

}
