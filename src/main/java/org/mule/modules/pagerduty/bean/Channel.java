/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

public class Channel {
	
	
	/*
     * This type : For channel type 
     */
	private String type;

	/*
     * TO get the Type
     */
    public String getType ()
    {
        return type;
    }

    
    /*
     * TO set the Type
     */
    public void setType (String type)
    {
        this.type = type;
    }

    
    /*
     * This Is Override For Abstract Method String
     */
    @Override
    public String toString()
    {
        return "ClassPojo [type = "+type+"]";
    }

}
