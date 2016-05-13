/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

public class IncidentNotesGetResponse extends StatusResponse {
	
	private Notes[] notes;

    public Notes[] getNotes ()
    {
        return notes;
    }

    public void setNotes (Notes[] notes)
    {
        this.notes = notes;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [notes = "+notes+"]";
    }

}
