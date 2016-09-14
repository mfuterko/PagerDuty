package org.mule.modules.pagerduty.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class Escalation_policy.
 */
public class Escalation_policy {
	
	/** The id. */
	private String id;

    /** The name. */
    private String name;

    /** The deleted_at. */
    private String deleted_at;
    private String type;
    private String summary;
    private String html_url;
    private String self;

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getHtml_url() {
		return html_url;
	}

	public void setHtml_url(String html_url) {
		this.html_url = html_url;
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
    
}
