package org.mule.modules.pagerduty.bean;

public class SchedulesGetResponse extends StatusResponse {
	
	 private String total;

	    private String limit;

	    private Schedules[] schedules;

	    private String offset;

	    public String getTotal ()
	    {
	        return total;
	    }

	    public void setTotal (String total)
	    {
	        this.total = total;
	    }

	    public String getLimit ()
	    {
	        return limit;
	    }

	    public void setLimit (String limit)
	    {
	        this.limit = limit;
	    }

	    public Schedules[] getSchedules ()
	    {
	        return schedules;
	    }

	    public void setSchedules (Schedules[] schedules)
	    {
	        this.schedules = schedules;
	    }

	    public String getOffset ()
	    {
	        return offset;
	    }

	    public void setOffset (String offset)
	    {
	        this.offset = offset;
	    }

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [total = "+total+", limit = "+limit+", schedules = "+schedules+", offset = "+offset+"]";
	    }

}
