/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class NotificationRulePostRequest.
 */
public class NotificationRulePostRequest {
	
	/** The start delay in minutes. */
	int startDelayInMinutes;
	
	/** The contact method id. */
	String contactMethodId;
	
	
	/**
	 * Gets the start delay in minutes.
	 *
	 * @return the start delay in minutes
	 */
	public int getStartDelayInMinutes() {
		return startDelayInMinutes;
	}
	
	/**
	 * Sets the start delay in minutes.
	 *
	 * @param startDelayInMinutes the new start delay in minutes
	 */
	public void setStartDelayInMinutes(int startDelayInMinutes) {
		this.startDelayInMinutes = startDelayInMinutes;
	}
	
	/**
	 * Gets the contact method id.
	 *
	 * @return the contact method id
	 */
	public String getContactMethodId() {
		return contactMethodId;
	}
	
	/**
	 * Sets the contact method id.
	 *
	 * @param contactMethodId the new contact method id
	 */
	public void setContactMethodId(String contactMethodId) {
		this.contactMethodId = contactMethodId;
	}
	
	

}
