/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

public class ContactMethodPostRequest {
	
	String type;
	String address;
	int countryCode;
	String label;
	boolean sendShortEmail;
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(int countryCode) {
		this.countryCode = countryCode;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public boolean isSendShortEmail() {
		return sendShortEmail;
	}
	public void setSendShortEmail(boolean sendShortEmail) {
		this.sendShortEmail = sendShortEmail;
	}
	
	

}
