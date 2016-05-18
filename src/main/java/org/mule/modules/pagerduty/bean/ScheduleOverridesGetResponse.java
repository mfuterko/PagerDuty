/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class ScheduleOverridesGetResponse.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ScheduleOverridesGetResponse extends StatusResponse {
	 	
		/** The total. */
		private String total;

	    /** The overrides. */
    	private Overrides[] overrides;

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
    	 * Gets the overrides.
    	 *
    	 * @return the overrides
    	 */
    	public Overrides[] getOverrides ()
	    {
	        return overrides;
	    }

	    /**
    	 * Sets the overrides.
    	 *
    	 * @param overrides the new overrides
    	 */
    	public void setOverrides (Overrides[] overrides)
	    {
	        this.overrides = overrides;
	    }

	    /* (non-Javadoc)
    	 * @see java.lang.Object#toString()
    	 */
    	@Override
	    public String toString()
	    {
	        return "ClassPojo [total = "+total+", overrides = "+overrides+"]";
	    }

}
