/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class Escalation_rule.
 */
public class Escalation_rule {
	
	/** The id. */
	private String id;

    /** The escalation_delay_in_minutes. */
    private String escalation_delay_in_minutes;

    /** The rule_object. */
    private Rule_object rule_object;

    /** The targets. */
    private Targets[] targets;

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
     * Gets the escalation_delay_in_minutes.
     *
     * @return the escalation_delay_in_minutes
     */
    public String getEscalation_delay_in_minutes ()
    {
        return escalation_delay_in_minutes;
    }

    /**
     * Sets the escalation_delay_in_minutes.
     *
     * @param escalation_delay_in_minutes the new escalation_delay_in_minutes
     */
    public void setEscalation_delay_in_minutes (String escalation_delay_in_minutes)
    {
        this.escalation_delay_in_minutes = escalation_delay_in_minutes;
    }

    /**
     * Gets the rule_object.
     *
     * @return the rule_object
     */
    public Rule_object getRule_object ()
    {
        return rule_object;
    }

    /**
     * Sets the rule_object.
     *
     * @param rule_object the new rule_object
     */
    public void setRule_object (Rule_object rule_object)
    {
        this.rule_object = rule_object;
    }

    /**
     * Gets the targets.
     *
     * @return the targets
     */
    public Targets[] getTargets ()
    {
        return targets;
    }

    /**
     * Sets the targets.
     *
     * @param targets the new targets
     */
    public void setTargets (Targets[] targets)
    {
        this.targets = targets;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", escalation_delay_in_minutes = "+escalation_delay_in_minutes+", rule_object = "+rule_object+", targets = "+targets+"]";
    }

}
