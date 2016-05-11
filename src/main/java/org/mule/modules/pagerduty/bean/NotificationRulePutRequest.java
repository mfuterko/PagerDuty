package org.mule.modules.pagerduty.bean;

public class NotificationRulePutRequest {

	String start_delay_in_minutes;
	String contact_method_id;
	
	
	public String getStart_delay_in_minutes() {
		return start_delay_in_minutes;
	}
	public void setStart_delay_in_minutes(String start_delay_in_minutes) {
		this.start_delay_in_minutes = start_delay_in_minutes;
	}
	public String getContact_method_id() {
		return contact_method_id;
	}
	public void setContact_method_id(String contact_method_id) {
		this.contact_method_id = contact_method_id;
	}
	
	


}
