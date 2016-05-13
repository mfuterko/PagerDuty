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
import org.mule.modules.pagerduty.bean.TeamsGetResponse;

public class GetTeamsTestCases extends AbstractTestCase{
	
	public GetTeamsTestCases()
	{
		super();
	}
	@Test
    @Category({FunctionalTestSuite.class})
    public void testGetTeams() throws Exception 
	{
		String query = getQuery();
		TeamsGetResponse TeamsGetResponse = getConnector().getTeams(query);
		assertNotNull(TeamsGetResponse);
	    assertEquals("200", TeamsGetResponse.getStatusCode() );
	}

}
