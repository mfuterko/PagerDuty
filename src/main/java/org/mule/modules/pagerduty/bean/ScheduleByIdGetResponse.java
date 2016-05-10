package org.mule.modules.pagerduty.bean;

import java.util.Date;
import java.util.TimeZone;

public class ScheduleByIdGetResponse extends StatusResponse {
	
	ScheduleLayer[] scheduleLayers;
	String name;
	Object finalSchedule;
	Object overridesSchedule;
	TimeZone timeZone;
	EscalationPolicy[] escalationPoliceis;
	Date today;
	

}
