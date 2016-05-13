/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

public class SchedulePreviewPostResponse extends StatusResponse {
	
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
