
package org.mule.modules.pagerduty.bean.holders;

import javax.annotation.Generated;
import org.mule.modules.pagerduty.bean.Rule_object;
import org.mule.modules.pagerduty.bean.Targets;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.0", date = "2016-05-12T02:38:48+05:30", comments = "Build mule-devkit-3.7.0.2589.361fd9f")
public class Escalation_rulesExpressionHolder {

    protected Object id;
    protected String _idType;
    protected Object escalation_delay_in_minutes;
    protected String _escalation_delay_in_minutesType;
    protected Object rule_object;
    protected Rule_object _rule_objectType;
    protected Object targets;
    protected Targets[] _targetsType;

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
     * Sets escalation_delay_in_minutes
     * 
     * @param value Value to set
     */
    public void setEscalation_delay_in_minutes(Object value) {
        this.escalation_delay_in_minutes = value;
    }

    /**
     * Retrieves escalation_delay_in_minutes
     * 
     */
    public Object getEscalation_delay_in_minutes() {
        return this.escalation_delay_in_minutes;
    }

    /**
     * Sets rule_object
     * 
     * @param value Value to set
     */
    public void setRule_object(Object value) {
        this.rule_object = value;
    }

    /**
     * Retrieves rule_object
     * 
     */
    public Object getRule_object() {
        return this.rule_object;
    }

    /**
     * Sets targets
     * 
     * @param value Value to set
     */
    public void setTargets(Object value) {
        this.targets = value;
    }

    /**
     * Retrieves targets
     * 
     */
    public Object getTargets() {
        return this.targets;
    }

}
