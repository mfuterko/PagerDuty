/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class UserContactMethodsGetResponse.
 */
public class UserContactMethodsGetResponse extends StatusResponse {
	
	/** The total. */
	private String total;

    /** The contact_methods. */
    private Contact_methods[] contact_methods;

    /**
     * Gets the total.
     *
     * @return the total
     */
    public String getTotal ()
    {
        return total;
    }

    /**
     * Sets the total.
     *
     * @param total the new total
     */
    public void setTotal (String total)
    {
        this.total = total;
    }

    /**
     * Gets the contact_methods.
     *
     * @return the contact_methods
     */
    public Contact_methods[] getContact_methods ()
    {
        return contact_methods;
    }

    /**
     * Sets the contact_methods.
     *
     * @param contact_methods the new contact_methods
     */
    public void setContact_methods (Contact_methods[] contact_methods)
    {
        this.contact_methods = contact_methods;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [total = "+total+", contact_methods = "+contact_methods+"]";
    }

}
