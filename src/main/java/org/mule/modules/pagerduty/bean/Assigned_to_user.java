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
	private String html_url;

    /** The id. */
    private String id;

    
    /** The email. */
    private String email;

    /** The name. */
    private String name;
    
    /**
     * Gets the html_url.
     *
     * @return the html_url
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
    public void setHtml_url (String html_url)
    {
        this.html_url = html_url;
    }
    
    /**
     * Gets the id.
     *
     * @return the id
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
    public void setId (String id)
    {
        this.id = id;
    }

    /**
     * Gets the email.
     *
     * @return the email
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
    public void setEmail (String email)
    {
        this.email = email;
    }

    /**
     * Gets the name.
     *
     * @return the name
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
    public void setName (String name)
    {
        this.name = name;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [html_url = "+html_url+", id = "+id+", email = "+email+", name = "+name+"]";
    }

}
