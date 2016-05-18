/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class EmailFilterPostRequest.
 */
public class EmailFilterPostRequest {
	
	/** The subject mode. */
	String subjectMode;
	
	/** The subject regex. */
	String subjectRegex;
	
	/** The body mode. */
	String bodyMode;
	
	/** The body regex. */
	String bodyRegex;
	
	/** The from email mode. */
	String fromEmailMode;
	
	/** The from email regex. */
	String fromEmailRegex;
	
	/**
	 * Gets the subject mode.
	 *
	 * @return the subject mode
	 */
	public String getSubjectMode() {
		return subjectMode;
	}
	
	/**
	 * Sets the subject mode.
	 *
	 * @param subjectMode the new subject mode
	 */
	public void setSubjectMode(String subjectMode) {
		this.subjectMode = subjectMode;
	}
	
	/**
	 * Gets the subject regex.
	 *
	 * @return the subject regex
	 */
	public String getSubjectRegex() {
		return subjectRegex;
	}
	
	/**
	 * Sets the subject regex.
	 *
	 * @param subjectRegex the new subject regex
	 */
	public void setSubjectRegex(String subjectRegex) {
		this.subjectRegex = subjectRegex;
	}
	
	/**
	 * Gets the body mode.
	 *
	 * @return the body mode
	 */
	public String getBodyMode() {
		return bodyMode;
	}
	
	/**
	 * Sets the body mode.
	 *
	 * @param bodyMode the new body mode
	 */
	public void setBodyMode(String bodyMode) {
		this.bodyMode = bodyMode;
	}
	
	/**
	 * Gets the body regex.
	 *
	 * @return the body regex
	 */
	public String getBodyRegex() {
		return bodyRegex;
	}
	
	/**
	 * Sets the body regex.
	 *
	 * @param bodyRegex the new body regex
	 */
	public void setBodyRegex(String bodyRegex) {
		this.bodyRegex = bodyRegex;
	}
	
	/**
	 * Gets the from email mode.
	 *
	 * @return the from email mode
	 */
	public String getFromEmailMode() {
		return fromEmailMode;
	}
	
	/**
	 * Sets the from email mode.
	 *
	 * @param fromEmailMode the new from email mode
	 */
	public void setFromEmailMode(String fromEmailMode) {
		this.fromEmailMode = fromEmailMode;
	}
	
	/**
	 * Gets the from email regex.
	 *
	 * @return the from email regex
	 */
	public String getFromEmailRegex() {
		return fromEmailRegex;
	}
	
	/**
	 * Sets the from email regex.
	 *
	 * @param fromEmailRegex the new from email regex
	 */
	public void setFromEmailRegex(String fromEmailRegex) {
		this.fromEmailRegex = fromEmailRegex;
	}
	

}
