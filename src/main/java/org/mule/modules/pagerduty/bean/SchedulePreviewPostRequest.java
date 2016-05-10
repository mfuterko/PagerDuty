package org.mule.modules.pagerduty.bean;

import java.util.Date;

public class SchedulePreviewPostRequest {
	
	Date since;
	Date until;
	boolean overview;
	Schedule schedule;

}
