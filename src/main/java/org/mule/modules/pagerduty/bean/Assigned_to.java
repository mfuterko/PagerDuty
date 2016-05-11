package org.mule.modules.pagerduty.bean;

public class Assigned_to {
	
	private String at;

    private Object object;

    public String getAt ()
    {
        return at;
    }

    public void setAt (String at)
    {
        this.at = at;
    }

    public Object getObject ()
    {
        return object;
    }

    public void setObject (Object object)
    {
        this.object = object;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [at = "+at+", object = "+object+"]";
    }

}
