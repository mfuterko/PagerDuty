/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class NotifcationRulePostResponse.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class NotifcationRulePostResponse extends StatusResponse {
	
	/** The notification_rule. */
	private Notification_rule notification_rule;

    /**
     * Gets the notification_rule.
     *
     * @return the notification_rule
     */
    public Notification_rule getNotification_rule ()
    {
        return notification_rule;
    }

    /**
     * Sets the notification_rule.
     *
     * @param notification_rule the new notification_rule
     */
    public void setNotification_rule (Notification_rule notification_rule)
    {
        this.notification_rule = notification_rule;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [notification_rule = "+notification_rule+"]";
    }

}
