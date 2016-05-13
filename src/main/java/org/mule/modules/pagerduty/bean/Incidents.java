/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

public class Incidents {
	
	private Assigned_to[] assigned_to;

    private String html_url;

    private Assigned_to_user assigned_to_user;

    private String last_status_change_on;

    private String status;

    private String created_on;

    private Last_status_change_by last_status_change_by;

    private Service service;

    private String  incident_key;

    private Trigger_summary_data trigger_summary_data;

    private Pending_actions[] pending_actions;

    private String incident_number;

    private String trigger_details_html_url;

    private String urgency;

    public Assigned_to[] getAssigned_to ()
    {
        return assigned_to;
    }

    public void setAssigned_to (Assigned_to[] assigned_to)
    {
        this.assigned_to = assigned_to;
    }

    public String getHtml_url ()
    {
        return html_url;
    }

    public void setHtml_url (String html_url)
    {
        this.html_url = html_url;
    }

    public Assigned_to_user getAssigned_to_user ()
    {
        return assigned_to_user;
    }

    public void setAssigned_to_user (Assigned_to_user assigned_to_user)
    {
        this.assigned_to_user = assigned_to_user;
    }

    public String getLast_status_change_on ()
    {
        return last_status_change_on;
    }

    public void setLast_status_change_on (String last_status_change_on)
    {
        this.last_status_change_on = last_status_change_on;
    }

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }

    public String getCreated_on ()
    {
        return created_on;
    }

    public void setCreated_on (String created_on)
    {
        this.created_on = created_on;
    }

    public Last_status_change_by getLast_status_change_by ()
    {
        return last_status_change_by;
    }

    public void setLast_status_change_by (Last_status_change_by last_status_change_by)
    {
        this.last_status_change_by = last_status_change_by;
    }

    public Service getService ()
    {
        return service;
    }

    public void setService (Service service)
    {
        this.service = service;
    }

    public String getIncident_key ()
    {
        return incident_key;
    }

    public void setIncident_key (String incident_key)
    {
        this.incident_key = incident_key;
    }

    public Trigger_summary_data getTrigger_summary_data ()
    {
        return trigger_summary_data;
    }

    public void setTrigger_summary_data (Trigger_summary_data trigger_summary_data)
    {
        this.trigger_summary_data = trigger_summary_data;
    }

    public Pending_actions[] getPending_actions ()
    {
        return pending_actions;
    }

    public void setPending_actions (Pending_actions[] pending_actions)
    {
        this.pending_actions = pending_actions;
    }

    public String getIncident_number ()
    {
        return incident_number;
    }

    public void setIncident_number (String incident_number)
    {
        this.incident_number = incident_number;
    }

    public String getTrigger_details_html_url ()
    {
        return trigger_details_html_url;
    }

    public void setTrigger_details_html_url (String trigger_details_html_url)
    {
        this.trigger_details_html_url = trigger_details_html_url;
    }

    public String getUrgency ()
    {
        return urgency;
    }

    public void setUrgency (String urgency)
    {
        this.urgency = urgency;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [assigned_to = "+assigned_to+", html_url = "+html_url+", assigned_to_user = "+assigned_to_user+", last_status_change_on = "+last_status_change_on+", status = "+status+", created_on = "+created_on+", last_status_change_by = "+last_status_change_by+", service = "+service+", incident_key = "+incident_key+", trigger_summary_data = "+trigger_summary_data+", pending_actions = "+pending_actions+", incident_number = "+incident_number+", trigger_details_html_url = "+trigger_details_html_url+", urgency = "+urgency+"]";
    }

}
