/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RegenerateServiceKeyPostResponse extends StatusResponse{
	
	private Service service;

    public Service getService ()
    {
        return service;
    }

    public void setService (Service service)
    {
        this.service = service;
    }

    @Override
    public String toString()
    {
    	return "ClassPojo [service = "+service+"]";
    }
	

}
