package org.mule.modules.pagerduty.bean;

public class TeamsGetResponse extends StatusResponse {
	private String total;

    private String limit;

    private Teams[] teams;

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

    public Teams[] getTeams ()
    {
        return teams;
    }

    public void setTeams (Teams[] teams)
    {
        this.teams = teams;
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
        return "ClassPojo [total = "+total+", limit = "+limit+", teams = "+teams+", offset = "+offset+"]";
    }
}
