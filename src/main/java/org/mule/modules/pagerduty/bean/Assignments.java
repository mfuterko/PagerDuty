package org.mule.modules.pagerduty.bean;

public class Assignments {
	private String at;

    private Assignee assignee;

    public String getAt ()
    {
        return at;
    }

    public void setAt (String at)
    {
        this.at = at;
    }

    public Assignee getAssignee ()
    {
        return assignee;
    }

    public void setAssignee (Assignee assignee)
    {
        this.assignee = assignee;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [at = "+at+", assignee = "+assignee+"]";
    }

}
