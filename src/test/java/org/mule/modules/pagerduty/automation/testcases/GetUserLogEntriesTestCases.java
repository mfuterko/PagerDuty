package org.mule.modules.pagerduty.automation.testcases;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.automation.AbstractTestCase;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;
import org.mule.modules.pagerduty.bean.UserLogEntriesGetResponse;

public class GetUserLogEntriesTestCases extends AbstractTestCase{
	
	public GetUserLogEntriesTestCases()
	{
		super();
	}
    @Test
    @Category({FunctionalTestSuite.class})
    public void testGetUserLogEntries() throws Exception 
    {
    	UserLogEntriesGetResponse  userLogEntriesGetResponse = getConnector().getUserLogEntries(id, timeZone, since, until, isOverview, include);
		assertNotNull(userLogEntriesGetResponse);
	    assertEquals("200", userLogEntriesGetResponse.getStatusCode() );
    }

}
