/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class MaintenanceWindowsGetResponse.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MaintenanceWindowsGetResponse extends StatusResponse {
	
	/** The total. */
	private String total;

    /** The limit. */
    private String limit;

    /** The query. */
    private String query;

    /** The counts. */
    private Counts counts;

    /** The offset. */
    private String offset;

    /** The maintenance_windows. */
    private Maintenance_windows[] maintenance_windows;

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
     * Gets the query.
     *
     * @return the query
     */
    public String getQuery ()
    {
        return query;
    }

    /**
     * Sets the query.
     *
     * @param query the new query
     */
    public void setQuery (String query)
    {
        this.query = query;
    }

    /**
     * Gets the counts.
     *
     * @return the counts
     */
    public Counts getCounts ()
    {
        return counts;
    }

    /**
     * Sets the counts.
     *
     * @param counts the new counts
     */
    public void setCounts (Counts counts)
    {
        this.counts = counts;
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

    /**
     * Gets the maintenance_windows.
     *
     * @return the maintenance_windows
     */
    public Maintenance_windows[] getMaintenance_windows ()
    {
        return maintenance_windows;
    }

    /**
     * Sets the maintenance_windows.
     *
     * @param maintenance_windows the new maintenance_windows
     */
    public void setMaintenance_windows (Maintenance_windows[] maintenance_windows)
    {
        this.maintenance_windows = maintenance_windows;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [total = "+total+", limit = "+limit+", query = "+query+", counts = "+counts+", offset = "+offset+", maintenance_windows = "+maintenance_windows+"]";
    }
	

}
