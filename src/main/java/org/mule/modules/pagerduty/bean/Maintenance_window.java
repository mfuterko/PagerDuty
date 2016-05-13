package org.mule.modules.pagerduty.bean;

public class Maintenance_window {
	
	private Created_by created_by;

    private String sequence_number;

    private String id;

    private Services[] services;

    private String end_time;

    private String description;

    private String start_time;

    public Created_by getCreated_by ()
    {
        return created_by;
    }

    public void setCreated_by (Created_by created_by)
    {
        this.created_by = created_by;
    }

    public String getSequence_number ()
    {
        return sequence_number;
    }

    public void setSequence_number (String sequence_number)
    {
        this.sequence_number = sequence_number;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public Services[] getServices ()
    {
        return services;
    }

    public void setServices (Services[] services)
    {
        this.services = services;
    }

    public String getEnd_time ()
    {
        return end_time;
    }

    public void setEnd_time (String end_time)
    {
        this.end_time = end_time;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public String getStart_time ()
    {
        return start_time;
    }

    public void setStart_time (String start_time)
    {
        this.start_time = start_time;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [created_by = "+created_by+", sequence_number = "+sequence_number+", id = "+id+", services = "+services+", end_time = "+end_time+", description = "+description+", start_time = "+start_time+"]";
    }

}
