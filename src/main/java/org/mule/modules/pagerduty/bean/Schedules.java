/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

public class Schedules {
	
	private String id;

    private String time_zone;

    private String[] escalation_policies;

    private String name;

    private String today;

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

    public String[] getEscalation_policies ()
    {
        return escalation_policies;
    }

    public void setEscalation_policies (String[] escalation_policies)
    {
        this.escalation_policies = escalation_policies;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getToday ()
    {
        return today;
    }

    public void setToday (String today)
    {
        this.today = today;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", time_zone = "+time_zone+", escalation_policies = "+escalation_policies+", name = "+name+", today = "+today+"]";
    }

}
