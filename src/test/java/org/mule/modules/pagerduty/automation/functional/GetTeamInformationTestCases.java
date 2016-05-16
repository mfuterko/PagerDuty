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
import org.mule.modules.pagerduty.bean.TeamGetResponse;

public class GetTeamInformationTestCases extends PagerDutyAbstractTestCases{
	
	public GetTeamInformationTestCases()
	{
		super(PagerDutyConnector.class);
	}
	@Test
    @Category({FunctionalTestSuite.class})
    public void testGetTeamInformation() throws Exception 
	{
		String teamId = getTeamId();
		TeamGetResponse teamGetResponse = getConnector().getTeamInformation(teamId);
		assertNotNull(teamGetResponse);
	    assertEquals("200", teamGetResponse.getStatusCode());
	}

}
