/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class Restrictions.
 */
public class Restrictions {
	
	/** The duration_seconds. */
	private String duration_seconds;

    /** The start_time_of_day. */
    private String start_time_of_day;

    /**
     * Gets the duration_seconds.
     *
     * @return the duration_seconds
     */
    public String getDuration_seconds ()
    {
        return duration_seconds;
    }

    /**
     * Sets the duration_seconds.
     *
     * @param duration_seconds the new duration_seconds
     */
    public void setDuration_seconds (String duration_seconds)
    {
        this.duration_seconds = duration_seconds;
    }

    /**
     * Gets the start_time_of_day.
     *
     * @return the start_time_of_day
     */
    public String getStart_time_of_day ()
    {
        return start_time_of_day;
    }

    /**
     * Sets the start_time_of_day.
     *
     * @param start_time_of_day the new start_time_of_day
     */
    public void setStart_time_of_day (String start_time_of_day)
    {
        this.start_time_of_day = start_time_of_day;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [duration_seconds = "+duration_seconds+", start_time_of_day = "+start_time_of_day+"]";
    }

}
