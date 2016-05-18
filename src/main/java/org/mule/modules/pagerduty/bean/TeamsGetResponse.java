/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class TeamsGetResponse.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TeamsGetResponse extends StatusResponse {
	
	/** The total. */
	private String total;

    /** The limit. */
    private String limit;

    /** The teams. */
    private Teams[] teams;
    
    /** The offset. */
    private String offset;

    /** The query. */
    private String query;
    
    
    /**
     * Gets the query.
     *
     * @return the query
     */
    public String getQuery() {
		return query;
	}

	/**
	 * Sets the query.
	 *
	 * @param query the new query
	 */
	public void setQuery(String query) {
		this.query = query;
	}

	/**
	 * Gets the total.
	 *
	 * @return the total
	 */
	public String getTotal ()
    {
        return total;
    }

    /**
     * Sets the total.
     *
     * @param total the new total
     */
    public void setTotal (String total)
    {
        this.total = total;
    }

    /**
     * Gets the limit.
     *
     * @return the limit
     */
    public String getLimit ()
    {
        return limit;
    }

    /**
     * Sets the limit.
     *
     * @param limit the new limit
     */
    public void setLimit (String limit)
    {
        this.limit = limit;
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
     * Gets the offset.
     *
     * @return the offset
     */
    public String getOffset ()
    {
        return offset;
    }

    /**
     * Sets the offset.
     *
     * @param offset the new offset
     */
    public void setOffset (String offset)
    {
        this.offset = offset;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [total = "+total+", limit = "+limit+", teams = "+teams+", offset = "+offset+"]";
    }
}
