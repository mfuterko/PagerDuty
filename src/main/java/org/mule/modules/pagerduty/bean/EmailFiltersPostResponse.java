/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class EmailFiltersPostResponse.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class EmailFiltersPostResponse extends StatusResponse {
	
	/** The email_filter. */
	private Email_filter email_filter;

    /**
     * Gets the email_filter.
     *
     * @return the email_filter
     */
    public Email_filter getEmail_filter ()
    {
        return email_filter;
    }

    /**
     * Sets the email_filter.
     *
     * @param email_filter the new email_filter
     */
    public void setEmail_filter (Email_filter email_filter)
    {
        this.email_filter = email_filter;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [email_filter = "+email_filter+"]";
    }

}
