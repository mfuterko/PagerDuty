package org.mule.modules.pagerduty.bean;

public class Contact_methods {
	
	private String id;

    private String email;

    private String address;

    private String user_id;

    private String label;

    private String type;

    private String send_short_email;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getEmail ()
    {
        return email;
    }

    public void setEmail (String email)
    {
        this.email = email;
    }

    public String getAddress ()
    {
        return address;
    }

    public void setAddress (String address)
    {
        this.address = address;
    }

    public String getUser_id ()
    {
        return user_id;
    }

    public void setUser_id (String user_id)
    {
        this.user_id = user_id;
    }

    public String getLabel ()
    {
        return label;
    }

    public void setLabel (String label)
    {
        this.label = label;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public String getSend_short_email ()
    {
        return send_short_email;
    }

    public void setSend_short_email (String send_short_email)
    {
        this.send_short_email = send_short_email;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", email = "+email+", address = "+address+", user_id = "+user_id+", label = "+label+", type = "+type+", send_short_email = "+send_short_email+"]";
    }

}
