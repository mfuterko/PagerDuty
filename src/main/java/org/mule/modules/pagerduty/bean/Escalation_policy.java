/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class Escalation_policy.
 */
public class Escalation_policy {
	
	/** The id. */
	private String id;

    /** The services. */
    private String[] services;

    /** The description. */
    private String description;

    /** The name. */
    private String name;

    /** The escalation_rules. */
    private Escalation_rules[] escalation_rules;

    /** The num_loops. */
    private String num_loops;
    
    /** The deleted_at. */
    private String deleted_at;

    /**
     * Gets the deleted_at.
     *
     * @return the deleted_at
     */
    public String getDeleted_at() {
		return deleted_at;
	}

	/**
	 * Sets the deleted_at.
	 *
	 * @param deleted_at the new deleted_at
	 */
	public void setDeleted_at(String deleted_at) {
		this.deleted_at = deleted_at;
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
     * Gets the services.
     *
     * @return the services
     */
    public String[] getServices ()
    {
        return services;
    }

    /**
     * Sets the services.
     *
     * @param services the new services
     */
    public void setServices (String[] services)
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
        return "ClassPojo [id = "+id+", services = "+services+", description = "+description+", name = "+name+", escalation_rules = "+escalation_rules+", num_loops = "+num_loops+"]";
    }

}
