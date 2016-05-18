/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class Escalation_policies.
 */
public class Escalation_policies {
	
	/** The id. */
	private String id;

    /** The teams. */
    private Teams[] teams;

    /** The services. */
    private Services[] services;

    /** The description. */
    private String description;

    /** The name. */
    private String name;

    /** The escalation_rules. */
    private Escalation_rules[] escalation_rules;

    /** The num_loops. */
    private String num_loops;

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
    public Teams[] getTeams ()
    {
        return teams;
    }

    /**
     * Sets the teams.
     *
     * @param teams the new teams
     */
    public void setTeams (Teams[] teams)
    {
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
     * Gets the escalation_rules.
     *
     * @return the escalation_rules
     */
    public Escalation_rules[] getEscalation_rules ()
    {
        return escalation_rules;
    }

    /**
     * Sets the escalation_rules.
     *
     * @param escalation_rules the new escalation_rules
     */
    public void setEscalation_rules (Escalation_rules[] escalation_rules)
    {
        this.escalation_rules = escalation_rules;
    }

    /**
     * Gets the num_loops.
     *
     * @return the num_loops
     */
    public String getNum_loops ()
    {
        return num_loops;
    }

    /**
     * Sets the num_loops.
     *
     * @param num_loops the new num_loops
     */
    public void setNum_loops (String num_loops)
    {
        this.num_loops = num_loops;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", teams = "+teams+", services = "+services+", description = "+description+", name = "+name+", escalation_rules = "+escalation_rules+", num_loops = "+num_loops+"]";
    }

}
