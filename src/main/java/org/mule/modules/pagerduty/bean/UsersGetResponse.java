/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class UsersGetResponse.
 */
public class UsersGetResponse extends StatusResponse {
	
	/** The total. */
	private String total;

    /** The limit. */
    private String limit;

    /** The users. */
    private Users[] users;

    /** The query. */
    private String query;

    /** The active_account_users. */
    private String active_account_users;

    /** The offset. */
    private String offset;

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
     * Gets the users.
     *
     * @return the users
     */
    public Users[] getUsers ()
    {
        return users;
    }

    /**
     * Sets the users.
     *
     * @param users the new users
     */
    public void setUsers (Users[] users)
    {
        this.users = users;
    }

    /**
     * Gets the query.
     *
     * @return the query
     */
    public String getQuery ()
    {
        return query;
    }

    /**
     * Sets the query.
     *
     * @param query the new query
     */
    public void setQuery (String query)
    {
        this.query = query;
    }

    /**
     * Gets the active_account_users.
     *
     * @return the active_account_users
     */
    public String getActive_account_users ()
    {
        return active_account_users;
    }

    /**
     * Sets the active_account_users.
     *
     * @param active_account_users the new active_account_users
     */
    public void setActive_account_users (String active_account_users)
    {
        this.active_account_users = active_account_users;
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
        return "ClassPojo [total = "+total+", limit = "+limit+", users = "+users+", query = "+query+", active_account_users = "+active_account_users+", offset = "+offset+"]";
    }

}
