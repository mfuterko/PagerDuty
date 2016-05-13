/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

public class IncidentNotesPostResponse extends StatusResponse {
	
	private Note note;

    public Note getNote ()
    {
        return note;
    }

    public void setNote (Note note)
    {
        this.note = note;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [note = "+note+"]";
    }

}
