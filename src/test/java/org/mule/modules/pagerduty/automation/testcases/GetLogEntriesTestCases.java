package org.mule.modules.pagerduty.automation.testcases;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.automation.AbstractTestCase;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;
import org.mule.modules.pagerduty.bean.LogEntriesGetResponse;

public class GetLogEntriesTestCases extends AbstractTestCase{
	public GetLogEntriesTestCases()
	{
		super();
	}
    @Test
    @Category({FunctionalTestSuite.class})
    public void testGetLogEntries() throws Exception 
    {
    	
    	LogEntriesGetResponse logEntriesGetResponse = getConnector().getLogEntries(timeZone, since, until, isOverview, include);
    	assertNotNull(logEntriesGetResponse);
	    assertEquals("200", logEntriesGetResponse.getStatusCode() );
    }

}
