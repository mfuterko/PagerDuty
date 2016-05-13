/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

public class Incident {
	
	String id;
	String status;
	Integer escalation_level;
	String assigned_to_user;
	String escalation_policy;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getEscalation_level() {
		return escalation_level;
	}
	public void setEscalation_level(Integer escalation_level) {
		this.escalation_level = escalation_level;
	}
	public String getAssigned_to_user() {
		return assigned_to_user;
	}
	public void setAssigned_to_user(String assigned_to_user) {
		this.assigned_to_user = assigned_to_user;
	}
	public String getEscalation_policy() {
		return escalation_policy;
	}
	public void setEscalation_policy(String escalation_policy) {
		this.escalation_policy = escalation_policy;
	}
	
	

}
