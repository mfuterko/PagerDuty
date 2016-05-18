/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class NotificationRulesGetResponse.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class NotificationRulesGetResponse extends StatusResponse {
	
	/** The total. */
	private String total;

    /** The notification_rules. */
    private Notification_rules[] notification_rules;

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
     * Gets the notification_rules.
     *
     * @return the notification_rules
     */
    public Notification_rules[] getNotification_rules ()
    {
        return notification_rules;
    }

    /**
     * Sets the notification_rules.
     *
     * @param notification_rules the new notification_rules
     */
    public void setNotification_rules (Notification_rules[] notification_rules)
    {
        this.notification_rules = notification_rules;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [total = "+total+", notification_rules = "+notification_rules+"]";
    }

}
