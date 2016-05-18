/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class Notification_rules.
 */
public class Notification_rules {
	
	/** The id. */
	private String id;

    /** The contact_method. */
    private Contact_method contact_method;

    /** The start_delay_in_minutes. */
    private String start_delay_in_minutes;

    /**
     * Gets the id.
     *
     * @return the id
     */
    public String getId ()
    {
        return id;
    }

    /**
     * Sets the id.
     *
     * @param id the new id
     */
    public void setId (String id)
    {
        this.id = id;
    }

    /**
     * Gets the contact_method.
     *
     * @return the contact_method
     */
    public Contact_method getContact_method ()
    {
        return contact_method;
    }

    /**
     * Sets the contact_method.
     *
     * @param contact_method the new contact_method
     */
    public void setContact_method (Contact_method contact_method)
    {
        this.contact_method = contact_method;
    }

    /**
     * Gets the start_delay_in_minutes.
     *
     * @return the start_delay_in_minutes
     */
    public String getStart_delay_in_minutes ()
    {
        return start_delay_in_minutes;
    }

    /**
     * Sets the start_delay_in_minutes.
     *
     * @param start_delay_in_minutes the new start_delay_in_minutes
     */
    public void setStart_delay_in_minutes (String start_delay_in_minutes)
    {
        this.start_delay_in_minutes = start_delay_in_minutes;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", contact_method = "+contact_method+", start_delay_in_minutes = "+start_delay_in_minutes+"]";
    }

}
