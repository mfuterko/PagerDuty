/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

public class UserDetailsOnCallGetResponse extends StatusResponse {
	
	 private User user;

	    public User getUser ()
	    {
	        return user;
	    }

	    public void setUser (User user)
	    {
	        this.user = user;
	    }

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [user = "+user+"]";
	    }

}
