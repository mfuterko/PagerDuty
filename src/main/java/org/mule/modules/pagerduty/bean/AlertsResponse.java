/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class AlertsResponse.
 */
public class AlertsResponse extends StatusResponse {
	
	/** The total. */
	/*
     * This total : For total
     */
	private String total;

	
	/** The limit. */
	/*
     * This limit : For limit
     */
    private String limit;

    
    /** The alerts. */
    /*
     * This Alerts Array : For Alerts
     */
    private Alerts[] alerts;

    
    /** The offset. */
    /*
     * This offset : For Offset
     */
    private String offset;

    
    /**
     * Gets the total.
     *
     * @return the total
     */
    /*
     * TO get the Total
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
    /*
     * TO set the Total
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
    /*
     * TO get the Limit
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
    /*
     * TO set the Limit
     */
    public void setLimit (String limit)
    {
        this.limit = limit;
    }


    /**
     * Gets the alerts.
     *
     * @return the alerts
     */
    /*
     * TO get the Alerts
     */
    public Alerts[] getAlerts ()
    {
        return alerts;
    }

    
    /**
     * Sets the alerts.
     *
     * @param alerts the new alerts
     */
    /*
     * TO set the Alerts
     */
    public void setAlerts (Alerts[] alerts)
    {
        this.alerts = alerts;
    }

    
    /**
     * Gets the offset.
     *
     * @return the offset
     */
    /*
     * TO get the offset
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
    /*
     * TO set the Offset
     */
    public void setOffset (String offset)
    {
        this.offset = offset;
    }

    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    /*
     * This Is Override For Abstract Method String
     */
    @Override
    public String toString()
    {
        return "ClassPojo [total = "+total+", limit = "+limit+", alerts = "+alerts+", offset = "+offset+"]";
    }

}
