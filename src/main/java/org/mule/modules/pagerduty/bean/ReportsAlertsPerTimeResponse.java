/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class ReportsAlertsPerTimeResponse.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReportsAlertsPerTimeResponse extends StatusResponse {
	
	/** The total_number_of_alerts. */
	private String total_number_of_alerts;

    /** The alerts. */
    private Alerts[] alerts;

    /** The total_number_of_sms_alerts. */
    private String total_number_of_sms_alerts;

    /** The total_number_of_phone_alerts. */
    private String total_number_of_phone_alerts;

    /** The total_number_of_billable_alerts. */
    private String total_number_of_billable_alerts;

    /** The total_number_of_email_alerts. */
    private String total_number_of_email_alerts;

    /**
     * Gets the total_number_of_alerts.
     *
     * @return the total_number_of_alerts
     */
    public String getTotal_number_of_alerts ()
    {
        return total_number_of_alerts;
    }

    /**
     * Sets the total_number_of_alerts.
     *
     * @param total_number_of_alerts the new total_number_of_alerts
     */
    public void setTotal_number_of_alerts (String total_number_of_alerts)
    {
        this.total_number_of_alerts = total_number_of_alerts;
    }

    /**
     * Gets the alerts.
     *
     * @return the alerts
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
    public void setAlerts (Alerts[] alerts)
    {
        this.alerts = alerts;
    }

    /**
     * Gets the total_number_of_sms_alerts.
     *
     * @return the total_number_of_sms_alerts
     */
    public String getTotal_number_of_sms_alerts ()
    {
        return total_number_of_sms_alerts;
    }

    /**
     * Sets the total_number_of_sms_alerts.
     *
     * @param total_number_of_sms_alerts the new total_number_of_sms_alerts
     */
    public void setTotal_number_of_sms_alerts (String total_number_of_sms_alerts)
    {
        this.total_number_of_sms_alerts = total_number_of_sms_alerts;
    }

    /**
     * Gets the total_number_of_phone_alerts.
     *
     * @return the total_number_of_phone_alerts
     */
    public String getTotal_number_of_phone_alerts ()
    {
        return total_number_of_phone_alerts;
    }

    /**
     * Sets the total_number_of_phone_alerts.
     *
     * @param total_number_of_phone_alerts the new total_number_of_phone_alerts
     */
    public void setTotal_number_of_phone_alerts (String total_number_of_phone_alerts)
    {
        this.total_number_of_phone_alerts = total_number_of_phone_alerts;
    }

    /**
     * Gets the total_number_of_billable_alerts.
     *
     * @return the total_number_of_billable_alerts
     */
    public String getTotal_number_of_billable_alerts ()
    {
        return total_number_of_billable_alerts;
    }

    /**
     * Sets the total_number_of_billable_alerts.
     *
     * @param total_number_of_billable_alerts the new total_number_of_billable_alerts
     */
    public void setTotal_number_of_billable_alerts (String total_number_of_billable_alerts)
    {
        this.total_number_of_billable_alerts = total_number_of_billable_alerts;
    }

    /**
     * Gets the total_number_of_email_alerts.
     *
     * @return the total_number_of_email_alerts
     */
    public String getTotal_number_of_email_alerts ()
    {
        return total_number_of_email_alerts;
    }

    /**
     * Sets the total_number_of_email_alerts.
     *
     * @param total_number_of_email_alerts the new total_number_of_email_alerts
     */
    public void setTotal_number_of_email_alerts (String total_number_of_email_alerts)
    {
        this.total_number_of_email_alerts = total_number_of_email_alerts;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [total_number_of_alerts = "+total_number_of_alerts+", alerts = "+alerts+", total_number_of_sms_alerts = "+total_number_of_sms_alerts+", total_number_of_phone_alerts = "+total_number_of_phone_alerts+", total_number_of_billable_alerts = "+total_number_of_billable_alerts+", total_number_of_email_alerts = "+total_number_of_email_alerts+"]";
    }

}
