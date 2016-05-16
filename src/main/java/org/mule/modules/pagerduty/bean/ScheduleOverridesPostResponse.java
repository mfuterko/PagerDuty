/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ScheduleOverridesPostResponse extends StatusResponse {
	
	private Override1 override;

    public Override1 getOverride ()
    {
        return override;
    }

    public void setOverride (Override1 override)
    {
        this.override = override;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [override = "+override+"]";
    }

}
