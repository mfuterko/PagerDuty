package org.mule.modules.pagerduty.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;
import org.mule.modules.pagerduty.bean.TeamsGetResponse;

public class GetTeamsTestCases extends PagerDutyAbstractTestCases{
	
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
