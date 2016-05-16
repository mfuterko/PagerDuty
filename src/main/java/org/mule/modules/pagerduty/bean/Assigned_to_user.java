/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class Assigned_to_user.
 */
public class Assigned_to_user {
	
	
	/** The html_url. */
	/*
     * This html_url : For html_url
     */
	private String html_url;

	
	/** The id. */
	/*
     * This Id : For Id 
     */
    private String id;

    
    /** The email. */
    /*
     * This email : For email 
     */
    private String email;

    
    /** The name. */
    /*
     * This name : For name 
     */
    private String name;

    
    /**
     * Gets the html_url.
     *
     * @return the html_url
     */
    /*
     * TO get the Html_url
     */
    public String getHtml_url ()
    {
        return html_url;
    }

    
    /**
     * Sets the html_url.
     *
     * @param html_url the new html_url
     */
    /*
     * TO set the Html_url
     */
    public void setHtml_url (String html_url)
    {
        this.html_url = html_url;
    }

    
    /**
     * Gets the id.
     *
     * @return the id
     */
    /*
     * TO get the Id
     */
    public String getId ()
    {
        return id;
    }

    
    /**
     * Sets the id.
     *
     * @param id the new id
     */
    /*
     * TO set the Id
     */
    public void setId (String id)
    {
        this.id = id;
    }

    
    /**
     * Gets the email.
     *
     * @return the email
     */
    /*
     * TO get the Email
     */
    public String getEmail ()
    {
        return email;
    }

    
    /**
     * Sets the email.
     *
     * @param email the new email
     */
    /*
     * TO set the Email
     */
    public void setEmail (String email)
    {
        this.email = email;
    }

    
    /**
     * Gets the name.
     *
     * @return the name
     */
    /*
     * TO get the Name
     */
    public String getName ()
    {
        return name;
    }

    
    /**
     * Sets the name.
     *
     * @param name the new name
     */
    /*
     * TO set the Name
     */
    public void setName (String name)
    {
        this.name = name;
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
        return "ClassPojo [html_url = "+html_url+", id = "+id+", email = "+email+", name = "+name+"]";
    }

}
