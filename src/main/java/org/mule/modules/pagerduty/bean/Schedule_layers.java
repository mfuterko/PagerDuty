/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

public class Schedule_layers {
	
	private String id;

    private Users[] users;

    private Restrictions[] restrictions;

    private String rendered_coverage_percentage;

    private String start;

    private String priority;

    private String rotation_turn_length_seconds;

    private String name;

    private String restriction_type;

    private String[] rendered_schedule_entries;

    private String end;

    private String rotation_virtual_start;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public Users[] getUsers ()
    {
        return users;
    }

    public void setUsers (Users[] users)
    {
        this.users = users;
    }

    public Restrictions[] getRestrictions ()
    {
        return restrictions;
    }

    public void setRestrictions (Restrictions[] restrictions)
    {
        this.restrictions = restrictions;
    }

    public String getRendered_coverage_percentage ()
    {
        return rendered_coverage_percentage;
    }

    public void setRendered_coverage_percentage (String rendered_coverage_percentage)
    {
        this.rendered_coverage_percentage = rendered_coverage_percentage;
    }

    public String getStart ()
    {
        return start;
    }

    public void setStart (String start)
    {
        this.start = start;
    }

    public String getPriority ()
    {
        return priority;
    }

    public void setPriority (String priority)
    {
        this.priority = priority;
    }

    public String getRotation_turn_length_seconds ()
    {
        return rotation_turn_length_seconds;
    }

    public void setRotation_turn_length_seconds (String rotation_turn_length_seconds)
    {
        this.rotation_turn_length_seconds = rotation_turn_length_seconds;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getRestriction_type ()
    {
        return restriction_type;
    }

    public void setRestriction_type (String restriction_type)
    {
        this.restriction_type = restriction_type;
    }

    public String[] getRendered_schedule_entries ()
    {
        return rendered_schedule_entries;
    }

    public void setRendered_schedule_entries (String[] rendered_schedule_entries)
    {
        this.rendered_schedule_entries = rendered_schedule_entries;
    }

    public String getEnd ()
    {
        return end;
    }

    public void setEnd (String end)
    {
        this.end = end;
    }

    public String getRotation_virtual_start ()
    {
        return rotation_virtual_start;
    }

    public void setRotation_virtual_start (String rotation_virtual_start)
    {
        this.rotation_virtual_start = rotation_virtual_start;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", users = "+users+", restrictions = "+restrictions+", rendered_coverage_percentage = "+rendered_coverage_percentage+", start = "+start+", priority = "+priority+", rotation_turn_length_seconds = "+rotation_turn_length_seconds+", name = "+name+", restriction_type = "+restriction_type+", rendered_schedule_entries = "+rendered_schedule_entries+", end = "+end+", rotation_virtual_start = "+rotation_virtual_start+"]";
    }

}
