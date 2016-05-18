/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class ContactMethodPutRequest.
 */
public class ContactMethodPutRequest {
	
	/** The address. */
	String address;
	
	/** The country date. */
	int countryDate;
	
	/** The label. */
	String label;
	
	/** The send short email. */
	boolean sendShortEmail;
	
	
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
	 * Gets the country date.
	 *
	 * @return the country date
	 */
	public int getCountryDate() {
		return countryDate;
	}
	
	/**
	 * Sets the country date.
	 *
	 * @param countryDate the new country date
	 */
	public void setCountryDate(int countryDate) {
		this.countryDate = countryDate;
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
	
	/**
	 * Checks if is send short email.
	 *
	 * @return true, if is send short email
	 */
	public boolean isSendShortEmail() {
		return sendShortEmail;
	}
	
	/**
	 * Sets the send short email.
	 *
	 * @param sendShortEmail the new send short email
	 */
	public void setSendShortEmail(boolean sendShortEmail) {
		this.sendShortEmail = sendShortEmail;
	}
	

}
