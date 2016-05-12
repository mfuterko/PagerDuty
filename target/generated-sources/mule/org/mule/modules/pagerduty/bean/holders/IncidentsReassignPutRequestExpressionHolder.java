
package org.mule.modules.pagerduty.bean.holders;

import javax.annotation.Generated;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.0", date = "2016-05-12T02:38:48+05:30", comments = "Build mule-devkit-3.7.0.2589.361fd9f")
public class IncidentsReassignPutRequestExpressionHolder {

    protected Object requester_id;
    protected String _requester_idType;
    protected Object escalation_policy;
    protected String _escalation_policyType;
    protected Object escalation_level;
    protected int _escalation_levelType;
    protected Object assigned_to_user;
    protected String _assigned_to_userType;

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
     * Sets escalation_policy
     * 
     * @param value Value to set
     */
    public void setEscalation_policy(Object value) {
        this.escalation_policy = value;
    }

    /**
     * Retrieves escalation_policy
     * 
     */
    public Object getEscalation_policy() {
        return this.escalation_policy;
    }

    /**
     * Sets escalation_level
     * 
     * @param value Value to set
     */
    public void setEscalation_level(Object value) {
        this.escalation_level = value;
    }

    /**
     * Retrieves escalation_level
     * 
     */
    public Object getEscalation_level() {
        return this.escalation_level;
    }

    /**
     * Sets assigned_to_user
     * 
     * @param value Value to set
     */
    public void setAssigned_to_user(Object value) {
        this.assigned_to_user = value;
    }

    /**
     * Retrieves assigned_to_user
     * 
     */
    public Object getAssigned_to_user() {
        return this.assigned_to_user;
    }

}
