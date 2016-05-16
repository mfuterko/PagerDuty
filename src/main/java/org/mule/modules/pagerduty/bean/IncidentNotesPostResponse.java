/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
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
