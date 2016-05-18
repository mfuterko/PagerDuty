/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class ScheduleByIdGetResponse.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ScheduleByIdGetResponse extends StatusResponse {
	
	/** The schedule. */
	private Schedule schedule;

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
        return "ClassPojo [schedule = "+schedule+"]";
    }

}
