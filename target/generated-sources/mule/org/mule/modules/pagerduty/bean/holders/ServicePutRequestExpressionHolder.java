
package org.mule.modules.pagerduty.bean.holders;

import javax.annotation.Generated;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.0", date = "2016-05-12T02:38:48+05:30", comments = "Build mule-devkit-3.7.0.2589.361fd9f")
public class ServicePutRequestExpressionHolder {

    protected Object name;
    protected String _nameType;
    protected Object description;
    protected String _descriptionType;
    protected Object escalationPolicyId;
    protected String _escalationPolicyIdType;
    protected Object acknowledgmentTimeout;
    protected int _acknowledgmentTimeoutType;
    protected Object autoResolveTimeout;
    protected int _autoResolveTimeoutType;
    protected Object severityFilter;
    protected String _severityFilterType;

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
     * Sets escalationPolicyId
     * 
     * @param value Value to set
     */
    public void setEscalationPolicyId(Object value) {
        this.escalationPolicyId = value;
    }

    /**
     * Retrieves escalationPolicyId
     * 
     */
    public Object getEscalationPolicyId() {
        return this.escalationPolicyId;
    }

    /**
     * Sets acknowledgmentTimeout
     * 
     * @param value Value to set
     */
    public void setAcknowledgmentTimeout(Object value) {
        this.acknowledgmentTimeout = value;
    }

    /**
     * Retrieves acknowledgmentTimeout
     * 
     */
    public Object getAcknowledgmentTimeout() {
        return this.acknowledgmentTimeout;
    }

    /**
     * Sets autoResolveTimeout
     * 
     * @param value Value to set
     */
    public void setAutoResolveTimeout(Object value) {
        this.autoResolveTimeout = value;
    }

    /**
     * Retrieves autoResolveTimeout
     * 
     */
    public Object getAutoResolveTimeout() {
        return this.autoResolveTimeout;
    }

    /**
     * Sets severityFilter
     * 
     * @param value Value to set
     */
    public void setSeverityFilter(Object value) {
        this.severityFilter = value;
    }

    /**
     * Retrieves severityFilter
     * 
     */
    public Object getSeverityFilter() {
        return this.severityFilter;
    }

}
