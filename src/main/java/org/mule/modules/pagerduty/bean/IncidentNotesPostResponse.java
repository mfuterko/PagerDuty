/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class IncidentNotesPostResponse.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class IncidentNotesPostResponse extends StatusResponse {
	
	/** The note. */
	private Note note;

    /**
     * Gets the note.
     *
     * @return the note
     */
    public Note getNote ()
    {
        return note;
    }

    /**
     * Sets the note.
     *
     * @param note the new note
     */
    public void setNote (Note note)
    {
        this.note = note;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [note = "+note+"]";
    }

}
