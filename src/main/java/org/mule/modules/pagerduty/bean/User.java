/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

public class User {
	
	private String id;
	
	private String name;
	
	private String email;
	
	private String html_url;
	
	private String member_order;
	
    public String getMember_order ()
    {
        return member_order;
    }

	public void setMember_order (String member_order)
    {
        this.member_order = member_order;
    }
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

    @Override
    public String toString()
    {
        return "ClassPojo [member_order = "+member_order+"]";
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHtml_url() {
		return html_url;
	}

	public void setHtml_url(String html_url) {
		this.html_url = html_url;
	}

}
