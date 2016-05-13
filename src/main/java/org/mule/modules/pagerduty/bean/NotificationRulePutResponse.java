/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

public class NotificationRulePutResponse extends StatusResponse {
	
	private Notification_rule notification_rule;

    public Notification_rule getNotification_rule ()
    {
        return notification_rule;
    }

    public void setNotification_rule (Notification_rule notification_rule)
    {
        this.notification_rule = notification_rule;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [notification_rule = "+notification_rule+"]";
    }

}
