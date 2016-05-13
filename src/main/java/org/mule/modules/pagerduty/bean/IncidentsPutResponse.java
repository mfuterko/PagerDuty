package org.mule.modules.pagerduty.bean;

public class IncidentsPutResponse extends StatusResponse {
	
	private Incidents[] incidents;

    public Incidents[] getIncidents ()
    {
        return incidents;
    }

    public void setIncidents (Incidents[] incidents)
    {
        this.incidents = incidents;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [incidents = "+incidents+"]";
    }

}
