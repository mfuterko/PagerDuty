/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class Users.
 */
public class Users {
	
	  private String id;

	    private String billed;

	    private String time_zone;

	    private String invitation_sent;

	    private String avatar_url;

	    private String color;

	    private String email;

	    private String job_title;

	    private String name;

	    private String role;

	    private String user_url;

	    private String marketing_opt_out;

	    public String getId ()
	    {
	        return id;
	    }

	    public void setId (String id)
	    {
	        this.id = id;
	    }

	    public String getBilled ()
	    {
	        return billed;
	    }

	    public void setBilled (String billed)
	    {
	        this.billed = billed;
	    }

	    public String getTime_zone ()
	    {
	        return time_zone;
	    }

	    public void setTime_zone (String time_zone)
	    {
	        this.time_zone = time_zone;
	    }

	    public String getInvitation_sent ()
	    {
	        return invitation_sent;
	    }

	    public void setInvitation_sent (String invitation_sent)
	    {
	        this.invitation_sent = invitation_sent;
	    }

	    public String getAvatar_url ()
	    {
	        return avatar_url;
	    }

	    public void setAvatar_url (String avatar_url)
	    {
	        this.avatar_url = avatar_url;
	    }

	    public String getColor ()
	    {
	        return color;
	    }

	    public void setColor (String color)
	    {
	        this.color = color;
	    }

	    public String getEmail ()
	    {
	        return email;
	    }

	    public void setEmail (String email)
	    {
	        this.email = email;
	    }

	    public String getJob_title ()
	    {
	        return job_title;
	    }

	    public void setJob_title (String job_title)
	    {
	        this.job_title = job_title;
	    }

	    public String getName ()
	    {
	        return name;
	    }

	    public void setName (String name)
	    {
	        this.name = name;
	    }

	    public String getRole ()
	    {
	        return role;
	    }

	    public void setRole (String role)
	    {
	        this.role = role;
	    }

	    public String getUser_url ()
	    {
	        return user_url;
	    }

	    public void setUser_url (String user_url)
	    {
	        this.user_url = user_url;
	    }

	    public String getMarketing_opt_out ()
	    {
	        return marketing_opt_out;
	    }

	    public void setMarketing_opt_out (String marketing_opt_out)
	    {
	        this.marketing_opt_out = marketing_opt_out;
	    }

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [id = "+id+", billed = "+billed+", time_zone = "+time_zone+", invitation_sent = "+invitation_sent+", avatar_url = "+avatar_url+", color = "+color+", email = "+email+", job_title = "+job_title+", name = "+name+", role = "+role+", user_url = "+user_url+", marketing_opt_out = "+marketing_opt_out+"]";
	    }
}
