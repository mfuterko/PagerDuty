/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;
import org.mule.modules.pagerduty.bean.TeamPostRequest;
import org.mule.modules.pagerduty.bean.TeamsPostResponse;

public class CreateTeamTestCases extends PagerDutyAbstractTestCases{

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
