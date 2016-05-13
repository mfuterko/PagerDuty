/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

public class Incident_counts {
	private String total;

    private String resolved;

    private String acknowledged;

    private String triggered;

    public String getTotal ()
    {
        return total;
    }

    public void setTotal (String total)
    {
        this.total = total;
    }

    public String getResolved ()
    {
        return resolved;
    }

    public void setResolved (String resolved)
    {
        this.resolved = resolved;
    }

    public String getAcknowledged ()
    {
        return acknowledged;
    }

    public void setAcknowledged (String acknowledged)
    {
        this.acknowledged = acknowledged;
    }

    public String getTriggered ()
    {
        return triggered;
    }

    public void setTriggered (String triggered)
    {
        this.triggered = triggered;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [total = "+total+", resolved = "+resolved+", acknowledged = "+acknowledged+", triggered = "+triggered+"]";
    }
}
