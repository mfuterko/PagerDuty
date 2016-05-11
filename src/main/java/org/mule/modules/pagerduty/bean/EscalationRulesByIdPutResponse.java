package org.mule.modules.pagerduty.bean;

public class EscalationRulesByIdPutResponse extends StatusResponse {
	
	private Escalation_rules[] escalation_rules;

    public Escalation_rules[] getEscalation_rules ()
    {
        return escalation_rules;
    }

    public void setEscalation_rules (Escalation_rules[] escalation_rules)
    {
        this.escalation_rules = escalation_rules;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [escalation_rules = "+escalation_rules+"]";
    }

}
