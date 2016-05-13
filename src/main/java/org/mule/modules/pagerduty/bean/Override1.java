package org.mule.modules.pagerduty.bean;

public class Override1 {
	
	private String id;

    private String start;

    private User user;

    private String end;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getStart ()
    {
        return start;
    }

    public void setStart (String start)
    {
        this.start = start;
    }

    public User getUser ()
    {
        return user;
    }

    public void setUser (User user)
    {
        this.user = user;
    }

    public String getEnd ()
    {
        return end;
    }

    public void setEnd (String end)
    {
        this.end = end;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", start = "+start+", user = "+user+", end = "+end+"]";
    }

}
