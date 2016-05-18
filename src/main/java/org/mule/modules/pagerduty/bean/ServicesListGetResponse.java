/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class ServicesListGetResponse.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ServicesListGetResponse extends StatusResponse {
	
	/** The total. */
	private String total;

    /** The limit. */
    private String limit;

    /** The services. */
    private Services[] services;

    /** The offset. */
    private String offset;

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
     * Gets the services.
     *
     * @return the services
     */
    public Services[] getServices ()
    {
        return services;
    }

    /**
     * Sets the services.
     *
     * @param services the new services
     */
    public void setServices (Services[] services)
    {
        this.services = services;
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

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [total = "+total+", limit = "+limit+", services = "+services+", offset = "+offset+"]";
    }
	

}
