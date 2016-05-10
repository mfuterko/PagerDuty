package org.mule.modules.pagerduty.bean;

public class LogEntriesGetResponse extends StatusResponse {
	
	LogEntries[] logEntries;
	Integer total;
	Integer offset;
	Integer limit;

}
