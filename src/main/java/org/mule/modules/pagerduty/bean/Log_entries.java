package org.mule.modules.pagerduty.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class Log_entries.
 */
public class Log_entries {
	 
 	/** The id. */
 	private String id;

	    /** The created_at. */
    	private String created_at;
    	
	    /** The user. */
	    private User user;
    	
	    private String acknowledgement_timeout;

	    public String getAcknowledgement_timeout() {
			return acknowledgement_timeout;
		}

		public void setAcknowledgement_timeout(String acknowledgement_timeout) {
			this.acknowledgement_timeout = acknowledgement_timeout;
		}

		/**
    	 * Gets the user.
    	 *
    	 * @return the user
    	 */
    	public User getUser() {
			return user;
		}

		/**
		 * Sets the user.
		 *
		 * @param user the new user
		 */
		public void setUser(User user) {
			this.user = user;
		}

		/** The contexts. */
    	private String[] contexts;

	    /** The type. */
    	private String type;

	    /** The channel. */
    	private Channel channel;

	    /** The agent. */
    	private Agent agent;
	    
    	/** The notification. */
    	private Notification notification;
    	
    	/** The assigned_user. */
	    private Assigned_user assigned_user;
		
		/**
		 * Gets the assigned_user.
		 *
		 * @return the assigned_user
		 */
		public Assigned_user getAssigned_user() {
			return assigned_user;
		}

		/**
		 * Sets the assigned_user.
		 *
		 * @param assigned_user the new assigned_user
		 */
		public void setAssigned_user(Assigned_user assigned_user) {
			this.assigned_user = assigned_user;
		}

		/**
		 * Gets the id.
		 *
		 * @return the id
		 */
		public String getId() {
			return id;
		}
		
		/**
		 * Sets the id.
		 *
		 * @param id the new id
		 */
		public void setId(String id) {
			this.id = id;
		}
		
		/**
		 * Gets the created_at.
		 *
		 * @return the created_at
		 */
		public String getCreated_at() {
			return created_at;
		}
		
		/**
		 * Sets the created_at.
		 *
		 * @param created_at the new created_at
		 */
		public void setCreated_at(String created_at) {
			this.created_at = created_at;
		}
		
		/**
		 * Gets the contexts.
		 *
		 * @return the contexts
		 */
		public String[] getContexts() {
			return contexts;
		}
		
		/**
		 * Sets the contexts.
		 *
		 * @param contexts the new contexts
		 */
		public void setContexts(String[] contexts) {
			this.contexts = contexts;
		}
		
		/**
		 * Gets the type.
		 *
		 * @return the type
		 */
		public String getType() {
			return type;
		}
		
		/**
		 * Sets the type.
		 *
		 * @param type the new type
		 */
		public void setType(String type) {
			this.type = type;
		}
		
		/**
		 * Gets the channel.
		 *
		 * @return the channel
		 */
		public Channel getChannel() {
			return channel;
		}
		
		/**
		 * Sets the channel.
		 *
		 * @param channel the new channel
		 */
		public void setChannel(Channel channel) {
			this.channel = channel;
		}
		
		/**
		 * Gets the agent.
		 *
		 * @return the agent
		 */
		public Agent getAgent() {
			return agent;
		}
		
		/**
		 * Sets the agent.
		 *
		 * @param agent the new agent
		 */
		public void setAgent(Agent agent) {
			this.agent = agent;
		}
		
		/**
		 * Gets the notification.
		 *
		 * @return the notification
		 */
		public Notification getNotification() {
			return notification;
		}
		
		/**
		 * Sets the notification.
		 *
		 * @param notification the new notification
		 */
		public void setNotification(Notification notification) {
			this.notification = notification;
		}
	    
}
