/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class IncidentsPutResponse.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class IncidentsPutResponse extends StatusResponse {
	
	/** The incidents. */
	private Incidents[] incidents;

    /**
     * Gets the incidents.
     *
     * @return the incidents
     */
    public Incidents[] getIncidents ()
    {
        return incidents;
    }

    /**
     * Sets the incidents.
     *
     * @param incidents the new incidents
     */
    public void setIncidents (Incidents[] incidents)
    {
        this.incidents = incidents;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [incidents = "+incidents+"]";
    }

}
