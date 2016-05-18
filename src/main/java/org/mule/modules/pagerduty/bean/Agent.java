/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class Agent.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Agent {
	
	/** The id. */
	private String id;
	
    /** The time_zone. */
	private String time_zone;
    
    /** The invitation_sent. */
    private String invitation_sent;

    
    /** The avatar_url. */
    private String avatar_url;

    /** The color. */
    private String color;

    /** The email. */
    private String email;

    /** The name. */
    private String name;

    /** The role. */
    private String role;

    /** The user_url. */
    private String user_url;

    /** The type. */
    private String type;

    /** The marketing_opt_out. */
    private String marketing_opt_out;
    
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
     * Gets the invitation_sent.
     *
     * @return the invitation_sent
     */
    public String getInvitation_sent ()
    {
        return invitation_sent;
    }

    /**
     * Sets the invitation_sent.
     *
     * @param invitation_sent the new invitation_sent
     */
    public void setInvitation_sent (String invitation_sent)
    {
        this.invitation_sent = invitation_sent;
    }

    
    /**
     * Gets the avatar_url.
     *
     * @return the avatar_url
     */
    public String getAvatar_url ()
    {
        return avatar_url;
    }

    /**
     * Sets the avatar_url.
     *
     * @param avatar_url the new avatar_url
     */
    public void setAvatar_url (String avatar_url)
    {
        this.avatar_url = avatar_url;
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
     * Gets the role.
     *
     * @return the role
     */
    public String getRole ()
    {
        return role;
    }

    
    /**
     * Sets the role.
     *
     * @param role the new role
     */
    public void setRole (String role)
    {
        this.role = role;
    }

    
    /**
     * Gets the user_url.
     *
     * @return the user_url
     */
    public String getUser_url ()
    {
        return user_url;
    }

    
    /**
     * Sets the user_url.
     *
     * @param user_url the new user_url
     */
    public void setUser_url (String user_url)
    {
        this.user_url = user_url;
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
     * Gets the marketing_opt_out.
     *
     * @return the marketing_opt_out
     */
    public String getMarketing_opt_out ()
    {
        return marketing_opt_out;
    }

    
    /**
     * Sets the marketing_opt_out.
     *
     * @param marketing_opt_out the new marketing_opt_out
     */
    public void setMarketing_opt_out (String marketing_opt_out)
    {
        this.marketing_opt_out = marketing_opt_out;
    }

    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", time_zone = "+time_zone+", invitation_sent = "+invitation_sent+", avatar_url = "+avatar_url+", color = "+color+", email = "+email+", name = "+name+", role = "+role+", user_url = "+user_url+", type = "+type+", marketing_opt_out = "+marketing_opt_out+"]";
    }

}
