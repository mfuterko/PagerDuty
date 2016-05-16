/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SchedulesPostResponse extends StatusResponse {
	
	private String id;

    private Schedule schedule;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public Schedule getSchedule ()
    {
        return schedule;
    }

    public void setSchedule (Schedule schedule)
    {
        this.schedule = schedule;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", schedule = "+schedule+"]";
    }

}
