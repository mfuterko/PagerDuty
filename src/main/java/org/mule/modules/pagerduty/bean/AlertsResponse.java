/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

public class AlertsResponse extends StatusResponse {
	
	/*
     * This total : For total
     */
	private String total;

	
	/*
     * This limit : For limit
     */
    private String limit;

    
    /*
     * This Alerts Array : For Alerts
     */
    private Alerts[] alerts;

    
    /*
     * This offset : For Offset
     */
    private String offset;

    
    /*
     * TO get the Total
     */
    public String getTotal ()
    {
        return total;
    }

    
    /*
     * TO set the Total
     */
    public void setTotal (String total)
    {
        this.total = total;
    }

    
    /*
     * TO get the Limit
     */
    public String getLimit ()
    {
        return limit;
    }

    
    /*
     * TO set the Limit
     */
    public void setLimit (String limit)
    {
        this.limit = limit;
    }


    /*
     * TO get the Alerts
     */
    public Alerts[] getAlerts ()
    {
        return alerts;
    }

    
    /*
     * TO set the Alerts
     */
    public void setAlerts (Alerts[] alerts)
    {
        this.alerts = alerts;
    }

    
    /*
     * TO get the offset
     */
    public String getOffset ()
    {
        return offset;
    }

    
    /*
     * TO set the Offset
     */
    public void setOffset (String offset)
    {
        this.offset = offset;
    }

    
    /*
     * This Is Override For Abstract Method String
     */
    @Override
    public String toString()
    {
        return "ClassPojo [total = "+total+", limit = "+limit+", alerts = "+alerts+", offset = "+offset+"]";
    }

}
