/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class EscalationPoliciesPostRequest.
 */
public class EscalationPoliciesPostRequest {
	
	/** The name. */
	private String name;
	
	/** The repeat_enabled. */
	private Boolean repeat_enabled;
	
	/** The num_loops. */
	private Integer num_loops;
	
	/** The escalation_rules. */
	private Escalation_rule[] escalation_rules;
	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Checks if is repeat_enabled.
	 *
	 * @return the boolean
	 */
	public Boolean isRepeat_enabled() {
		return repeat_enabled;
	}
	
	/**
	 * Sets the repeat_enabled.
	 *
	 * @param repeat_enabled the new repeat_enabled
	 */
	public void setRepeat_enabled(Boolean repeat_enabled) {
		this.repeat_enabled = repeat_enabled;
	}
	
	/**
	 * Gets the num_loops.
	 *
	 * @return the num_loops
	 */
	public Integer getNum_loops() {
		return num_loops;
	}
	
	/**
	 * Sets the num_loops.
	 *
	 * @param num_loops the new num_loops
	 */
	public void setNum_loops(Integer num_loops) {
		this.num_loops = num_loops;
	}
	
	/**
	 * Gets the escalation_rules.
	 *
	 * @return the escalation_rules
	 */
	public Escalation_rule[] getEscalation_rules() {
		return escalation_rules;
	}
	
	/**
	 * Sets the escalation_rules.
	 *
	 * @param escalation_rules the new escalation_rules
	 */
	public void setEscalation_rules(Escalation_rule[] escalation_rules) {
		this.escalation_rules = escalation_rules;
	}
	
	

}
