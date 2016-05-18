/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;


// TODO: Auto-generated Javadoc
/**
 * The Class Alerts.
 */
public class Alerts {
	
	
	/** The id. */
	private String id;

	/** The address. */
	private String address;

    
    /** The started_at. */
    private String started_at;

    /** The type. */
    private String type;

    /** The user. */
    private User user;

    /**
     * Gets the id.
     *
     * @return the id
     */
    public String getId ()
    {
        return id;
    }

    /**
     * Sets the id.
     *
     * @param id the new id
     */
    public void setId (String id)
    {
        this.id = id;
    }

    /**
     * Gets the address.
     *
     * @return the address
     */
    public String getAddress ()
    {
        return address;
    }

    /**
     * Sets the address.
     *
     * @param address the new address
     */
    public void setAddress (String address)
    {
        this.address = address;
    }
    
    /**
     * Gets the started_at.
     *
     * @return the started_at
     */
    public String getStarted_at ()
    {
        return started_at;
    }

    /**
     * Sets the started_at.
     *
     * @param started_at the new started_at
     */
    public void setStarted_at (String started_at)
    {
        this.started_at = started_at;
    }

    
    /**
     * Gets the type.
     *
     * @return the type
     */
    public String getType ()
    {
        return type;
    }

    /**
     * Sets the type.
     *
     * @param type the new type
     */
    public void setType (String type)
    {
        this.type = type;
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
        return "ClassPojo [id = "+id+", address = "+address+", started_at = "+started_at+", type = "+type+", user = "+user+"]";
    }

}
