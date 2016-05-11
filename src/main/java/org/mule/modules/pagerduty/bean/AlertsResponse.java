package org.mule.modules.pagerduty.bean;

public class AlertsResponse extends StatusResponse {
	private String total;

    private String limit;

    private Alerts[] alerts;

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

    public Alerts[] getAlerts ()
    {
        return alerts;
    }

    public void setAlerts (Alerts[] alerts)
    {
        this.alerts = alerts;
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
        return "ClassPojo [total = "+total+", limit = "+limit+", alerts = "+alerts+", offset = "+offset+"]";
    }

}
