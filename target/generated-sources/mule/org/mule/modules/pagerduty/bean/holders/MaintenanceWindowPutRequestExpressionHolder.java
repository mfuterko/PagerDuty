
package org.mule.modules.pagerduty.bean.holders;

import javax.annotation.Generated;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.0", date = "2016-05-12T02:38:48+05:30", comments = "Build mule-devkit-3.7.0.2589.361fd9f")
public class MaintenanceWindowPutRequestExpressionHolder {

    protected Object start_time;
    protected String _start_timeType;
    protected Object end_time;
    protected String _end_timeType;
    protected Object description;
    protected String _descriptionType;
    protected Object service_ids;
    protected String _service_idsType;

    /**
     * Sets start_time
     * 
     * @param value Value to set
     */
    public void setStart_time(Object value) {
        this.start_time = value;
    }

    /**
     * Retrieves start_time
     * 
     */
    public Object getStart_time() {
        return this.start_time;
    }

    /**
     * Sets end_time
     * 
     * @param value Value to set
     */
    public void setEnd_time(Object value) {
        this.end_time = value;
    }

    /**
     * Retrieves end_time
     * 
     */
    public Object getEnd_time() {
        return this.end_time;
    }

    /**
     * Sets description
     * 
     * @param value Value to set
     */
    public void setDescription(Object value) {
        this.description = value;
    }

    /**
     * Retrieves description
     * 
     */
    public Object getDescription() {
        return this.description;
    }

    /**
     * Sets service_ids
     * 
     * @param value Value to set
     */
    public void setService_ids(Object value) {
        this.service_ids = value;
    }

    /**
     * Retrieves service_ids
     * 
     */
    public Object getService_ids() {
        return this.service_ids;
    }

}
