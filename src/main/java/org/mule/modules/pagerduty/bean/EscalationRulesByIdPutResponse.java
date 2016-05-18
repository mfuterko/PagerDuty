/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class EscalationRulesByIdPutResponse.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class EscalationRulesByIdPutResponse extends StatusResponse {
	
	/** The escalation_rules. */
	private Escalation_rules[] escalation_rules;

    /**
     * Gets the escalation_rules.
     *
     * @return the escalation_rules
     */
    public Escalation_rules[] getEscalation_rules ()
    {
        return escalation_rules;
    }

    /**
     * Sets the escalation_rules.
     *
     * @param escalation_rules the new escalation_rules
     */
    public void setEscalation_rules (Escalation_rules[] escalation_rules)
    {
        this.escalation_rules = escalation_rules;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [escalation_rules = "+escalation_rules+"]";
    }

}
