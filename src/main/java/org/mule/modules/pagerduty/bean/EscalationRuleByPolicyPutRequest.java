package org.mule.modules.pagerduty.bean;

public class EscalationRuleByPolicyPutRequest {
	
	int escalation_delay_in_minutes;
	Rule_object rule_object;
	public int getEscalation_delay_in_minutes() {
		return escalation_delay_in_minutes;
	}
	public void setEscalation_delay_in_minutes(int escalation_delay_in_minutes) {
		this.escalation_delay_in_minutes = escalation_delay_in_minutes;
	}
	public Rule_object getRule_object() {
		return rule_object;
	}
	public void setRule_object(Rule_object rule_object) {
		this.rule_object = rule_object;
	}
	
	

}
