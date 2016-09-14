/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class Service.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Service {
		
	/** The incident_counts. */
	private Incident_counts incident_counts;

    /** The scheduled_actions. */
    private String[] scheduled_actions;

    /** The service_url. */
    private String service_url;

    /** The status. */
    private String status;

    public String getHtml_url() {
		return html_url;
	}

	public void setHtml_url(String html_url) {
		this.html_url = html_url;
	}

	/** The support_hours. */
    private String support_hours;

    /** The auto_resolve_timeout. */
    private String auto_resolve_timeout;

    /** The deleted_at. */
    private String deleted_at;

    /** The last_incident_timestamp. */
    private String last_incident_timestamp;

    /** The email_filter_mode. */
    private String email_filter_mode;

    /** The acknowledgement_timeout. */
    private String acknowledgement_timeout;

    /** The type. */
    private String type;

    /** The email_incident_creation. */
    private String email_incident_creation;

    /** The id. */
    private String id;

    /** The service_key. */
    private String service_key;

    /** The description. */
    private String description;

    /** The name. */
    private String name;

    /** The incident_urgency_rule. */
    private Incident_urgency_rule incident_urgency_rule;

    /** The created_at. */
    private String created_at;
    
    /** The html_url. */
    private String html_url;
    

	/**
	 * Gets the html_url.
	 *
	 * @return the html_url
	 */
	public String getHtml_user() {
		return html_url;
	}

	/**
	 * Sets the html_user.
	 *
	 * @param html_user the new html_user
	 */
	public void setHtml_user(String html_user) {
		this.html_url = html_user;
	}

	/**
	 * Gets the incident_counts.
	 *
	 * @return the incident_counts
	 */
	public Incident_counts getIncident_counts() {
		return incident_counts;
	}

	/**
	 * Sets the incident_counts.
	 *
	 * @param incident_counts the new incident_counts
	 */
	public void setIncident_counts(Incident_counts incident_counts) {
		this.incident_counts = incident_counts;
	}

	/**
	 * Gets the scheduled_actions.
	 *
	 * @return the scheduled_actions
	 */
	public String[] getScheduled_actions() {
		return scheduled_actions;
	}

	/**
	 * Sets the scheduled_actions.
	 *
	 * @param scheduled_actions the new scheduled_actions
	 */
	public void setScheduled_actions(String[] scheduled_actions) {
		this.scheduled_actions = scheduled_actions;
	}

	/**
	 * Gets the service_url.
	 *
	 * @return the service_url
	 */
	public String getService_url() {
		return service_url;
	}

	/**
	 * Sets the service_url.
	 *
	 * @param service_url the new service_url
	 */
	public void setService_url(String service_url) {
		this.service_url = service_url;
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
	 * @param status the new status
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * Gets the support_hours.
	 *
	 * @return the support_hours
	 */
	public String getSupport_hours() {
		return support_hours;
	}

	/**
	 * Sets the support_hours.
	 *
	 * @param support_hours the new support_hours
	 */
	public void setSupport_hours(String support_hours) {
		this.support_hours = support_hours;
	}

	/**
	 * Gets the auto_resolve_timeout.
	 *
	 * @return the auto_resolve_timeout
	 */
	public String getAuto_resolve_timeout() {
		return auto_resolve_timeout;
	}

	/**
	 * Sets the auto_resolve_timeout.
	 *
	 * @param auto_resolve_timeout the new auto_resolve_timeout
	 */
	public void setAuto_resolve_timeout(String auto_resolve_timeout) {
		this.auto_resolve_timeout = auto_resolve_timeout;
	}

	/**
	 * Gets the deleted_at.
	 *
	 * @return the deleted_at
	 */
	public String getDeleted_at() {
		return deleted_at;
	}

	/**
	 * Sets the deleted_at.
	 *
	 * @param deleted_at the new deleted_at
	 */
	public void setDeleted_at(String deleted_at) {
		this.deleted_at = deleted_at;
	}

	/**
	 * Gets the last_incident_timestamp.
	 *
	 * @return the last_incident_timestamp
	 */
	public String getLast_incident_timestamp() {
		return last_incident_timestamp;
	}

	/**
	 * Sets the last_incident_timestamp.
	 *
	 * @param last_incident_timestamp the new last_incident_timestamp
	 */
	public void setLast_incident_timestamp(String last_incident_timestamp) {
		this.last_incident_timestamp = last_incident_timestamp;
	}

	/**
	 * Gets the email_filter_mode.
	 *
	 * @return the email_filter_mode
	 */
	public String getEmail_filter_mode() {
		return email_filter_mode;
	}

	/**
	 * Sets the email_filter_mode.
	 *
	 * @param email_filter_mode the new email_filter_mode
	 */
	public void setEmail_filter_mode(String email_filter_mode) {
		this.email_filter_mode = email_filter_mode;
	}

	/**
	 * Gets the acknowledgement_timeout.
	 *
	 * @return the acknowledgement_timeout
	 */
	public String getAcknowledgement_timeout() {
		return acknowledgement_timeout;
	}

	/**
	 * Sets the acknowledgement_timeout.
	 *
	 * @param acknowledgement_timeout the new acknowledgement_timeout
	 */
	public void setAcknowledgement_timeout(String acknowledgement_timeout) {
		this.acknowledgement_timeout = acknowledgement_timeout;
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
	 * Gets the email_incident_creation.
	 *
	 * @return the email_incident_creation
	 */
	public String getEmail_incident_creation() {
		return email_incident_creation;
	}

	/**
	 * Sets the email_incident_creation.
	 *
	 * @param email_incident_creation the new email_incident_creation
	 */
	public void setEmail_incident_creation(String email_incident_creation) {
		this.email_incident_creation = email_incident_creation;
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
	 * @param id the new id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Gets the service_key.
	 *
	 * @return the service_key
	 */
	public String getService_key() {
		return service_key;
	}

	/**
	 * Sets the service_key.
	 *
	 * @param service_key the new service_key
	 */
	public void setService_key(String service_key) {
		this.service_key = service_key;
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
	 * Sets the description.
	 *
	 * @param description the new description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

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
	 * Gets the incident_urgency_rule.
	 *
	 * @return the incident_urgency_rule
	 */
	public Incident_urgency_rule getIncident_urgency_rule() {
		return incident_urgency_rule;
	}

	/**
	 * Sets the incident_urgency_rule.
	 *
	 * @param incident_urgency_rule the new incident_urgency_rule
	 */
	public void setIncident_urgency_rule(Incident_urgency_rule incident_urgency_rule) {
		this.incident_urgency_rule = incident_urgency_rule;
	}

	/**
	 * Gets the created_at.
	 *
	 * @return the created_at
	 */
	public String getCreated_at() {
		return created_at;
	}

	/**
	 * Sets the created_at.
	 *
	 * @param created_at the new created_at
	 */
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
    
}
