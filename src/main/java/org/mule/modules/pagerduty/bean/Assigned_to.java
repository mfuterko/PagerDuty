package org.mule.modules.pagerduty.bean;

public class Assigned_to {
	
	
	/*
     * This at : For at 
     */
	private String at;

	
	/*
     * This object : For object 
     */
    private Object object;

    
    
    /*
     * TO get the At
     */
    public String getAt ()
    {
        return at;
    }

    
    /*
     * TO set the At
     */
    public void setAt (String at)
    {
        this.at = at;
    }

    
    /*
     * TO get the Object
     */
    public Object getObject ()
    {
        return object;
    }

    
    /*
     * TO set the Object
     */
    public void setObject (Object object)
    {
        this.object = object;
    }

    
    /*
     * This Is Override For Abstract Method String
     */
    @Override
    public String toString()
    {
        return "ClassPojo [at = "+at+", object = "+object+"]";
    }

}
