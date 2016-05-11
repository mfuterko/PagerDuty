package org.mule.modules.pagerduty.bean;

public class Channel {
	
	private String type;

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
        return "ClassPojo [type = "+type+"]";
    }

}
