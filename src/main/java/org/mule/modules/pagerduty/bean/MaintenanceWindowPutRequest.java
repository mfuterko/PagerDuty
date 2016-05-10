package org.mule.modules.pagerduty.bean;

import java.util.Date;

public class MaintenanceWindowPutRequest {
	
	Date startTime;
	Date endTime;
	String description;
	String serviceIds;

}
