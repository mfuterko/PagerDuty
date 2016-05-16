/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

public class Service {
		
	private String html_url;

    private String id;

    private String description;

    private String name;
    
    private String deleted_at;

    public String getHtml_url ()
    {
        return html_url;
    }
    

	public String getDeleted_at() {
		return deleted_at;
	}

	public void setDeleted_at(String deleted_at) {
		this.deleted_at = deleted_at;
	}

    public void setHtml_url (String html_url)
    {
        this.html_url = html_url;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [html_url = "+html_url+", id = "+id+", description = "+description+", name = "+name+"]";
    }

}
