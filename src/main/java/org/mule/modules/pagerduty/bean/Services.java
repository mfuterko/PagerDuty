package org.mule.modules.pagerduty.bean;

public class Services {
	private Incident_counts incident_counts;

    private String service_url;

    private String status;

    private String auto_resolve_timeout;

    private String deleted_at;

    private String last_incident_timestamp;

    private String email_filter_mode;

    private String acknowledgement_timeout;

    private String type;

    private String email_incident_creation;

    private String id;

    private String service_key;

    private String name;

    private String created_at;

    public Incident_counts getIncident_counts ()
    {
        return incident_counts;
    }

    public void setIncident_counts (Incident_counts incident_counts)
    {
        this.incident_counts = incident_counts;
    }

    public String getService_url ()
    {
        return service_url;
    }

    public void setService_url (String service_url)
    {
        this.service_url = service_url;
    }

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }

    public String getAuto_resolve_timeout ()
    {
        return auto_resolve_timeout;
    }

    public void setAuto_resolve_timeout (String auto_resolve_timeout)
    {
        this.auto_resolve_timeout = auto_resolve_timeout;
    }

    public String getDeleted_at ()
    {
        return deleted_at;
    }

    public void setDeleted_at (String deleted_at)
    {
        this.deleted_at = deleted_at;
    }

    public String getLast_incident_timestamp ()
    {
        return last_incident_timestamp;
    }

    public void setLast_incident_timestamp (String last_incident_timestamp)
    {
        this.last_incident_timestamp = last_incident_timestamp;
    }

    public String getEmail_filter_mode ()
    {
        return email_filter_mode;
    }

    public void setEmail_filter_mode (String email_filter_mode)
    {
        this.email_filter_mode = email_filter_mode;
    }

    public String getAcknowledgement_timeout ()
    {
        return acknowledgement_timeout;
    }

    public void setAcknowledgement_timeout (String acknowledgement_timeout)
    {
        this.acknowledgement_timeout = acknowledgement_timeout;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public String getEmail_incident_creation ()
    {
        return email_incident_creation;
    }

    public void setEmail_incident_creation (String email_incident_creation)
    {
        this.email_incident_creation = email_incident_creation;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getService_key ()
    {
        return service_key;
    }

    public void setService_key (String service_key)
    {
        this.service_key = service_key;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getCreated_at ()
    {
        return created_at;
    }

    public void setCreated_at (String created_at)
    {
        this.created_at = created_at;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [incident_counts = "+incident_counts+", service_url = "+service_url+", status = "+status+", auto_resolve_timeout = "+auto_resolve_timeout+", deleted_at = "+deleted_at+", last_incident_timestamp = "+last_incident_timestamp+", email_filter_mode = "+email_filter_mode+", acknowledgement_timeout = "+acknowledgement_timeout+", type = "+type+", email_incident_creation = "+email_incident_creation+", id = "+id+", service_key = "+service_key+", name = "+name+", created_at = "+created_at+"]";
    }

}
