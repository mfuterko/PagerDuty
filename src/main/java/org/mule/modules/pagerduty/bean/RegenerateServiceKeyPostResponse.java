package org.mule.modules.pagerduty.bean;

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
