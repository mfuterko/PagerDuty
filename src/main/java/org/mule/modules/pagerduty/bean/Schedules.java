/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class Schedules.
 */
public class Schedules {
	
	/** The id. */
	private String id;

    /** The time_zone. */
    private String time_zone;

    /** The escalation_policies. */
    private String[] escalation_policies;

    /** The name. */
    private String name;

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
        return "ClassPojo [id = "+id+", time_zone = "+time_zone+", escalation_policies = "+escalation_policies+", name = "+name+", today = "+today+"]";
    }

}
