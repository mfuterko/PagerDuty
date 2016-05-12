
package org.mule.modules.pagerduty.bean.holders;

import javax.annotation.Generated;
import org.mule.modules.pagerduty.bean.Schedule;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.0", date = "2016-05-12T02:38:48+05:30", comments = "Build mule-devkit-3.7.0.2589.361fd9f")
public class SchedulePreviewPostRequestExpressionHolder {

    protected Object since;
    protected String _sinceType;
    protected Object until;
    protected String _untilType;
    protected Object overview;
    protected boolean _overviewType;
    protected Object schedule;
    protected Schedule _scheduleType;

    /**
     * Sets since
     * 
     * @param value Value to set
     */
    public void setSince(Object value) {
        this.since = value;
    }

    /**
     * Retrieves since
     * 
     */
    public Object getSince() {
        return this.since;
    }

    /**
     * Sets until
     * 
     * @param value Value to set
     */
    public void setUntil(Object value) {
        this.until = value;
    }

    /**
     * Retrieves until
     * 
     */
    public Object getUntil() {
        return this.until;
    }

    /**
     * Sets overview
     * 
     * @param value Value to set
     */
    public void setOverview(Object value) {
        this.overview = value;
    }

    /**
     * Retrieves overview
     * 
     */
    public Object getOverview() {
        return this.overview;
    }

    /**
     * Sets schedule
     * 
     * @param value Value to set
     */
    public void setSchedule(Object value) {
        this.schedule = value;
    }

    /**
     * Retrieves schedule
     * 
     */
    public Object getSchedule() {
        return this.schedule;
    }

}
