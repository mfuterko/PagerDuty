/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class EscalationRuleByPolicyPutRequest.
 */
public class EscalationRuleByPolicyPutRequest {
	
	/** The escalation_delay_in_minutes. */
	int escalation_delay_in_minutes;
	
	/** The rule_object. */
	Rule_object rule_object;
	
	/**
	 * Gets the escalation_delay_in_minutes.
	 *
	 * @return the escalation_delay_in_minutes
	 */
	public int getEscalation_delay_in_minutes() {
		return escalation_delay_in_minutes;
	}
	
	/**
	 * Sets the escalation_delay_in_minutes.
	 *
	 * @param escalation_delay_in_minutes the new escalation_delay_in_minutes
	 */
	public void setEscalation_delay_in_minutes(int escalation_delay_in_minutes) {
		this.escalation_delay_in_minutes = escalation_delay_in_minutes;
	}
	
	/**
	 * Gets the rule_object.
	 *
	 * @return the rule_object
	 */
	public Rule_object getRule_object() {
		return rule_object;
	}
	
	/**
	 * Sets the rule_object.
	 *
	 * @param rule_object the new rule_object
	 */
	public void setRule_object(Rule_object rule_object) {
		this.rule_object = rule_object;
	}
	
	

}
