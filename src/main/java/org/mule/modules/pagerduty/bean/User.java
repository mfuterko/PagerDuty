package org.mule.modules.pagerduty.bean;

public class User {
	
	private String member_order;
	
    public String getMember_order ()
    {
        return member_order;
    }

    public void setMember_order (String member_order)
    {
        this.member_order = member_order;
    }

   
    @Override
    public String toString()
    {
        return "ClassPojo [member_order = "+member_order+"]";
    }

}
