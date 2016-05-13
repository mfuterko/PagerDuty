package org.mule.modules.pagerduty.bean;

public class MaintenanceWindowPutResponse extends StatusResponse {
	
	private Maintenance_window maintenance_window;

    public Maintenance_window getMaintenance_window ()
    {
        return maintenance_window;
    }

    public void setMaintenance_window (Maintenance_window maintenance_window)
    {
        this.maintenance_window = maintenance_window;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [maintenance_window = "+maintenance_window+"]";
    }

}
