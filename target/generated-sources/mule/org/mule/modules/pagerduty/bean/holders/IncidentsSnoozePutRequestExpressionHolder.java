
package org.mule.modules.pagerduty.bean.holders;

import javax.annotation.Generated;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.0", date = "2016-05-12T02:38:48+05:30", comments = "Build mule-devkit-3.7.0.2589.361fd9f")
public class IncidentsSnoozePutRequestExpressionHolder {

    protected Object requester_id;
    protected String _requester_idType;
    protected Object duration;
    protected int _durationType;

    /**
     * Sets requester_id
     * 
     * @param value Value to set
     */
    public void setRequester_id(Object value) {
        this.requester_id = value;
    }

    /**
     * Retrieves requester_id
     * 
     */
    public Object getRequester_id() {
        return this.requester_id;
    }

    /**
     * Sets duration
     * 
     * @param value Value to set
     */
    public void setDuration(Object value) {
        this.duration = value;
    }

    /**
     * Retrieves duration
     * 
     */
    public Object getDuration() {
        return this.duration;
    }

}
