package org.mule.modules.pagerduty.bean;

public class Rule_object {
	private String id;

    private String time_zone;

    private String color;

    private String email;

    private String name;

    private String type;

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

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", time_zone = "+time_zone+", color = "+color+", email = "+email+", name = "+name+", type = "+type+"]";
    }

}
