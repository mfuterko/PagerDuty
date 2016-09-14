/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class Incident.
 */
public class Incident {

	/** The id. */
	String id;

	/** The status. */
	String status;

	/** The escalation_level. */
	Integer escalation_level;

	/** The assigned_to_user. */
	String assigned_to_user;

	/** The escalation_policy. */
	String escalation_policy;
	private String type;
	private String summary;
	public String getHtml_url() {
		return html_url;
	}

	public void setHtml_url(String html_url) {
		this.html_url = html_url;
	}

	private String self;

	private String html_url;

	public String getSelf() {
		return self;
	}

	public void setSelf(String self) {
		this.self = self;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id
	 *            the new id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Gets the status.
	 *
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Sets the status.
	 *
	 * @param status
	 *            the new status
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * Gets the escalation_level.
	 *
	 * @return the escalation_level
	 */
	public Integer getEscalation_level() {
		return escalation_level;
	}

	/**
	 * Sets the escalation_level.
	 *
	 * @param escalation_level
	 *            the new escalation_level
	 */
	public void setEscalation_level(Integer escalation_level) {
		this.escalation_level = escalation_level;
	}

	/**
	 * Gets the assigned_to_user.
	 *
	 * @return the assigned_to_user
	 */
	public String getAssigned_to_user() {
		return assigned_to_user;
	}

	/**
	 * Sets the assigned_to_user.
	 *
	 * @param assigned_to_user
	 *            the new assigned_to_user
	 */
	public void setAssigned_to_user(String assigned_to_user) {
		this.assigned_to_user = assigned_to_user;
	}

	/**
	 * Gets the escalation_policy.
	 *
	 * @return the escalation_policy
	 */
	public String getEscalation_policy() {
		return escalation_policy;
	}

	/**
	 * Sets the escalation_policy.
	 *
	 * @param escalation_policy
	 *            the new escalation_policy
	 */
	public void setEscalation_policy(String escalation_policy) {
		this.escalation_policy = escalation_policy;
	}

}
