/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class UserDetailsGetResponse.
 */
public class UserDetailsGetResponse extends StatusResponse {
	
	/** The user. */
	private User user;

    /**
     * Gets the user.
     *
     * @return the user
     */
    public User getUser ()
    {
        return user;
    }

    /**
     * Sets the user.
     *
     * @param user the new user
     */
    public void setUser (User user)
    {
        this.user = user;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [user = "+user+"]";
    }
	

}
