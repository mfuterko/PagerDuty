/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class LogEntriesGetResponse.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class LogEntriesGetResponse extends StatusResponse {
	
	/** The total. */
	private String total;

    /** The limit. */
    private String limit;

    /** The log_entries. */
    private Log_entries[] log_entries;

    /** The offset. */
    private String offset;

    /**
     * Gets the total.
     *
     * @return the total
     */
    public String getTotal ()
    {
        return total;
    }

    /**
     * Sets the total.
     *
     * @param total the new total
     */
    public void setTotal (String total)
    {
        this.total = total;
    }

    /**
     * Gets the limit.
     *
     * @return the limit
     */
    public String getLimit ()
    {
        return limit;
    }

    /**
     * Sets the limit.
     *
     * @param limit the new limit
     */
    public void setLimit (String limit)
    {
        this.limit = limit;
    }

    /**
     * Gets the log_entries.
     *
     * @return the log_entries
     */
    public Log_entries[] getLog_entries ()
    {
        return log_entries;
    }

    /**
     * Sets the log_entries.
     *
     * @param log_entries the new log_entries
     */
    public void setLog_entries (Log_entries[] log_entries)
    {
        this.log_entries = log_entries;
    }

    /**
     * Gets the offset.
     *
     * @return the offset
     */
    public String getOffset ()
    {
        return offset;
    }

    /**
     * Sets the offset.
     *
     * @param offset the new offset
     */
    public void setOffset (String offset)
    {
        this.offset = offset;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [total = "+total+", limit = "+limit+", log_entries = "+log_entries+", offset = "+offset+"]";
    }

}
