/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SchedulesPutResponse extends StatusResponse {
	
	private Schedule schedule;

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
        return "ClassPojo [schedule = "+schedule+"]";
    }

}
