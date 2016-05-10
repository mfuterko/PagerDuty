package org.mule.modules.pagerduty.bean;

public class EscalationPolicyIdGetResponse extends StatusResponse {
	
	String id;
	String name;
	String num_loops;
	EscalationRuleResponse[] escalation_rules;
	
	

}
