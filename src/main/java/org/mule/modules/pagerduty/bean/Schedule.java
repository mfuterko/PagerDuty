/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class Schedule.
 */
public class Schedule {
	
	/** The id. */
	private String id;

    /** The time_zone. */
    private String time_zone;

    /** The escalation_policies. */
    private String[] escalation_policies;

    /** The final_schedule. */
    private Final_schedule final_schedule;

    /** The name. */
    private String name;

    /** The schedule_layers. */
    private Schedule_layers[] schedule_layers;

    /** The overrides_subschedule. */
    private Overrides_subschedule overrides_subschedule;

    /** The today. */
    private String today;

    /**
     * Gets the id.
     *
     * @return the id
     */
    public String getId ()
    {
        return id;
    }

    /**
     * Sets the id.
     *
     * @param id the new id
     */
    public void setId (String id)
    {
        this.id = id;
    }

    /**
     * Gets the time_zone.
     *
     * @return the time_zone
     */
    public String getTime_zone ()
    {
        return time_zone;
    }

    /**
     * Sets the time_zone.
     *
     * @param time_zone the new time_zone
     */
    public void setTime_zone (String time_zone)
    {
        this.time_zone = time_zone;
    }

    /**
     * Gets the escalation_policies.
     *
     * @return the escalation_policies
     */
    public String[] getEscalation_policies ()
    {
        return escalation_policies;
    }

    /**
     * Sets the escalation_policies.
     *
     * @param escalation_policies the new escalation_policies
     */
    public void setEscalation_policies (String[] escalation_policies)
    {
        this.escalation_policies = escalation_policies;
    }

    /**
     * Gets the final_schedule.
     *
     * @return the final_schedule
     */
    public Final_schedule getFinal_schedule ()
    {
        return final_schedule;
    }

    /**
     * Sets the final_schedule.
     *
     * @param final_schedule the new final_schedule
     */
    public void setFinal_schedule (Final_schedule final_schedule)
    {
        this.final_schedule = final_schedule;
    }

    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName ()
    {
        return name;
    }

    /**
     * Sets the name.
     *
     * @param name the new name
     */
    public void setName (String name)
    {
        this.name = name;
    }

    /**
     * Gets the schedule_layers.
     *
     * @return the schedule_layers
     */
    public Schedule_layers[] getSchedule_layers ()
    {
        return schedule_layers;
    }

    /**
     * Sets the schedule_layers.
     *
     * @param schedule_layers the new schedule_layers
     */
    public void setSchedule_layers (Schedule_layers[] schedule_layers)
    {
        this.schedule_layers = schedule_layers;
    }

    /**
     * Gets the overrides_subschedule.
     *
     * @return the overrides_subschedule
     */
    public Overrides_subschedule getOverrides_subschedule ()
    {
        return overrides_subschedule;
    }

    /**
     * Sets the overrides_subschedule.
     *
     * @param overrides_subschedule the new overrides_subschedule
     */
    public void setOverrides_subschedule (Overrides_subschedule overrides_subschedule)
    {
        this.overrides_subschedule = overrides_subschedule;
    }

    /**
     * Gets the today.
     *
     * @return the today
     */
    public String getToday ()
    {
        return today;
    }

    /**
     * Sets the today.
     *
     * @param today the new today
     */
    public void setToday (String today)
    {
        this.today = today;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", time_zone = "+time_zone+", escalation_policies = "+escalation_policies+", final_schedule = "+final_schedule+", name = "+name+", schedule_layers = "+schedule_layers+", overrides_subschedule = "+overrides_subschedule+", today = "+today+"]";
    }
}
