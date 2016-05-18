/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class Log_entry.
 */
public class Log_entry {
	
	 /** The id. */
 	private String id;

	    /** The created_at. */
    	private String created_at;

	    /** The contexts. */
    	private Contexts[] contexts;

	    /** The type. */
    	private String type;

	    /** The channel. */
    	private Channel channel;

	    /** The agent. */
    	private Agent agent;

	    /**
    	 * Gets the id.
    	 *
    	 * @return the id
    	 */
    	public String getId ()
	    {
	        return id;
	    }

	    /**
    	 * Sets the id.
    	 *
    	 * @param id the new id
    	 */
    	public void setId (String id)
	    {
	        this.id = id;
	    }

	    /**
    	 * Gets the created_at.
    	 *
    	 * @return the created_at
    	 */
    	public String getCreated_at ()
	    {
	        return created_at;
	    }

	    /**
    	 * Sets the created_at.
    	 *
    	 * @param created_at the new created_at
    	 */
    	public void setCreated_at (String created_at)
	    {
	        this.created_at = created_at;
	    }

	    /**
    	 * Gets the contexts.
    	 *
    	 * @return the contexts
    	 */
    	public Contexts[] getContexts ()
	    {
	        return contexts;
	    }

	    /**
    	 * Sets the contexts.
    	 *
    	 * @param contexts the new contexts
    	 */
    	public void setContexts (Contexts[] contexts)
	    {
	        this.contexts = contexts;
	    }

	    /**
    	 * Gets the type.
    	 *
    	 * @return the type
    	 */
    	public String getType ()
	    {
	        return type;
	    }

	    /**
    	 * Sets the type.
    	 *
    	 * @param type the new type
    	 */
    	public void setType (String type)
	    {
	        this.type = type;
	    }

	    /**
    	 * Gets the channel.
    	 *
    	 * @return the channel
    	 */
    	public Channel getChannel ()
	    {
	        return channel;
	    }

	    /**
    	 * Sets the channel.
    	 *
    	 * @param channel the new channel
    	 */
    	public void setChannel (Channel channel)
	    {
	        this.channel = channel;
	    }

	    /**
    	 * Gets the agent.
    	 *
    	 * @return the agent
    	 */
    	public Agent getAgent ()
	    {
	        return agent;
	    }

	    /**
    	 * Sets the agent.
    	 *
    	 * @param agent the new agent
    	 */
    	public void setAgent (Agent agent)
	    {
	        this.agent = agent;
	    }

	    /* (non-Javadoc)
    	 * @see java.lang.Object#toString()
    	 */
    	@Override
	    public String toString()
	    {
	        return "ClassPojo [id = "+id+", created_at = "+created_at+", contexts = "+contexts+", type = "+type+", channel = "+channel+", agent = "+agent+"]";
	    }

}
