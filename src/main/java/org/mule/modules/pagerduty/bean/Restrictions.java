package org.mule.modules.pagerduty.bean;

public class Restrictions {
	
	private String duration_seconds;

    private String start_time_of_day;

    public String getDuration_seconds ()
    {
        return duration_seconds;
    }

    public void setDuration_seconds (String duration_seconds)
    {
        this.duration_seconds = duration_seconds;
    }

    public String getStart_time_of_day ()
    {
        return start_time_of_day;
    }

    public void setStart_time_of_day (String start_time_of_day)
    {
        this.start_time_of_day = start_time_of_day;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [duration_seconds = "+duration_seconds+", start_time_of_day = "+start_time_of_day+"]";
    }

}
