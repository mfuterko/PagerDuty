package org.mule.modules.pagerduty.bean;

public class EmailFilterPostRequest {
	
	String subjectMode;
	String subjectRegex;
	String bodyMode;
	String bodyRegex;
	String fromEmailMode;
	String fromEmailRegex;
	public String getSubjectMode() {
		return subjectMode;
	}
	public void setSubjectMode(String subjectMode) {
		this.subjectMode = subjectMode;
	}
	public String getSubjectRegex() {
		return subjectRegex;
	}
	public void setSubjectRegex(String subjectRegex) {
		this.subjectRegex = subjectRegex;
	}
	public String getBodyMode() {
		return bodyMode;
	}
	public void setBodyMode(String bodyMode) {
		this.bodyMode = bodyMode;
	}
	public String getBodyRegex() {
		return bodyRegex;
	}
	public void setBodyRegex(String bodyRegex) {
		this.bodyRegex = bodyRegex;
	}
	public String getFromEmailMode() {
		return fromEmailMode;
	}
	public void setFromEmailMode(String fromEmailMode) {
		this.fromEmailMode = fromEmailMode;
	}
	public String getFromEmailRegex() {
		return fromEmailRegex;
	}
	public void setFromEmailRegex(String fromEmailRegex) {
		this.fromEmailRegex = fromEmailRegex;
	}
	

}
