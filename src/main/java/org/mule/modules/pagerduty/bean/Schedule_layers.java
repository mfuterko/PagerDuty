/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class Schedule_layers.
 */
public class Schedule_layers {
	
	/** The id. */
	private String id;

    /** The users. */
    private Users[] users;

    /** The restrictions. */
    private Restrictions[] restrictions;

    /** The rendered_coverage_percentage. */
    private String rendered_coverage_percentage;

    /** The start. */
    private String start;

    /** The priority. */
    private String priority;

    /** The rotation_turn_length_seconds. */
    private String rotation_turn_length_seconds;

    /** The name. */
    private String name;

    /** The restriction_type. */
    private String restriction_type;

    /** The rendered_schedule_entries. */
    private String[] rendered_schedule_entries;

    /** The end. */
    private String end;

    /** The rotation_virtual_start. */
    private String rotation_virtual_start;

    /**
     * Gets the id.
     *
     * @return the id
     */
    public String getId ()
    {
        return id;
    }

    /**
     * Sets the id.
     *
     * @param id the new id
     */
    public void setId (String id)
    {
        this.id = id;
    }

    /**
     * Gets the users.
     *
     * @return the users
     */
    public Users[] getUsers ()
    {
        return users;
    }

    /**
     * Sets the users.
     *
     * @param users the new users
     */
    public void setUsers (Users[] users)
    {
        this.users = users;
    }

    /**
     * Gets the restrictions.
     *
     * @return the restrictions
     */
    public Restrictions[] getRestrictions ()
    {
        return restrictions;
    }

    /**
     * Sets the restrictions.
     *
     * @param restrictions the new restrictions
     */
    public void setRestrictions (Restrictions[] restrictions)
    {
        this.restrictions = restrictions;
    }

    /**
     * Gets the rendered_coverage_percentage.
     *
     * @return the rendered_coverage_percentage
     */
    public String getRendered_coverage_percentage ()
    {
        return rendered_coverage_percentage;
    }

    /**
     * Sets the rendered_coverage_percentage.
     *
     * @param rendered_coverage_percentage the new rendered_coverage_percentage
     */
    public void setRendered_coverage_percentage (String rendered_coverage_percentage)
    {
        this.rendered_coverage_percentage = rendered_coverage_percentage;
    }

    /**
     * Gets the start.
     *
     * @return the start
     */
    public String getStart ()
    {
        return start;
    }

    /**
     * Sets the start.
     *
     * @param start the new start
     */
    public void setStart (String start)
    {
        this.start = start;
    }

    /**
     * Gets the priority.
     *
     * @return the priority
     */
    public String getPriority ()
    {
        return priority;
    }

    /**
     * Sets the priority.
     *
     * @param priority the new priority
     */
    public void setPriority (String priority)
    {
        this.priority = priority;
    }

    /**
     * Gets the rotation_turn_length_seconds.
     *
     * @return the rotation_turn_length_seconds
     */
    public String getRotation_turn_length_seconds ()
    {
        return rotation_turn_length_seconds;
    }

    /**
     * Sets the rotation_turn_length_seconds.
     *
     * @param rotation_turn_length_seconds the new rotation_turn_length_seconds
     */
    public void setRotation_turn_length_seconds (String rotation_turn_length_seconds)
    {
        this.rotation_turn_length_seconds = rotation_turn_length_seconds;
    }

    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName ()
    {
        return name;
    }

    /**
     * Sets the name.
     *
     * @param name the new name
     */
    public void setName (String name)
    {
        this.name = name;
    }

    /**
     * Gets the restriction_type.
     *
     * @return the restriction_type
     */
    public String getRestriction_type ()
    {
        return restriction_type;
    }

    /**
     * Sets the restriction_type.
     *
     * @param restriction_type the new restriction_type
     */
    public void setRestriction_type (String restriction_type)
    {
        this.restriction_type = restriction_type;
    }

    /**
     * Gets the rendered_schedule_entries.
     *
     * @return the rendered_schedule_entries
     */
    public String[] getRendered_schedule_entries ()
    {
        return rendered_schedule_entries;
    }

    /**
     * Sets the rendered_schedule_entries.
     *
     * @param rendered_schedule_entries the new rendered_schedule_entries
     */
    public void setRendered_schedule_entries (String[] rendered_schedule_entries)
    {
        this.rendered_schedule_entries = rendered_schedule_entries;
    }

    /**
     * Gets the end.
     *
     * @return the end
     */
    public String getEnd ()
    {
        return end;
    }

    /**
     * Sets the end.
     *
     * @param end the new end
     */
    public void setEnd (String end)
    {
        this.end = end;
    }

    /**
     * Gets the rotation_virtual_start.
     *
     * @return the rotation_virtual_start
     */
    public String getRotation_virtual_start ()
    {
        return rotation_virtual_start;
    }

    /**
     * Sets the rotation_virtual_start.
     *
     * @param rotation_virtual_start the new rotation_virtual_start
     */
    public void setRotation_virtual_start (String rotation_virtual_start)
    {
        this.rotation_virtual_start = rotation_virtual_start;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", users = "+users+", restrictions = "+restrictions+", rendered_coverage_percentage = "+rendered_coverage_percentage+", start = "+start+", priority = "+priority+", rotation_turn_length_seconds = "+rotation_turn_length_seconds+", name = "+name+", restriction_type = "+restriction_type+", rendered_schedule_entries = "+rendered_schedule_entries+", end = "+end+", rotation_virtual_start = "+rotation_virtual_start+"]";
    }

}
