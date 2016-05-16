/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ListEntriesOfScheduleGetResponse extends StatusResponse {
	
	private String total;

    private Entries[] entries;

    public String getTotal ()
    {
        return total;
    }

    public void setTotal (String total)
    {
        this.total = total;
    }

    public Entries[] getEntries ()
    {
        return entries;
    }

    public void setEntries (Entries[] entries)
    {
        this.entries = entries;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [total = "+total+", entries = "+entries+"]";
    }

}
