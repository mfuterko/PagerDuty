/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class SchedulesPostResponse.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SchedulesPostResponse extends StatusResponse {
	
	/** The id. */
	private String id;

    /** The schedule. */
    private Schedule schedule;

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
     * Gets the schedule.
     *
     * @return the schedule
     */
    public Schedule getSchedule ()
    {
        return schedule;
    }

    /**
     * Sets the schedule.
     *
     * @param schedule the new schedule
     */
    public void setSchedule (Schedule schedule)
    {
        this.schedule = schedule;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", schedule = "+schedule+"]";
    }

}
