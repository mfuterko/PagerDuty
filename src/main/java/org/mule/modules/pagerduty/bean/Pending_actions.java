package org.mule.modules.pagerduty.bean;

public class Pending_actions {
	
	private String at;

    private String type;

    public String getAt ()
    {
        return at;
    }

    public void setAt (String at)
    {
        this.at = at;
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
        return "ClassPojo [at = "+at+", type = "+type+"]";
    }

}
