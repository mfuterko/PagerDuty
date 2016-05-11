package org.mule.modules.pagerduty.bean;

import java.util.Date;
import java.util.TimeZone;

public class ScheduleByIdGetResponse extends StatusResponse {
	
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
