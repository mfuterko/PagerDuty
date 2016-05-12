
package org.mule.modules.pagerduty.bean.holders;

import javax.annotation.Generated;
import org.mule.modules.pagerduty.bean.Final_schedule;
import org.mule.modules.pagerduty.bean.Overrides_subschedule;
import org.mule.modules.pagerduty.bean.Schedule_layers;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.0", date = "2016-05-12T02:38:48+05:30", comments = "Build mule-devkit-3.7.0.2589.361fd9f")
public class ScheduleExpressionHolder {

    protected Object id;
    protected String _idType;
    protected Object time_zone;
    protected String _time_zoneType;
    protected Object escalation_policies;
    protected String[] _escalation_policiesType;
    protected Object final_schedule;
    protected Final_schedule _final_scheduleType;
    protected Object name;
    protected String _nameType;
    protected Object schedule_layers;
    protected Schedule_layers[] _schedule_layersType;
    protected Object overrides_subschedule;
    protected Overrides_subschedule _overrides_subscheduleType;
    protected Object today;
    protected String _todayType;

    /**
     * Sets id
     * 
     * @param value Value to set
     */
    public void setId(Object value) {
        this.id = value;
    }

    /**
     * Retrieves id
     * 
     */
    public Object getId() {
        return this.id;
    }

    /**
     * Sets time_zone
     * 
     * @param value Value to set
     */
    public void setTime_zone(Object value) {
        this.time_zone = value;
    }

    /**
     * Retrieves time_zone
     * 
     */
    public Object getTime_zone() {
        return this.time_zone;
    }

    /**
     * Sets escalation_policies
     * 
     * @param value Value to set
     */
    public void setEscalation_policies(Object value) {
        this.escalation_policies = value;
    }

    /**
     * Retrieves escalation_policies
     * 
     */
    public Object getEscalation_policies() {
        return this.escalation_policies;
    }

    /**
     * Sets final_schedule
     * 
     * @param value Value to set
     */
    public void setFinal_schedule(Object value) {
        this.final_schedule = value;
    }

    /**
     * Retrieves final_schedule
     * 
     */
    public Object getFinal_schedule() {
        return this.final_schedule;
    }

    /**
     * Sets name
     * 
     * @param value Value to set
     */
    public void setName(Object value) {
        this.name = value;
    }

    /**
     * Retrieves name
     * 
     */
    public Object getName() {
        return this.name;
    }

    /**
     * Sets schedule_layers
     * 
     * @param value Value to set
     */
    public void setSchedule_layers(Object value) {
        this.schedule_layers = value;
    }

    /**
     * Retrieves schedule_layers
     * 
     */
    public Object getSchedule_layers() {
        return this.schedule_layers;
    }

    /**
     * Sets overrides_subschedule
     * 
     * @param value Value to set
     */
    public void setOverrides_subschedule(Object value) {
        this.overrides_subschedule = value;
    }

    /**
     * Retrieves overrides_subschedule
     * 
     */
    public Object getOverrides_subschedule() {
        return this.overrides_subschedule;
    }

    /**
     * Sets today
     * 
     * @param value Value to set
     */
    public void setToday(Object value) {
        this.today = value;
    }

    /**
     * Retrieves today
     * 
     */
    public Object getToday() {
        return this.today;
    }

}
