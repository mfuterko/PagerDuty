package org.mule.modules.pagerduty.automation.testcases;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.automation.AbstractTestCase;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;
import org.mule.modules.pagerduty.bean.TeamPostRequest;
import org.mule.modules.pagerduty.bean.TeamsPostResponse;

public class CreateTeamTestCases extends AbstractTestCase{

	public CreateTeamTestCases()
	{
		super();
	}
	@Test
    @Category({FunctionalTestSuite.class})
    public void testCreateTeam() throws Exception 
	{
		TeamPostRequest request = new TeamPostRequest();
		TeamsPostResponse teamsPostResponse = getConnector().createTeam(request);
		assertNotNull(teamsPostResponse);
	    assertEquals("200", teamsPostResponse.getStatusCode() );
	}
}
