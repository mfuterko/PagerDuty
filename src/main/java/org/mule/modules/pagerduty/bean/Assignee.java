package org.mule.modules.pagerduty.bean;

public class Assignee {
	 private String html_url;

	    private String summary;

	    private String id;

	    private String self;

	    private String type;

	    public String getHtml_url ()
	    {
	        return html_url;
	    }

	    public void setHtml_url (String html_url)
	    {
	        this.html_url = html_url;
	    }

	    public String getSummary ()
	    {
	        return summary;
	    }

	    public void setSummary (String summary)
	    {
	        this.summary = summary;
	    }

	    public String getId ()
	    {
	        return id;
	    }

	    public void setId (String id)
	    {
	        this.id = id;
	    }

	    public String getSelf ()
	    {
	        return self;
	    }

	    public void setSelf (String self)
	    {
	        this.self = self;
	    }

	    public String getType ()
	    {
	        return type;
	    }

	    public void setType (String type)
	    {
	        this.type = type;
	    }

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [html_url = "+html_url+", summary = "+summary+", id = "+id+", self = "+self+", type = "+type+"]";
	    }
}
