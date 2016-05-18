/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class MaintenanceWindowPutResponse.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MaintenanceWindowPutResponse extends StatusResponse {
	
	/** The maintenance_window. */
	private Maintenance_window maintenance_window;

    /**
     * Gets the maintenance_window.
     *
     * @return the maintenance_window
     */
    public Maintenance_window getMaintenance_window ()
    {
        return maintenance_window;
    }

    /**
     * Sets the maintenance_window.
     *
     * @param maintenance_window the new maintenance_window
     */
    public void setMaintenance_window (Maintenance_window maintenance_window)
    {
        this.maintenance_window = maintenance_window;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [maintenance_window = "+maintenance_window+"]";
    }

}
