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
import org.mule.modules.pagerduty.bean.TeamPostRequest;
import org.mule.modules.pagerduty.bean.TeamsPostResponse;

public class CreateTeamTestCases extends PagerDutyAbstractTestCases{

	public CreateTeamTestCases()
	{
		super(PagerDutyConnector.class);
	}
	@Test
    @Category({FunctionalTestSuite.class})
    public void testCreateTeam() throws Exception 
	{
		TeamPostRequest request = new TeamPostRequest();
		request.setName("Team1");
		request.setDescription("Team1 description");
		TeamsPostResponse teamsPostResponse = getConnector().createTeam(request);
		assertNotNull(teamsPostResponse);
	    assertEquals("201", teamsPostResponse.getStatusCode() );
	}
}
