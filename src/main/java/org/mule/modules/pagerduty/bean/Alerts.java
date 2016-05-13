package org.mule.modules.pagerduty.bean;



public class Alerts {
	
	/*
     * This Id : For Id 
     */
	private String id;

	
	/*
     * This Address : For Address 
     */
    private String address;

    
    /*
     * This Started_at : For Started_at 
     */
    private String started_at;

    
    /*
     * This Type : For Type 
     */
    private String type;

    
    /*
     * This User : For User 
     */
    private User user;

    
    /*
     * TO get the Id 
     */
    public String getId ()
    {
        return id;
    }

    
    /*
     * TO set the Id
     */
    public void setId (String id)
    {
        this.id = id;
    }

    
    /*
     * TO get the Address
     */
    public String getAddress ()
    {
        return address;
    }

    
    /*
     * TO set the Address
     */
    public void setAddress (String address)
    {
        this.address = address;
    }

    
    /*
     * TO get the Started_at
     */
    public String getStarted_at ()
    {
        return started_at;
    }

    
    /*
     * TO set the Started_at
     */
    public void setStarted_at (String started_at)
    {
        this.started_at = started_at;
    }

    
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
     * TO get the User
     */
    public User getUser ()
    {
        return user;
    }

    
    /*
     * TO set the User
     */
    public void setUser (User user)
    {
        this.user = user;
    }

    
    /*
     * This Is Override For Abstract Method String
     */
    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", address = "+address+", started_at = "+started_at+", type = "+type+", user = "+user+"]";
    }

}
