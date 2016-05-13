/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

public class Contact_methods {
	
	
	/*
     * This id : For id 
     */
	private String id;

	/*
     * This email : For email 
     */
    private String email;

    
    /*
     * This address : For address 
     */
    private String address;

    
    /*
     * This user_id : For user id 
     */
    private String user_id;

    
    /*
     * This label : For contact type 
     */
    private String label;

    
    /*
     * This type : For contact type 
     */
    private String type;

    /*
     * This send_short_email : For sending short email 
     */
    private String send_short_email;

    
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
     * TO get the Email
     */
    public String getEmail ()
    {
        return email;
    }

    
    /*
     * TO set the Email
     */
    public void setEmail (String email)
    {
        this.email = email;
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
     * TO get the Send_short_email
     */
    public String getSend_short_email ()
    {
        return send_short_email;
    }

    
    /*
     * TO set the Send_short_email
     */
    public void setSend_short_email (String send_short_email)
    {
        this.send_short_email = send_short_email;
    }
    
    /*
     * This Is Override For Abstract Method String
     */

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", email = "+email+", address = "+address+", user_id = "+user_id+", label = "+label+", type = "+type+", send_short_email = "+send_short_email+"]";
    }

}
