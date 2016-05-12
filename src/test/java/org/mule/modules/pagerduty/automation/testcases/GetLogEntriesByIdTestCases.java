package org.mule.modules.pagerduty.automation.testcases;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.automation.AbstractTestCase;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;
import org.mule.modules.pagerduty.bean.LogEntriesByIdGetResponse;

public class GetLogEntriesByIdTestCases extends AbstractTestCase{
	
	public GetLogEntriesByIdTestCases()
	{
		super();
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
