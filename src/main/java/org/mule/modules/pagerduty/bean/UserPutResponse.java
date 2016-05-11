package org.mule.modules.pagerduty.bean;

public class UserPutResponse extends StatusResponse {
	
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
