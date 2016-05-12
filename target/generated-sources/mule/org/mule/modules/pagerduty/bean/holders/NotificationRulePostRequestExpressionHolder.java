
package org.mule.modules.pagerduty.bean.holders;

import javax.annotation.Generated;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.0", date = "2016-05-12T02:38:48+05:30", comments = "Build mule-devkit-3.7.0.2589.361fd9f")
public class NotificationRulePostRequestExpressionHolder {

    protected Object startDelayInMinutes;
    protected int _startDelayInMinutesType;
    protected Object contactMethodId;
    protected String _contactMethodIdType;

    /**
     * Sets startDelayInMinutes
     * 
     * @param value Value to set
     */
    public void setStartDelayInMinutes(Object value) {
        this.startDelayInMinutes = value;
    }

    /**
     * Retrieves startDelayInMinutes
     * 
     */
    public Object getStartDelayInMinutes() {
        return this.startDelayInMinutes;
    }

    /**
     * Sets contactMethodId
     * 
     * @param value Value to set
     */
    public void setContactMethodId(Object value) {
        this.contactMethodId = value;
    }

    /**
     * Retrieves contactMethodId
     * 
     */
    public Object getContactMethodId() {
        return this.contactMethodId;
    }

}
