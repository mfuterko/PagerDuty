package org.mule.modules.pagerduty.bean;

public class UsersOnCallGetResponse extends StatusResponse {
	
	private String total;

    private String limit;

    private Users[] users;

    private String query;

    private String active_account_users;

    private String offset;

    public String getTotal ()
    {
        return total;
    }

    public void setTotal (String total)
    {
        this.total = total;
    }

    public String getLimit ()
    {
        return limit;
    }

    public void setLimit (String limit)
    {
        this.limit = limit;
    }

    public Users[] getUsers ()
    {
        return users;
    }

    public void setUsers (Users[] users)
    {
        this.users = users;
    }

    public String getQuery ()
    {
        return query;
    }

    public void setQuery (String query)
    {
        this.query = query;
    }

    public String getActive_account_users ()
    {
        return active_account_users;
    }

    public void setActive_account_users (String active_account_users)
    {
        this.active_account_users = active_account_users;
    }

    public String getOffset ()
    {
        return offset;
    }

    public void setOffset (String offset)
    {
        this.offset = offset;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [total = "+total+", limit = "+limit+", users = "+users+", query = "+query+", active_account_users = "+active_account_users+", offset = "+offset+"]";
    }

}
