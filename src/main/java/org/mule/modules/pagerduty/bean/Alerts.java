package org.mule.modules.pagerduty.bean;



public class Alerts {
	private String id;

    private String address;

    private String started_at;

    private String type;

    private User user;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getAddress ()
    {
        return address;
    }

    public void setAddress (String address)
    {
        this.address = address;
    }

    public String getStarted_at ()
    {
        return started_at;
    }

    public void setStarted_at (String started_at)
    {
        this.started_at = started_at;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public User getUser ()
    {
        return user;
    }

    public void setUser (User user)
    {
        this.user = user;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", address = "+address+", started_at = "+started_at+", type = "+type+", user = "+user+"]";
    }

}
