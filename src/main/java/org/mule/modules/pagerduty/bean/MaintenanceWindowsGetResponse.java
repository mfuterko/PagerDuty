/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MaintenanceWindowsGetResponse extends StatusResponse {
	
	private String total;

    private String limit;

    private String query;

    private Counts counts;

    private String offset;

    private Maintenance_windows[] maintenance_windows;

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

    public String getQuery ()
    {
        return query;
    }

    public void setQuery (String query)
    {
        this.query = query;
    }

    public Counts getCounts ()
    {
        return counts;
    }

    public void setCounts (Counts counts)
    {
        this.counts = counts;
    }

    public String getOffset ()
    {
        return offset;
    }

    public void setOffset (String offset)
    {
        this.offset = offset;
    }

    public Maintenance_windows[] getMaintenance_windows ()
    {
        return maintenance_windows;
    }

    public void setMaintenance_windows (Maintenance_windows[] maintenance_windows)
    {
        this.maintenance_windows = maintenance_windows;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [total = "+total+", limit = "+limit+", query = "+query+", counts = "+counts+", offset = "+offset+", maintenance_windows = "+maintenance_windows+"]";
    }
	

}
