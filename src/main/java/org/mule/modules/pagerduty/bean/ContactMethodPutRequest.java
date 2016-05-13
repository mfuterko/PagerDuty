/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

public class ContactMethodPutRequest {
	
	String address;
	int countryDate;
	String label;
	boolean sendShortEmail;
	
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getCountryDate() {
		return countryDate;
	}
	public void setCountryDate(int countryDate) {
		this.countryDate = countryDate;
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
