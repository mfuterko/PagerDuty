package org.mule.modules.pagerduty.bean;

public class ReportsAlertsPerTimeResponse extends StatusResponse {
	
	private String total_number_of_alerts;

    private Alerts[] alerts;

    private String total_number_of_sms_alerts;

    private String total_number_of_phone_alerts;

    private String total_number_of_billable_alerts;

    private String total_number_of_email_alerts;

    public String getTotal_number_of_alerts ()
    {
        return total_number_of_alerts;
    }

    public void setTotal_number_of_alerts (String total_number_of_alerts)
    {
        this.total_number_of_alerts = total_number_of_alerts;
    }

    public Alerts[] getAlerts ()
    {
        return alerts;
    }

    public void setAlerts (Alerts[] alerts)
    {
        this.alerts = alerts;
    }

    public String getTotal_number_of_sms_alerts ()
    {
        return total_number_of_sms_alerts;
    }

    public void setTotal_number_of_sms_alerts (String total_number_of_sms_alerts)
    {
        this.total_number_of_sms_alerts = total_number_of_sms_alerts;
    }

    public String getTotal_number_of_phone_alerts ()
    {
        return total_number_of_phone_alerts;
    }

    public void setTotal_number_of_phone_alerts (String total_number_of_phone_alerts)
    {
        this.total_number_of_phone_alerts = total_number_of_phone_alerts;
    }

    public String getTotal_number_of_billable_alerts ()
    {
        return total_number_of_billable_alerts;
    }

    public void setTotal_number_of_billable_alerts (String total_number_of_billable_alerts)
    {
        this.total_number_of_billable_alerts = total_number_of_billable_alerts;
    }

    public String getTotal_number_of_email_alerts ()
    {
        return total_number_of_email_alerts;
    }

    public void setTotal_number_of_email_alerts (String total_number_of_email_alerts)
    {
        this.total_number_of_email_alerts = total_number_of_email_alerts;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [total_number_of_alerts = "+total_number_of_alerts+", alerts = "+alerts+", total_number_of_sms_alerts = "+total_number_of_sms_alerts+", total_number_of_phone_alerts = "+total_number_of_phone_alerts+", total_number_of_billable_alerts = "+total_number_of_billable_alerts+", total_number_of_email_alerts = "+total_number_of_email_alerts+"]";
    }

}
