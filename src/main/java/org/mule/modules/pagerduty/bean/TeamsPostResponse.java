/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class TeamsPostResponse.
 */
public class TeamsPostResponse extends StatusResponse {
	
	/** The team. */
	private Team team;

    /**
     * Gets the team.
     *
     * @return the team
     */
    public Team getTeam ()
    {
        return team;
    }

    /**
     * Sets the team.
     *
     * @param team the new team
     */
    public void setTeam (Team team)
    {
        this.team = team;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [team = "+team+"]";
    }

}
