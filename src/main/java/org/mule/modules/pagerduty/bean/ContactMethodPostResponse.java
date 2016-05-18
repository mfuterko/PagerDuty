/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class ContactMethodPostResponse.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContactMethodPostResponse extends StatusResponse {
	
	/** The contact_method. */
	private Contact_method contact_method;

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

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [contact_method = "+contact_method+"]";
    }

}
