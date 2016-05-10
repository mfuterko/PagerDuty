package org.mule.modules.pagerduty.bean;

public class IncidentLogEntriesGetResponse extends StatusResponse {
	
	LogEntries[] logEntries;
	Integer total;
	Integer offset;
	Integer limit;
	
	

}
