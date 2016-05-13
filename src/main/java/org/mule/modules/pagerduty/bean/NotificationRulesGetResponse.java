package org.mule.modules.pagerduty.bean;

public class NotificationRulesGetResponse extends StatusResponse {
	
	private String total;

    private Notification_rules[] notification_rules;

    public String getTotal ()
    {
        return total;
    }

    public void setTotal (String total)
    {
        this.total = total;
    }

    public Notification_rules[] getNotification_rules ()
    {
        return notification_rules;
    }

    public void setNotification_rules (Notification_rules[] notification_rules)
    {
        this.notification_rules = notification_rules;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [total = "+total+", notification_rules = "+notification_rules+"]";
    }

}
