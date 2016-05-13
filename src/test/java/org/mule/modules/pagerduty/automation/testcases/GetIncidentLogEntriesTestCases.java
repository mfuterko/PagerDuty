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
    	String incidentId = getIncidentId();
    	String timeZone = getTimeZone();
    	String since = getSince();
    	String until = getUntil();
    	String isOverview = getOverview();
    	String include = getInclude();
    	IncidentLogEntriesGetResponse incidentLogEntriesGetResponse = getConnector().getIncidentLogEntries(incidentId, timeZone, since, until, isOverview, include);
		assertNotNull(incidentLogEntriesGetResponse);
	    assertEquals("200", incidentLogEntriesGetResponse.getStatusCode() );
    }

}
