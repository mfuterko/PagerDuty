/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

public class Assigned_to_user {
	
	
	/*
     * This html_url : For html_url
     */
	private String html_url;

	
	/*
     * This Id : For Id 
     */
    private String id;

    
    /*
     * This email : For email 
     */
    private String email;

    
    /*
     * This name : For name 
     */
    private String name;

    
    /*
     * TO get the Html_url
     */
    public String getHtml_url ()
    {
        return html_url;
    }

    
    /*
     * TO set the Html_url
     */
    public void setHtml_url (String html_url)
    {
        this.html_url = html_url;
    }

    
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
     * TO get the Name
     */
    public String getName ()
    {
        return name;
    }

    
    /*
     * TO set the Name
     */
    public void setName (String name)
    {
        this.name = name;
    }

    
    /*
     * This Is Override For Abstract Method String
     */
    @Override
    public String toString()
    {
        return "ClassPojo [html_url = "+html_url+", id = "+id+", email = "+email+", name = "+name+"]";
    }

}
