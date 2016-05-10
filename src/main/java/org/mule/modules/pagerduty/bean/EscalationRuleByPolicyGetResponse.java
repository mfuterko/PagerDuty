package org.mule.modules.pagerduty.bean;

public class EscalationRuleByPolicyGetResponse extends StatusResponse {
	
	private String id;
	private String escalation_delay_in_minutes;
	private Object rule_object;
	private String targets;

}
