/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

public class EscalationPoliciesPostRequest {
	
	private String name;
	private Boolean repeat_enabled;
	private Integer num_loops;
	private String[] escalation_rules;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean isRepeat_enabled() {
		return repeat_enabled;
	}
	public void setRepeat_enabled(Boolean repeat_enabled) {
		this.repeat_enabled = repeat_enabled;
	}
	public Integer getNum_loops() {
		return num_loops;
	}
	public void setNum_loops(Integer num_loops) {
		this.num_loops = num_loops;
	}
	public String[] getEscalation_rules() {
		return escalation_rules;
	}
	public void setEscalation_rules(String[] escalation_rules) {
		this.escalation_rules = escalation_rules;
	}
	
	

}
