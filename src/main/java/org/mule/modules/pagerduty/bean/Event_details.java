package org.mule.modules.pagerduty.bean;

public class Event_details {
	private String description;

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [description = "+description+"]";
    }
}
