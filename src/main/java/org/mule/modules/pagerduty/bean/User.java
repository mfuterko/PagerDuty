/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class User.
 */
public class User {
	
	/** The id. */
	private String id;
	
	/** The name. */
	private String name;
	
	/** The email. */
	private String email;
	
	/** The html_url. */
	private String html_url;
	
	/** The member_order. */
	private String member_order;
	
    /**
     * Gets the member_order.
     *
     * @return the member_order
     */
    public String getMember_order ()
    {
        return member_order;
    }

	/**
	 * Sets the member_order.
	 *
	 * @param member_order the new member_order
	 */
	public void setMember_order (String member_order)
    {
        this.member_order = member_order;
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

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [member_order = "+member_order+"]";
    }

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email.
	 *
	 * @param email the new email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Gets the html_url.
	 *
	 * @return the html_url
	 */
	public String getHtml_url() {
		return html_url;
	}

	/**
	 * Sets the html_url.
	 *
	 * @param html_url the new html_url
	 */
	public void setHtml_url(String html_url) {
		this.html_url = html_url;
	}

}
