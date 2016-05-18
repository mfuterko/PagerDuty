/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class Users.
 */
public class Users {
	
	/** The member_order. */
	private String member_order;

    /** The user. */
    private User user;

    /**
     * Gets the member_order.
     *
     * @return the member_order
     */
    public String getMember_order ()
    {
        return member_order;
    }

    /**
     * Sets the member_order.
     *
     * @param member_order the new member_order
     */
    public void setMember_order (String member_order)
    {
        this.member_order = member_order;
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

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [member_order = "+member_order+", user = "+user+"]";
    }

}
