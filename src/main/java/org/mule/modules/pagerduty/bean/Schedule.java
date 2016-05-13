/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

public class Schedule {
	
	private String id;

    private String time_zone;

    private String[] escalation_policies;

    private Final_schedule final_schedule;

    private String name;

    private Schedule_layers[] schedule_layers;

    private Overrides_subschedule overrides_subschedule;

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

    public Final_schedule getFinal_schedule ()
    {
        return final_schedule;
    }

    public void setFinal_schedule (Final_schedule final_schedule)
    {
        this.final_schedule = final_schedule;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public Schedule_layers[] getSchedule_layers ()
    {
        return schedule_layers;
    }

    public void setSchedule_layers (Schedule_layers[] schedule_layers)
    {
        this.schedule_layers = schedule_layers;
    }

    public Overrides_subschedule getOverrides_subschedule ()
    {
        return overrides_subschedule;
    }

    public void setOverrides_subschedule (Overrides_subschedule overrides_subschedule)
    {
        this.overrides_subschedule = overrides_subschedule;
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
        return "ClassPojo [id = "+id+", time_zone = "+time_zone+", escalation_policies = "+escalation_policies+", final_schedule = "+final_schedule+", name = "+name+", schedule_layers = "+schedule_layers+", overrides_subschedule = "+overrides_subschedule+", today = "+today+"]";
    }
}
