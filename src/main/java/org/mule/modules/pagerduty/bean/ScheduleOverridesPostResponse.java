package org.mule.modules.pagerduty.bean;

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
