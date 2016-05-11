package org.mule.modules.pagerduty.bean;



public class Escalation_rules {
	private String id;

    private String escalation_delay_in_minutes;

    private Rule_object rule_object;

    private Targets[] targets;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getEscalation_delay_in_minutes ()
    {
        return escalation_delay_in_minutes;
    }

    public void setEscalation_delay_in_minutes (String escalation_delay_in_minutes)
    {
        this.escalation_delay_in_minutes = escalation_delay_in_minutes;
    }

    public Rule_object getRule_object ()
    {
        return rule_object;
    }

    public void setRule_object (Rule_object rule_object)
    {
        this.rule_object = rule_object;
    }

    public Targets[] getTargets ()
    {
        return targets;
    }

    public void setTargets (Targets[] targets)
    {
        this.targets = targets;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", escalation_delay_in_minutes = "+escalation_delay_in_minutes+", rule_object = "+rule_object+", targets = "+targets+"]";
    }

}
