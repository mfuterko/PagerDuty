/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class Contact_methods.
 */
public class Contact_methods {
	
	
	/** The id. */
	private String id;

    /** The email. */
    private String email;

    
    /** The address. */
    private String address;

    
    /** The user_id. */
    private String user_id;

    /** The label. */
    private String label;

    
    /** The type. */
    private String type;
    
    /** The send_short_email. */
    private String send_short_email;

    
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
     * Gets the address.
     *
     * @return the address
     */
    public String getAddress ()
    {
        return address;
    }

    /**
     * Sets the address.
     *
     * @param address the new address
     */
    public void setAddress (String address)
    {
        this.address = address;
    }

    /**
     * Gets the user_id.
     *
     * @return the user_id
     */
    public String getUser_id ()
    {
        return user_id;
    }

    /**
     * Sets the user_id.
     *
     * @param user_id the new user_id
     */
    public void setUser_id (String user_id)
    {
        this.user_id = user_id;
    }

    
    /**
     * Gets the label.
     *
     * @return the label
     */
    public String getLabel ()
    {
        return label;
    }

    /**
     * Sets the label.
     *
     * @param label the new label
     */
    public void setLabel (String label)
    {
        this.label = label;
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

    /**
     * Gets the send_short_email.
     *
     * @return the send_short_email
     */
    public String getSend_short_email ()
    {
        return send_short_email;
    }

    /**
     * Sets the send_short_email.
     *
     * @param send_short_email the new send_short_email
     */
    public void setSend_short_email (String send_short_email)
    {
        this.send_short_email = send_short_email;
    }
    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", email = "+email+", address = "+address+", user_id = "+user_id+", label = "+label+", type = "+type+", send_short_email = "+send_short_email+"]";
    }

}
