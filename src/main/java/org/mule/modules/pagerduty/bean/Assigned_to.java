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
	private String at;

    /** The object. */
    private Object object;

    
    /**
     * Gets the at.
     *
     * @return the at
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
    public void setAt (String at)
    {
        this.at = at;
    }

    /**
     * Gets the object.
     *
     * @return the object
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
    public void setObject (Object object)
    {
        this.object = object;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [at = "+at+", object = "+object+"]";
    }

}
