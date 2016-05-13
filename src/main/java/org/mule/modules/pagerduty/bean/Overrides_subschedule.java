/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

public class Overrides_subschedule {
	
	private String name;

    private String[] rendered_schedule_entries;

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String[] getRendered_schedule_entries ()
    {
        return rendered_schedule_entries;
    }

    public void setRendered_schedule_entries (String[] rendered_schedule_entries)
    {
        this.rendered_schedule_entries = rendered_schedule_entries;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [name = "+name+", rendered_schedule_entries = "+rendered_schedule_entries+"]";
    }

}
