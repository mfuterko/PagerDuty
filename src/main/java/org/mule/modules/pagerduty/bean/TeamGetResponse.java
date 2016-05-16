/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TeamGetResponse extends StatusResponse {
	
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
