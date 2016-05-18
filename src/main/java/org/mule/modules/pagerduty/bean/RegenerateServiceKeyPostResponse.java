/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class RegenerateServiceKeyPostResponse.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RegenerateServiceKeyPostResponse extends StatusResponse{
	
	/** The service. */
	private Service service;

    /**
     * Gets the service.
     *
     * @return the service
     */
    public Service getService ()
    {
        return service;
    }

    /**
     * Sets the service.
     *
     * @param service the new service
     */
    public void setService (Service service)
    {
        this.service = service;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
    	return "ClassPojo [service = "+service+"]";
    }
	

}
