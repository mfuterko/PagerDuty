/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

public class EmailFiltersPostResponse extends StatusResponse {
	
	private Email_filter email_filter;

    public Email_filter getEmail_filter ()
    {
        return email_filter;
    }

    public void setEmail_filter (Email_filter email_filter)
    {
        this.email_filter = email_filter;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [email_filter = "+email_filter+"]";
    }

}
