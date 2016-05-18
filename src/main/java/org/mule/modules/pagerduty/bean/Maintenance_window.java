/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class Maintenance_window.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Maintenance_window {
	
	/** The created_by. */
	private Created_by created_by;

    /** The sequence_number. */
    private String sequence_number;

    /** The id. */
    private String id;
    
    /** The teams. */
    private Teams[] teams;

    /** The services. */
    private Services[] services;

    /** The end_time. */
    private String end_time;

    /** The description. */
    private String description;

    /** The start_time. */
    private String start_time;

    /**
     * Gets the created_by.
     *
     * @return the created_by
     */
    public Created_by getCreated_by ()
    {
        return created_by;
    }

    /**
     * Sets the created_by.
     *
     * @param created_by the new created_by
     */
    public void setCreated_by (Created_by created_by)
    {
        this.created_by = created_by;
    }

    /**
     * Gets the sequence_number.
     *
     * @return the sequence_number
     */
    public String getSequence_number ()
    {
        return sequence_number;
    }

    /**
     * Sets the sequence_number.
     *
     * @param sequence_number the new sequence_number
     */
    public void setSequence_number (String sequence_number)
    {
        this.sequence_number = sequence_number;
    }

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
     * Gets the teams.
     *
     * @return the teams
     */
    public Teams[] getTeams() {
		return teams;
	}

	/**
	 * Sets the teams.
	 *
	 * @param teams the new teams
	 */
	public void setTeams(Teams[] teams) {
		this.teams = teams;
	}

    /**
     * Gets the services.
     *
     * @return the services
     */
    public Services[] getServices ()
    {
        return services;
    }

    /**
     * Sets the services.
     *
     * @param services the new services
     */
    public void setServices (Services[] services)
    {
        this.services = services;
    }

    /**
     * Gets the end_time.
     *
     * @return the end_time
     */
    public String getEnd_time ()
    {
        return end_time;
    }

    /**
     * Sets the end_time.
     *
     * @param end_time the new end_time
     */
    public void setEnd_time (String end_time)
    {
        this.end_time = end_time;
    }

    /**
     * Gets the description.
     *
     * @return the description
     */
    public String getDescription ()
    {
        return description;
    }

    /**
     * Sets the description.
     *
     * @param description the new description
     */
    public void setDescription (String description)
    {
        this.description = description;
    }

    /**
     * Gets the start_time.
     *
     * @return the start_time
     */
    public String getStart_time ()
    {
        return start_time;
    }

    /**
     * Sets the start_time.
     *
     * @param start_time the new start_time
     */
    public void setStart_time (String start_time)
    {
        this.start_time = start_time;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [created_by = "+created_by+", sequence_number = "+sequence_number+", id = "+id+", services = "+services+", end_time = "+end_time+", description = "+description+", start_time = "+start_time+"]";
    }

	

}
