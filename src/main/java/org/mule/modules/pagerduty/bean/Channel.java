/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class Channel.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Channel {
	
	
	/** The type. */
	/*
     * This type : For channel type 
     */
	private String type;

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

    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    /*
     * This Is Override For Abstract Method String
     */
    @Override
    public String toString()
    {
        return "ClassPojo [type = "+type+"]";
    }

}
