package org.mule.modules.pagerduty.bean;

public class Notification_rules {
	
	private String id;

    private Contact_method contact_method;

    private String start_delay_in_minutes;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public Contact_method getContact_method ()
    {
        return contact_method;
    }

    public void setContact_method (Contact_method contact_method)
    {
        this.contact_method = contact_method;
    }

    public String getStart_delay_in_minutes ()
    {
        return start_delay_in_minutes;
    }

    public void setStart_delay_in_minutes (String start_delay_in_minutes)
    {
        this.start_delay_in_minutes = start_delay_in_minutes;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", contact_method = "+contact_method+", start_delay_in_minutes = "+start_delay_in_minutes+"]";
    }

}
