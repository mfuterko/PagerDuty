package org.mule.modules.pagerduty.bean;

public class Final_schedule {
	
	private String rendered_coverage_percentage;

    private String name;

    private String[] rendered_schedule_entries;

    public String getRendered_coverage_percentage ()
    {
        return rendered_coverage_percentage;
    }

    public void setRendered_coverage_percentage (String rendered_coverage_percentage)
    {
        this.rendered_coverage_percentage = rendered_coverage_percentage;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String[] getRendered_schedule_entries ()
    {
        return rendered_schedule_entries;
    }

    public void setRendered_schedule_entries (String[] rendered_schedule_entries)
    {
        this.rendered_schedule_entries = rendered_schedule_entries;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [rendered_coverage_percentage = "+rendered_coverage_percentage+", name = "+name+", rendered_schedule_entries = "+rendered_schedule_entries+"]";
    }

}
