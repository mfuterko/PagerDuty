/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class Incident_counts.
 */
public class Incident_counts {
	
	/** The total. */
	private String total;

    /** The resolved. */
    private String resolved;

    /** The acknowledged. */
    private String acknowledged;

    /** The triggered. */
    private String triggered;

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
     * Gets the resolved.
     *
     * @return the resolved
     */
    public String getResolved ()
    {
        return resolved;
    }

    /**
     * Sets the resolved.
     *
     * @param resolved the new resolved
     */
    public void setResolved (String resolved)
    {
        this.resolved = resolved;
    }

    /**
     * Gets the acknowledged.
     *
     * @return the acknowledged
     */
    public String getAcknowledged ()
    {
        return acknowledged;
    }

    /**
     * Sets the acknowledged.
     *
     * @param acknowledged the new acknowledged
     */
    public void setAcknowledged (String acknowledged)
    {
        this.acknowledged = acknowledged;
    }

    /**
     * Gets the triggered.
     *
     * @return the triggered
     */
    public String getTriggered ()
    {
        return triggered;
    }

    /**
     * Sets the triggered.
     *
     * @param triggered the new triggered
     */
    public void setTriggered (String triggered)
    {
        this.triggered = triggered;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [total = "+total+", resolved = "+resolved+", acknowledged = "+acknowledged+", triggered = "+triggered+"]";
    }
}
