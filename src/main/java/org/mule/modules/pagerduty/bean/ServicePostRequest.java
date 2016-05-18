/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class ServicePostRequest.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ServicePostRequest {
	
	/** The name. */
	String name;
	
	/** The escalation_policy_id. */
	String escalation_policy_id;
	
	/** The type. */
	String type;
	
	/** The vendor_id. */
	String vendor_id;
	
	/** The description. */
	String description;
	
	/** The acknowledgment_timeout. */
	int acknowledgment_timeout;
	
	/** The auto_resolve_timeout. */
	int auto_resolve_timeout;
	
	/** The severity_filter. */
	String severity_filter;
	
	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
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
	 * Gets the description.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * Gets the escalation_policy_id.
	 *
	 * @return the escalation_policy_id
	 */
	public String getEscalation_policy_id() {
		return escalation_policy_id;
	}
	
	/**
	 * Sets the escalation_policy_id.
	 *
	 * @param escalation_policy_id the new escalation_policy_id
	 */
	public void setEscalation_policy_id(String escalation_policy_id) {
		this.escalation_policy_id = escalation_policy_id;
	}
	
	/**
	 * Gets the vendor_id.
	 *
	 * @return the vendor_id
	 */
	public String getVendor_id() {
		return vendor_id;
	}
	
	/**
	 * Sets the vendor_id.
	 *
	 * @param vendor_d the new vendor_id
	 */
	public void setVendor_id(String vendor_d) {
		this.vendor_id = vendor_d;
	}
	
	/**
	 * Gets the acknowledgment_timeout.
	 *
	 * @return the acknowledgment_timeout
	 */
	public int getAcknowledgment_timeout() {
		return acknowledgment_timeout;
	}
	
	/**
	 * Sets the acknowledgment_timeout.
	 *
	 * @param acknowledgment_imeout the new acknowledgment_timeout
	 */
	public void setAcknowledgment_timeout(int acknowledgment_imeout) {
		this.acknowledgment_timeout = acknowledgment_imeout;
	}
	
	/**
	 * Gets the auto_resolve_timeout.
	 *
	 * @return the auto_resolve_timeout
	 */
	public int getAuto_resolve_timeout() {
		return auto_resolve_timeout;
	}
	
	/**
	 * Sets the auto_resolve_timeout.
	 *
	 * @param auto_resolve_timeout the new auto_resolve_timeout
	 */
	public void setAuto_resolve_timeout(int auto_resolve_timeout) {
		this.auto_resolve_timeout = auto_resolve_timeout;
	}
	
	/**
	 * Gets the severity_filter.
	 *
	 * @return the severity_filter
	 */
	public String getSeverity_filter() {
		return severity_filter;
	}
	
	/**
	 * Sets the severity_filter.
	 *
	 * @param severity_filter the new severity_filter
	 */
	public void setSeverity_filter(String severity_filter) {
		this.severity_filter = severity_filter;
	}
	
	/**
	 * Sets the description.
	 *
	 * @param description the new description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	

}
