/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class Overrides.
 */
public class Overrides {
	
	/** The start. */
	private String start;

    /** The user. */
    private User user;

    /** The end. */
    private String end;

    /**
     * Gets the start.
     *
     * @return the start
     */
    public String getStart ()
    {
        return start;
    }

    /**
     * Sets the start.
     *
     * @param start the new start
     */
    public void setStart (String start)
    {
        this.start = start;
    }

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

    /**
     * Gets the end.
     *
     * @return the end
     */
    public String getEnd ()
    {
        return end;
    }

    /**
     * Sets the end.
     *
     * @param end the new end
     */
    public void setEnd (String end)
    {
        this.end = end;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [start = "+start+", user = "+user+", end = "+end+"]";
    }

}
