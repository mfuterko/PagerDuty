package org.mule.modules.pagerduty.bean;

public class Agent {
	
	private String id;

    private String time_zone;

    private String invitation_sent;

    private String avatar_url;

    private String color;

    private String email;

    private String name;

    private String role;

    private String user_url;

    private String type;

    private String marketing_opt_out;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
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

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
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
        return "ClassPojo [id = "+id+", time_zone = "+time_zone+", invitation_sent = "+invitation_sent+", avatar_url = "+avatar_url+", color = "+color+", email = "+email+", name = "+name+", role = "+role+", user_url = "+user_url+", type = "+type+", marketing_opt_out = "+marketing_opt_out+"]";
    }

}
