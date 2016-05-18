/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class Counts.
 */
public class Counts {
	
	/** The ongoing. */
	private String ongoing;

    /** The future. */
    private String future;

    /** The past. */
    private String past;

    /** The all. */
    private String all;

    /**
     * Gets the ongoing.
     *
     * @return the ongoing
     */
    public String getOngoing ()
    {
        return ongoing;
    }

    /**
     * Sets the ongoing.
     *
     * @param ongoing the new ongoing
     */
    public void setOngoing (String ongoing)
    {
        this.ongoing = ongoing;
    }

    /**
     * Gets the future.
     *
     * @return the future
     */
    public String getFuture ()
    {
        return future;
    }

    /**
     * Sets the future.
     *
     * @param future the new future
     */
    public void setFuture (String future)
    {
        this.future = future;
    }

    /**
     * Gets the past.
     *
     * @return the past
     */
    public String getPast ()
    {
        return past;
    }

    /**
     * Sets the past.
     *
     * @param past the new past
     */
    public void setPast (String past)
    {
        this.past = past;
    }

    /**
     * Gets the all.
     *
     * @return the all
     */
    public String getAll ()
    {
        return all;
    }

    /**
     * Sets the all.
     *
     * @param all the new all
     */
    public void setAll (String all)
    {
        this.all = all;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [ongoing = "+ongoing+", future = "+future+", past = "+past+", all = "+all+"]";
    }

}
