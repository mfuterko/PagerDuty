package org.mule.modules.pagerduty.bean;

public class User {
	
	private String member_order;

    private User user;

    public String getMember_order ()
    {
        return member_order;
    }

    public void setMember_order (String member_order)
    {
        this.member_order = member_order;
    }

    public User getUser ()
    {
        return user;
    }

    public void setUser (User user)
    {
        this.user = user;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [member_order = "+member_order+", user = "+user+"]";
    }

}
