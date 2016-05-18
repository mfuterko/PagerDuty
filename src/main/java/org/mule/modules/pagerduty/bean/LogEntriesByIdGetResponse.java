/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class LogEntriesByIdGetResponse.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class LogEntriesByIdGetResponse extends StatusResponse {
	
	/** The log_entry. */
	private Log_entry log_entry;

    /**
     * Gets the log_entry.
     *
     * @return the log_entry
     */
    public Log_entry getLog_entry ()
    {
        return log_entry;
    }

    /**
     * Sets the log_entry.
     *
     * @param log_entry the new log_entry
     */
    public void setLog_entry (Log_entry log_entry)
    {
        this.log_entry = log_entry;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [log_entry = "+log_entry+"]";
    }

}
