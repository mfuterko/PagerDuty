/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class Note.
 */
public class Note {
	
	/** The content. */
	private String content;

    /** The id. */
    private String id;

    /** The created_at. */
    private String created_at;

    /** The user. */
    private User user;

    /**
     * Gets the content.
     *
     * @return the content
     */
    public String getContent ()
    {
        return content;
    }

    /**
     * Sets the content.
     *
     * @param content the new content
     */
    public void setContent (String content)
    {
        this.content = content;
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
     * Gets the user.
     *
     * @return the user
     */
    public User getUser ()
    {
        return user;
    }

    /**
     * Sets the user.
     *
     * @param user the new user
     */
    public void setUser (User user)
    {
        this.user = user;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [content = "+content+", id = "+id+", created_at = "+created_at+", user = "+user+"]";
    }

}
