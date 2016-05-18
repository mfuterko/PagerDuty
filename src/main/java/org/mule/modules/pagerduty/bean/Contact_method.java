/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class Contact_method.
 */
public class Contact_method {
	
	/** The id. */
	private String id;


	/** The phone_number. */
	private String phone_number;

    /** The address. */
    private String address;

    /** The user_id. */
    private String user_id;

    /** The label. */
    private String label;

    /** The type. */
    private String type;
    
    /** The blacklisted. */
    private String blacklisted;

    
    /** The country_code. */
    private String country_code;

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
     * Gets the phone_number.
     *
     * @return the phone_number
     */
    public String getPhone_number ()
    {
        return phone_number;
    }

    /**
     * Sets the phone_number.
     *
     * @param phone_number the new phone_number
     */
    public void setPhone_number (String phone_number)
    {
        this.phone_number = phone_number;
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
     * Gets the blacklisted.
     *
     * @return the blacklisted
     */
    public String getBlacklisted ()
    {
        return blacklisted;
    }

    /**
     * Sets the blacklisted.
     *
     * @param blacklisted the new blacklisted
     */
    public void setBlacklisted (String blacklisted)
    {
        this.blacklisted = blacklisted;
    }

    /**
     * Gets the country_code.
     *
     * @return the country_code
     */
    public String getCountry_code ()
    {
        return country_code;
    }

    /**
     * Sets the country_code.
     *
     * @param country_code the new country_code
     */
    public void setCountry_code (String country_code)
    {
        this.country_code = country_code;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", phone_number = "+phone_number+", address = "+address+", user_id = "+user_id+", label = "+label+", type = "+type+", blacklisted = "+blacklisted+", country_code = "+country_code+"]";
    }

}
