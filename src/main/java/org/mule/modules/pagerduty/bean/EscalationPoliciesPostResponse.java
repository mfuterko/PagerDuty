/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class EscalationPoliciesPostResponse.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class EscalationPoliciesPostResponse extends StatusResponse {
	
	/** The escalation_policy. */
	private Escalation_policy escalation_policy;

    /**
     * Gets the escalation_policy.
     *
     * @return the escalation_policy
     */
    public Escalation_policy getEscalation_policy ()
    {
        return escalation_policy;
    }

    /**
     * Sets the escalation_policy.
     *
     * @param escalation_policy the new escalation_policy
     */
    public void setEscalation_policy (Escalation_policy escalation_policy)
    {
        this.escalation_policy = escalation_policy;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [escalation_policy = "+escalation_policy+"]";
    }

}
