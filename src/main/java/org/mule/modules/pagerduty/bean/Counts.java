package org.mule.modules.pagerduty.bean;

public class Counts {
	
	private String ongoing;

    private String future;

    private String past;

    private String all;

    public String getOngoing ()
    {
        return ongoing;
    }

    public void setOngoing (String ongoing)
    {
        this.ongoing = ongoing;
    }

    public String getFuture ()
    {
        return future;
    }

    public void setFuture (String future)
    {
        this.future = future;
    }

    public String getPast ()
    {
        return past;
    }

    public void setPast (String past)
    {
        this.past = past;
    }

    public String getAll ()
    {
        return all;
    }

    public void setAll (String all)
    {
        this.all = all;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [ongoing = "+ongoing+", future = "+future+", past = "+past+", all = "+all+"]";
    }

}
