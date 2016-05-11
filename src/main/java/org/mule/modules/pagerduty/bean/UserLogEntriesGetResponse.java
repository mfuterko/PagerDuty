package org.mule.modules.pagerduty.bean;

public class UserLogEntriesGetResponse extends StatusResponse {
	
	private String total;

    private String limit;

    private Log_entries[] log_entries;

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

    public Log_entries[] getLog_entries ()
    {
        return log_entries;
    }

    public void setLog_entries (Log_entries[] log_entries)
    {
        this.log_entries = log_entries;
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
        return "ClassPojo [total = "+total+", limit = "+limit+", log_entries = "+log_entries+", offset = "+offset+"]";
    }

}
