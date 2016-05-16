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
import org.mule.modules.pagerduty.bean.LogEntriesByIdGetResponse;

public class GetLogEntriesByIdTestCases extends PagerDutyAbstractTestCases{
	
	public GetLogEntriesByIdTestCases()
	{
		super(PagerDutyConnector.class);
	}
    @Test
    @Category({FunctionalTestSuite.class})
    public void testGetLogEntriesById() throws Exception 
    {
    	String id = getId();
    	String timeZone = getTimeZone();
    	String include = getInclude();
    	LogEntriesByIdGetResponse logEntriesByIdGetResponse = getConnector().getLogEntriesById(id, timeZone, include);
    	assertNotNull(logEntriesByIdGetResponse);
	    assertEquals("200", logEntriesByIdGetResponse.getStatusCode() );
    }

}
