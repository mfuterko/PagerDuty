/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class Incidents.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Incidents {
	
	private String summary;

    private String[] acknowledgements;

    private String status;

    private String[] responder_requests;

    private Last_status_change_by last_status_change_by;

    private String incident_key;

    private String self;

    private String[] incidents_responders;

    private Pending_actions[] pending_actions;

    private String type;

    private String incident_number;

    private Assignments[] assignments;

    private String urgency;

    private String html_url;

    private String id;

    private Teams[] teams;

    private String importance;

    private Service service;

    private Escalation_policy escalation_policy;

    private String created_at;

    private First_trigger_log_entry first_trigger_log_entry;

    private String last_status_change_at;

	private Assigned_to[] assigned_to;

	private Assigned_to_user assigned_to_user;

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String[] getAcknowledgements() {
		return acknowledgements;
	}

	public void setAcknowledgements(String[] acknowledgements) {
		this.acknowledgements = acknowledgements;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String[] getResponder_requests() {
		return responder_requests;
	}

	public void setResponder_requests(String[] responder_requests) {
		this.responder_requests = responder_requests;
	}

	public Last_status_change_by getLast_status_change_by() {
		return last_status_change_by;
	}

	public void setLast_status_change_by(Last_status_change_by last_status_change_by) {
		this.last_status_change_by = last_status_change_by;
	}

	public String getIncident_key() {
		return incident_key;
	}

	public void setIncident_key(String incident_key) {
		this.incident_key = incident_key;
	}

	public String getSelf() {
		return self;
	}

	public void setSelf(String self) {
		this.self = self;
	}

	public String[] getIncidents_responders() {
		return incidents_responders;
	}

	public void setIncidents_responders(String[] incidents_responders) {
		this.incidents_responders = incidents_responders;
	}

	public Pending_actions[] getPending_actions() {
		return pending_actions;
	}

	public void setPending_actions(Pending_actions[] pending_actions) {
		this.pending_actions = pending_actions;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getIncident_number() {
		return incident_number;
	}

	public void setIncident_number(String incident_number) {
		this.incident_number = incident_number;
	}

	public Assignments[] getAssignments() {
		return assignments;
	}

	public void setAssignments(Assignments[] assignments) {
		this.assignments = assignments;
	}

	public String getUrgency() {
		return urgency;
	}

	public void setUrgency(String urgency) {
		this.urgency = urgency;
	}

	public String getHtml_url() {
		return html_url;
	}

	public void setHtml_url(String html_url) {
		this.html_url = html_url;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Teams[] getTeams() {
		return teams;
	}

	public void setTeams(Teams[] teams) {
		this.teams = teams;
	}

	public String getImportance() {
		return importance;
	}

	public void setImportance(String importance) {
		this.importance = importance;
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public Escalation_policy getEscalation_policy() {
		return escalation_policy;
	}

	public void setEscalation_policy(Escalation_policy escalation_policy) {
		this.escalation_policy = escalation_policy;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public First_trigger_log_entry getFirst_trigger_log_entry() {
		return first_trigger_log_entry;
	}

	public void setFirst_trigger_log_entry(
			First_trigger_log_entry first_trigger_log_entry) {
		this.first_trigger_log_entry = first_trigger_log_entry;
	}

	public String getLast_status_change_at() {
		return last_status_change_at;
	}

	public void setLast_status_change_at(String last_status_change_at) {
		this.last_status_change_at = last_status_change_at;
	}

	public Assigned_to[] getAssigned_to() {
		return assigned_to;
	}

	public void setAssigned_to(Assigned_to[] assigned_to) {
		this.assigned_to = assigned_to;
	}

	public Assigned_to_user getAssigned_to_user() {
		return assigned_to_user;
	}

	public void setAssigned_to_user(Assigned_to_user assigned_to_user) {
		this.assigned_to_user = assigned_to_user;
	}

    

}
