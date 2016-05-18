/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

// TODO: Auto-generated Javadoc
/**
 * The Class Trigger_summary_data.
 */
public class Trigger_summary_data {
	
	/** The subject. */
	private String subject;

    /**
     * Gets the subject.
     *
     * @return the subject
     */
    public String getSubject ()
    {
        return subject;
    }

    /**
     * Sets the subject.
     *
     * @param subject the new subject
     */
    public void setSubject (String subject)
    {
        this.subject = subject;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [subject = "+subject+"]";
    }

}
