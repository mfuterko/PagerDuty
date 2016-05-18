/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class Overrides_subschedule.
 */
public class Overrides_subschedule {
	
	/** The name. */
	private String name;

    /** The rendered_schedule_entries. */
    private String[] rendered_schedule_entries;

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

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [name = "+name+", rendered_schedule_entries = "+rendered_schedule_entries+"]";
    }

}
