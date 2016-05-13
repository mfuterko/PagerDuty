/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

public class LogEntriesByIdGetResponse extends StatusResponse {
	
	private Log_entry log_entry;

    public Log_entry getLog_entry ()
    {
        return log_entry;
    }

    public void setLog_entry (Log_entry log_entry)
    {
        this.log_entry = log_entry;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [log_entry = "+log_entry+"]";
    }

}
