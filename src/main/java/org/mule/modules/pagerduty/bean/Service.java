/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class Service.
 */
public class Service {
		
	/** The html_url. */
	private String html_url;

    /** The id. */
    private String id;

    /** The description. */
    private String description;

    /** The name. */
    private String name;
    
    /** The deleted_at. */
    private String deleted_at;

    /**
     * Gets the html_url.
     *
     * @return the html_url
     */
    public String getHtml_url ()
    {
        return html_url;
    }
    

	/**
	 * Gets the deleted_at.
	 *
	 * @return the deleted_at
	 */
	public String getDeleted_at() {
		return deleted_at;
	}

	/**
	 * Sets the deleted_at.
	 *
	 * @param deleted_at the new deleted_at
	 */
	public void setDeleted_at(String deleted_at) {
		this.deleted_at = deleted_at;
	}

    /**
     * Sets the html_url.
     *
     * @param html_url the new html_url
     */
    public void setHtml_url (String html_url)
    {
        this.html_url = html_url;
    }

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
     * Gets the description.
     *
     * @return the description
     */
    public String getDescription ()
    {
        return description;
    }

    /**
     * Sets the description.
     *
     * @param description the new description
     */
    public void setDescription (String description)
    {
        this.description = description;
    }

    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName ()
    {
        return name;
    }

    /**
     * Sets the name.
     *
     * @param name the new name
     */
    public void setName (String name)
    {
        this.name = name;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [html_url = "+html_url+", id = "+id+", description = "+description+", name = "+name+"]";
    }

}
