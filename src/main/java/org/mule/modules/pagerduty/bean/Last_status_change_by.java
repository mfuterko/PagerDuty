package org.mule.modules.pagerduty.bean;

public class Last_status_change_by {
	private String html_url;

    private String id;

    private String email;

    private String name;

    public String getHtml_url ()
    {
        return html_url;
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

    public String getEmail ()
    {
        return email;
    }

    public void setEmail (String email)
    {
        this.email = email;
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
        return "ClassPojo [html_url = "+html_url+", id = "+id+", email = "+email+", name = "+name+"]";
    }

}
