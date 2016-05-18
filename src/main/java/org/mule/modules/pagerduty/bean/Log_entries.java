/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class Log_entries.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Log_entries {
	
	/** The id. */
	private String id;

    /** The created_at. */
    private String created_at;

    /** The type. */
    private String type;

    /** The channel. */
    private Channel channel;

    /** The agent. */
    private Agent agent;

    /** The note. */
    private String note;

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

    /**
     * Gets the note.
     *
     * @return the note
     */
    public String getNote ()
    {
        return note;
    }

    /**
     * Sets the note.
     *
     * @param note the new note
     */
    public void setNote (String note)
    {
        this.note = note;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", created_at = "+created_at+", type = "+type+", channel = "+channel+", agent = "+agent+", note = "+note+"]";
    }

}
