/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class EscalationRuleByPolicyGetResponse.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class EscalationRuleByPolicyGetResponse extends StatusResponse {
	
	/** The escalation_rule. */
	private Escalation_rule escalation_rule;

    /**
     * Gets the escalation_rule.
     *
     * @return the escalation_rule
     */
    public Escalation_rule getEscalation_rule ()
    {
        return escalation_rule;
    }

    /**
     * Sets the escalation_rule.
     *
     * @param escalation_rule the new escalation_rule
     */
    public void setEscalation_rule (Escalation_rule escalation_rule)
    {
        this.escalation_rule = escalation_rule;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [escalation_rule = "+escalation_rule+"]";
    }
}
