/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.automation.testcases;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.automation.AbstractTestCase;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;
import org.mule.modules.pagerduty.bean.IncidentNotesGetResponse;

public class GetIncidentsNotesByIdTestCases extends AbstractTestCase{
	
	public GetIncidentsNotesByIdTestCases()
	{
		super();
	}
    @Test
    @Category({FunctionalTestSuite.class})
    public void testGetIncidentsNotesById() throws Exception 
    {
    	String id = getEscalationId();
    	IncidentNotesGetResponse incidentNotesGetResponse = getConnector().getIncidentsNotesById(id);
    	assertNotNull(incidentNotesGetResponse);
	    assertEquals("200", incidentNotesGetResponse.getStatusCode() );
    }

}
