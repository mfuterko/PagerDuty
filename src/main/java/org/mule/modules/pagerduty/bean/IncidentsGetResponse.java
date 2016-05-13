/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

public class IncidentsGetResponse extends StatusResponse {
	
	private String total;

    private String limit;

    private Incidents[] incidents;

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

    public Incidents[] getIncidents ()
    {
        return incidents;
    }

    public void setIncidents (Incidents[] incidents)
    {
        this.incidents = incidents;
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
        return "ClassPojo [total = "+total+", limit = "+limit+", incidents = "+incidents+", offset = "+offset+"]";
    }

}
