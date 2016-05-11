package org.mule.modules.pagerduty.bean;

public class Escalation_policies {
	private String id;

    private Teams[] teams;

    private Services[] services;

    private String description;

    private String name;

    private Escalation_rules[] escalation_rules;

    private String num_loops;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public Teams[] getTeams ()
    {
        return teams;
    }

    public void setTeams (Teams[] teams)
    {
        this.teams = teams;
    }

    public Services[] getServices ()
    {
        return services;
    }

    public void setServices (Services[] services)
    {
        this.services = services;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public Escalation_rules[] getEscalation_rules ()
    {
        return escalation_rules;
    }

    public void setEscalation_rules (Escalation_rules[] escalation_rules)
    {
        this.escalation_rules = escalation_rules;
    }

    public String getNum_loops ()
    {
        return num_loops;
    }

    public void setNum_loops (String num_loops)
    {
        this.num_loops = num_loops;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", teams = "+teams+", services = "+services+", description = "+description+", name = "+name+", escalation_rules = "+escalation_rules+", num_loops = "+num_loops+"]";
    }

}
