/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class Targets.
 */
public class Targets {
	
	/** The id. */
	private String id;

    /** The time_zone. */
    private String time_zone;

    /** The color. */
    private String color;

    /** The email. */
    private String email;

    /** The name. */
    private String name;

    /** The type. */
    private String type;

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
     * Gets the time_zone.
     *
     * @return the time_zone
     */
    public String getTime_zone ()
    {
        return time_zone;
    }

    /**
     * Sets the time_zone.
     *
     * @param time_zone the new time_zone
     */
    public void setTime_zone (String time_zone)
    {
        this.time_zone = time_zone;
    }

    /**
     * Gets the color.
     *
     * @return the color
     */
    public String getColor ()
    {
        return color;
    }

    /**
     * Sets the color.
     *
     * @param color the new color
     */
    public void setColor (String color)
    {
        this.color = color;
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

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", time_zone = "+time_zone+", color = "+color+", email = "+email+", name = "+name+", type = "+type+"]";
    }

}
