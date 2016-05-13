package org.mule.modules.pagerduty.bean;

public class Email_filter {
	
	private String id;

    private String body_regex;

    private String subject_mode;

    private String from_email_regex;

    private String from_email_mode;

    private String body_mode;

    private String subject_regex;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getBody_regex ()
    {
        return body_regex;
    }

    public void setBody_regex (String body_regex)
    {
        this.body_regex = body_regex;
    }

    public String getSubject_mode ()
    {
        return subject_mode;
    }

    public void setSubject_mode (String subject_mode)
    {
        this.subject_mode = subject_mode;
    }

    public String getFrom_email_regex ()
    {
        return from_email_regex;
    }

    public void setFrom_email_regex (String from_email_regex)
    {
        this.from_email_regex = from_email_regex;
    }

    public String getFrom_email_mode ()
    {
        return from_email_mode;
    }

    public void setFrom_email_mode (String from_email_mode)
    {
        this.from_email_mode = from_email_mode;
    }

    public String getBody_mode ()
    {
        return body_mode;
    }

    public void setBody_mode (String body_mode)
    {
        this.body_mode = body_mode;
    }

    public String getSubject_regex ()
    {
        return subject_regex;
    }

    public void setSubject_regex (String subject_regex)
    {
        this.subject_regex = subject_regex;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", body_regex = "+body_regex+", subject_mode = "+subject_mode+", from_email_regex = "+from_email_regex+", from_email_mode = "+from_email_mode+", body_mode = "+body_mode+", subject_regex = "+subject_regex+"]";
    }

}
