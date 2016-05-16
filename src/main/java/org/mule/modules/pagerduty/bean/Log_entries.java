/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Log_entries {
	
	private String id;

    private String created_at;

    private String type;

    private Channel channel;

    private Agent agent;

    private String note;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getCreated_at ()
    {
        return created_at;
    }

    public void setCreated_at (String created_at)
    {
        this.created_at = created_at;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public Channel getChannel ()
    {
        return channel;
    }

    public void setChannel (Channel channel)
    {
        this.channel = channel;
    }

    public Agent getAgent ()
    {
        return agent;
    }

    public void setAgent (Agent agent)
    {
        this.agent = agent;
    }

    public String getNote ()
    {
        return note;
    }

    public void setNote (String note)
    {
        this.note = note;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", created_at = "+created_at+", type = "+type+", channel = "+channel+", agent = "+agent+", note = "+note+"]";
    }

}
