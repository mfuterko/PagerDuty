package org.mule.modules.pagerduty.bean;

import java.util.Date;

public class ServicesListGetResponse extends StatusResponse {
	private String total;

    private String limit;

    private Services[] services;

    private String offset;

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

    public Services[] getServices ()
    {
        return services;
    }

    public void setServices (Services[] services)
    {
        this.services = services;
    }

    public String getOffset ()
    {
        return offset;
    }

    public void setOffset (String offset)
    {
        this.offset = offset;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [total = "+total+", limit = "+limit+", services = "+services+", offset = "+offset+"]";
    }
	

}
