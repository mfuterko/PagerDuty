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
	/*
     * This Id : For Id 
     */
	private String id;

	
	/** The address. */
	/*
     * This Address : For Address 
     */
    private String address;

    
    /** The started_at. */
    /*
     * This Started_at : For Started_at 
     */
    private String started_at;

    
    /** The type. */
    /*
     * This Type : For Type 
     */
    private String type;

    
    /** The user. */
    /*
     * This User : For User 
     */
    private User user;

    
    /**
     * Gets the id.
     *
     * @return the id
     */
    /*
     * TO get the Id 
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
    /*
     * TO set the Id
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
    /*
     * TO get the Address
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
    /*
     * TO set the Address
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
    /*
     * TO get the Started_at
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
    /*
     * TO set the Started_at
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
    /*
     * TO get the Type
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
    /*
     * TO set the Type
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
    /*
     * TO get the User
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
    /*
     * TO set the User
     */
    public void setUser (User user)
    {
        this.user = user;
    }

    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    /*
     * This Is Override For Abstract Method String
     */
    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", address = "+address+", started_at = "+started_at+", type = "+type+", user = "+user+"]";
    }

}
