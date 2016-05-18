/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class ContactMethodPostRequest.
 */
public class ContactMethodPostRequest {
	
	/** The type. */
	String type;
	
	/** The address. */
	String address;
	
	/** The country_code. */
	int country_code;
	
	/** The label. */
	String label;
	
	/** The send_short_email. */
	boolean send_short_email;
	
	
	/**
	 * Gets the country_code.
	 *
	 * @return the country_code
	 */
	public int getCountry_code() {
		return country_code;
	}
	
	/**
	 * Sets the country_code.
	 *
	 * @param country_code the new country_code
	 */
	public void setCountry_code(int country_code) {
		this.country_code = country_code;
	}
	
	/**
	 * Checks if is send_short_email.
	 *
	 * @return true, if is send_short_email
	 */
	public boolean isSend_short_email() {
		return send_short_email;
	}
	
	/**
	 * Sets the send_short_email.
	 *
	 * @param send_short_email the new send_short_email
	 */
	public void setSend_short_email(boolean send_short_email) {
		this.send_short_email = send_short_email;
	}
	
	/**
	 * Gets the type.
	 *
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	
	/**
	 * Sets the type.
	 *
	 * @param type the new type
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	/**
	 * Gets the address.
	 *
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	
	/**
	 * Sets the address.
	 *
	 * @param address the new address
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * Gets the label.
	 *
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}
	
	/**
	 * Sets the label.
	 *
	 * @param label the new label
	 */
	public void setLabel(String label) {
		this.label = label;
	}
	
	

}
