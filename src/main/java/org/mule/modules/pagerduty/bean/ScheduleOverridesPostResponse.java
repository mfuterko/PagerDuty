/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class ScheduleOverridesPostResponse.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ScheduleOverridesPostResponse extends StatusResponse {
	
	/** The override. */
	private Override1 override;

    /**
     * Gets the override.
     *
     * @return the override
     */
    public Override1 getOverride ()
    {
        return override;
    }

    /**
     * Sets the override.
     *
     * @param override the new override
     */
    public void setOverride (Override1 override)
    {
        this.override = override;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [override = "+override+"]";
    }

}
