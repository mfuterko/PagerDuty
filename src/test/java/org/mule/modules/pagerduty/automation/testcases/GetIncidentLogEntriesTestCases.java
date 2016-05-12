package org.mule.modules.pagerduty.automation.testcases;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.automation.AbstractTestCase;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;
import org.mule.modules.pagerduty.bean.IncidentLogEntriesGetResponse;

public class GetIncidentLogEntriesTestCases extends AbstractTestCase{
	
	public GetIncidentLogEntriesTestCases()
	{
		super();
	}
    @Test
    @Category({FunctionalTestSuite.class})
    public void testGetIncidentLogEntries() throws Exception 
    {
    	IncidentLogEntriesGetResponse incidentLogEntriesGetResponse = getConnector().getIncidentLogEntries(incidentId, timeZone, since, until, isOverview, include);
		assertNotNull(incidentLogEntriesGetResponse);
	    assertEquals("200", incidentLogEntriesGetResponse.getStatusCode() );
    }

}
