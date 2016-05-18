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
	
	/** The id. */
	private String id;
	
	/** The escalation_policy. */
	private Escalation_policy escalation_policy;
	
	/** The trigger_type. */
	private String trigger_type;
	
	/** The assigned_to. */
	private Assigned_to[] assigned_to;

    /** The html_url. */
    private String html_url;

    /** The assigned_to_user. */
    private Assigned_to_user assigned_to_user;

    /** The last_status_change_on. */
    private String last_status_change_on;

    /** The status. */
    private String status;

    /** The created_on. */
    private String created_on;

    /** The last_status_change_by. */
    private Last_status_change_by last_status_change_by;

    /** The service. */
    private Service service;

    /** The incident_key. */
    private String  incident_key;

    /** The trigger_summary_data. */
    private Trigger_summary_data trigger_summary_data;

    /** The pending_actions. */
    private Pending_actions[] pending_actions;

    /** The incident_number. */
    private String incident_number;

    /** The trigger_details_html_url. */
    private String trigger_details_html_url;

    /** The urgency. */
    private String urgency;

    /**
     * Gets the assigned_to.
     *
     * @return the assigned_to
     */
    public Assigned_to[] getAssigned_to ()
    {
        return assigned_to;
    }

    /**
     * Sets the assigned_to.
     *
     * @param assigned_to the new assigned_to
     */
    public void setAssigned_to (Assigned_to[] assigned_to)
    {
        this.assigned_to = assigned_to;
    }

    /**
     * Gets the html_url.
     *
     * @return the html_url
     */
    public String getHtml_url ()
    {
        return html_url;
    }

    /**
     * Sets the html_url.
     *
     * @param html_url the new html_url
     */
    public void setHtml_url (String html_url)
    {
        this.html_url = html_url;
    }

    /**
     * Gets the assigned_to_user.
     *
     * @return the assigned_to_user
     */
    public Assigned_to_user getAssigned_to_user ()
    {
        return assigned_to_user;
    }

    /**
     * Sets the assigned_to_user.
     *
     * @param assigned_to_user the new assigned_to_user
     */
    public void setAssigned_to_user (Assigned_to_user assigned_to_user)
    {
        this.assigned_to_user = assigned_to_user;
    }

    /**
     * Gets the last_status_change_on.
     *
     * @return the last_status_change_on
     */
    public String getLast_status_change_on ()
    {
        return last_status_change_on;
    }

    /**
     * Sets the last_status_change_on.
     *
     * @param last_status_change_on the new last_status_change_on
     */
    public void setLast_status_change_on (String last_status_change_on)
    {
        this.last_status_change_on = last_status_change_on;
    }

    /**
     * Gets the status.
     *
     * @return the status
     */
    public String getStatus ()
    {
        return status;
    }

    /**
     * Sets the status.
     *
     * @param status the new status
     */
    public void setStatus (String status)
    {
        this.status = status;
    }

    /**
     * Gets the created_on.
     *
     * @return the created_on
     */
    public String getCreated_on ()
    {
        return created_on;
    }

    /**
     * Sets the created_on.
     *
     * @param created_on the new created_on
     */
    public void setCreated_on (String created_on)
    {
        this.created_on = created_on;
    }

    /**
     * Gets the last_status_change_by.
     *
     * @return the last_status_change_by
     */
    public Last_status_change_by getLast_status_change_by ()
    {
        return last_status_change_by;
    }

    /**
     * Sets the last_status_change_by.
     *
     * @param last_status_change_by the new last_status_change_by
     */
    public void setLast_status_change_by (Last_status_change_by last_status_change_by)
    {
        this.last_status_change_by = last_status_change_by;
    }

    /**
     * Gets the service.
     *
     * @return the service
     */
    public Service getService ()
    {
        return service;
    }

    /**
     * Sets the service.
     *
     * @param service the new service
     */
    public void setService (Service service)
    {
        this.service = service;
    }

    /**
     * Gets the incident_key.
     *
     * @return the incident_key
     */
    public String getIncident_key ()
    {
        return incident_key;
    }

    /**
     * Sets the incident_key.
     *
     * @param incident_key the new incident_key
     */
    public void setIncident_key (String incident_key)
    {
        this.incident_key = incident_key;
    }

    /**
     * Gets the trigger_summary_data.
     *
     * @return the trigger_summary_data
     */
    public Trigger_summary_data getTrigger_summary_data ()
    {
        return trigger_summary_data;
    }

    /**
     * Sets the trigger_summary_data.
     *
     * @param trigger_summary_data the new trigger_summary_data
     */
    public void setTrigger_summary_data (Trigger_summary_data trigger_summary_data)
    {
        this.trigger_summary_data = trigger_summary_data;
    }

    /**
     * Gets the pending_actions.
     *
     * @return the pending_actions
     */
    public Pending_actions[] getPending_actions ()
    {
        return pending_actions;
    }

    /**
     * Sets the pending_actions.
     *
     * @param pending_actions the new pending_actions
     */
    public void setPending_actions (Pending_actions[] pending_actions)
    {
        this.pending_actions = pending_actions;
    }

    /**
     * Gets the incident_number.
     *
     * @return the incident_number
     */
    public String getIncident_number ()
    {
        return incident_number;
    }

    /**
     * Sets the incident_number.
     *
     * @param incident_number the new incident_number
     */
    public void setIncident_number (String incident_number)
    {
        this.incident_number = incident_number;
    }

    /**
     * Gets the trigger_details_html_url.
     *
     * @return the trigger_details_html_url
     */
    public String getTrigger_details_html_url ()
    {
        return trigger_details_html_url;
    }

    /**
     * Sets the trigger_details_html_url.
     *
     * @param trigger_details_html_url the new trigger_details_html_url
     */
    public void setTrigger_details_html_url (String trigger_details_html_url)
    {
        this.trigger_details_html_url = trigger_details_html_url;
    }

    /**
     * Gets the urgency.
     *
     * @return the urgency
     */
    public String getUrgency ()
    {
        return urgency;
    }

    /**
     * Sets the urgency.
     *
     * @param urgency the new urgency
     */
    public void setUrgency (String urgency)
    {
        this.urgency = urgency;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [assigned_to = "+assigned_to+", html_url = "+html_url+", assigned_to_user = "+assigned_to_user+", last_status_change_on = "+last_status_change_on+", status = "+status+", created_on = "+created_on+", last_status_change_by = "+last_status_change_by+", service = "+service+", incident_key = "+incident_key+", trigger_summary_data = "+trigger_summary_data+", pending_actions = "+pending_actions+", incident_number = "+incident_number+", trigger_details_html_url = "+trigger_details_html_url+", urgency = "+urgency+"]";
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
	 * Gets the escalation_policy.
	 *
	 * @return the escalation_policy
	 */
	public Escalation_policy getEscalation_policy() {
		return escalation_policy;
	}

	/**
	 * Sets the escalation_policy.
	 *
	 * @param escalation_policy the new escalation_policy
	 */
	public void setEscalation_policy(Escalation_policy escalation_policy) {
		this.escalation_policy = escalation_policy;
	}

	/**
	 * Gets the trigger_type.
	 *
	 * @return the trigger_type
	 */
	public String getTrigger_type() {
		return trigger_type;
	}

	/**
	 * Sets the trigger_type.
	 *
	 * @param trigger_type the new trigger_type
	 */
	public void setTrigger_type(String trigger_type) {
		this.trigger_type = trigger_type;
	}

}
