/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

public class NotificationRulePostRequest {
	
	int startDelayInMinutes;
	String contactMethodId;
	
	
	public int getStartDelayInMinutes() {
		return startDelayInMinutes;
	}
	public void setStartDelayInMinutes(int startDelayInMinutes) {
		this.startDelayInMinutes = startDelayInMinutes;
	}
	public String getContactMethodId() {
		return contactMethodId;
	}
	public void setContactMethodId(String contactMethodId) {
		this.contactMethodId = contactMethodId;
	}
	
	

}
