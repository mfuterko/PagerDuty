/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

public class UserContactMethodsGetResponse extends StatusResponse {
	
	private String total;

    private Contact_methods[] contact_methods;

    public String getTotal ()
    {
        return total;
    }

    public void setTotal (String total)
    {
        this.total = total;
    }

    public Contact_methods[] getContact_methods ()
    {
        return contact_methods;
    }

    public void setContact_methods (Contact_methods[] contact_methods)
    {
        this.contact_methods = contact_methods;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [total = "+total+", contact_methods = "+contact_methods+"]";
    }

}
