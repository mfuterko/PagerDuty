/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class IncidentNotesGetResponse.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class IncidentNotesGetResponse extends StatusResponse {
	
	/** The notes. */
	private Notes[] notes;

    /**
     * Gets the notes.
     *
     * @return the notes
     */
    public Notes[] getNotes ()
    {
        return notes;
    }

    /**
     * Sets the notes.
     *
     * @param notes the new notes
     */
    public void setNotes (Notes[] notes)
    {
        this.notes = notes;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [notes = "+notes+"]";
    }

}
