/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

public class ContactMethodPostResponse extends StatusResponse {
	
	private Contact_method contact_method;

    public Contact_method getContact_method ()
    {
        return contact_method;
    }

    public void setContact_method (Contact_method contact_method)
    {
        this.contact_method = contact_method;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [contact_method = "+contact_method+"]";
    }

}
