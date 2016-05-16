/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

public class ContactMethodPostRequest {
	
	String type;
	String address;
	int country_code;
	String label;
	boolean send_short_email;
	
	
	public int getCountry_code() {
		return country_code;
	}
	public void setCountry_code(int country_code) {
		this.country_code = country_code;
	}
	public boolean isSend_short_email() {
		return send_short_email;
	}
	public void setSend_short_email(boolean send_short_email) {
		this.send_short_email = send_short_email;
	}
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
	
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	
	

}
