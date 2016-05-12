
package org.mule.modules.pagerduty.bean.holders;

import javax.annotation.Generated;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.0", date = "2016-05-12T02:38:48+05:30", comments = "Build mule-devkit-3.7.0.2589.361fd9f")
public class NotificationRulePutRequestExpressionHolder {

    protected Object start_delay_in_minutes;
    protected String _start_delay_in_minutesType;
    protected Object contact_method_id;
    protected String _contact_method_idType;

    /**
     * Sets start_delay_in_minutes
     * 
     * @param value Value to set
     */
    public void setStart_delay_in_minutes(Object value) {
        this.start_delay_in_minutes = value;
    }

    /**
     * Retrieves start_delay_in_minutes
     * 
     */
    public Object getStart_delay_in_minutes() {
        return this.start_delay_in_minutes;
    }

    /**
     * Sets contact_method_id
     * 
     * @param value Value to set
     */
    public void setContact_method_id(Object value) {
        this.contact_method_id = value;
    }

    /**
     * Retrieves contact_method_id
     * 
     */
    public Object getContact_method_id() {
        return this.contact_method_id;
    }

}
