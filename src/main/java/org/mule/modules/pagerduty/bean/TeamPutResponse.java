package org.mule.modules.pagerduty.bean;

public class TeamPutResponse extends StatusResponse {
	
	private Team team;

    public Team getTeam ()
    {
        return team;
    }

    public void setTeam (Team team)
    {
        this.team = team;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [team = "+team+"]";
    }
}
