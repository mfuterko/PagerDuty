/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class Pending_actions.
 */
public class Pending_actions {
	
	/** The at. */
	private String at;

    /** The type. */
    private String type;

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

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [at = "+at+", type = "+type+"]";
    }

}
