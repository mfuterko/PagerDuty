/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class ListEntriesOfScheduleGetResponse.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListEntriesOfScheduleGetResponse extends StatusResponse {
	
	/** The total. */
	private String total;

    /** The entries. */
    private Entries[] entries;

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
     * Gets the entries.
     *
     * @return the entries
     */
    public Entries[] getEntries ()
    {
        return entries;
    }

    /**
     * Sets the entries.
     *
     * @param entries the new entries
     */
    public void setEntries (Entries[] entries)
    {
        this.entries = entries;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [total = "+total+", entries = "+entries+"]";
    }

}
