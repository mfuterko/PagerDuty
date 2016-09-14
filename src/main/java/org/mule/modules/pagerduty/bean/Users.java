/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class Users.
 */
public class Users {
	
	 private String summary;

	    private String avatar_url;

	    private String self;

	    private String type;

	    private String html_url;

	    private String id;

	    private Teams[] teams;

	    private String time_zone;

	    private String billed;

	    private String invitation_sent;

	    private String email;

	    private String color;

	    private String description;

	    private Contact_methods[] contact_methods;

	    private String name;

	    private String job_title;

	    public String getSummary() {
			return summary;
		}

		public void setSummary(String summary) {
			this.summary = summary;
		}

		public String getAvatar_url() {
			return avatar_url;
		}

		public void setAvatar_url(String avatar_url) {
			this.avatar_url = avatar_url;
		}

		public String getSelf() {
			return self;
		}

		public void setSelf(String self) {
			this.self = self;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getHtml_url() {
			return html_url;
		}

		public void setHtml_url(String html_url) {
			this.html_url = html_url;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public Teams[] getTeams() {
			return teams;
		}

		public void setTeams(Teams[] teams) {
			this.teams = teams;
		}

		public String getTime_zone() {
			return time_zone;
		}

		public void setTime_zone(String time_zone) {
			this.time_zone = time_zone;
		}

		public String getBilled() {
			return billed;
		}

		public void setBilled(String billed) {
			this.billed = billed;
		}

		public String getInvitation_sent() {
			return invitation_sent;
		}

		public void setInvitation_sent(String invitation_sent) {
			this.invitation_sent = invitation_sent;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Contact_methods[] getContact_methods() {
			return contact_methods;
		}

		public void setContact_methods(Contact_methods[] contact_methods) {
			this.contact_methods = contact_methods;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getJob_title() {
			return job_title;
		}

		public void setJob_title(String job_title) {
			this.job_title = job_title;
		}

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public String[] getCoordinated_incidents() {
			return coordinated_incidents;
		}

		public void setCoordinated_incidents(String[] coordinated_incidents) {
			this.coordinated_incidents = coordinated_incidents;
		}

		public Notification_rules[] getNotification_rules() {
			return notification_rules;
		}

		public void setNotification_rules(Notification_rules[] notification_rules) {
			this.notification_rules = notification_rules;
		}

		private String role;

	    private String[] coordinated_incidents;

	    private Notification_rules[] notification_rules;
}
