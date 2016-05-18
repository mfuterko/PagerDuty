/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.PagerDutyConnector;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;
import org.mule.modules.pagerduty.bean.IncidentNotesGetResponse;

// TODO: Auto-generated Javadoc
/**
 * The Class GetIncidentsNotesByIdTestCases.
 */
public class GetIncidentsNotesByIdTestCases extends PagerDutyAbstractTestCases{
	
	/**
	 * Instantiates a new gets the incidents notes by id test cases.
	 */
	public GetIncidentsNotesByIdTestCases()
	{
		super(PagerDutyConnector.class);
	}
    
    /**
     * Test get incidents notes by id.
     *
     * @throws Exception the exception
     */
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
