/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class Assigned_to.
 */
public class Assigned_to {
	
	
	/** The at. */
	/*
     * This at : For at 
     */
	private String at;

	
	/** The object. */
	/*
     * This object : For object 
     */
    private Object object;

    
    
    /**
     * Gets the at.
     *
     * @return the at
     */
    /*
     * TO get the At
     */
    public String getAt ()
    {
        return at;
    }

    
    /**
     * Sets the at.
     *
     * @param at the new at
     */
    /*
     * TO set the At
     */
    public void setAt (String at)
    {
        this.at = at;
    }

    
    /**
     * Gets the object.
     *
     * @return the object
     */
    /*
     * TO get the Object
     */
    public Object getObject ()
    {
        return object;
    }

    
    /**
     * Sets the object.
     *
     * @param object the new object
     */
    /*
     * TO set the Object
     */
    public void setObject (Object object)
    {
        this.object = object;
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
        return "ClassPojo [at = "+at+", object = "+object+"]";
    }

}
