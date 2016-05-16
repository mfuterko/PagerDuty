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
import org.mule.modules.pagerduty.bean.TeamPutRequest;
import org.mule.modules.pagerduty.bean.TeamPutResponse;

public class UpdateTeamTestCases extends PagerDutyAbstractTestCases{
	
	public UpdateTeamTestCases()
	{
		super(PagerDutyConnector.class);
	}
	@Test
    @Category({FunctionalTestSuite.class})
    public void testUpdateTeam() throws Exception 
	{
		String teamId = getTeamId();
		TeamPutRequest request = new TeamPutRequest();
		TeamPutResponse teamPutResponse = getConnector().updateTeam(teamId,request);
		assertNotNull(teamPutResponse);
	    assertEquals("200", teamPutResponse.getStatusCode() );
	}

}
