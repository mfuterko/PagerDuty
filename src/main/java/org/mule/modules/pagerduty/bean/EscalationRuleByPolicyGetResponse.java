/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

public class EscalationRuleByPolicyGetResponse extends StatusResponse {
	
	private Escalation_rule escalation_rule;

    public Escalation_rule getEscalation_rule ()
    {
        return escalation_rule;
    }

    public void setEscalation_rule (Escalation_rule escalation_rule)
    {
        this.escalation_rule = escalation_rule;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [escalation_rule = "+escalation_rule+"]";
    }
}
