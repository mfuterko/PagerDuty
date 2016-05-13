/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

public class Contact_method {
	
	
	/*
     * This id : For id 
     */
	private String id;


	/*
     * This phone_number : For phone_number 
     */
	private String phone_number;

    
    /*
     * This address : For address 
     */
    private String address;

    
    /*
     * This user_id : For user_id 
     */
    private String user_id;

    /*
     * This label : For contact label 
     */
    private String label;

    
    /*
     * This type : For Contact type 
     */
    private String type;

    /*
     * This blacklisted : For blacklisted 
     */
    private String blacklisted;

    
    /*
     * This country_code : For country_code 
     */
    private String country_code;

    
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
     * TO get the Phone_number
     */
    public String getPhone_number ()
    {
        return phone_number;
    }

    
    /*
     * TO set the Phone_number
     */
    public void setPhone_number (String phone_number)
    {
        this.phone_number = phone_number;
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
     * TO get the User_id
     */
    public String getUser_id ()
    {
        return user_id;
    }

    
    /*
     * TO set the User_id
     */
    public void setUser_id (String user_id)
    {
        this.user_id = user_id;
    }

    
    /*
     * TO get the Label
     */
    public String getLabel ()
    {
        return label;
    }

    
    /*
     * TO set the Label
     */
    public void setLabel (String label)
    {
        this.label = label;
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
     * TO get the Blacklisted
     */
    public String getBlacklisted ()
    {
        return blacklisted;
    }

    
    /*
     * TO set the Blacklisted
     */
    public void setBlacklisted (String blacklisted)
    {
        this.blacklisted = blacklisted;
    }

    
    /*
     * TO get the Country_code
     */
    public String getCountry_code ()
    {
        return country_code;
    }

    
    /*
     * TO set the Country_code
     */
    public void setCountry_code (String country_code)
    {
        this.country_code = country_code;
    }

    
    /*
     * This Is Override For Abstract Method String
     */
    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", phone_number = "+phone_number+", address = "+address+", user_id = "+user_id+", label = "+label+", type = "+type+", blacklisted = "+blacklisted+", country_code = "+country_code+"]";
    }

}
