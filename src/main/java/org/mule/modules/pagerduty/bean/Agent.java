/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

public class Agent {
	/*
	 * This id: Agent Id
	 */
	private String id;
	
	/*
	 * This time_zone : time zone of the locale
	 */

    private String time_zone;
    
    /*
     * This invitation_sent
     */

    private String invitation_sent;

    
    /*
     * This avatar_url  : For Image Url
     */
    private String avatar_url;

    /*
     * This is For color 
     */
    private String color;

    /*
     * This email  : For Agent Email
     */
    private String email;

    /*
     * This name  : For Agent Name
     */
    private String name;

    /*
     * This role  : For Agent Role
     */
    private String role;

    /*
     * This user_url  : For user url
     */
    private String user_url;

    /*
     * This Type  : For Agent Type
     */
    private String type;

    /*
     * This marketing_opt_out  : For Marketing Operation Out
     */
    private String marketing_opt_out;
    
    /*
     * TO get the agents id
     */

    public String getId ()
    {
        return id;
    }

    /*
     * TO set the agents id
     */
    public void setId (String id)
    {
        this.id = id;
    }

    /*
     * TO get the Time_Zone
     */
    public String getTime_zone ()
    {
        return time_zone;
    }

    /*
     * TO set the Time_zone
     */
    public void setTime_zone (String time_zone)
    {
        this.time_zone = time_zone;
    }

    /*
     * TO get the Invitation_sent
     */
    public String getInvitation_sent ()
    {
        return invitation_sent;
    }

    /*
     * TO set the Invitation_sent
     */
    public void setInvitation_sent (String invitation_sent)
    {
        this.invitation_sent = invitation_sent;
    }

    
    /*
     * TO get the Avatar_url
     */
    public String getAvatar_url ()
    {
        return avatar_url;
    }

    /*
     * TO set the Avatar_url
     */
    public void setAvatar_url (String avatar_url)
    {
        this.avatar_url = avatar_url;
    }

    
    
    /*
     * TO get the Color
     */
    public String getColor ()
    {
        return color;
    }

    
    /*
     * TO set the Color
     */
    public void setColor (String color)
    {
        this.color = color;
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
     * TO get the Role
     */
    public String getRole ()
    {
        return role;
    }

    
    /*
     * TO set the Role
     */
    public void setRole (String role)
    {
        this.role = role;
    }

    
    /*
     * TO get the user_url
     */
    public String getUser_url ()
    {
        return user_url;
    }

    
    /*
     * TO set the user_url
     */
    public void setUser_url (String user_url)
    {
        this.user_url = user_url;
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
     * TO get the Marketing_opt_out
     */
    public String getMarketing_opt_out ()
    {
        return marketing_opt_out;
    }

    
    /*
     * TO set the Marketing_opt_out
     */
    public void setMarketing_opt_out (String marketing_opt_out)
    {
        this.marketing_opt_out = marketing_opt_out;
    }

    
    /*
     * This Is Override For Abstract Method String
     */
    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", time_zone = "+time_zone+", invitation_sent = "+invitation_sent+", avatar_url = "+avatar_url+", color = "+color+", email = "+email+", name = "+name+", role = "+role+", user_url = "+user_url+", type = "+type+", marketing_opt_out = "+marketing_opt_out+"]";
    }

}
